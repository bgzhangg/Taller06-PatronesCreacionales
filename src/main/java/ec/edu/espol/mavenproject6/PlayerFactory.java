/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.mavenproject6;

/**
 *
 * @author Deeje
 */
public class PlayerFactory extends EntityFactory {
    
    private PlayerBuilder PB;
    @Override
    public PlayerBuilder CreateBuilder(){
        PB = new PlayerBuilder();
    return PB;
    }

    @Override
    Entity CreateEntity() {
        //codigo usando el builder PB
        
    }
}
