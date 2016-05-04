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
public class Tiger extends BigCat{

    @Override
    protected void stroked() {
         this.health = health + 3;
    }

    @Override
    protected void treat() {
        stroked();
    }
    

}
