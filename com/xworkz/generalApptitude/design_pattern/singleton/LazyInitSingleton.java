package com.xworkz.generalApptitude.design_pattern.singleton;

public class LazyInitSingleton {
	//Object is created only if it is needed.
	//It may overcome resource overcome and wastage of CPU time.
	static LazyInitSingleton lazyInitSingleton;

	private LazyInitSingleton() {
		System.out.println("invoke " + this.getClass().getSimpleName());
	}

	public static synchronized LazyInitSingleton getlazyInitInstance() {
		if (lazyInitSingleton == null)
			lazyInitSingleton = new LazyInitSingleton();
		return lazyInitSingleton;
	}

	/*
	 * public static synchronized LazyInitSingleton getlazyInitInstance() {
	 * if(lazyInitSingleton==null) return lazyInitSingleton; else {
	 * lazyInitSingleton=new LazyInitSingleton(); return lazyInitSingleton; } }
	 */

}
