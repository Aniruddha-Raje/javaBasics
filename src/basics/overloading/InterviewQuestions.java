package basics.overloading;

/**
 * @author Aniruddha.Raje
 *
 */
class Parent{
	
}

class Child extends Parent {
	
}

public class InterviewQuestions {

	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		Object o = new Object();
		
		Object o1 = (Object) p;
		Object o2 = (Object) c;
		
		Parent p1 = (Parent) c;
		Parent p2 = (Parent) o;
		Child c1 = (Child) p;
		Child c2 = (Child) o;
		
		//Cannot cast 
		//String s1 = (String)p;
		//String s2 = (String)c;
	}
}
