/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factories;

import Builders.EntityBuilder;
import Entities.Entity;

/**
 *
 * @author Deeje
 */
public abstract class EntityFactory {
    abstract EntityBuilder CreateBuilder();
    abstract Entity CreateEntity();
}
