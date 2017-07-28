
package assignment9;        //i have created a package 

public class AbstractDemo {        //here i have created main class 
	public static void main(String[]args){  //here i have created main method 
		Dog obj = new PetDog();//here we cannot  instantiate the object class 
		                                 
		obj.bark();
		obj.run();
		obj.dance();
		obj.eat();
	}
}
    abstract class Dog{            //a class is declared as abstract is known as abstract class
    	// here i have created a parent class .if we define abstract methods so that class must be an abstract class
    
    	public void bark(){       //here  i have created a method and i have declared and defined it 
    		   System.out.println("dog has a property of barking....");
    	   }
   
    	public abstract void run();               //here i have declared  the abstract methods and implemented them in the child class  
        public abstract void dance();
        public abstract void eat();
       }

  class PetDog extends Dog{   //here i have extended the parent to the child class
	   public void run(){                                              //here i have implemented the methods  in this class
		   System.out.println("pet dog can run ....");
		   
	   }
	   public  void dance (){
		   System.out.println("pet dog can  also dance...");  
	   }
	   public  void eat(){
		   System.out.println("pet dog eat well and good food");
	   }
   }


