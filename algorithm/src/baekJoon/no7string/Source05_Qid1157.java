package baekJoon.no7string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Source05_Qid1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		String input = br.readLine().toUpperCase();
		
		int arr[] = new int[alphabet.length()];
		
		for(int e = 0 ; e<input.length() ; e++) {
			for(int i = 0 ; i<alphabet.length() ; i++) {
				if(input.charAt(e) == alphabet.charAt(i)) {
					arr[i]++;
				}
			}
		}
		char result = '\u0000';
		int num = 0;
		int tmp = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(num < arr[i]) {
				num = arr[i];
				result = alphabet.charAt(i);
			} else if(num == arr[i]) {
				result = '?';
			}
		}
		
		System.out.println(result);
	}
}
