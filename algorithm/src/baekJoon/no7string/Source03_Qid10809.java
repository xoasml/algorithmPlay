package baekJoon.no7string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;

public class Source03_Qid10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		String input = br.readLine();
		StringJoiner sj = new StringJoiner(" ");
		
		for(int i = 0 ; i<alphabet.length ; i++) {
			sj.add(input.indexOf(alphabet[i])+"");
		}
		System.out.println(sj);
	}
}
