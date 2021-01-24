package com.xworkz.generalApptitude.design_pattern.singleton;

public class StaticBlockSingleton {
	/*
	 * The only difference is object is created in a static block so that we can have access on its creation, 
	 * like exception handling. In this way also, object is created at the time of class loading.
       It can be used when there is a chance of exceptions in creating object with eager initialization.
    */
	public static StaticBlockSingleton staticBlockSingleton; 
	  
	  private StaticBlockSingleton()  
	  { 
		  System.out.println("invoke " + this.getClass().getSimpleName()); 
	  } 
	static//when pgm is loaded first static blocks are executed
	  { 
	   try {
		   staticBlockSingleton = new StaticBlockSingleton(); 
	   }
	   catch(Exception e) {
		   System.out.println("not able to create");
	   }
		
	  } 

}
