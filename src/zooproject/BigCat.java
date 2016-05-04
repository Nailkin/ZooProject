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
public abstract class BigCat extends Animal {
    
    public BigCat(){
        this.lifeExpectancy = 24;
        this.eats = new String[2];
        this.eats[0] = "steak";
        this.eats[1] = "celery";
//        this.eats = new String[]{"steak", "celery"};
    }
    
    protected abstract void stroked();            
    
}
