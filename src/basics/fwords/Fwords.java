package basics.fwords;

/**
 * @author Aniruddha.Raje
 *
 */
public class Fwords {
	
	public static void main(String[] args) {
		
		final int x=100;  
		//x=200;//Compile Time Error
		
		try{  
			int y=300;  
		}
		catch(Exception e){
			System.out.println(e);
		}  
		finally{
			System.out.println("finally block is always executed");
		}
		
		Fwords ob1 = new Fwords();
		ob1 = null;
		System.gc();
		
	}
	
	public void finalize(){
		System.out.println("finalize called");
	}
}
