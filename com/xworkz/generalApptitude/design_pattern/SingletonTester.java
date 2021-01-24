package com.xworkz.generalApptitude.design_pattern;

import com.xworkz.generalApptitude.design_pattern.singleton.EagerInitSingleton;
import com.xworkz.generalApptitude.design_pattern.singleton.EnumInitSingleton;
import com.xworkz.generalApptitude.design_pattern.singleton.LazyInitSingleton;
import com.xworkz.generalApptitude.design_pattern.singleton.StaticBlockSingleton;

public class SingletonTester {
	public static void main(String[] args) {
		System.out.println(EagerInitSingleton.getEagerInitInstance());

		System.out.println("-----------------------------------------------------");
		System.out.println(StaticBlockSingleton.staticBlockSingleton);

		System.out.println("-----------------------------------------------------");
		System.out.println(LazyInitSingleton.class);
		System.out.println(LazyInitSingleton.getlazyInitInstance());
		System.out.println("instance2 " + LazyInitSingleton.getlazyInitInstance());

		System.out.println("-----------------------------------------------------");
		System.out.println(EnumInitSingleton.INSTANCE);

	}
}
