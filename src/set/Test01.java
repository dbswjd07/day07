package set;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	ArrayList<String> name = new ArrayList<>();
	ArrayList<String> phone = new ArrayList<>();
	String inputName;
	String inputPhone;
	
	int num;
	int i,i2;
	
	
	while(true) {
		System.out.println("1. 연락처 등록");
		System.out.println("2. 연락처 보기");
		System.out.println("3. 연락처 삭제");
		System.out.println("4. 모든 연락처 보기");
		System.out.println("5. 종료");
		System.out.print(">>> ");
		num = input.nextInt();
		boolean bool;
		
		switch(num) {
		case 1:
			System.out.print("이름: ");
			inputName = input.next();
			System.out.print("연락처: ");
			inputPhone = input.next();
			
			
			if(name.contains(inputName)) {
				System.out.println("중복되는 이름입니다");
			}else {
				if(phone.contains(inputPhone)) {
					System.out.println("중복되는 연락처입니다");
				}else {
					System.out.println("등록 완료");
					
				}
			}
			
			name.add(inputName);
			phone.add(inputPhone);
			
			
			break;
		case 2:
			System.out.print("이름: ");
			inputName = input.next();
			
			if(name.contains(inputName)) {
				System.out.print("연락처: ");
				i=name.indexOf(inputName);
				System.out.println(phone.get(i));
				
			}else {
				System.out.println("등록되어 있지 않습니다");
			}
			
			
		
			break;
		case 3:
			System.out.print("삭제할 회원 이름: ");
			name.remove(input.next());
			System.out.println("삭제 완료");break;
		case 4:
			
			System.out.println();
			for(String s : name) {
				System.out.println("이름: "+ s);
				for(String s2 : phone) {
					System.out.println("연락처: "+s2);
					System.out.println();
					break;
				}
			}
			
			break;
			
		case 5:
			System.out.println("프로그램 종료");
			System.exit(1);
		}
	}
}
}
