package org.hyc.datetime;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * org.apache.commons.lang3 DateUtils/DateFormatUtils study
 * @author hyc
 */
public class DateTimeStudy {
    public static void main(String[] args) throws ParseException {
        // Date 转化为字符串
        System.out.println(DateFormatUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss"));
        // 字符串 转 Date
        System.out.println(DateUtils.parseDate("2020-05-07 22:00:00","yyyy-MM-dd HH:mm:ss"));

        Date now = new Date();
        // Date 加 1 天
        Date addDays = DateUtils.addDays(now, 1);
        System.out.println(addDays);
        // Date 加 33 分钟
        Date addMinutes = DateUtils.addMinutes(now, 33);
        System.out.println(addMinutes);
        // Date 减去 233 秒
        Date addSeconds = DateUtils.addSeconds(now, -233);
        System.out.println(addSeconds);
        // 判断是否同一天
        boolean sameDay = DateUtils.isSameDay(addDays, addMinutes);
        System.out.println(sameDay);
        // 过滤时分秒,若 now 为 2020-05-07 22:13:00 调用 truncate 方法以后
        // 返回时间为 2020-05-07 00:00:00
        Date truncate = DateUtils.truncate(now, Calendar.DATE);
        System.out.println(truncate);

        // Date-----> LocalDateTime 这里指定使用当前系统默认时区
        LocalDateTime localDateTime = now.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println(localDateTime);
        // LocalDateTime------> Date 这里指定使用当前系统默认时区
        Date date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(date);

        // 按照 yyyy-MM-dd HH:mm:ss 转化时间
        // LocalDateTime 的toString方法，可以看到遵循的是国际标准ISO 8601 日期和时间的组合表示时：要在时间前面加一大写字母T
        LocalDateTime dateTime = LocalDateTime.parse("2020-05-07 22:34:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(dateTime);
        // 将 LocalDateTime 格式化字符串
        String format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(dateTime);
        System.out.println(format);

        LocalDateTime present = LocalDateTime.now();
        // 年
        int year = present.getYear();
        System.out.println(year);
        // 月
        int month = present.getMonthValue();
        System.out.println(month);
        // 日
        int day = present.getDayOfMonth();
        System.out.println(day);

       // 当前时间加一天
        LocalDateTime plusDays = present.plusDays(1L);
        System.out.println(plusDays);
        // 当前时间减一个小时
        LocalDateTime minusHours = present.minusHours(1L);
        System.out.println(minusHours);
    }
}
