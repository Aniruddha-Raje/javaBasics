/**
 * 
 */
package java8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Aniruddha.Raje
 *
 */
public class Filter {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
	    map.put(1, "aaa");
	    map.put(2, "bbb");
	    map.put(3, "ccc");
	    map.put(4, "ddd");
	    
	    String result1 = "";
	    for (Map.Entry<Integer, String> entry : map.entrySet()) {
			
	    	if("something".equals(entry.getValue())){
				result1 = entry.getValue();
			}
		}
	    System.out.println(result1);
	    
	    String result2 = map.entrySet().stream()
	    		.filter(x -> "something".equals(x.getValue()))
	    		.map(x -> x.getValue())
	    		.collect(Collectors.joining());
	    System.out.println(result2);
	    
	    //Collection
	    Map<Integer, String> collect1 = map.entrySet().stream()
	    		.filter(x -> x.getKey() == 2)
	    		.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
	    System.out.println(collect1);
	    
	    Map<Integer, String> collect2 = map.entrySet().stream()
	    		.filter(x -> x.getKey() == 3)
	    		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	    System.out.println(collect2);
	    
	}
}
