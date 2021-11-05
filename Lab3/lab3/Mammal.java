/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Computer Science
 */
public class Mammal {
     private int No_Of_legs;
   private String favorite_food;

    public Mammal(int No_Of_legs, String favorite_food) {
        this.No_Of_legs = No_Of_legs;
        this.favorite_food = favorite_food;
    }
    public int get_No_Of_legs()
    {
        return No_Of_legs;
    }
    public String get_favorite_food()
    {
        return favorite_food;
    }
    public void eat()
    {
        System.out.println("Mammal can eat");
    }
    public void travel()
    {
        System.out.println("Mammal can travel");
    }
   
    
}
