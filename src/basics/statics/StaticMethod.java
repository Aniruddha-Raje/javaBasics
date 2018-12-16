package basics.statics;

public class StaticMethod {
	
	 int rollno;  
     String name;  
     static String college = "SIOM";  
       
     StaticMethod(int r, String n){  
	     rollno = r;  
	     name = n;  
     }  
     
     //static void change(){  
     void change(){  
    	 college = "SIT";  
     }
  
     void display (){
    	 System.out.println(rollno+" "+name+" "+college);
     }  
  
     public static void main(String args[]){  
    	  
	  
    	 StaticMethod s1 = new StaticMethod (1,"Aniruddha");  
    	 StaticMethod s2 = new StaticMethod (2,"Bhagyesha"); 
    	 //StaticMethod.change();
    	 s2.change(); 
    	 StaticMethod s3 = new StaticMethod (3,"Ankita");
	  
    	 s1.display();  
    	 s2.display();  
    	 s3.display();  
     }
}
