package com.ubs.opsit.interviews;

public class TimeConverterImpl implements TimeConverter {

    TimeConverterHelper timeConverterHelper = new TimeConverterHelper();

    public String convertTime(String aTime) {
        StringBuffer berlineClockTime = new StringBuffer();
        String[] timeArray = aTime.split(Constants.CLOCK_REGEX);

        //Y\r\nOOOO\r\nOOOO\r\nOOOOOOOOOOO\r\nOOOO
        //Y\r\nRRRR\r\nRRRR\r\nOOOOOOOOOOO\r\nOOOO


        timeConverterHelper.determineLightSecond(berlineClockTime, timeArray[2]);

        berlineClockTime.append(Constants.LINE_SEPARATOR);

        timeConverterHelper.determineLightFiveHour(berlineClockTime, timeArray[0]);

        berlineClockTime.append(Constants.LINE_SEPARATOR);

        timeConverterHelper.determineLightOneHourOrMinute(berlineClockTime, timeArray, 0, Constants.CLOCK_LIGHT_RED, Constants.CLOCK_LIGHT_OFF);

        berlineClockTime.append(Constants.LINE_SEPARATOR);

        timeConverterHelper.determineLightFiveMinute(berlineClockTime, timeArray[1]);

        berlineClockTime.append(Constants.LINE_SEPARATOR);

        timeConverterHelper.determineLightOneHourOrMinute(berlineClockTime, timeArray, 1, Constants.CLOCK_LIGHT_YELLOW, Constants.CLOCK_LIGHT_OFF);


        return berlineClockTime.toString();
    }


}
