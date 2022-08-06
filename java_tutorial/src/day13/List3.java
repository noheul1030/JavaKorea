package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class List3 {
	public static void main(String[] args) {
		Menu1 a = new Menu1();
		a.go();
	}
}

class Menu1{
	private int choice = -1;
	
	public void go() {
		ArrayList<String> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String str1 = "", str2 = "";
		
		while(true) {
			System.out.println("[1.추가 2.수정 3.제거 4.보기 0.종료]");
			choice = Integer.parseInt(sc.nextLine());
			if(choice == 1) {
				System.out.print("추가할 항목 입력 >>> ");
				str1 = sc.nextLine();
				arr.add(str1);
			}
			else if(choice == 2) {
				System.out.print("수정할 위치를 입력 >>> ");
				choice = Integer.parseInt(sc.nextLine());

				System.out.print("수정할 내용을 입력 >>> ");
				str1 = sc.nextLine();
				
				arr.set(choice,str1);
			}
			else if(choice == 3) {
				System.out.print("삭제할 위치를 입력 >>> ");
				choice = Integer.parseInt(sc.nextLine());
				
				arr.remove(choice);	
			}
			else if(choice == 4) {
				for (int i = 0; i < arr.size(); i++) {
					System.out.print(arr.get(i)+" ");
					
					}
			}
			else if(choice == 0) {
				break;
			}
			else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
		System.out.println("프로그램 종료");
	}
}

