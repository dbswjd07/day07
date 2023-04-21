package str;

public class Ex06 {
public static void main(String[] args) {
	
	String str = new String("tESt sTring change first");
	String changeStr = new String();
	Character ch, ch2, first;
	String str2;
	
	
	String[] s = str.split(" ");
	
	str.toUpperCase();
	
	for(int i=0;i<s.length;i++) {
		
		ch = s[i].charAt(0);
		System.out.println(ch);
		
		changeStr = s[i].toLowerCase();
		System.out.println(changeStr);
		
		
		
		//System.out.println(s[i]);
	}
	
	
	System.out.println("변경 전: "+str);
	System.out.println("변경 후: "+changeStr);
}
}
