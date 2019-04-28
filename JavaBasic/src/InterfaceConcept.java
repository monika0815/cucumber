
import java.io.*; 
  
interface Vehicle { 
     // int speed=0;
      int gear=0;
    // all are the abstract methods. 
    void changeGear(); 
    void speedUp(int a); 
    void applyBrakes(int a); 
} 
  
class Bicycle implements Vehicle{ 
      
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
  
class Bike implements Vehicle { 
      
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
      
} 
class InterfaceConcept { 
      
    public static void main (String[] args) { 
      
        // creating an inatance of Bicycle  
        // doing some operations  
        Bicycle bicycle = new Bicycle(); 
        bicycle.changeGear(); 
        bicycle.speedUp(3); 
        bicycle.applyBrakes(1); 
          
        System.out.println("Bicycle present state :"); 
        bicycle.printStates(); 
          
        // creating instance of bike. 
        Bike bike = new Bike(); 
        bike.changeGear(); 
        bike.speedUp(4); 
        bike.applyBrakes(3); 
        
        System.out.println("Bike present state :"); 
        bike.printStates(); 
    } 
} 