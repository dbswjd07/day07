package radom;

import java.util.ArrayList;

public class Ex02 {
public static void main(String[] args) {
	System.out.println(Math.random());
	ArrayList<Integer> arr = new ArrayList<>();
	
	for(int i=0;i<6;i++) {
		double ran = Math.random();
		
		//System.out.println((int)(ran*45)+1);
		
		arr.add((int)(ran*6)+1);
		
		if(arr.contains(arr)) {
			System.out.println("ㅈ");
		}
		
	
	}
	System.out.println(arr);
}
}
