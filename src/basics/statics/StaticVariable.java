package basics.statics;

/*
 	Memory for variable static String college, will be allocated only once, 
	no matter how many new object of Class StaticVariable are created
*/

public class StaticVariable {
	int rollno;  
	String name;  
	static String college ="ITS";//will get memory only once and retain its value
     
	StaticVariable(int r,String n){  
		rollno = r;  
		name = n;  
	}  
 
	void display (){
		System.out.println(rollno+" "+name+" "+college);
	}  
  
	public static void main(String args[]){  
		StaticVariable s1 = new StaticVariable(111,"Karan");  
		StaticVariable s2 = new StaticVariable(222,"Aryan");  
	   
		s1.display();  
		s2.display();  
	}
}
