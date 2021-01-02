package baekJoon.no3For;

import java.util.Scanner;

public class Source07_Qid10871 {
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1 ; i <= n ; i++) {
			
			int fn = scan.nextInt();
			if(fn < x) {
				sb.append(fn+" ");
			}
		}
		System.out.println(sb);
	}
}
