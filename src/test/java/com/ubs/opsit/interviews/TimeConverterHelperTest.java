package com.ubs.opsit.interviews;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TimeConverterHelperTest {

    TimeConverterHelper timeConverterHelper;
    StringBuffer berlineClockTime;
    String[] timeArray;

    @Before
    public void setup() {
        timeConverterHelper = new TimeConverterHelper();
        timeArray = new String("14:19:21").split(Constants.CLOCK_REGEX);
        berlineClockTime = new StringBuffer();
    }

    @Test
    public void testDetermineLightSecond() {
        timeConverterHelper.determineLightSecond(berlineClockTime, timeArray[2]);
        Assert.assertEquals("O", berlineClockTime.toString());
    }

    @Test
    public void testDetermineLightFiveHour() {
        timeConverterHelper.determineLightFiveHour(berlineClockTime, timeArray[0]);
        Assert.assertEquals("RROO", berlineClockTime.toString());
    }

    @Test
    public void testDetermineLightOneHourOrMinute_Hour() {
        timeConverterHelper.determineLightOneHourOrMinute(berlineClockTime, timeArray, 0, Constants.CLOCK_LIGHT_RED, Constants.CLOCK_LIGHT_OFF);
        Assert.assertEquals("RRRR", berlineClockTime.toString());

    }

    @Test
    public void testDetermineLightFiveMinute() {
        timeConverterHelper.determineLightFiveMinute(berlineClockTime, timeArray[1]);
        Assert.assertEquals("YYROOOOOOOO", berlineClockTime.toString());

    }


    @Test
    public void testDetermineLightOneHourOrMinute_Minute() {
        timeConverterHelper.determineLightOneHourOrMinute(berlineClockTime, timeArray, 1, Constants.CLOCK_LIGHT_YELLOW, Constants.CLOCK_LIGHT_OFF);
        Assert.assertEquals("YYYY", berlineClockTime.toString());
    }


}
