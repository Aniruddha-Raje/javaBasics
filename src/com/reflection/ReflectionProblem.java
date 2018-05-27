package com.reflection;

import java.lang.reflect.Constructor;

class Singleton {

	private static Singleton soleInstance = new Singleton(); 
	
	private Singleton(){
		System.out.println("Private Constructor called!");
	}
	
	public static Singleton getInstance(){
		return soleInstance;
	}
}

public class ReflectionProblem{
	public static void main(String[] args) throws Exception {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		print("S1",s1);
		print("S2",s2);
		
		//Reflection
		Class clazz = Class.forName("com.blcl.reflection.Singleton");
		Constructor<Singleton> ctor = clazz.getDeclaredConstructor();
		ctor.setAccessible(true);
		Singleton s3 = ctor.newInstance();
		
		print("S3",s3);
		
	}
	static void print(String name, Singleton object){
		System.out.println(String.format("Object %s , Hashcode: %d", name,object.hashCode()));
	}
}
