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
public class Chimpanzee extends Ape {
    public Chimpanzee(){
        this.lifeExpectancy = 24;                       
    }
    private void playChase(){
        this.health = health + 4;
    }

    @Override
    protected void treat() {
        playChase();
    }
    
    
}
