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
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
   // Question2:
       Mammal M =new Mammal(4,"stems,leaves,roots and nuts");
       M.eat();
       M.travel();
       System.out.println("Favotite food of Mammal is: "+M.get_favorite_food());
       System.out.println("number of legs of Mammal are: "+M.get_No_Of_legs());
    }
    
}
