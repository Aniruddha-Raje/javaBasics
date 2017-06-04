package basics.superKeyword;

class BaseClass{  
	String color="white"; 
	
	BaseClass(){
		System.out.println("BaseClass Constructor called");
	}
	
	void eat(){
		System.out.println("eating...");
	}
}  

class UsingSuper extends BaseClass{  
	String color="black";  
	
	UsingSuper(){
		super();
	}
	
	void printColor(){
		System.out.println(color);//prints color of UsingSuper class  
		System.out.println(super.color);//prints color of BaseClass class  
		super.eat();  
		
	} 
	
	public static void main(String args[]){  
		UsingSuper d=new UsingSuper();  
		d.printColor();  
	}
}