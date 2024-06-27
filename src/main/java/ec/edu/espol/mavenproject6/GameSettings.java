/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.mavenproject6;

/**
 *
 * @author Deeje
 */
public class GameSettings {
    private static GameSettings gm = new GameSettings();
    private int ScreenSizeX;
    private int ScreenSizeY;
    private double MinRAM;
    private int DiskSize;
    
    //Constructor, Getters y Setters
    
    public static GameSettings GetInstance(){
        return gm;
    }
}
