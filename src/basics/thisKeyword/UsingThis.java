package basics.thisKeyword;

public class UsingThis {

	public UsingThis() {
		System.out.println("Default Constructor called using this keyword");
	}

	int rollno;  
	String name;  
	float fee;  
	
	UsingThis(int rollno,String name,float fee){  
		this();
		rollno = rollno;  
		name = name;  
		fee = fee;
		this.display(); //calling non static method
		this.staticDisplay(); //calling static method
		/*
		this.rollno = rollno;  
		this.name = name;  
		this.fee = fee;
		*/
	}  
	
	void display(){
		System.out.println(rollno+" "+name+" "+fee);
	}
	
	public static void staticDisplay(){
		System.out.println("Static display called");
	}
	
	public static void main(String args[]){  
		UsingThis s1=new UsingThis(111,"ankit",5000f);  
		UsingThis s2=new UsingThis(112,"sumit",6000f);  
		
		s1.display();  
		s2.display();
	}
}