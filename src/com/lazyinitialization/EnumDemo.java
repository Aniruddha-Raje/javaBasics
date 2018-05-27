package com.lazyinitialization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

enum SingletonDemo{
	INSTANCE;
	
	public String getConfiguration(){
		return "Configuration";
	}
}

public class EnumDemo{
	static void useSingleton(){
		SingletonDemo singletons = SingletonDemo.INSTANCE;
		print("Singleton",singletons);
	}
	
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(EnumDemo::useSingleton);
		service.submit(EnumDemo::useSingleton);
		
		service.shutdown();
	}
	static void print(String name, SingletonDemo object){
		System.out.println(String.format("Object %s , Hashcode: %d", name,object.hashCode()));
	}
}