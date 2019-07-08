/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.task.clockHands.test;

import com.task.clockHands.angle.CountAngle;
import com.task.clockHands.model.AClock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 *
 * @author Jolita
 */
public class CountAngleTest {
    private CountAngle angl = new CountAngle();
    private double equal = 0.0;
    private AClock clockT = new AClock();
    
    @Before
    public void init() {
        clockT.setMinuteHand(15);
        clockT.setHourHand(12);
    }
    
    @Test
    public void countMinuteDegree(){
        int degrees = angl.countMinuteDegree(clockT);
    Assert.assertTrue(degrees == 90);
}
    
    @Test
    public void countHourDegree() {
        double degree = angl.countHourDegree(clockT);
        Assert.assertTrue(degree == 367.5);
    }
            
    @Test
    public void countAngle() {
        clockT.setHourHand(12);
        clockT.setMinuteHand(0);
        Assert.assertTrue(angl.countAngle(clockT)- equal == 0);
    }
            
    
}
