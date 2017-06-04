package com.blcl.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Singleton implements Serializable{

	private static Singleton soleInstance = new Singleton(); 
	
	private Singleton(){
		System.out.println("Private Constructor called!");
	}
	
	public static Singleton getInstance(){
		return soleInstance;
	}
}

public class SerializationProblem{
	public static void main(String[] args) throws Exception{
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		print("S1",s1);
		print("S2",s2);
		
		//Serialization example
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/home/anirudha/office/POC/s2.txt"));
		oos.writeObject(s2);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/home/anirudha/office/POC/s2.txt"));
		Singleton s3 = (Singleton)ois.readObject();
				
		print("S3",s3);
	}
	static void print(String name, Singleton object){
		System.out.println(String.format("Object %s , Hashcode: %d", name,object.hashCode()));
	}
}