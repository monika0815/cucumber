

/**
  * Java program to show that private, static and final method can not be
  * overridden in Java.
  *
  * @author Javin Paul
  */
public class AbstractConcept2 {
 
    public static void main(String args[]) {
 
        // Reference variable of type Base - Object of type Derived
        Base b = new Derived();
     
        System.out.println(b.version());
        System.out.println(b.name());
           
    }    
 
}

/**
  * Base Class which contains three methods with final, static, and private
  * modifier, to show that these method can't be overridden in Java.
  *
  * @author Javin
  */
class Base{
 
    //public final String version()
	public String version()
	{
        where(); // This will call Base class where() method
        return "1.0.0";
    }
 
    public  String name(){
        return "Base";
    }
 
    private void where(){
        System.out.println("Inside Base Class");
    }
}

/**
  * Derived Class, which extends Base and tries to override final, static
  * and private methods in Java.

  * @author Javin
  */
class Derived extends Base{
 
    // Compilation Error : Final method can't be overridden in Java
    public  String version(){
    	where();
        return "2.0.0";
    }
 
    // Hidden static method - Same Signature but bonded at compile time
    public  String name(){
        return "Derived";
    }
 
    // Hidden private method - Same signature but resolved at compile time
    private void where(){
        System.out.println("Inside Derived Class");
    }
}

