/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Extras.Type;

/**
 *
 * @author Deeje
 */
public class Enemy extends Entity{
    private Type type;
    private double Power;

    public Type getType() {
        return type;
    }
    public double getPower() {
        return Power;
    }

    public void setType(Type type) {
        this.type = type;
    }
    public void setPower(double Power) {
        this.Power = Power;
    }
    
}
