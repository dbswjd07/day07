package str;

public class Ex03 {
public static void main(String[] args) {
	String id = "test       ";
	id=id.trim();
	System.out.println(id+"!");
	if(id.equals("test")) {
		System.out.println("인증 통과");
	}else {
		System.out.println("인증 실패");
	}
	
	String addr = "우편번호/주소/상세주소";
	String[] s = addr.split("/");
	System.out.println(s[0]);
	System.out.println(s[1]);
	System.out.println(s[2]);
	
	System.out.println("addr: "+addr);
	addr = addr.replace("/", "=>");
	System.out.println("addr: "+addr);
}
}
