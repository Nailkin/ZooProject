/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooproject;

/**
 *
 * @author Naila
 */
public class Food {
    private String name;
    private int health;
    private int waste;

    public Food(String name, int health, int waste) {
        this.name = name;
        this.health = health;
        this.waste = waste;
    }

    public Food() {
        this.name = "";
        this.health = 0;
        this.waste = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getWaste() {
        return waste;
    }

    public void setWaste(int waste) {
        this.waste = waste;
    }

    @Override
    public String toString() {
        return "Food{" + "name=" + name + ", health=" + health + ", waste=" + waste + '}';
    }
       
}
