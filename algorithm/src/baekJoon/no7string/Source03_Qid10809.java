package baekJoon.no7string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;

public class Source03_Qid10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		char[] input = br.readLine().toCharArray();
		
		StringJoiner sj = new StringJoiner(" ");
		
		
		for(int i = 0 ; i<alphabet.length() ; i++) {
			String tmp = "-1";
			
			tmp = alphabet.indexOf(i)+"";
			
			sj.add(tmp);
		}
		System.out.println(sj.length());
		System.out.println(sj);
	}
}
