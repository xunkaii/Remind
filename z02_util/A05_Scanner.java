package javaexp.z02_util;

import java.util.Scanner;

public class A05_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가계부 지출금액 표기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("잔액을 입력하세요:");
		// print() 하면 입력 데이터를 문자열 옆에 바로 입력
		int rest = Integer.parseInt(sc.nextLine());
		System.out.println("현재 잔액은 "+rest+"원 입니다.");
		System.out.print("지출할 내용입력:");
//		String content = sc.next(); // 한번만 문자열 입력 받고 다른 처리 입력하지 못함
		String content = sc.nextLine(); // 한번만 문자열 입력 받고 다른 처리 입력하지 못함
		System.out.print("지출할 금액입력:");
		int spendMoney = Integer.parseInt(sc.nextLine());
		System.out.println("지출 내역:"+content);
		System.out.println("지출 금액:"+spendMoney);
		rest -= spendMoney;
		System.out.println("현재 잔액:"+rest);
			
		
	}

}
