package com.blcl.clone;

class Singleton implements Cloneable{

	private static Singleton soleInstance = new Singleton(); 
	
	private Singleton(){
		System.out.println("Private Constructor called!");
	}
	
	public static Singleton getInstance(){
		return soleInstance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

public class CloneSolution{
	public static void main(String[] args) throws Exception {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		print("S1",s1);
		print("S2",s2);
		
		//Clone 
		Singleton s3 = (Singleton) s2.clone();
		print("S3",s3);
		
	}
	static void print(String name, Singleton object){
		System.out.println(String.format("Object %s , Hashcode: %d", name,object.hashCode()));
	}
}
