/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.mavenproject6;

/**
 *
 * @author Deeje
 */
public class Player extends Entity {
    private double hp;
    private double strength;
    
    public double getHp() {
        return hp;
    }
    public double getStrength() {
        return strength;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }
    public void setStrength(double strength) {
        this.strength = strength;
    }
    
}
