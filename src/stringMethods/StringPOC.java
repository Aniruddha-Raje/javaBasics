package stringMethods;

public class StringPOC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Str = new String("XYZ: ABC PSR S01 EP07");
		System.out.println("Original String is : "+Str);
		
        String first = Str.substring(0, Str.indexOf(':'));
        System.out.println("\n\n " + first);
      
        String second = Str.substring(Str.indexOf(':'), Str.length());
        System.out.println("\n\n " + second);
      
        String third = first + "\\" + second;
        System.out.println("\n\n "+third);
	}

}
