package com.example.chattingroom.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static String getNowDateTime() {
        String pattern;
        SimpleDateFormat sdf = new SimpleDateFormat( pattern: "yyyyMMddHHmmss");
        return sdf.format(new Date());
    }
    public static String getNowTime() {
        String pattern;
        SimpleDateFormat sdf = new SimpleDateFormat( pattern: "HH:MM:ss");
    }
}
