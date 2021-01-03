package baekJoon.no7string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Source04_Qid2675 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int roofCnt = Integer.parseInt(br.readLine());
		
		StringBuilder sb; 
		
		for(int i = 0 ; i<roofCnt ; i++) {
			sb = new StringBuilder();
			String[] input = br.readLine().split(" ");
			
			int cnt = Integer.parseInt(input[0]);
			
			char[] cArr = input[1].toCharArray();
			
			for(int e = 0 ; e<cArr.length ; e++) {
				for(int x = 0; x<cnt ; x++) {
					sb.append(cArr[e]);
				}
			}
			System.out.println(sb);
		}
	}
}
