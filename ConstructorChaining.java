/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorchaining;

/**
 *
 * @author user2
 */
public class ConstructorChaining {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ByCicle newCycle = new ByCicle(10,"CannonDale");
    newCycle.show();
    }
    
}
//Superclass Cycle is defined
class Cycle {
    //integer Variable Declaration
  int weight;
 //creating a new paramterized constructor with integer value to
  //display weight
  Cycle(int weight) {
      //this keyword is used to differentiate between global and local variables
    //"this.name" refers to the global instance variable
    // "= name" refers to the local variable defined inside the constructor 
    this.weight = weight;
  }
}
 //subclass ByCicle which extends Cycle
class ByCicle extends Cycle {
    //String Variable Declaration
  String name;
 //creating a new paramterized constructor with String value
  //and integer value from Superclass since it extends SuperClass.
  ByCicle(int weight, String name) {
      //super keyword can be used to access the instance variables of superclass
      //"super" can also be used to invoke parent class constructor and method
    super(weight);//Accessign Superclass constructor and its variable
    //Global Variable=Local variable
    this.name = name;
  }
  
 //Creating a new Method "show" to display Values of the Weight and Name
  
  void show() {
    System.out.println("Weight of the Cycle is = " + weight);
    System.out.println("Name of the Cycle is = " + name);
  }
}
 
       
   

