package baekJoon.no7string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Source06_Qid1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine().trim();
		String[] arr = input.split(" ");
		
		int reuslt = 0;
		if(input.length() > 0) {
			reuslt = arr.length;
		}
		
		System.out.println(reuslt);
	}
}
