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
public class Zoo {
    Enclosure[] enclosures ;
    ArrayList<ZooKeeper> zooKeepers;
    private ArrayList <Food> foods;

    public Zoo() {
        foods = new ArrayList<>();
        foods.add(new Food("hay", 1, 4));
        foods.add(new Food("steak", 3, 4));
        foods.add(new Food("fruit", 2, 3));
        foods.add(new Food("celery", 0, 1));
        foods.add(new Food("fish", 3, 2));
        foods.add(new Food("ice cream", 1, 3));
        
        enclosures = new Enclosure [5];
        for(int i = 0; i < enclosures.length; i++) {
            enclosures[i] = new Enclosure();
        }
        
        //1 - lion & tiger
        int animalCount = (int)(Math.random() * 10);
        System.out.println("Creating " + animalCount + " lions");
        
        for (int i = 1; i <= animalCount; i++) {
            Lion a = new Lion();
            a.setEnclosure(enclosures[0]);
            enclosures[0].addAnimal(a);
            System.out.println("Adding new lion into enclosure 1");
        }
        
        animalCount = (int)(Math.random() * 10);
        System.out.println("Creating " + animalCount + " tigers");
        
        for(int i = 1; i < animalCount; i++){
            Tiger t = new Tiger();
            t.setEnclosure(enclosures[0]);
            enclosures[0].addAnimal(t);
            System.out.println("Adding new tiger into enclosure 1");
        }
       
        //2 - chimpanzee & gorilla
        animalCount = (int)(Math.random() * 10);
        System.out.println("Creating " + animalCount + " chimpanzee");
        
        for (int i = 1; i <= animalCount; i++) {
            Chimpanzee c = new Chimpanzee();
            c.setEnclosure(enclosures[1]);
            enclosures[1].addAnimal(c);
            System.out.println("Adding new chimpanzee into enclosure 2");
        }
        
        animalCount = (int)(Math.random() * 10);
        System.out.println("Creating " + animalCount + " gorillas");
        
        for(int i = 1; i < animalCount; i++){
            Gorilla g = new Gorilla();
            g.setEnclosure(enclosures[1]);
            enclosures[1].addAnimal(g);
            System.out.println("Adding new gorilla into enclosure 2");
        }
        
        //3 - elephant & giraffe
        animalCount = (int)(Math.random() * 10);
        System.out.println("Creating " + animalCount + " elephants");
        
        for (int i = 1; i <= animalCount; i++) {
            Elephant e = new Elephant();
            e.setEnclosure(enclosures[2]);
            enclosures[2].addAnimal(e);
            System.out.println("Adding new elephant into enclosure 3");
        }
        
        animalCount = (int)(Math.random() * 10);
        System.out.println("Creating " + animalCount + " giraffe");
        
        for(int i = 1; i < animalCount; i++){
            Giraffe gf = new Giraffe();
            gf.setEnclosure(enclosures[2]);
            enclosures[2].addAnimal(gf);
            System.out.println("Adding new giraffe into enclosure 3");
        }
        
        //4 - penguin
        animalCount = (int)(Math.random() * 10);
        System.out.println("Creating " + animalCount + " penguins");
        
        for (int i = 1; i <= animalCount; i++) {
            Penguin p = new Penguin();
            p.setEnclosure(enclosures[3]);
            enclosures[3].addAnimal(p);
            System.out.println("Adding new penguin into enclosure 4");
        }
        
        
        //5 - bear
        animalCount = (int)(Math.random() * 10);
        System.out.println("Creating " + animalCount + " bears");
        
        for (int i = 1; i <= animalCount; i++) {
            Bear b = new Bear();
            b.setEnclosure(enclosures[4]);
            enclosures[4].addAnimal(b);
            System.out.println("Adding new bear into enclosure 4");
        }
        
    }
    
    public ArrayList<Food> getMenu() {
        return foods;
    }
 
    public void aMonthPasses(){
        for(ZooKeeper z: zooKeepers){
            z.aMonthPasses();
        }
        
        for(Enclosure enc : enclosures) {
            enc.aMonthPasses();
        }
    }
            
    
}
