import java.util.Scanner;

public class FlowEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		조건문
//		조건문은 프로그램의 flow(흐름)를 바꾸는 역할을 한다.
//		if(조건식) {
//		// 조건식이 true일 때 수행될 문장들을 적는다
//		}

//		int score = 0;
//
//		score = 61;
//
//		if (score > 60) {
//			System.out.println("합격입니다");
//		}

		// 홀짝 판별 프로그램
		
		Scanner scan = new Scanner(System.in);
		
		int inputNum = 0;
		
		System.out.println("숫자를 입력해주세요");
		
		inputNum = scan.nextInt();
		
		if(inputNum == 0) {
			System.out.println("0 입니다");
		}
		
		if(inputNum !=0) {
			System.out.println("0 아닙니다.");
		}
		
		
		
	}

}
