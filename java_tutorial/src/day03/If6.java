package day03;

import java.util.Scanner;

public class If6 {
	public static void main(String[] args) {
		/* 년,월을 입력하면 몇일까지 있는지 알려주는 프로그램 개발
		 1,3,5,7,8,10,12 -> 31일
		 4,6,9,11 -> 30일
		 2 -> 28일, 윤년일때만 29일
		 그외 입력 -> "?"
		 
		 윤년공식 : 4로 나눠떨어지면서 100으로 나누어 떨어지지 않으면 윤년,
		 		 혹은 400으로 나눠 떨어진다면 무조건 윤년.
		 		 
		 switch, if 중 아무거나 써서 해보기
		 결과예시 : 2024년 2월은 29일까지 있습니다.
		 
		 년도를 입력받고, 월을 입력받아서 몇일까지 있는지 보여주기
		 int year, month, day;
		 */
		Scanner sc = new Scanner(System.in);
		String year = "";
		String month = "";
				
		System.out.println("해당 연도를 입력하세요 >>> ");
		year = sc.next();
		System.out.println("해당 월을 입력하세요 >>> ");
		month = sc.next();
/*		
		if (month = 1&&3&&5&&7&&8&&10&&12) {
			System.out.println("31일");
		}else if (month == 4,6,9,11)	
			System.out.println("30일");
			break;
		case "2":
			System.out.println("28일");
			break;
			//if (!(year % 4 == 0)||(year % 100 != 0))
				//System.out.println("29일");
		default :
			System.out.println("해당하는 항목이 없습니다.");
		}*/
	}
}
