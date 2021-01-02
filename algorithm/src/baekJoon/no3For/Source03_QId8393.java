package baekJoon.no3For;

//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
import java.util.Scanner;

public class Source03_QId8393 {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		
		int result = 0;
		
		for(int i = 1 ; i <=n ; i++) {
			result += i;
		}
		
		System.out.println(result);
	}
}
