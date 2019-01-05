package basics.overloading;

class Parent{
	
}

class Child extends Parent {
	
}

public class InterviewQuestions {

	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		
		Object o1 = (Object) p;
		Object o2 = (Object) c;
		
		Parent p1 = (Parent) c;
		
		Child c1 = (Child) p;
		
		//Cannot cast 
		//String s1 = (String)p;
		//String s2 = (String)c;
	}
}
