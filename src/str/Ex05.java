package str;

public class Ex05 {
public static void main(String[] args) {
	String s = "It is a fun java programming";
	int i, aCount=0, gCount=0;
	char ch;
	
	for(i=0;i<s.length();i++) {
		ch = s.charAt(i);
		
		if(ch == 'a') {
			aCount++ ;
		}else if(ch == 'g') {
			gCount++;
		}
	}
	System.out.println("총 개수: "+i);
	System.out.println("a 개수 : "+aCount);
	System.out.println("g 개수 : "+gCount);
}
}
