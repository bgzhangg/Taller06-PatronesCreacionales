/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builders;

import Entities.Object;
import Extras.Actions;
import Extras.Sprite;
import Extras.Type;

/**
 *
 * @author Deeje
 */
public class ObjectBuilder implements EntityBuilder {
    Object object = new Object();
    public void reset(){};
    public void setName(String name){
        object.setName(name);
    };
    public void setActions(Actions actions){
        object.setActions(actions);
    };
    public void setSprite(Sprite sprite){
        object.setSprite(sprite);
    };
    public void setWeight (double weight){
        object.setWeight(weight);
    }
    public void setType (Type type){
        object.setType(type);
    }
    public Object giveResult(){
            return object;
    }
}