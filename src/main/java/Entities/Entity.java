/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Entities;

import Extras.Actions;
import Extras.Sprite;

/**
 *
 * @author Deeje
 */
public class Entity {
    protected String name;
    protected Actions actions;
    protected Sprite sprite;
       
    public void draw(){
    System.out.println("draw");
            }
    public void update(){
    System.out.println("update");
    }

    public String getName() {
        return name;
    }
    public Actions getActions() {
        return actions;
    }
    public Sprite getSprite() {
        return sprite;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setActions(Actions actions) {
        this.actions = actions;
    }
    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }
    
}
