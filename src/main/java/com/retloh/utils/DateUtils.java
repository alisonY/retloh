package com.retloh.utils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.retloh.controller.BloodPressureController;

/**
 * 时间处理工具类<br>
 * 
 */
public class DateUtils {

	
	private static final Logger logger     = LoggerFactory.getLogger(BloodPressureController.class);
    /**
     * 默认时间格式
     */
    public static final String  DEFAULT_DATE_PATTERN       = "yyyy-MM-dd HH:mm:ss.SSS";

    /**
     * 当天时间，二十四小时制
     */
    public static final String  DEFAULT_TODAY_PATTERN      = "HH:mm";

    /**
     * 昨天格式
     */
    public static final String  DEFUALT_YESTERDAY_PATTERN  = "昨天 HH:mm";

    /**
     * 月日格式
     */
    public static final String  DEFAULT_MONTH_AND_DAY      = "M月d日 HH:mm";
    /**
     * 年月日格式
     */
    public static final String  DEFAULT_YEAR_MONTH_DAY     = "yyyy-MM-dd HH:mm";
    /**
     * 年月日时分秒格式
     */
    public static final String  DEFAULT_YEAR_MONTH_DAY_HMS = "yyyy-MM-dd HH:mm:ss";

    /**
     * MONDAY
     */
    public static final String  MONDAY                     = "星期一";
    /**
     * TUESDAY
     */
    public static final String  TUESDAY                    = "星期二";
    /**
     * WEDNESDAY
     */
    public static final String  WEDNESDAY                  = "星期三";
    /**
     * THURSDAY
     */
    public static final String  THURSDAY                   = "星期四";
    /**
     * FRIDAY
     */
    public static final String  FRIDAY                     = "星期五";
    /**
     * SATURDAY
     */
    public static final String  SATURDAY                   = "星期六";
    /**
     * SUNDAY
     */
    public static final String  SUNDAY                     = "星期日";

    /**
     * 日期不能为空提示信息
     */
    private static final String DATE_NULL_MSG              = "The date must not be null";
    
    /**
     *  24小时制 yyyy-MM-dd HH:mm:ss 
     */
    public static final String   DATETIMEPATTERN24H  = "yyyy-MM-dd HH:mm:ss";

    /** 
     * Base ISO 8601 Date format yyyyMMdd i.e., 20021225 for the 25th day of December in the year 2002 
     */
    public static final String   ISO_DATE_FORMAT     = "yyyyMMdd";

    /** 
     * Default lenient setting for getDate. 
     */
    private static final boolean LENIENTDATE         = false;

    /** 
     * 一天的秒数
     **/
    private static final int     DAYSERCOND          = 24 * 60 * 60;
    
    /** 
     * timestamp最小值 1970-01-01 00:00:00 
     **/
    private static final long    TIMESTAMP_RANGE_MIN = -28800000L;
    
    /** 
     * timestamp最大值 2037-12-31 23:59:59 
     **/
    private static final long    TIMESTAMP_RANGE_MAX = 2145887999000L;

    /**
     * 私有化构造函数
     */
    private DateUtils() {
    }

    /**
     * 处理时间戳为格式化字符串<br>
     * 
     * @param timestamp
     * @param pattern
     * @return
     */
    public static String format(long timestamp,
                                String pattern) {
        Date date = new Date(timestamp);
        return format(date, pattern);
    }

    /**
     * 处理时间为格式化字符串<br>
     * 
     * @param date
     * @param pattern
     * @return
     */
    public static String format(Date date,
                                String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }

