package basics.staticKeyword;

/*
STATIC VARIABLE
- The static variable can be used to refer to the common property of all objects 
(which is not unique for each object), 
for example, the company name of employees, college name of students, etc.
- The static variable gets memory only once in the class area at the time of class loading.
- Ideally, static fields are only updated from synchronized static methods.

STATIC METHOD
- A static method belongs to the class rather than the object of a class.
- A static method can be invoked without the need for creating an instance of a class.
- A static method can access static data member and can change the value of it.
- The static method can not use non static data member or call non-static method directly.
- this and super cannot be used in static context.

STATIC BLOCK
- Is used to initialize the static data member.
- It is executed before the main method 
*/

public class StaticBlock {
	static{
		System.out.println("I'll be called before Main method");
	}  
	  
	public static void main(String args[]){  
		System.out.println("Hello main");  
	}
}
