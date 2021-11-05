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
public abstract class Ball implements Tossable {
     private String brand_name;

    public Ball(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getBrand_name() {
        return brand_name;
    }
   
    public abstract void bounce();
    
    
}
