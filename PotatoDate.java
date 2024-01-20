package com.potato.commonpro.util;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class PotatoDate {

    Date date;

    /**
     * 默认构造方法为当前时间
     */
    public PotatoDate() {
        this.date = new Date();
    }

    public PotatoDate(String dateStr) throws ParseException {
        try {
            String patten = "yyyy-MM-dd HH:mm:ss";
            SimpleDateFormat sdf = new SimpleDateFormat(patten);
            this.date = sdf.parse(dateStr);
        } catch (ParseException e) {
            String patten = "yyyy-MM-dd";
            SimpleDateFormat sdf = new SimpleDateFormat(patten);
            this.date = sdf.parse(dateStr);
        }
    }

    public PotatoDate(String dateStr, String patten) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(patten);
        this.date = sdf.parse(dateStr);
    }

    public PotatoDate(long timeStamp) {
        this.date = new Date(timeStamp);
    }

    public PotatoDate(Date date) {
        this.date = date;
    }

    /**
     * 增加日期
     *
     * @param field
     * @param amount
     * @return
     */
    public PotatoDate add(String field, int amount) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);

        switch (field) {
            case "year":
                calendar.add(Calendar.YEAR, amount);
                break;
            case "month":
                calendar.add(Calendar.MONTH, amount);
                break;
            case "week":
                calendar.add(Calendar.WEEK_OF_YEAR, amount);
                break;
            case "day":
                calendar.add(Calendar.DATE, amount);
                break;
            case "hour":
                calendar.add(Calendar.HOUR_OF_DAY, amount);
                break;
            case "minute":
                calendar.add(Calendar.MINUTE, amount);
                break;
            case "second":
                calendar.add(Calendar.SECOND, amount);
                break;
            case "millisecond":
                calendar.add(Calendar.MILLISECOND, amount);
                break;
        }

        this.date = calendar.getTime();
        return this;
    }

    /**
     * 减少日期
     *
     * @param field
     * @param amount
     * @return
     */
    public PotatoDate substract(String field, int amount) {
        return add(field, amount * -1);
    }

    public PotatoDate addYear(int amount) {
        return add("year", amount);
    }

    public PotatoDate substractYear(int amount) {
        return addYear(amount * -1);
    }

    public PotatoDate addMonth(int amount) {
        return add("month", amount);
    }

    public PotatoDate substractMonth(int amount) {
        return addMonth(amount * -1);
    }

    public PotatoDate addWeek(int amount) {
        return add("week", amount);
    }

    public PotatoDate substractWeek(int amount) {
        return addWeek(amount * -1);
    }

    public PotatoDate addDay(int amount) {
        return add("day", amount);
    }

    public PotatoDate substractDay(int amount) {
        return addDay(amount * -1);
    }

    public PotatoDate addHour(int amount) {
        return add("hour", amount);
    }

    public PotatoDate substractHour(int amount) {
        return addHour(amount * -1);
    }

    public PotatoDate addMinute(int amount) {
        return add("minute", amount);
    }

    public PotatoDate substractMinute(int amount) {
        return addMinute(amount * -1);
    }

    public PotatoDate addSecond(int amount) {
        return add("second", amount);
    }

    public PotatoDate substractSecond(int amount) {
        return addSecond(amount * -1);
    }

    public PotatoDate addMillisecond(int amount) {
        return add("millisecond", amount);
    }

    public PotatoDate substractMillisecond(int amount) {
        return addMillisecond(amount * -1);
    }

    /**
     * 获取时间戳
     *
     * @return
     */
    public long getTimeStamp() {
        return this.date.getTime();
    }


    /**
     * 格式化成字符串，默认格式化为 yyyy-MM-dd HH:mm:ss
     *
     * @return
     */
    public String format() {
        return format("yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 格式化成指定格式
     *
     * @param patten
     * @return
     */
    public String format(String patten) {
        SimpleDateFormat sdf = new SimpleDateFormat(patten);
        return sdf.format(this.date);
    }

    /**
     * 格式化为 yyyy-MM-dd
     *
     * @return
     */
    public String formatDate() {
        return format("yyyy-MM-dd");
    }

    /**
     * 格式化为 yyyy-MM-dd HH:mm:ss
     *
     * @return
     */
    public String formatDateTime() {
        return format("yyyy-MM-dd HH:mm:ss");
    }


    /**
     * 直接使用Date的toString方法
     *
     * @return
     */
    @Override
    public String toString() {
        return date.toString();
    }

    /**
     * 转化为Date 对象
     *
     * @return
     */
    public Date toDate() {
        return date;
    }

    public int year() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        return calendar.get(Calendar.YEAR);
    }

    public PotatoDate year(int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        calendar.set(Calendar.YEAR, year);
        this.date = calendar.getTime();
        return this;
    }

    public int month() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        return calendar.get(Calendar.MONTH);
    }

    public PotatoDate month(int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        calendar.set(Calendar.MONTH, month);
        this.date = calendar.getTime();
        return this;
    }

    public int week() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        return calendar.get(Calendar.WEEK_OF_YEAR);
    }

    public PotatoDate week(int week) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        calendar.set(Calendar.WEEK_OF_YEAR, week);
        this.date = calendar.getTime();
        return this;
    }

    public int day() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        return calendar.get(Calendar.DATE);
    }

    public PotatoDate day(int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        calendar.set(Calendar.DATE, day);
        this.date = calendar.getTime();
        return this;
    }

    public int hour() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        return calendar.get(Calendar.HOUR_OF_DAY);
    }

    public PotatoDate hour(int hour) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        this.date = calendar.getTime();
        return this;
    }

    public int minute() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        return calendar.get(Calendar.MINUTE);
    }

    public PotatoDate minute(int minute) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        calendar.set(Calendar.MINUTE, minute);
        this.date = calendar.getTime();
        return this;
    }

    public int second() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        return calendar.get(Calendar.SECOND);
    }

    public PotatoDate second(int second) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        calendar.set(Calendar.SECOND, second);
        this.date = calendar.getTime();
        return this;
    }

    public int millisecond() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        return calendar.get(Calendar.MILLISECOND);
    }

    public PotatoDate millisecond(int millisecond) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        calendar.set(Calendar.MILLISECOND, millisecond);
        this.date = calendar.getTime();
        return this;
    }

    public PotatoDate startOf(String filed) {
        switch (filed) {
            case "year":
                return startOfYear();
            case "month":
                return startOfMonth();
            case "week":
                return startOfWeek();
            case "day":
                return startOfDay();
            case "hour":
                return startOfHour();
            case "minite":
                return startOfMinute();
            case "second":
                return startOfSecond();
        }
        return this;
    }

    public PotatoDate startOfYear() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        calendar.set(Calendar.DAY_OF_YEAR, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        this.date = calendar.getTime();
        return this;
    }

    public PotatoDate startOfMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        this.date = calendar.getTime();
        return this;
    }

    public PotatoDate startOfWeek() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);

        int firstDay = calendar.getFirstDayOfWeek();
        int offset = calendar.get(Calendar.DAY_OF_WEEK) - firstDay;
        if (offset < 0) offset += 7;
        calendar.add(Calendar.DATE, -offset);

        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        this.date = calendar.getTime();
        return this;
    }

    public PotatoDate startOfDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);

        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        this.date = calendar.getTime();
        return this;
    }

    public PotatoDate startOfHour() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);

        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        this.date = calendar.getTime();
        return this;
    }

    public PotatoDate startOfMinute() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);

        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        this.date = calendar.getTime();
        return this;
    }

    public PotatoDate startOfSecond() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.date);
        calendar.set(Calendar.MILLISECOND, 0);
        this.date = calendar.getTime();
        return this;
    }

    public PotatoDate endOfYear() {
        return startOfYear().addYear(1).substractMillisecond(1);
    }

    public PotatoDate endOfMonth() {
        return startOfMonth().addMonth(1).substractMillisecond(1);
    }

    public PotatoDate endOfWeek() {
        return startOfWeek().addDay(7).substractMillisecond(1);
    }

    public PotatoDate endOfDay() {
        return startOfDay().addDay(1).substractMillisecond(1);
    }

    public PotatoDate endOfHour() {
        return startOfHour().addHour(1).substractMillisecond(1);
    }

    public PotatoDate endOfMinute() {
        return startOfMinute().addMinute(1).substractMillisecond(1);
    }

    public PotatoDate endOfSecond() {
        return startOfSecond().addSecond(1).substractMillisecond(1);
    }

}
