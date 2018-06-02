package basics.defaultValues;

/**
 * @author Aniruddha.Raje
 *
 */
public class DefaultValues {
	
	//static and member variables are initialized to default values
	
	//primitives
    private int a; //default 0
    private static int b; //default 0

    //objects
    private Object c; //default NULL
    private static Object d; //default NULL

    //arrays (Note: they are objects too, even if they store primitives)
    private int[] e; //default NULL
    private static int[] f; //default NULL

    //what if declared as final?

    //primitives
    private final int g; //not initialized, MUST set in constructor
    private final static int h; //not initialized, MUST set in a static {}

    //objects
    private final Object i; //not initialized, MUST set in constructor
    private final static Object j; //not initialized, MUST set in a static {}

    //arrays
    private final int[] k; //not initialized, MUST set in constructor
    private final static int[] l; //not initialized, MUST set in a static {}

    //initialize final statics
    static {
        h = 5;
        j = new Object();
        l = new int[5]; //elements of l are initialized to 0
    }

    //initialize final member variables
    public DefaultValues() {
        g = 10;
        i = new Object();
        k = new int[10]; //elements of k are initialized to 0
    }

    //A second example constructor
    //you have to initialize final member variables to every constructor!
    public DefaultValues(boolean aBoolean) {
        g = 15;
        i = new Object();
        k = new int[15]; //elements of k are initialized to 0
    }

    public static void main(String[] args) {
        //local variables are not initialized
        int m; //not initialized
        Object n; //not initialized
        int[] o; //not initialized

        //we must initialize them before usage
        m = 20;
        n = new Object();
        o = new int[20]; //elements of o are initialized to 0
    }
}
