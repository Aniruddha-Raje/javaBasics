/**
 * 
 */
package basics.thread;

/**
 * @author Aniruddha.Raje
 *
 */

//volatile is a field modifier, 
//while synchronized modifies code blocks and methods.

public class Volatile {

	int i1;              
	int geti1() {return i1;}
	
	volatile int i2;              
	int geti2() {return i2;}        
	
	int i3;
	synchronized int geti3() {return i3;}
}
