package basics.constructors;
/*
 	A Constructor return the Instance of a Class
 	
	When you set a method as final it means: "You don't want any class override it." 
	But the constructor (according to the Java Language Specification) can't be overridden, 
	so it is clean.

	When you set a method as abstract it means: 
	"The method doesn't have a body and it should be implemented in a child class." 
	But the constructor is called implicitly when the new keyword is used so it can't lack a body.

	When you set a method as static it means: 
	"The method belongs to the class, not a particular object." 
	But the constructor is implicitly called to initialize an object, 
	so there is no purpose in having a static constructor.
*/
/**
 * @author Aniruddha.Raje
 *
 */
public class CopyConstructor {
	 
    int id;  
    String name;  
    
    CopyConstructor(int i,String n){  
	    id = i;  
	    name = n;  
    }  

    CopyConstructor(CopyConstructor s){  
	    id = s.id;  
	    name =s.name;  
    }  
    
    void display(){
    	System.out.println(id+" "+name);
    }  
   
    public static void main(String args[]){  
	    CopyConstructor s1 = new CopyConstructor(111,"Karan");  
	    CopyConstructor s2 = new CopyConstructor(s1);  
	    
	    s1.display();  
	    s2.display();  
   }  
	
}
