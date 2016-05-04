/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooproject;

import java.util.ArrayList;

/**
 *
 * @author esmiraldashirinova
 */
public class Enclosure {

    private ArrayList<Animal> animals;
    private FoodStore foodStore;
    private int waste;

    public Enclosure() {
        this.animals = new ArrayList<>();
        this.foodStore = new FoodStore();
        this.waste = 0;
    }

    public void addAnimal(Animal a) {
        animals.add(a);
    }

    public void removeAnimal(Animal a) {
        animals.remove(a);
    }

    public int size() {
        return animals.size();
    }

    public void removeWaste(int wasteAmount) {
        this.waste = this.waste - wasteAmount;

        if (this.waste < 0) {
            this.waste = 0;
        }
    }

    public void addWaste(int wasteAmount) {
        this.waste = this.waste + wasteAmount;
    }

    public int getWasteSize() {
        return this.waste;
    }

    public FoodStore getFoodStore() {
        return this.foodStore;
    }

    public void aMonthPasses() {
        for (Animal a : animals) {
            a.aMonthPasses();
        }
    }

}
