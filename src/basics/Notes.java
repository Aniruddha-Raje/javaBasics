/**
 * 
 */
package basics;

/**
 * @author Aniruddha.Raje
 *
 */
//You cannot Override a Private or a Static(belongs to class) method

//JVM(Has interpreter - line by line) + Libraries = JRE
//JRE + Development tools(Compiler) = JDK

//System.out.println
//System - is a class in the java.lang package.
//out - is a static member of the System class, and is an instance of java.io.PrintStream.
//print, println and printf - are methods of java.io.PrintStream.

//Heap - Objects + String Pool - Young generation(Eden,S0,S1) has Minor gc, 
//Objects that have survived many cycles of GC, are moved to the old generation memory space.
//Older Memory has Major gc, Perm 

//Method Area is part of space in the Perm Gen and used to store class structure 
//(runtime constants and static variables) and code for methods and constructors.

//Stack - Methods and Local Variables, References

//hashCode() : For every object, JVM generates a unique number which is hashcode. 
//It returns distinct integers for distinct objects. 
//A common misconception about this method is that hashCode() method returns the address of object, which is not correct. 
//It convert the internal address of object to an integer by using an algorithm.
public class Notes {
	public static void main(String[] args) {
		
	}

}
