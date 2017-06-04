package basics.thisKeyword;

public class ThisAsFunctionArgument {
	int id;
	String name;
	
	void m(ThisAsFunctionArgument obj){  
		System.out.println("ID = "+obj.id+" Name = "+obj.name);
	}  
	  
	void p(int id, String name){
		this.id=id;
		this.name=name;
		
		m(this); //Passing this as method argument 
	}  
	
	public static void main(String args[]){  
		ThisAsFunctionArgument s1 = new ThisAsFunctionArgument();  
		s1.p(1,"abc");  
	}
}
