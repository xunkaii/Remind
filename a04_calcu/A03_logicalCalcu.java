package javaexp.a04_calcu;

public class A03_logicalCalcu {

	public static void main(String[] args) {
		/*
		7. 논리연산자
		- 비교연산식이 2개이상, 또는 not(!) 연산자를 이용할 때 논리연산자를 이용해서 처리한다
		&& : (and) 논리합 두가지 비교연산자가 모두 true일 때, true 그외는 false
			 ex) 나이에 따라 청소년요금제 적용 여부
			 boolean isAdolPay = age>=14 && age<18
		
		|| : (or) 논리곱 두가지 비교연산자중 하나만 true이면 true, 둘 다 false일 때 false
				 ex) 놀이공원 나이에 따라 무료입장 적용 여부
				 boolean isFree = age<5 || age>=65
		
		! : (not) 비교연산식이나 논리연산식의 결과가 true이면 false로, false이면 true로 처리
			boolean isPass = point>=60; 합격하는 경우
			boolean isNotPass =!isPass; 불합격하는 경우
			booleans isPay = !isFree    유료인 경우
		*/
		
		int age = 25;
		boolean isAdol = age>=14 && age<18;
		// && and 두개의 비교연산자가 모두 다 true일때 처리
		System.out.println("청소년 여부:"+isAdol);
		
		String inputId = "himan";
		String inputPass = "7777";
		boolean isMemValid = inputId.equals("himan") && inputPass.equals("7777");
		System.out.println("로그인 성공여부:"+isMemValid);
		
		age = 4;
		boolean isFree = age<5 || age>=65;
		System.out.println("무료 여부:"+isFree);
		
		// ex) 국어 점수와 영어 점수를 할당해서 
		//      모두 다 80점 이상이면 상금 50000원 여부
		//		둘중에 하나만 90점 이상이면 상금 30000원 여부를 처리할때 변수 선언하고 상금 여부를 출력
		
		int kor = 80;
		int eng = 80;
		boolean sumAvr = kor>=80 && eng>=80;
		boolean sumAvr2 = kor>=90 || eng >=90;
		System.out.println("80점 이상 상금 여부:"+ sumAvr);
		System.out.println("90점 이상 상금 여부:"+ sumAvr2);
		
		int korea = 90;
		boolean is80over = kor>=80;
		System.out.println("국어점수가 80이상여부:"+is80over);
		int english = 70;
		boolean isGift50000 = korea>=80&&english>=80;
		System.out.println("상금 50000 여부:"+isGift50000);
		boolean isGift30000 = korea>=90 || english>=90;
		System.out.println("상금 30000 여부:"+isGift30000);
		
		
		int point = 70;
		boolean isPass = point >=60;
		boolean isNotPass = !isPass;
		System.out.println("합격여부:"+isPass);
		System.out.println("불합격여부:"+isNotPass);
		
		int age1 = 17;
		boolean isAdol1 = age1>=14 && age1<18;
		boolean isNotAdol1 = !isAdol1;
		boolean isNotAdol2 = !(age1>=14 && age1<18);
		boolean isNotAdol3 = age1<14 || age>=18;
		System.out.println("청소년인지 여부:"+isAdol1);
		System.out.println("청소년인지 여부:"+isNotAdol1);
		System.out.println("청소년인지 여부:"+isNotAdol2);
		System.out.println("청소년인지 여부:"+isNotAdol3);
		
		// ex) 5미만이거나 65이상이면 무료요금제이다
		// 무료요금제가 아닌 경우를 위!(not) 활용하거나 연산식을 사용
		
		age = 4;
		boolean isFree1 = age<5 || age>=65;
		boolean isNotFree1 = age>=4 && age<65;
		boolean isNotFree2 = !isFree1;
		boolean isNotFree3 = !(age<5 || age>=65);
		System.out.println("무료요금이 아닌 경우:"+isNotFree1);
		System.out.println("무료요금이 아닌 경우:"+isNotFree2);
		System.out.println("무료요금이 아닌 경우:"+isNotFree3);
		
		
		
		
	}

}
