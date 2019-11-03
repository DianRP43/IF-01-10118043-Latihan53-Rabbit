/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author user
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit r = new Rabbit("peter", false, "grass", 4, "Grey");
        System.out.println("Hello, His name is "+r.getName());
        System.out.println(r.getName()+" is Vegetarian? "+r.vegetarian);
        System.out.println(r.getName()+" eats "+r.getEats());
        System.out.println(r.getName()+" has "+r.getNoOfLegs()+" Legs");
        System.out.println(r.getName()+" color is "+r.getColor());
        
    }
    
}
