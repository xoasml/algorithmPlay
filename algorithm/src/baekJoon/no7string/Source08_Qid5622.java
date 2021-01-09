package baekJoon.no7string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Source08_Qid5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input = br.readLine().toCharArray();
		
		String[] sArr = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
		
		int result = 0;
		
		for(int e = 0; e < input.length ; e++) {
			for(int x = 0, i = 3 ; i < sArr.length+3 ; x++, i++) {
				if(sArr[x].indexOf(input[e]) != -1) {
					result += i;
					break;
				}
			}
		}
		System.out.println(result);
	}
}
