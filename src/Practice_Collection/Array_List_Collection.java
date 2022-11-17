package Practice_Collection;

import java.util.ArrayList;
import java.util.List;

public class Array_List_Collection {
	
	public static void main(String[] args) {
		
		List<Integer> i = new ArrayList<Integer>();
		
		i.add(1);
		i.add(2);
		i.add(3);
		i.add(4);
		i.add(5);
		int a = i.indexOf(3);
		System.out.println("the valu of indexof is : " + a);
		int b = i.size();
		System.out.println("the value of size is : " + b);
		int c = i.lastIndexOf(4);
		System.out.println("the value of lastindexof is : "+  c);
		boolean d = i.contains(6);
		System.out.println("the value of contains is : "+d);
		boolean e = i.isEmpty(													);
		System.out.println("the valu of isempty is :"+ e);
		Integer f = i.get(2);
		System.out.println("the value of get is :"+f);
		Integer g = i.set(3,55);
		System.out.println("the value of set is :"+g);
		i.clear();
		System.out.println(i);
		
		
	System.out.println(i);
		
	}
	
	
	

}
