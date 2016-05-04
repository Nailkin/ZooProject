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
public class Gorilla extends Ape{
    public Gorilla(){
        this.lifeExpectancy = 32;                       
    }
    private void painting(){
        this.health = health + 4;
    }

    @Override
    protected void treat() {
        painting();
    }
    
}
