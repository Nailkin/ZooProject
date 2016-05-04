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
public class Lion extends BigCat {

    @Override
    protected void stroked() {
        this.health = health + 2;
    }
//    public void stroked÷

    @Override
    protected void treat() {
        stroked();
    }
}
