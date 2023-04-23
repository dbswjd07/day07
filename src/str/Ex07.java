package str;

import java.util.ArrayList;

public class Ex07 {
public static void main(String[] args) {
	
	String str = new String("tESt sTring change first");
	String changeStr = new String();
	char ch,ch2 , first, other=0;
	String str2;
	
	
	
	
	String[] s = str.split(" ");

	
	
	for(int i=0;i<s.length;i++) {
		
		ch = s[i].charAt(0) ;
		first = (char)(ch-32);
		changeStr += first;
		
		
		for(int j=1;j<s[i].length();j++) {
			
			ch = s[i].charAt(j);
			if(65<=ch&&ch<=90) {
				other=(char)(ch+32);
				
			}else if(97<=ch&&ch<=122){
				other=ch;
				
			}
			
			changeStr += other;
			
		}
		
		changeStr += " ";
		
		
		//System.out.println(s[i]);
	}
	
	System.out.println("변경 전: "+str);
	System.out.println("변경 후: "+changeStr);
	
	
}
}
