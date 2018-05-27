package com.reflection;

import java.lang.reflect.Constructor;

class Singletons {

	private static Singletons soleInstance = new Singletons(); 
	
	private Singletons(){
		if(soleInstance != null){
			throw new RuntimeException("Cannot create, use getInstance");
		}
		System.out.println("Private Constructor called!");
	}
	
	public static Singletons getInstance(){
		return soleInstance;
	}
}

public class ReflectionSolution{
	public static void main(String[] args) throws Exception {
		Singletons s1 = Singletons.getInstance();
		Singletons s2 = Singletons.getInstance();
		
		print("S1",s1);
		print("S2",s2);
		
		//Reflection
		System.out.println("Using Reflection");
		Class clazz = Class.forName("com.blcl.reflection.Singletons");
		Constructor<Singletons> ctor = clazz.getDeclaredConstructor();
		ctor.setAccessible(true);
		Singletons s3 = ctor.newInstance();
		
		print("S3",s3);
		
	}
	static void print(String name, Singletons object){
		System.out.println(String.format("Object %s , Hashcode: %d", name,object.hashCode()));
	}
}