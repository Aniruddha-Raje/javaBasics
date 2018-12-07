/**
 * 
 */
package basics.strictFp;

/**
 * @author Aniruddha.Raje
 *
 */
//strictfp applied on class  
strictfp public class StrictFp implements testInf {

	strictfp void classTest(){
		
	}//strictfp applied on method  
	
	public static void main(String[] args) {
		StrictFp ob = new StrictFp();
		ob.classTest();
	}

	@Override
	public strictfp void infTest() {
		
	}
}

//strictfp applied on interface 
strictfp interface testInf{
	//strictfp is not permitted for abstract interface method infTest
	void infTest();
}