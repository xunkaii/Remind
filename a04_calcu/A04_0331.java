package javaexp.a04_calcu;

public class A04_0331 {

	public static void main(String[] args) {
// 1. 연산자, 피연산자, 연산식을 예제로 만들어, 해당 내용을 구분하여 설명
		int num01 = 7; int num02 = 12;
		System.out.println(num01+" + "+num02+" = "+(num01+num02));
// 		+, =는 연산자 / 7, 12는 피연산자
		
// 2. 산술연산자의 종류와 그 특징을 예제를 통하여 설명		
		int person = 3;
		int food = 16;
		System.out.println("배분: "+(food/person)+" 나머지: "+(person%food));
		
// 3. 500cc의 오렌지쥬스를 3잔에 나누어 할당할려고 한다. 소숫점 이하가 처리된 경우와
//    소숫점 이하가 처리되지 않는 경우를 나누어 코딩
		int orn = 500;
		int cup = 3;
		System.out.println("소숫점 처리된 경우: "+(orn/cup));
		
		float orn1 = 500;
		float cup2 = 3;
		System.out.println("소숫점 처리되지 않은 경우: "+(orn1/cup2));
		
// 4.  증감연산식의 앞에 ++, 뒤에 ++의 차이점을 예제를 통하여 기술하세요
		int cnt1 = 10;
		System.out.println(cnt1++); // +1을 바깥쪽에서 한다 10
		System.out.println(cnt1++); // 11로 들어와 바깥에서 +1해서 12
		System.out.println(++cnt1); // +1을 더하면서 들어와 13
		System.out.println(cnt1++); // +1을 바깥쪽에서 한다 13
		
// 5. 증감대입연산자의 종류를 기술하고 예제를 통하여 설명하세요. 
		// 종류: +=, -+ (*=, /=, %= ...)
		int cnt11 = 0;
			cnt11 = cnt11 + 10; // cnt11 = 10
			cnt11 += 10;        // cnt11 = 20
			cnt11 -= 20;        // cnt11 = 0
			cnt11 *= 10;		// cnt11 = 0
		System.out.println(cnt11);
		
// 6. 구매하는 김밥의 갯수를 선언하고, 1씩 증가하여 김밥의 단가(2500) 아래와 같이 출력
/*	      김밥 1개 구매  2500 
	      김밥 2개 구매  5000
	      김밥 3개 구매  10000
*/
		
// 7. 문자열의 비교연산자 사용에서 ==, equals()의 차이점을 기술하세요.
/* 		문자열 비교 차이
*/

// 7. main()의 args[]의 처리 내용방법 자바 코드를 통한 처리와 함께 기술하세요		
		
		
// 8. args로 물건명1 가격1 갯수1 물건명2 가격2 갯수2로 입력받아 계산서(전체 총계포함)를 출력하세요
/*  키보드 / 100000 / 1
    마우스 / 40000 / 1
 */
		String key = args[0];
		String pri = args[1];
		String count1 = args[2];
		
		String mou = args[3];
		String pri1 = args[4];
		String count2 = args[5];
		
		System.out.println("");
		System.out.print("물건명1: "+args[0]+" ");
		System.out.print("가격: "+args[1]+"원 ");
		System.out.println("갯수: "+args[2]);
		
		System.out.print("물건명2: "+args[3]+" ");
		System.out.print("가격2: "+args[4]+"원 ");
		System.out.println("갯수2: "+args[5]);
		
		int price = Integer.parseInt(args[1]);
		int price2 = Integer.parseInt(args[4]);
		System.out.println(price+price2);
		
		
	
		
		
		
		
		
		
	
	
		
			
		
		
		
		
		
		
		
		
		
	}

}
