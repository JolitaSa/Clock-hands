/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.task.clockHands.app;

import com.task.clockHands.angle.CountAngle;
import com.task.clockHands.model.AClock;
import java.util.Scanner;

/**
 *
 * @author Jolita
 */
public class AClockApp {

    public static void main(String[] args) {

        AClock clock = new AClock();
        CountAngle angle = new CountAngle();
        Scanner input = new Scanner(System.in);
        int hour = 0;
        int minute = 0;
        try {
            do {
                System.out.println("Please enter a digit value for hours - a whole number from 1 to 12 (inclusive).");
                hour = input.nextInt();
            } while (!(isValidHour(hour)));
            clock.setHourHand(hour);

            do {
                System.out.println("Please enter a value for minutes - a whole number from 0 to 59 (inclusive).");
                minute = input.nextInt();
            } while (!(isValidMinute(minute)));
            clock.setMinuteHand(minute);

            System.out.println("Angle between clock hour hand and minute hand is " + angle.countAngle(clock) + " degrees.");

        } catch (Exception e) {
            System.out.println("Entered value is not acceptable. Please try again.");
        }
    }

    private static boolean isValidHour(int hour) {
        if ((hour % 1 != 0) || (hour < 1 || hour > 12)) {
            System.out.println("Entered value is not valid for hours.");
            return false;
        } else {
            return true;
        }
    }

    private static boolean isValidMinute(int minute) {
        if ((minute % 1 != 0) || (minute < 0 || minute > 59)) {
            System.out.println("Entered value is not valid for minutes.");
            return false;
        } else {
            return true;
        }
    }

}
