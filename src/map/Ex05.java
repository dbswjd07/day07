package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ex05 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	HashMap<String,Integer> menu = new HashMap<>();
	int num, inputMoney,i=1;
	String inputMenu;
	boolean bool = true;
	
	
	while(true) {
		System.out.println("1. 메뉴등록");
		System.out.println("2. 메뉴별 가격 보기");
		System.out.println("3. 종료");
		System.out.print(">>> ");
		num = input.nextInt();
		
		switch(num) {
		case 1:
			System.out.print("메뉴 이름: ");
			inputMenu = input.next();
			System.out.print("가격 입력: ");
			inputMoney = input.nextInt();
			if(menu.containsKey(inputMenu)) {
				System.out.println("이미 존재하는 메뉴입니다");
			}else {
				menu.put(inputMenu, inputMoney);
			}
			
			break;
			
		case 2:
			Iterator<String> it = menu.keySet().iterator();
			
			while(i<menu.size()) {
				it.hasNext();
				String key = it.next();
				i=1;
				System.out.println(i+"."+key+":"+menu.get(key));
				i++;
			}
			
			
			bool = true;
			
			
			while(bool) {
				System.out.println("1.수정  2.삭제  3.나가기");
				System.out.print(">>> ");
				num = input.nextInt();
				
				switch(num) {
				case 1:
					System.out.print("수정 할 메뉴 입력: ");
					inputMenu = input.next();
					if(menu.containsKey(inputMenu)) {
						System.out.print("새로운 가격 입력: ");
						inputMoney = input.nextInt();
						menu.put(inputMenu,inputMoney);
						System.out.println("수정 완료");
					}else {
						System.out.println("존재하지 않는 메뉴입니다");
					}
					break;
				case 2:
					System.out.print("삭제 할 메뉴 입력: ");
					inputMenu = input.next();
					if(menu.containsKey(inputMenu)) {
						menu.remove(inputMenu);
						System.out.println("삭제 완료");
					}else {
						System.out.println("존재하지 않는 메뉴입니다");
					}
					break;
				case 3:
					bool = false;
				}
				
			}
			
			
			break;
			
		case 3:
			System.out.println("프로그램 종료");
			System.exit(1);
		}
	}
}
}
