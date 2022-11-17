package Practice_Collection;

import java.util.ArrayList;
import java.util.List;

public class Array_List2 {

	public static void main(String[] args) {

		List<Integer> b = new ArrayList<Integer>();
		b.add(11);
		b.add(22);
		b.add(33);
		b.add(44);

		List<Object> v = new ArrayList<Object>();
		v.add("bhavi");
		v.add(44);
		v.add("prveen");
		v.add(33);

		Object[] a = v.toArray();
for (int i = 0; i < a.length; i++) {
System.out.println(a[i]);
	
}	
System.out.println("welcome to string");
for (Object object : a) {
	System.out.println(object);
}	

String f = v.toString();
System.out.println(b);
	}			
		
	
	
	}
