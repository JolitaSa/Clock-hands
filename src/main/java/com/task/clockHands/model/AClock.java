/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.task.clockHands.model;

/**
 *
 * @author Jolita
 */
public class AClock {

    private int hourHand;
    private int minuteHand;

    public AClock(int hourHand, int minuteHand) {
        this.hourHand = hourHand;
        this.minuteHand = minuteHand;
    }

    public AClock() {
    }

    public int getHourHand() {
        return hourHand;
    }

    public void setHourHand(int hourHand) {
        this.hourHand = hourHand;
    }

    public int getMinuteHand() {
        return minuteHand;
    }

    public void setMinuteHand(int minuteHand) {
        this.minuteHand = minuteHand;
    }

}
