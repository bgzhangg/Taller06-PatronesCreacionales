/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.mavenproject6;

/**
 *
 * @author Deeje
 */
public class PlayerBuilder implements EntityBuilder {
    Player player = new Player();
    public void reset(){};
    public void setName(String name){
        player.setName(name);
    };
    public void setActions(Actions actions){
        player.setActions(actions);
    };
    public void setSprite(Sprite sprite){
        player.setSprite(sprite);
    };
    public void setHP (double hp){
        player.setHp(hp);
    }
    public void setStrenght (double st){
        player.setStrength(st);
    }
    public Player giveResult(){
            return player;
    }
}