    /**
     * 解析时间字符串<br>
     * 
     * @param source
     * @param pattern
     * @return
     */
    public static Date parse(String source,
                             String pattern) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            return simpleDateFormat.parse(source);
        } catch (ParseException e) {
            return null;
        }
    }

    /**
     * 是否同一天<br>
     * 
     * @param date1
     * @param date2
     * @return
     */
    public static boolean isSameday(Date date1,
                                    Date date2) {
        if (date1 == null || date2 == null) {
            throw new IllegalArgumentException(DATE_NULL_MSG);
        }
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        return isSameday(cal1, cal2);
    }

    /**
     * 是否同一天<br>
     * 
     * @param cal1
     * @param cal2
     * @return
     */
    public static boolean isSameday(Calendar cal1,
                                    Calendar cal2) {
        if (cal1 == null || cal2 == null) {
            throw new IllegalArgumentException(DATE_NULL_MSG);
        }
        return cal1.get(Calendar.ERA) == cal2.get(Calendar.ERA) && cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) && cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR);
    }

    /**
     * 是否昨天<br>
     * 
     * @param date1
     * @param date2
     * @return
     */
    public static boolean isYesterday(Date date1,
                                      Date date2) {
        if (date1 == null || date2 == null) {
            throw new IllegalArgumentException(DATE_NULL_MSG);
        }
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        return isYesterday(cal1, cal2);
    }

    /**
     * 是否昨天<br>
     * 
     * @param cal1
     * @param cal2
     * @return
     */
    public static boolean isYesterday(Calendar cal1,
                                      Calendar cal2) {
        if (cal1 == null || cal2 == null) {
            throw new IllegalArgumentException(DATE_NULL_MSG);
        }

        return cal1.get(Calendar.ERA) == cal2.get(Calendar.ERA) && cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) && (cal1.get(Calendar.DAY_OF_YEAR) - 1 == cal2.get(Calendar.DAY_OF_YEAR) || cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR) - 1);
    }

    /**
     * 是否本周<br>
     * 
     * @param date1
     * @param date2
     * @return
     */
    public static boolean isSameweek(Date date1,
                                     Date date2) {
        if (date1 == null || date2 == null) {
            throw new IllegalArgumentException(DATE_NULL_MSG);
        }
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        return isSameweek(cal1, cal2);
    }

    /**
     * 是否本周<br>
     * 
     * @param cal1
     * @param cal2
     * @return
     */
    public static boolean isSameweek(Calendar cal1,
                                     Calendar cal2) {
        if (cal1 == null || cal2 == null) {
            throw new IllegalArgumentException(DATE_NULL_MSG);
        }

        return cal1.get(Calendar.ERA) == cal2.get(Calendar.ERA) && cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) && cal1.get(Calendar.WEEK_OF_MONTH) == cal2.get(Calendar.WEEK_OF_MONTH);
    }

    /**
     * 是否本年<br>
     * 
     * @param date1
     * @param date2
     * @return
     */
    public static boolean isSameyear(Date date1,
                                     Date date2) {
        if (date1 == null || date2 == null) {
            throw new IllegalArgumentException(DATE_NULL_MSG);
        }
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        return isSameyear(cal1, cal2);
    }

    /**
     * 是否本年<br>
     * 
     * @param cal1
     * @param cal2
     * @return
     */
    public static boolean isSameyear(Calendar cal1,
                                     Calendar cal2) {
        if (cal1 == null || cal2 == null) {
            throw new IllegalArgumentException(DATE_NULL_MSG);
        }

        return cal1.get(Calendar.ERA) == cal2.get(Calendar.ERA) && cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR);
    }

    /**
     * 取一天内的小时数，二十四小时制<br>
     * 
     * @param calendar
     * @return
     */
    public static String toToday(Date date) {
        return format(date, DEFAULT_TODAY_PATTERN);
    }

    /**
     * 昨天时间格式<br>
     * 
     * @param date
     * @return
     */
    public static String toYesterday(Date date) {
        return format(date, DEFUALT_YESTERDAY_PATTERN);
    }

    /**
     * 取星期几<br>
     * 
     * @param calendar
     * @return
     */
    public static String toDayOfWeek(Calendar calendar) {
        String when = null;
        if (Calendar.MONDAY == calendar.get(Calendar.DAY_OF_WEEK)) {

            when = MONDAY;
        } else if (Calendar.TUESDAY == calendar.get(Calendar.DAY_OF_WEEK)) {

            when = TUESDAY;
        } else if (Calendar.WEDNESDAY == calendar.get(Calendar.DAY_OF_WEEK)) {

            when = WEDNESDAY;
        } else if (Calendar.THURSDAY == calendar.get(Calendar.DAY_OF_WEEK)) {

            when = THURSDAY;
        } else if (Calendar.FRIDAY == calendar.get(Calendar.DAY_OF_WEEK)) {

            when = FRIDAY;
        } else if (Calendar.SATURDAY == calendar.get(Calendar.DAY_OF_WEEK)) {

            when = SATURDAY;
        } else if (Calendar.SUNDAY == calendar.get(Calendar.DAY_OF_WEEK)) {

            when = SUNDAY;
        }
        return when;
    }

    /**
     * 返回月日<br>
     * 
     * @param date
     * @return
     */
    public static String toMonthAndDay(Date date) {
        return format(date, DEFAULT_MONTH_AND_DAY);
    }

    /**
     * 返回年月日<br>
     * 
     * @param date
     * @return
     */
    public static String toYearMonthDay(Date date) {
        return format(date, DEFAULT_YEAR_MONTH_DAY);
    }

    /**
     * 格式化时间字符串<br>
     * <p>
     * 今天的：时间 24小时制
     * </p>
     * <p>
     * 昨天：昨天
     * </p>
     * <p>
     * 一周内：显示星期几
     * </p>
     * <p>
     * 大于一周小于一年：4-7
     * </p>
     * <p>
     * 大于一年：2012-4-7
     * </p>
     * 
     * @param source
     * @return
     */
    public static String formatDate(String source) {
        if (StringUtils.isNotBlank(source)) {
            Date date = DateUtils.parse(source, DateUtils.DEFAULT_DATE_PATTERN);

            if (date != null) {
                Date now = new Date();

                Calendar cal1 = Calendar.getInstance();
                cal1.setTime(now);
                Calendar cal2 = Calendar.getInstance();
                cal2.setTime(date);

                String result = null;

                if (DateUtils.isSameday(cal1, cal2)) {

                    result = DateUtils.toToday(date);
                } else if (DateUtils.isYesterday(cal1, cal2)) {

                    result = DateUtils.toYesterday(date);
                } else if (DateUtils.isSameweek(cal1, cal2)) {

                    String dayOfWeek = DateUtils.toDayOfWeek(cal2);
                    result = DateUtils.toToday(date);

                    if (StringUtils.isNotBlank(dayOfWeek)) {
                        result = dayOfWeek + " " + result;
                    }
                } else if (DateUtils.isSameyear(cal1, cal2)) {

                    result = DateUtils.toMonthAndDay(date);
                } else {

                    result = DateUtils.toYearMonthDay(date);
                }

                return result;
            }
        }

        return "";
    }
    
    /**
     * 功能描述: 验证时间戳是否在指定范围，避免保存到数据库报错<br>
     * timestamp最小值 1970-01-01 00:00:00，最大值 2037-12-31 23:59:59
     * 
     * @param longTime 待验证时间戳
     * @return true在指定范围，false不在
     * @version 2.0.0
     * @author guanyang/14050360
     */
    public static boolean validateTimestampRange(long longTime) {
        if (longTime >= TIMESTAMP_RANGE_MIN && longTime <= TIMESTAMP_RANGE_MAX) {
            return true;
        }
        return false;
    }

    /**
     * 返回当前日期字符串
     * 
     * @param pattern 日期字符串样式
     * @return
     */
    public static String getCurrentDateString(String pattern) {
        return dateToString(getCurrentDateTime(), pattern);
    }

    /**
     * 字符串转换为日期java.util.Date
     * 
     * @param dateText 字符串
     * @param format 日期格式
     * @return
     */
    public static Date stringToDate(String dateString,
                                    String format) {
        return stringToDate(dateString, format, LENIENTDATE);
    }

    /**
     * 字符串转换为日期java.sql.Date
     * 
     * @param dateText 字符串
     * @param format 日期格式
     * @return 数据库中的Date类型，只有年月日
     */
    public static java.sql.Date stringToSqlDate(String dateString,
                                                String format) {
        return new java.sql.Date(stringToDate(dateString, format, LENIENTDATE).getTime());
    }

    /**
     * 字符串转换为日期java.sql.Timestamp
     * 
     * @param dateText 字符串
     * @param format 日期格式
     * @return 数据库中的Date类型，只有年月日
     */
    public static java.sql.Timestamp stringToSqlTimestamp(String dateString,
                                                          String format) {
        return new java.sql.Timestamp(stringToDate(dateString, format, LENIENTDATE).getTime());
    }

    /**
     * 字符串转换为日期java.util.Date
     * 
     * @param dateText 字符串
     * @param format 日期格式
     * @param lenient 日期越界标志
     * @return
     */
    public static Date stringToDate(String dateText,
                                    String format,
                                    boolean lenient) {
        if (dateText == null) {
            return null;
        }
        DateFormat df = null;

        try {
            if (format == null) {
                df = new SimpleDateFormat();
            } else {
                df = new SimpleDateFormat(format);
            }
            df.setLenient(false);
            df.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
            return df.parse(dateText);
        } catch (ParseException e) {
            logger.error(e.getMessage(), e);
            return null;
        }
    }

    /**
     * 返回当前时间
     * 
     * @return 返回当前时间
     */
    public static Date getCurrentDateTime() {
        java.util.Calendar calNow = java.util.Calendar.getInstance();
        java.util.Date dtNow = calNow.getTime();

        return dtNow;
    }

    /**
     * 根据时间变量返回时间字符串
     * 
     * @return 返回时间字符串
     * @param pattern 时间字符串样式
     * @param date 时间变量
     */
    public static String dateToString(Object date,
                                      String pattern) {
        if (date == null) {
            return null;
        }
        try {
            SimpleDateFormat sfDate = new SimpleDateFormat(pattern);
            sfDate.setLenient(false);
            return sfDate.format(date);
        } catch (RuntimeException e) {
            logger.error(e.getMessage(), e);
            return null;
        }
    }

    /**
     * 获取几天的秒数
     * 
     * @param day
     * @return
     */
    public static int transformDayToSecond(int day) {
        return day * DAYSERCOND;
    }

    /**
     * 取得当前年
     * 
     * @return
     */
    public static int getCurrentYear() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy");
        return Integer.parseInt(df.format(new Date()));
    }

    /**
     * 字符串转换成Timestamp类型 格式 :yyyy-MM-dd HH:mm:ss 张静萌
     * 
     * @param timeString
     * @return
     * @throws ParseException
     */
    public static Timestamp stringToTimestamp(String timeString) throws ParseException {
        SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Timestamp result = null;

        if (timeString != null && !"".equals(timeString.trim())) {
            // 去掉尾部的.0
            if (timeString.contains(".")) {
                int index = timeString.indexOf(".");
                timeString = timeString.substring(0, index);
            }
            result = new Timestamp(dataFormat.parse(timeString).getTime());
        }
        return result;
    }
    
    /**
	 * 获取day天前的日期
	 * @param day
	 * @return
	 */
	public static Date getDateBefore(int day) {
		Date date=new Date();
        Calendar now = Calendar.getInstance();  
        now.setTime(date);  
        now.set(Calendar.DATE, now.get(Calendar.DATE) - day);
        //SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //return sdf.format(now.getTime());
        return now.getTime();
    }
    
    public static void main(String[] args) {
        System.out.println(getCurrentYear());
        System.out.println(stringToDate("2014-07-08", "yyyy-MM-dd"));
        System.out.println(stringToDate("2014-07-08 03:05:02", DATETIMEPATTERN24H));
        System.out.println(stringToSqlDate("2014-07-08 03:05:02", DATETIMEPATTERN24H));
        System.out.println(stringToSqlTimestamp("2014-07-08 03:05:02", DATETIMEPATTERN24H));
    }
    
}
