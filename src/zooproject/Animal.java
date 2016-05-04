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
public abstract class Animal {
    protected int age;
    protected char gender;
    protected String[] eats;
    protected int health;
    protected int lifeExpectancy;
    protected Enclosure enclosure;

    public void setEnclosure(Enclosure enclosure) {
        this.enclosure = enclosure;
    }
    
    
    protected boolean canEat(String food) {
        boolean flag = false;
        for (String eat : eats) {
            if (food.equals(eat)) {
                flag = true;
                break;
            }
        }
            
        return flag;
    }
    
    protected void eat() {
    
    }
    
    protected void decreaseHealth() {
    
    }
    
    protected abstract void treat();
        
    
    protected boolean aMonthPasses(){
        this.health  = health - 2;
        return health > 0;
    }
    

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public int getLifeExpectancy() {
        return lifeExpectancy;
    }
    
    
    
    
}
