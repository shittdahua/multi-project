package com.stone.multiproject.utils;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.apache.commons.lang3.time.DateUtils.MILLIS_PER_MINUTE;
import static org.apache.commons.lang3.time.DateUtils.MILLIS_PER_SECOND;

@UtilityClass
@Slf4j
public class DateHelp {

    public static final String DATE_FORMAT_YMD = "yyyy-MM-dd";
    public static final String DATE_FORMAT_HMS = "HH:mm:ss";
    public static final String DATE_FORMAT_HM = "HH:mm";
    public static final String DATE_FORMAT_YMDHM = "yyyy-MM-dd HH:mm";
    public static final String DATE_FORMAT_YMDHMS = "yyyyMMddHHmmss";
    public static final String DAYTIME_START = "00:00:00";
    public static final String DAYTIME_END = "23:59:59";
    public static final String DATE_SHORT_FORMAT = "yyyyMMdd";
    public static final String DATE_CH_FORMAT = "yyyy年MM月dd日";
    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_FORMAT = "yyyy-MM-dd";
    public static final String DATE_MONTH_FORMAT = "yyyy-MM";

    private static final String[] FORMATS = {"yyyy-MM-dd", "yyyy-MM-dd HH:mm",
            "yyyy-MM-dd HH:mm:ss", "HH:mm", "HH:mm:ss", "yyyy-MM",
            "yyyy-MM-dd HH:mm:ss.S"};

    /**
     * 字符串转换成日期 主要解决json传入日期问题
     */
    public static Date convert(String str) {
        if (str != null && str.length() > 0) {
            if (str.length() > 10 && str.charAt(10) == 'T') {
                str = str.replace('T', ' ');// 去掉json-lib加的T字母
            }
            for (String format : FORMATS) {
                if (format.length() == str.length()) {
                    try {
                        Date date = new SimpleDateFormat(format).parse(str);
                        return date;
                    } catch (ParseException e) {
                        log.error(StringUtils.EMPTY, e);
                    }
                }
            }
        }
        return null;
    }

    public String formatNow() {
        return convert(new Date(), DATE_TIME_FORMAT);
    }

    public String formatDefault(Date date) {
        return convert(date, DATE_TIME_FORMAT);
    }

    /**
     * 字符串、日期格式 转换日期
     *
     * @param format 例如: "yyyy-MM-dd HH:mm:ss"
     * @param str    例如: "2012-12-03 23:21:24"
     */
    public static Date convert(String str, String format) {
        if (!StringUtils.isEmpty(str)) {
            try {
                Date date = new SimpleDateFormat(format).parse(str);
                return date;
            } catch (ParseException e) {
                log.error(StringUtils.EMPTY, e);
            }
        }
        return null;
    }

    /**
     * 将日期转换成format字符串
     *
     * @param date       例如: Sun Jun 10 09:18:00 CST 2018
     * @param dateFormat 例如: "yyyy-MM-dd HH:mm:ss"
     */
    public static String convert(Date date, String dateFormat) {
        if (date == null) {
            return null;
        }
        if (null == dateFormat) {
            dateFormat = DATE_TIME_FORMAT;
        }
        return new SimpleDateFormat(dateFormat).format(date);
    }

    /**
     * 根据传入的日期  转换成这样格式的字符串 如：“yyyy-MM-dd HH:mm:ss”
     */
    public static String convert(Date date) {
        return convert(date, DATE_TIME_FORMAT);
    }

    /**
     * 根据传入的日期返回年月日的6位字符串，例：20101203
     */
    public static String getDay(Date date) {
        return convert(date, DATE_SHORT_FORMAT);
    }

    /**
     * 根据传入的日期返回中文年月日字符串，例：2010年12月03日
     */
    public static String getChDate(Date date) {
        return convert(date, DATE_CH_FORMAT);
    }

    /**
     * 返回该天从00:00:00开始的日期
     */
    public static Date getStartDatetime(Date date) {
        String thisDate = convert(date, DATE_FORMAT);
        return convert(thisDate + " " + DAYTIME_START);
    }

    /**
     * 返回该天到23:59:59结束的日期
     */
    public static Date getEndDatetime(Date date) {
        String thisDate = convert(date, DATE_FORMAT);
        return convert(thisDate + " " + DAYTIME_END);
    }

    /**
     * 将传入的时间格式的字符串转成时间对象      例如：传入2012-12-03 23:21:24
     */
    public static Date strToDate(String dateStr) {
        SimpleDateFormat formatDate = new SimpleDateFormat(DATE_TIME_FORMAT);
        Date date = null;
        try {
            date = formatDate.parse(dateStr);
        } catch (Exception e) {

        }
        return date;
    }

    /**
     * 返回该日期的最后一刻，精确到纳秒
     */
    public static Timestamp getLastEndDatetime(Date endTime) {
        Timestamp ts = new Timestamp(endTime.getTime());
        ts.setNanos(999999999);
        return ts;
    }

    /**
     * 返回该日期加1秒
     */
    public static Timestamp getEndTimeAdd(Date endTime) {
        Timestamp ts = new Timestamp(endTime.getTime());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(ts);
        calendar.add(Calendar.MILLISECOND, 1000);
        calendar.set(Calendar.MILLISECOND, 0);
        return new Timestamp(calendar.getTimeInMillis());
    }

    /**
     * 返回该日期加 millisecond 毫秒，正数为加，负数为减
     */
    public static Timestamp getDateAdd(Date date, int millisecond) {
        Timestamp ts = new Timestamp(date.getTime());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(ts);
        calendar.add(Calendar.MILLISECOND, millisecond);
        calendar.set(Calendar.MILLISECOND, 0);
        return new Timestamp(calendar.getTimeInMillis());
    }

    /**
     * 相对当前日期，增加或减少天数
     */
    public static Date addDay(Date date, int day) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT);
        DateTime dateTime = new DateTime(date);
        dateTime.plusDays(day);
        return dateTime.toDate();
    }

    /**
     * 返回两个时间的相差分钟数
     */
    public static Long getMinuteDiff(Date startTime, Date endTime) {
        Long minutes = null;

        Calendar c = Calendar.getInstance();
        c.setTime(startTime);
        long l_s = c.getTimeInMillis();
        c.setTime(endTime);
        long l_e = c.getTimeInMillis();
        minutes = (l_e - l_s) / MILLIS_PER_MINUTE;
        return minutes;
    }

    /**
     * 返回两个时间的相差秒数
     */
    public static Long getSecondDiff(Date startTime, Date endTime) {
        return (endTime.getTime() - startTime.getTime()) / MILLIS_PER_SECOND;
    }

    /**
     * 返回两个时间的相差月数
     */
    public static int getMonthDiff(Date startTime, Date endTime) {
        int months = 0;

        Calendar startCalendar = Calendar.getInstance();
        Calendar endCalendar = Calendar.getInstance();
        startCalendar.setTime(startTime);
        endCalendar.setTime(endTime);
        months = endCalendar.get(Calendar.MONTH) - startCalendar.get(Calendar.MONTH);
        return months;
    }
}
