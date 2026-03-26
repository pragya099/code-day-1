public class Main{
    public static void main (String [] args){
       Car car = new Car();
       // Engine car = new Car();// This will cause an error because the Car class 
        //implements the Engine interface,
    
        car.start();
        car.stop();
        car.Break();
        // System.out.println(car.price);
         // This will cause an error because price is a static final 
         //variable in the Engine interface, 
         //and it cannot be accessed through an instance of Car. 
         //To access it, you should use Engine.price instead.
    }
}