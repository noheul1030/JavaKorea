package day03;

import java.util.Scanner;

public class Scan3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 시험통과여부 판별 프로그램
		// 대상 : 국어, 영어, 수학 + 총점
		// 국영수 전과목 각각 40점 이상이면서 합계가 150점 이상이면 합격
		// 그 외에는 불합격
		int 
		int 국어 = sc.nextInt("국어점수를 입력하세요 >>> ");
		int 영어 = sc.nextInt("영어점수를 입력하세요 >>> ");
		int 수학 = sc.nextInt("수학점수를 입력하세요 >>> ");
		
		int 총점 = sc.nextInt(국어+영어+수학);
		
		
		if(!(국어 > 40)||!(영어 > 40)||!(수학 > 40)) {
			System.out.println("불합격입니다.");
		}else {
			System.out.println("합격입니다.");
	}
}
