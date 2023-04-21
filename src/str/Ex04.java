package str;

public class Ex04 {
public static void main(String[] args) {
	int i;
	char ch;
	String s = "Have a nice day Have a nice day Have a nice day";
	
	System.out.print("결과: ");
	for(i=0;i<s.length();i++) {
		ch = s.charAt(i);
		
		if(ch=='a') {
			System.out.print(i+" ");
		}
		
	}
	
	
}
}
