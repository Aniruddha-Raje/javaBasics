package com.blcl.simpleSingleton;

class Singleton {

	private static Singleton soleInstance = new Singleton(); 
	
	private Singleton(){
		System.out.println("Private Constructor called!");
	}
	
	public static Singleton getInstance(){
		return soleInstance;
	}
}

public class Test{
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		print("S1",s1);
		print("S2",s2);
	}
	static void print(String name, Singleton object){
		System.out.println(String.format("Object %s , Hashcode: %d", name,object.hashCode()));
	}
}