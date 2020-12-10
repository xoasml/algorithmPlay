package pickUpExemple;

public class RecursiveCallPractice {	/* 재귀호출 연습 */
	public static void main(String[] args) {
		System.out.println(mult(2, 4));
		System.out.println(pow(2, 4));
		System.out.println(fac(4));
	}
	
	// 곱하기
	static int mult(int i, int e) {
		if(e == 0) return 0;
		return i + mult(i, --e);
	}
	
	// 제곱
	static int pow(int i, int e) {
		if(e == 1) return i;
		return i * pow(i, --e);
	}
	
	// 팩토리얼
	static int fac(int i) {
		if(i == 1) return i;
		return i * fac(--i);
	}
	
}
