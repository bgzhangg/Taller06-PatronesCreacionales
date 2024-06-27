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
public class Object extends Entity {
    private Type type;
    private double weight;

    public Type getType() {
        return type;
    }
    public double getWeight() {
        return weight;
    }

    public void setType(Type type) {
        this.type = type;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
}
