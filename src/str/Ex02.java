package str;

public class Ex02 {
public static void main(String[] args) {
	int num = 1111;
	
	//String st = (String)num;
	String st = num+"";
	System.out.println("a"+100+100);
	System.out.println(st+num);
	int n = Integer.parseInt(st);
	System.out.println(n+num);
	
	int n2 = (int)'a';
	
	String st02 = "";
	st02 += "a";
	st02 += 'b';
	st02 += (char)('c' - 32);
	System.out.println(st02);
	
}
}
