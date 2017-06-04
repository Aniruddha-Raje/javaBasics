package basics.clone;

class Student implements Cloneable{  
	int rollno;  
	String name;  
	  
	Student(int rollno, String name){  
		this.rollno=rollno;  
		this.name=name;  
	}  
	  
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
	}  

}

public class Clone {
	public static void main(String[] args) {
		
		Student s1 = new Student(1,"abc");
		try {
			Student s2 = (Student) s1.clone();
			System.out.println(s1.rollno+" "+s1.name);  
			System.out.println(s2.rollno+" "+s2.name);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		  
	}
}
