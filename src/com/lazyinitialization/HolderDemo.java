package com.lazyinitialization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Singletonss {

	private Singletonss(){
		System.out.println("Private Constructor called!");
	}
	
	public static Singletonss getInstance(){
		return Holder.INSTANCE;
	}

	//Singleton Holder
	static class Holder{
		static final Singletonss INSTANCE = new Singletonss();
	}
}

public class HolderDemo{
	static void useSingleton(){
		Singletonss singletons = Singletonss.getInstance();
		print("Singleton",singletons);
	}
	
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(HolderDemo::useSingleton);
		service.submit(HolderDemo::useSingleton);
		
		service.shutdown();
	}
	static void print(String name, Singletonss object){
		System.out.println(String.format("Object %s , Hashcode: %d", name,object.hashCode()));
	}
}