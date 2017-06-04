package com.blcl.lazyinitialization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Singleton {

	private static volatile Singleton soleInstance = null; 
	
	private Singleton(){
		System.out.println("Private Constructor called!");
	}
	
	public static Singleton getInstance(){
		if(soleInstance == null){
			synchronized(Singleton.class){
				if(soleInstance == null){
					soleInstance = new Singleton();
				}
			}
		}
		return soleInstance;
	}
}

public class MultiThreadSolution{
	static void useSingleton(){
		Singleton singletons = Singleton.getInstance();
		print("Singleton",singletons);
	}
	
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(LazyInitializationProblem::useSingleton);
		service.submit(LazyInitializationProblem::useSingleton);
		
		service.shutdown();
	}
	static void print(String name, Singleton object){
		System.out.println(String.format("Object %s , Hashcode: %d", name,object.hashCode()));
	}
}
