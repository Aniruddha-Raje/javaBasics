package com.lazyinitialization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Singletons {

	private static Singletons soleInstance = null; 
	
	private Singletons(){
		System.out.println("Private Constructor called!");
	}
	
	public static Singletons getInstance(){
		if(soleInstance == null){
			soleInstance = new Singletons();
		}
		return soleInstance;
	}
}

public class LazyInitializationProblem{
	static void useSingleton(){
		Singletons singletons = Singletons.getInstance();
		print("Singleton",singletons);
	}
	
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(LazyInitializationProblem::useSingleton);
		service.submit(LazyInitializationProblem::useSingleton);
		
		service.shutdown();
	}
	static void print(String name, Singletons object){
		System.out.println(String.format("Object %s , Hashcode: %d", name,object.hashCode()));
	}
}