package baekJoon.no7string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Source09_Qid2941 {
	public static void main(String[] args) throws IOException {
		String[] str = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int cnt = 0;
		
		for(int i = 0; i<str.length ; i++) {
			while(true) {
				if(!input.contains(str[i])) {
					break;
				} else {
					input = input.replaceFirst(str[i], " ");
					cnt++;
				}
			}
		}
		
		System.out.println(cnt+input.trim().replace(" ", "").length());
	}
}
