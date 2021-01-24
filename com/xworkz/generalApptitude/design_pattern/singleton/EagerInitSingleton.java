package com.xworkz.generalApptitude.design_pattern.singleton;

public class EagerInitSingleton {
	/*object of class is created when it is loaded to the memory by JVM. 
	It is done by assigning the reference an instance directly.
	*/
	 private static final EagerInitSingleton eagerInitSingleton = new EagerInitSingleton(); 
	  
	  private EagerInitSingleton() 
	  { 
		  System.out.println("invoke " + this.getClass().getSimpleName());
	  } 
	  public static EagerInitSingleton getEagerInitInstance(){ 
	        return eagerInitSingleton; 
	    } 

}
