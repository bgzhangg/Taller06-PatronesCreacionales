/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builders;

import Entities.Enemy;
import Extras.Actions;
import Extras.Sprite;
import Extras.Type;

/**
 *
 * @author Deeje
 */
public class EnemyBuilder implements EntityBuilder {
    Enemy enemy = new Enemy();
    public void reset(){};
    public void setName(String name){
        enemy.setName(name);
    };
    public void setActions(Actions actions){
        enemy.setActions(actions);
    };
    public void setSprite(Sprite sprite){
        enemy.setSprite(sprite);
    };
    public void setPower (double power){
        enemy.setPower(power);
    }
    public void setType (Type type){
        enemy.setType(type);
    }
    public Enemy giveResult(){
            return enemy;
    }
}
