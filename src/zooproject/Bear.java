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
public class Bear extends Animal {
    public Bear() {
        this.lifeExpectancy = 18;
        this.eats = new String[]{"fish","steak"};
        
    }
    private void hug(){
        this.health = health + 3;
    }

    @Override
    protected void treat() {
         hug();
    }
    
    
}
