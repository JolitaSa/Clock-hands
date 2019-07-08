/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.task.clockHands.angle;

import com.task.clockHands.model.AClock;

/**
 *
 * @author Jolita
 */
public class CountAngle {

    private final int CLOCK_DEGREES = 360; // full number of degrees in a clock circle
    private final int HALF_CLOCK_DEGREES = 180; // for finding lower angle

// 60 is the number of minutes on a clock. Dividing: 360/60 = 6 - number of degrees for one minute.
    private final int MINUTE_DEGREES = 6;

// 12 is the number of hours on a clock. Dividing: 360/12 = 30 - number of degrees for one hour.
    private final int HOUR_DEGREES = 30;

// 60 is the number of minutes on a clock. 30 is the number of degrees for one hour. 
//Dividing: 30/60 = 0.5 - number of degrees for hour hand move depending on one minute hand move.
    private final double HOUR_DEP_DEGREES = 0.5;

    public int countMinuteDegree(AClock clock) {
        int minutePosition = clock.getMinuteHand() * MINUTE_DEGREES;
        return minutePosition;
    }

    public double countHourDegree(AClock clock) {
        double hourStartPosition = clock.getHourHand() * HOUR_DEGREES;
        double hourDepPosition = hourStartPosition + (clock.getMinuteHand() * HOUR_DEP_DEGREES);
        return hourDepPosition;
    }

    public double countAngle(AClock clock) {
        if (countHourDegree(clock) > countMinuteDegree(clock)) {
            double resultAngle1 = countHourDegree(clock) - countMinuteDegree(clock);
            {
                if (resultAngle1 >= HALF_CLOCK_DEGREES) {
                    return CLOCK_DEGREES - resultAngle1;
                } else {
                    return resultAngle1;
                }
            }
        } else if (countHourDegree(clock) < countMinuteDegree(clock)) {
            double resultAngle2 = countMinuteDegree(clock) - countHourDegree(clock);
            {
                if (resultAngle2 >= HALF_CLOCK_DEGREES) {
                    return CLOCK_DEGREES - resultAngle2;
                } else {
                    return countMinuteDegree(clock) - countHourDegree(clock);
                }
            }
        } else {
            return 0;
        }
    }
}
