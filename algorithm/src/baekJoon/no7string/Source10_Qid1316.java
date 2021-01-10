package baekJoon.no7string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Source10_Qid1316 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int roof = Integer.parseInt(br.readLine());
		int result = 0;
		
		for(int i = 0 ; i < roof ; i++) {
			
			boolean flag = true;
			String tmp = "";
			
			char[] input = br.readLine().toCharArray();
			
			for(int e = 0 ; e < input.length ; e++) {
				
				if(e == input.length-1) {
					if(tmp.indexOf(input[e]) != -1) {
						flag = false;
					}
					break;
				}
				
				if(input[e] != input[e+1]) {
					if(tmp.indexOf(input[e]) != -1) {
						flag = false;
						break;
					}
					tmp += input[e];
				}
				
			}
			
			if(flag) {
				result ++;
			}
		}
		System.out.println(result);
	}
}
