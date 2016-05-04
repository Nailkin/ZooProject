/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooproject;

import java.util.HashMap;

/**
 *
 * @author esmiraldashirinova
 */
public class FoodStore {
    
    private HashMap<String, Integer> foods = null;
    
    public FoodStore() {
        foods = new HashMap<>();
    }
    
    public void addFood(String food, int quantity){
        if(foods.containsKey(food)) {
            int currentQuantity = foods.get(food);
            foods.put(food, currentQuantity + quantity);
        } else {
            foods.put(food, quantity);
        }
    }
    
    public void takeFood(String food) {
        if(foods.containsKey(food)) {
            int currentQuantity = foods.get(food);
            
            if(currentQuantity > 0) {
                foods.put(food, currentQuantity - 1);
            } else {
                System.err.println("Sorry, no more food " + food);
            }
         } else {
            System.out.println("Sorry, you cannot take non existing food :)");
        }
    }
    
}
