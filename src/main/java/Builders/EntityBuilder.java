/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Builders;

import Extras.Actions;
import Extras.Sprite;

/**
 *
 * @author Deeje
 */
public interface EntityBuilder {
    public void reset();
    public void setName(String name);
    public void setActions(Actions actions);
    public void setSprite(Sprite sprite);

}
