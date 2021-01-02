package baekJoon.no7string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Source02_Qid11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numberCnt = br.readLine();
		char[] cArr = br.readLine().toCharArray();
		int sum = 0;
		for(int i = 0 ; i<cArr.length ; i++) {
			sum += cArr[i] - '0';
		}
		System.out.println(sum);
	}
}
