
import java.io.*; 
  
abstract class Vehicle1 { 
     // int speed=0;
      int gear=0;
    // all are the abstract methods. 
      void changeGear()
    {
    	
    }
   abstract void speedUp(int a);
    
    void applyBrakes(int a)
    {
    	
    }
} 
  
class Bicycle1 extends Vehicle1{ 
      
    int speed; 
    //int gear; 
      
     // to change gear 
    @Override
    public void changeGear(){ 
     
        //gear ; 
    } 
      
    // to increase speed 
    @Override
    public void speedUp(int increment){ 
          
        speed = speed + increment; 
    } 
      
    // to decrease speed 
    @Override
    public void applyBrakes(int decrement){ 
          
        speed = speed - decrement; 
    } 
      
    public void printStates() { 
         System.out.println("speed: " + speed 
              + " gear: " + gear); 
    } 
} 
  
/*class Bike extends Vehicle { 
      
    int speed; 
    int gear; 
      
    // to change gear 
    @Override
    public void changeGear(){ 
          
      //  gear = newGear; 
    } 
      
    // to increase speed 
    @Override
    public void speedUp(int increment){ 
          
        speed = speed + increment; 
    } 
      
    // to decrease speed 
    @Override
    public void applyBrakes(int decrement){ 
          
        speed = speed - decrement; 
    } 
      
    public void printStates() { 
         System.out.println("speed: " + speed 
             + " gear: " + gear); 
    } 
      
} */
public class AbstractConcept { 
      
    public static void main (String[] args) { 
      
        // creating an inatance of Bicycle  
        // doing some operations  
        Bicycle1 bicycle = new Bicycle1(); 
        bicycle.changeGear(); 
        bicycle.speedUp(3); 
        bicycle.applyBrakes(1); 
          
        System.out.println("Bicycle present state :"); 
        bicycle.printStates(); 
          
        // creating instance of bike. 
      /*  Bike bike = new Bike(); 
        bike.changeGear(); 
        bike.speedUp(4); 
        bike.applyBrakes(3); 
        
        System.out.println("Bike present state :"); 
        bike.printStates(); */
    } 
} 