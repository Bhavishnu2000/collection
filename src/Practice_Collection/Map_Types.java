package Practice_Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class Map_Types {

	public static void main(String[] args) {

		Map<Integer, Integer> y = new ConcurrentHashMap<Integer, Integer>();

		y.put(1, 100);
		y.put(2, 200);
		y.put(3, 300);
		y.put(4, 400);

		int a = y.size();
		System.out.println("size value = " + a);
		boolean b = y.containsKey(3);
		System.out.println("contains  key is =" + b);
		boolean c = y.isEmpty();
		System.out.println("isempty value is =" + c);
		Integer d = y.get(2);
		System.out.println("get value is =" + d);
		Set<Integer> e = y.keySet();
		System.out.println("keyset value is =" + e);
		Collection<Integer> f = y.values();
		System.out.println("data values is =" + f);
		Set<Entry<Integer, Integer>> g = y.entrySet();
		System.out.println("value of entryset is =" + g);
		y.clear();
		System.out.println(y);

	}

}
