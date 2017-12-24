package com.faisal.javabpracs.Utilities.DateUtils;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class DateUtilTest {

    @Test
    public void now() {
        Date actualValue = DateUtil.now();

        assertNotNull(actualValue);
    }

    @Test
    public void epochToDate() {
        String expectedValue = "Thu Jul 01 00:00:00 WIB 2010";
        Date actualValue = DateUtil.epochToDate("1277917200000");

        assertEquals(actualValue.toString(), expectedValue);
    }
}