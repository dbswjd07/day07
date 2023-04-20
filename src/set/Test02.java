package set;

import java.util.ArrayList;
import java.util.Scanner;

public class Test02 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	ArrayList<String> name = new ArrayList<String>();
	ArrayList<String> phone = new ArrayList<String>();
	
	String inputName;
	String inputPhone;
	int num,i;
	
	while(true) {
		System.out.println("1.연락처 등록");
		System.out.println("2.연락처 보기");
		System.out.println("3.연락처 삭제");
		System.out.println("4.모든 연락처 보기");
		System.out.println("5.종료");
		System.out.print(">>> ");
		num = input.nextInt();
		
		switch(num) {
		case 1:
			System.out.print("이름: ");
			inputName = input.next();
			System.out.print("연락처: ");
			inputPhone = input.next();
			
			if(name.contains(inputName)) {
				System.out.println("중복된 이름입니다");
			}else {
				if(phone.contains(inputPhone)) {
					System.out.println("중복된 연락처입니다");
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
				i = name.indexOf(inputName);
				System.out.println("연락처: "+phone.get(i));
				
			}else {
				System.out.println("존재하지 않는 회원입니다");
			}
			
			break;
		case 3:
			System.out.print("삭제 회원 이름: ");
			
			inputName = input.next();
			i=name.indexOf(inputName);
			phone.remove(i);
			name.remove(inputName);
			
			System.out.println("삭제 완료");
			
			break;
		case 4:
			
			for(i=0;i<name.size();i++) {
				System.out.println("이름: "+name.get(i));
				System.out.println("연락처: "+phone.get(i));
			}
			
			
			break;
		case 5:
			System.out.println("프로그램 종료");
			System.exit(1);
		}
	}
}
}
