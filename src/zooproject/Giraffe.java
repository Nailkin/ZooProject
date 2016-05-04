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
public class Giraffe extends Animal {
    public Giraffe() {
        this.lifeExpectancy = 28;
        this.eats = new String[]{"hay","fruit"};
        
    }
    private void neckMassage(){
        this.health = health + 4;
    }

    @Override
    protected void treat() {
        neckMassage();
    }
    
}
