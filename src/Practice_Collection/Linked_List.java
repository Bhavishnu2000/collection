package Practice_Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class Linked_List {

	public static void main(String[] args) {
		Set<Integer> b = new TreeSet<Integer>();
		b.add(45);
		b.add(10);
		b.add(11);
		b.add(12);

		Set<Integer> s = new TreeSet<Integer>();
		s.add(22);
		s.add(10);
		s.add(33);
		s.add(55);
		s.add(12);

		int a = b.size();
		System.out.println("the value of size is :" + a);

		boolean e = b.contains(13);
		System.out.println("the value of contains is :" + e);
		boolean g = b.isEmpty();
		System.out.println("isempty value :" + g);

		s.addAll(b);
		System.out.println(s);

		b.removeAll(s);
		System.out.println(s);
		s.retainAll(b);
		System.out.println(s);

		String y = s.toString();
		System.out.println(y);

		for (Object j : s) {
			System.out.println(j);
		}

		s.clear();
		System.out.println("clear value is :" + s);
	}

}
