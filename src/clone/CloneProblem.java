package clone;

class Singletons implements Cloneable{

	private static Singletons soleInstance = new Singletons(); 
	
	private Singletons(){
		System.out.println("Private Constructor called!");
	}
	
	public static Singletons getInstance(){
		return soleInstance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

public class CloneProblem{
	public static void main(String[] args) throws Exception {
		Singletons s1 = Singletons.getInstance();
		Singletons s2 = Singletons.getInstance();
		
		print("S1",s1);
		print("S2",s2);
		
		//Clone 
		Singletons s3 = (Singletons) s2.clone();
		print("S3",s3);
		
	}
	static void print(String name, Singletons object){
		System.out.println(String.format("Object %s , Hashcode: %d", name,object.hashCode()));
	}
}
