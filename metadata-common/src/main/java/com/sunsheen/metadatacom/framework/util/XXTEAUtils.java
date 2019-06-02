package com.sunsheen.metadatacom.framework.util;

import org.apache.tomcat.util.codec.binary.Base64;

/**
 * @description: 加密解密XXTEA
 *      1) 微型加密算法（TEA）及其相关变种（XTEA，Block TEA，XXTEA）都是分组加密算法；
 *      2) TEA算法使用 128 位的密钥为 64 位的信息块进行加密，它需要进行 64 轮迭代；
 *          该算法使用了一个神秘常数δ作为倍数，它来源于黄金比率，以保证每一轮加密都不相同；
 *          但δ的精确值似乎并不重要，这里 TEA 把它定义为 δ=「(√5 - 1)231」(也就是程序中的 0×9E3779B9);
 *          其实，TEA跟我们的关系非常密切，因为QQ就是使用16轮迭代的TEA算法;
 *      3) XXTEA是其最新的变种，于1998年提出。目前还没有人找到对其进行攻击的方法，是对前面一些变种的改进；
 *          XXTEA 算法很安全，而且非常快速，非常适合应用于 Web 开发中；
 *      4) 最核心的是要明白：XXTEA算法使用128bit的密钥对以32bit为单位的信息块进行加密
 * @author: zhangxuejiao
 * @createDate: 2019/6/2 20:01
 */
public class XXTEAUtils {

    /**
     * 使用密钥加密数据
     * @param plain
     * @param key
     * @return
     */
    public static byte[] encrypt(byte[] plain, byte[] key) {
        if (plain.length == 0) {
            return plain;
        }
        return toByteArray(encrypt(toIntArray(plain, true), toIntArray(key, false)), false);
    }

    /**
     * 使用密钥解密
     * @param cipher
     * @param key
     * @return
     */
    public static byte[] decrypt(byte[] cipher, byte[] key) {
        if (cipher.length == 0) {
            return cipher;
        }
        return toByteArray(decrypt(toIntArray(cipher, false), toIntArray(key, false)), true);
    }

    /**
     * 使用密钥加密数据
     * @param v
     * @param k
     * @return
     */
    public static int[] encrypt(int[] v, int[] k) {
        int n = v.length - 1;

        if (n < 1) {
            return v;
        }
        if (k.length < 4) {
            int[] key = new int[4];

            System.arraycopy(k, 0, key, 0, k.length);
            k = key;
        }
        int z = v[n], y = v[0], delta = 0x9E3779B9, sum = 0, e;
        int p, q = 6 + 52 / (n + 1);

        while (q-- > 0) {
            sum = sum + delta;
            e = sum >>> 2 & 3;
            for (p = 0; p < n; p++) {
                y = v[p + 1];
                z = v[p] += (z >>> 5 ^ y << 2) + (y >>> 3 ^ z << 4) ^ (sum ^ y) + (k[p & 3 ^ e] ^ z);
            }
            y = v[0];
            z = v[n] += (z >>> 5 ^ y << 2) + (y >>> 3 ^ z << 4) ^ (sum ^ y) + (k[p & 3 ^ e] ^ z);
        }
        return v;
    }

    /**
     * 使用密钥解密数据
     * @param v
     * @param k
     * @return
     */
    public static int[] decrypt(int[] v, int[] k) {
        int n = v.length - 1;

        if (n < 1) {
            return v;
        }
        if (k.length < 4) {
            int[] key = new int[4];

            System.arraycopy(k, 0, key, 0, k.length);
            k = key;
        }
        int z = v[n], y = v[0], delta = 0x9E3779B9, sum, e;
        int p, q = 6 + 52 / (n + 1);

        sum = q * delta;
        while (sum != 0) {
            e = sum >>> 2 & 3;
            for (p = n; p > 0; p--) {
                z = v[p - 1];
                y = v[p] -= (z >>> 5 ^ y << 2) + (y >>> 3 ^ z << 4) ^ (sum ^ y) + (k[p & 3 ^ e] ^ z);
            }
            z = v[n];
            y = v[0] -= (z >>> 5 ^ y << 2) + (y >>> 3 ^ z << 4) ^ (sum ^ y) + (k[p & 3 ^ e] ^ z);
            sum = sum - delta;
        }
        return v;
    }

    /**
     * 字节数组转换为整型数组
     * @param data
     * @param includeLength
     * @return
     */
    private static int[] toIntArray(byte[] data, boolean includeLength) {
        int n = (((data.length & 3) == 0) ? (data.length >>> 2) : ((data.length >>> 2) + 1));
        int[] result;

        if (includeLength) {
            result = new int[n + 1];
            result[n] = data.length;
        } else {
            result = new int[n];
        }
        n = data.length;
        for (int i = 0; i < n; i++) {
            result[i >>> 2] |= (0x000000ff & data[i]) << ((i & 3) << 3);
        }
        return result;
    }

    /**
     * 整型数组转换为字节数组
     * @param data
     * @param includeLength
     * @return
     */
    private static byte[] toByteArray(int[] data, boolean includeLength) {
        int n = data.length << 2;
        if (includeLength) {
            int m = data[data.length - 1];

            if (m > n) {
                return null;
            } else {
                n = m;
            }
        }
        byte[] result = new byte[n];

        for (int i = 0; i < n; i++) {
            result[i] = (byte) ((data[i >>> 2] >>> ((i & 3) << 3)) & 0xff);
        }
        return result;
    }

    /**
     * 先XXXTEA加密，后Base64加密
     * @param plain
     * @param key
     * @return
     */
    public static String encrypt(String plain, String key) {
        String cipher = "";
        byte[] k = key.getBytes();
        byte[] v = plain.getBytes();
        cipher = new String(Base64.encodeBase64(XXTEAUtils.encrypt(v, k)));
        cipher = cipher.replace('+', '-');
        cipher = cipher.replace('/', '_');
        cipher = cipher.replace('=', '.');
        return cipher;
    }

    /**
     * 先Base64解密，后XXXTEA解密
     * @param cipher
     * @param key
     * @return
     */
    public static String decrypt(String cipher, String key) {
        String plain = "";
        cipher = cipher.replace('-', '+');
        cipher = cipher.replace('_', '/');
        cipher = cipher.replace('.', '=');
        byte[] k = key.getBytes();
        byte[] v = Base64.decodeBase64(cipher);
        plain = new String(XXTEAUtils.decrypt(v, k));
        return plain;
    }

}
