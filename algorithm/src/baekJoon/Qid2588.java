package baekJoon;

import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2588
 * 
 * (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 *    472···(1)
 *   x385···(2)
 *-------
 *   2360···(3)
 *  3776 ···(4)
 * 1416  ···(5)
 *-------
 * 181720···(6)
 * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에
 * 들어갈 값을 구하는 프로그램을 작성하시오.
 * 
 */

public class Qid2588 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int top = scan.nextInt();
		int bottom = scan.nextInt();
		
		String strBottom = ""+bottom;
		char[] bAr = strBottom.toCharArray();
		
		for(int i = bAr.length-1 ; i >= 0 ; i--) {
			System.out.println(top*(bAr[i] - 48));
		}
		System.out.println(top*bottom);
		
//		백준에서 가장 짧은 코드
//		Scanner s = new Scanner(System.in);
//		int a = s.nextInt(), b = s.nextInt();
//		System.out.printf("%d %d %d %d", b % 10 * a, b / 10 % 10 * a, b / 100 * a, a * b);
	}
}

/* 
 * for문을 써도 되는건지 안되는건지 딱 연산자만 이용해야 하는건지 모르겠어서 포문 돌렸다..
 */
