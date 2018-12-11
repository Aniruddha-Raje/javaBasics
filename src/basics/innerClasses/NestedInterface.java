/**
 * 
 */
package basics.innerClasses;

/**
 * @author Aniruddha.Raje
 *
 */
public class NestedInterface implements OuterInf.InnerInf {

	public static void main(String[] args) {
		OuterInf.InnerInf ob = new NestedInterface();
		ob.inner();
	}

	@Override
	public void inner() {
		System.out.println("Implementation called!");
	}
}

interface OuterInf {
	void outer();

	interface InnerInf {
		void inner();
	}
}

class OuterClass {
	interface ClassInnerInf {
		void inner();
	}
}