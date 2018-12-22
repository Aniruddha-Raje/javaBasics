/**
 * 
 */
package basics.defaultValues;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

/**
 * @author Aniruddha.Raje
 *
 */
public class CollectionInfo {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		Map<Integer, String> treeMap = new TreeMap<>();
		Hashtable<Integer, String> hashTable = new Hashtable<>();

		Set<String> hashSet = new HashSet();
		Set<String> linkedhashSet = new LinkedHashSet();
		Set<String> treeSet = new TreeSet();

		List<String> arrayList = new ArrayList();
		List<String> linkedList = new LinkedList();
		List<String> vector = new Vector<>();

		StringBuilder builder = new StringBuilder();
		StringBuffer buffer = new StringBuffer();

		// Table - 16, LoadFactor - 12, Threshhold - 0.75
		hashMap.put(1, "a");

		// Table - 16, LoadFactor - 12, Threshhold - 0.75
		linkedHashMap.put(1, "a");

		treeMap.put(1, "a");
		
		hashTable.put(1, "a");

		// Table - 16, LoadFactor - 12, Threshhold - 0.75
		hashSet.add("a");

		// Table - 16, LoadFactor - 12, Threshhold - 0.75
		linkedhashSet.add("a");

		treeSet.add("a");

		// ElementData - 10
		arrayList.add("a");

		// Has First and Last
		linkedList.add("a");

		vector.add("a");

		// Size - 16
		builder.append("a");

		// Size - 16
		buffer.append("a");

		System.out.println("Added debugger to this line and please inspect the references");

	}
}
