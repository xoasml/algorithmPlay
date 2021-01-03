package baekJoon.no7string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Source07_Qid2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputArr = br.readLine().trim().split(" ");
		StringBuilder sb;
		int iArr[] = new int[2];
		
		for(int i = 0 ; i < inputArr.length ; i++) {
			sb = new StringBuilder();
			sb.append(inputArr[i]);
			iArr[i] = Integer.parseInt(sb.reverse().toString());
		}
		
		if(iArr[0] > iArr[1]) {
			System.out.println(iArr[0]);
		} else {
			System.out.println(iArr[1]);
		}
	}
}
