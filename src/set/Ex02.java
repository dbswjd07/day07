package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex02 {
public static void main(String[] args) {
	ArrayList<String> arr = new ArrayList<>();
	arr.add("aaa");
	arr.add("bbb");
	arr.add("ccc");
	
//	Iterator<String> it = arr.iterator();
	//[bof aaa bbb ccc eof]
	// it
//	System.out.println(it.hasNext());
//	System.out.println(it.next());
//	System.out.println(it.next());
//	System.out.println(it.next());
//	System.out.println(it.hasNext());
	
//	for(int i=0;i<arr.size();i++) {
//		if(it.hasNext()==true) {
//			System.out.println(it.next());
//		}else {
//			break;
//		}
//	}
//	
//	for(;it.hasNext();) {
//		System.out.println(it.next());
//	}
//	
//	while(it.hasNext()) {
//		System.out.println(it.next());
//	}

	HashSet<String> set = new HashSet<>();
	set.add("aaa");
	set.add("bbb");
	set.add("ccc");
	
	Iterator<String> ite = arr.iterator();
	while(ite.hasNext()) {
		System.out.println(ite.next());
	}
	
}
}
