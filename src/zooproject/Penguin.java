/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooproject;

/**
 *
 * @author esmiraldashirinova
 */
public class Penguin extends Animal{
    public Penguin() {
        this.lifeExpectancy = 15;
        this.eats = new String[]{"fish","ice cream"};
        
    }
    private void watchAFilm(){
        this.health = health + 2;
    }

    @Override
    protected void treat() {
       watchAFilm();
    }
    
}
