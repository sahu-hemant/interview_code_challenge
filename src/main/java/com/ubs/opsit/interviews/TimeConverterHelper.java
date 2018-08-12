package com.ubs.opsit.interviews;

public class TimeConverterHelper {

    public void determineLightFiveMinute(StringBuffer berlineClockTime, String minutes) {
        int fiveMinutes = Integer.parseInt(minutes) / 5;
        for (int i = 0; i < 11; i++) {

            if (i < fiveMinutes) {
                if (((i + 1) % 3) != 0) {
                    berlineClockTime.append(Constants.CLOCK_LIGHT_YELLOW);
                } else {
                    berlineClockTime.append(Constants.CLOCK_LIGHT_RED);
                }
            } else {
                berlineClockTime.append(Constants.CLOCK_LIGHT_OFF);
            }
        }
    }

    public void determineLightFiveHour(StringBuffer berlineClockTime, String hours) {
        int fiveHours = Integer.parseInt(hours) / 5;
        for (int i = 0; i < 4; i++) {
            if (i < fiveHours) {
                berlineClockTime.append(Constants.CLOCK_LIGHT_RED);
            } else {
                berlineClockTime.append(Constants.CLOCK_LIGHT_OFF);
            }
        }
    }

    public void determineLightSecond(StringBuffer berlineClockTime, String seconds) {
        if (Integer.parseInt(seconds) % 2 == 0) {
            berlineClockTime.append(Constants.CLOCK_LIGHT_YELLOW);
        } else {
            berlineClockTime.append(Constants.CLOCK_LIGHT_OFF);
        }
    }

    public void determineLightOneHourOrMinute(StringBuffer berlineClockTime, String[] timeArray, int hourOrMinuteIndex, String clockLightOn, String clockLightOff) {
        int oneMinutes = Integer.parseInt(timeArray[hourOrMinuteIndex]) % 5;
        for (int i = 0; i < 4; i++) {
            if (i < oneMinutes) {
                berlineClockTime.append(clockLightOn);
            } else {
                berlineClockTime.append(clockLightOff);
            }
        }
    }
}
