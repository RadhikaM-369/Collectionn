package com.xworkz.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
	Collection arrayList=new ArrayList();
	
		arrayList.add("Xworkz");
		arrayList.add("Bangalore");
		arrayList.add("BTM");
		arrayList.isEmpty();
		arrayList.size();;
		arrayList.toArray();
		
		Collection arrayList2=new ArrayList();
		arrayList2.add("RajajiNagar");
		arrayList2.add("Xworkz");
		arrayList2.add("Bangalore");
		System.out.println(arrayList2.size());
		
		arrayList2.addAll(arrayList);
		System.out.println(arrayList2.size());
		
		boolean containsAll=arrayList.containsAll(arrayList2);
		System.out.println(containsAll);
		
		arrayList.removeAll(arrayList2);
		System.out.println(arrayList2.size());
		
		List arrayList1=new ArrayList();
		
		arrayList1.add("Bangalore");
		arrayList1.add("Mysore");
		arrayList1.add("Udupi");
		arrayList1.add("Magalore");
		arrayList1.add("Belgaum");
		arrayList1.add("Hubli");
		arrayList1.add("Dharwad");
		
		for(Object object : arrayList1) {
			System.out.println( object);
		}	}

}
