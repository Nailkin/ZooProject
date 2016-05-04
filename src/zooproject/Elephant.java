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
public class Elephant extends Animal{
    public Elephant() {
        this.lifeExpectancy = 36;
        this.eats = new String[]{"hay","fruit"};
        
    }
    
    private void bath() {
        this.health = health + 5;
    }

    @Override
    protected void treat() {
        bath();
    }
    
    
}
