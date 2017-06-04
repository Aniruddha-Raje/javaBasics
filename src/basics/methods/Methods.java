package basics.methods;

public class Methods {
	public static void main(String[] args) {
		//Number methods
		
		//Max
		System.out.println(Math.max(12.123, 12.456));
		
		//Min
		System.out.println(Math.min(23.12, 23.0));
		
		//Random
		System.out.println( Math.random()*100);
	
		//Round
		float g = 90f;
	    System.out.println(Math.round(g));
	    
	    //Parse Int
	    int b = Integer.parseInt("444");
	    System.out.println(b);
	    
	    //toString
	    Integer x = 5;
	    System.out.println(x.toString());
	    
	    //Equals
	    Integer aa = 5;
	    Integer bb = 10;
	    System.out.println(aa.equals(bb));  
	    
	    //compareTo
	    Integer cc = 5;
	    System.out.println(cc.compareTo(3));
	    System.out.println(cc.compareTo(5));
	}
}
