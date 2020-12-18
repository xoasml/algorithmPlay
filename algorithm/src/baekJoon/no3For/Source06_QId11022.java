package baekJoon.no3For;

import java.util.Scanner;
/*
 * 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
 */
public class Source06_QId11022 {
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
	
		for(int i = 1 ; i <= t ; i++) {
			
			int fn = scan.nextInt();
			int bn = scan.nextInt();
			
			System.out.printf("Case #%d: %d + %d = %d %n", i, fn, bn, fn+bn);
		}
	}
}
