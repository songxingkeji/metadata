package com.sunsheen.metadatacom.common.util;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @description: 日期工具类, 继承org.apache.commons.lang.time.DateUtils类
 * @author: zhangxuejiao
 * @createDate: 2019/5/31 15:46
 */
public class DateUtils extends org.apache.commons.lang3.time.DateUtils {

    private static String[] parsePatterns = {
            "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy-MM",
            "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm", "yyyy/MM",
            "yyyy.MM.dd", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm", "yyyy.MM",
            "yyyyMMddHHmmss"
    };

    /**
     * 得到当前日期字符串 格式（yyyy-MM-dd）
     */
    public static String getDate() {
        return getDate("yyyy-MM-dd");
    }

    /**
     * 得到当前日期字符串 格式（yyyy-MM-dd） pattern可以为："yyyy-MM-dd" "HH:mm:ss" "E"
     */
    public static String getDate(String pattern) {
        return DateFormatUtils.format(new Date(), pattern);
    }

    /**
     * 得到日期字符串 默认格式（yyyy-MM-dd） pattern可以为："yyyy-MM-dd" "HH:mm:ss" "E"
     */
    public static String formatDate(Date date, Object... pattern) {
        String formatDate = null;
        if (null == date) {
            return "";
        }
        if (pattern != null && pattern.length > 0) {
            formatDate = DateFormatUtils.format(date, pattern[0].toString());
        } else {
            formatDate = DateFormatUtils.format(date, "yyyy-MM-dd");
        }
        return formatDate;
    }

    /**
     * 得到日期时间字符串，转换格式（yyyy-MM-dd HH:mm:ss）
     */
    public static String formatDateTime(Date date) {
        if (date == null) {
            return "";
        }
        return formatDate(date, "yyyy-MM-dd HH:mm:ss");
    }

    public static String formatDateTimeNoDash(Date date) {
        if (date == null) {
            return "";
        }
        return formatDate(date, "yyyyMMddHHmmss");
    }

    public static String formatDateTimeFromMonth(Date date) {
        if (null == date) {
            return "";
        }
        return formatDate(date, "MM-dd HH:mm");
    }

    public static String formatDateTimeToMonth(Date date) {
        if (null == date) {
            return "";
        }
        return formatDate(date, "yyyy-MM");
    }

    public static String formatDateTimeToMonthyyMM(Date date) {
        if (null == date) {
            return "";
        }
        return formatDate(date, "yy/MM");
    }

    public static String formatDateTimeOnlyTime(Date date) {
        if (null == date) {
            return "";
        }
        return formatDate(date, "HH:mm");
    }

    public static String formatDateTimeToTime(Date date) {
        if (null == date) {
            return "";
        }
        return formatDate(date, "yyyy-MM-dd HH:mm");
    }

    /**
     * 得到当前时间字符串 格式（HH:mm:ss）
     */
    public static String getTime() {
        return formatDate(new Date(), "HH:mm:ss");
    }

    /**
     * 得到当前日期和时间字符串 格式（yyyy-MM-dd HH:mm:ss）
     */
    public static String getDateTime() {
        return formatDate(new Date(), "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 得到当前年份字符串 格式（yyyy）
     */
    public static String getYear() {
        return formatDate(new Date(), "yyyy");
    }

    /**
     * 得到当前月份字符串 格式（MM）
     */
    public static String getMonth() {
        return formatDate(new Date(), "MM");
    }

    /**
     * 得到当天字符串 格式（dd）
     */
    public static String getDay() {
        return formatDate(new Date(), "dd");
    }

    /**
     * 得到当前星期字符串 格式（E）星期几
     */
    public static String getWeek() {
        return formatDate(new Date(), "E");
    }

    /**
     * 日期型字符串转化为日期 格式 { "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm",
     * "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm", "yyyy.MM.dd",
     * "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm" }
     */
    public static Date parseDate(Object str) {
        if (str == null) {
            return null;
        }
        try {
            return parseDate(str.toString(), parsePatterns);
        } catch (ParseException e) {
            return new Date();
        }
    }

    /**
     * 获取过去的天数
     *
     * @param date 日期
     * @return long
     */
    public static long pastDays(Date date) {
        long t = new Date().getTime() - date.getTime();
        return t / (24 * 60 * 60 * 1000);
    }

    /**
     * 获取过去的小时
     *
     * @param date 日期
     * @return long
     */
    public static long pastHour(Date date) {
        long t = new Date().getTime() - date.getTime();
        return t / (60 * 60 * 1000);
    }

    /**
     * 获取过去的分钟
     *
     * @param date 日期
     * @return long
     */
    public static long pastMinutes(Date date) {
        long t = new Date().getTime() - date.getTime();
        return t / (60 * 1000);
    }

    /**
     * 转换为时间（天,时:分:秒.毫秒）
     *
     * @param timeMillis 毫秒数
     * @return String
     */
    public static String formatDateTime(long timeMillis) {
        long day = timeMillis / (24 * 60 * 60 * 1000);
        long hour = (timeMillis / (60 * 60 * 1000) - day * 24);
        long min = ((timeMillis / (60 * 1000)) - day * 24 * 60 - hour * 60);
        long s = (timeMillis / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
        long sss = (timeMillis - day * 24 * 60 * 60 * 1000 - hour * 60 * 60 * 1000 - min * 60 * 1000 - s * 1000);
        return (day > 0 ? day + "," : "") + hour + ":" + min + ":" + s + "." + sss;
    }

    /**
     * 获取两个日期之间的天数
     */
    public static double getDistanceOfTwoDate(Date before, Date after) {
        long beforeTime = before.getTime();
        long afterTime = after.getTime();
        return (afterTime - beforeTime) / (1000 * 60 * 60 * 24);
    }

    public static String convertComentTime(Date commentTime) {
        String commentAt = "";
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime commentDateTime = LocalDateTime.ofInstant(commentTime.toInstant(), zoneId);
        Duration duration = Duration.between(commentDateTime, now);

        if (duration.toMinutes() < 1) {
            commentAt = "刚刚";
        }
        if (duration.toMinutes() >= 1 && duration.toMinutes() < 60) {
            commentAt = duration.toMinutes() + "分钟前";
        }
        if (duration.toHours() >= 1 && duration.toHours() < 24) {
            commentAt = duration.toHours() + "小时前";
        }
        if (duration.toHours() >= 24 && duration.toHours() < 48) {
            commentAt = "昨天 ".concat(DateUtils.formatDateTimeOnlyTime(commentTime));
        }
        if (duration.toHours() >= 48) {
            commentAt = DateUtils.formatDateTimeFromMonth(commentTime);
        }

        return commentAt;
    }
}