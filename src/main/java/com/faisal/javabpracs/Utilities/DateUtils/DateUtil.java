package com.faisal.javabpracs.Utilities.DateUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    private final SimpleDateFormat FORMAT_ISO8601 = new SimpleDateFormat("yyyy-MM-dd");
    private final SimpleDateFormat FORMAT_ISO8601_TIME = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private final SimpleDateFormat FORMAT_YYYYMMDD = new SimpleDateFormat("yyyyMMdd");
    private final SimpleDateFormat FORMAT_DDMMYYYY = new SimpleDateFormat("ddMMyyyy");
    private final SimpleDateFormat FORMAT_DD_MON_YYYY = new SimpleDateFormat("dd-MMM-yyyy");

    public DateUtil() {}

    public static Date now() {
        return new Date();
    }

    public static Date epochToDate(String epoch) {
        Date date = new Date(Long.parseLong(epoch));

        return date;
    }
}
