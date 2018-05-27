package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

class Singletons implements Serializable{

	private static Singletons soleInstance = new Singletons(); 
	
	private Singletons(){
		System.out.println("Private Constructor called!");
	}
	
	public static Singletons getInstance(){
		return soleInstance;
	}
	
	private Object readResolve() throws ObjectStreamException{
		System.out.println("Read resolve ...");
		return soleInstance;
	}
}

public class SerializationSolution{
	public static void main(String[] args) throws Exception{
		Singletons s1 = Singletons.getInstance();
		Singletons s2 = Singletons.getInstance();
		
		print("S1",s1);
		print("S2",s2);
		
		//Serialization example
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/home/anirudha/office/POC/s2.txt"));
		oos.writeObject(s2);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/home/anirudha/office/POC/s2.txt"));
		Singletons s3 = (Singletons)ois.readObject();
				
		print("S3",s3);
	}
	static void print(String name, Singletons object){
		System.out.println(String.format("Object %s , Hashcode: %d", name,object.hashCode()));
	}
}