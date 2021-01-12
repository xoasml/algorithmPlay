package baekJoon.no8Math;

import java.util.Scanner;

public class Source02_Qid2292 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int result = 0;
		int check = 1;
		
		outer:
		while(true) {
			result ++;
			if(input == 1) {
				break;
			}
			for(int i = 0 ; i < 6* (result-1) ; i++) {
				check++;
				if(input == check) {
					break outer;
				}
			}
		}
		System.out.println(result);
	}
}
