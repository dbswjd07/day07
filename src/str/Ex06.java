package str;

import java.util.ArrayList;

public class Ex06 {
public static void main(String[] args) {
	
	String str = new String("tESt sTring change first");
	String changeStr = new String();
	char ch,ch2 , first, other=0;
	String str2;
	
	
	System.out.println("변경 전: "+str);
	
	String[] s = str.split(" ");

	System.out.print("변경 후: ");
	
	for(int i=0;i<s.length;i++) {
		
		ch = s[i].charAt(0) ;
		first = (char)(ch-32);
		System.out.print(first);
		
//		ch2 = s[i].charAt(1);
//		other = (char)(ch+32);
		
		for(int j=1;j<s[i].length();j++) {
			
			ch = s[i].charAt(j);
			if(65<=ch&&ch<=90) {
				other=(char)(ch+32);
				System.out.print(other);
			}else if(97<=ch&&ch<=122){
				other=ch;
				System.out.print(other);
			}
			
			
		}
		
		System.out.print(" ");
		
		
		//System.out.println(s[i]);
	}
	
	
	
	
}
}
