package baekJoon.no6method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Source03_Qid1065 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		System.out.println(cnt(input));
		
	}
	
	static int cnt(int input) {
		int result = 0;
		
		for(int i = 1 ; i<=input ; i++ ) {
			if(i < 100) {
				result++;
				continue;
			}
			
			if(checker(i)) {
				result++;
			}
		}
		return result;
	}
	
	static boolean checker(int i) {
		boolean check = true;
		int[] digit = new int[(int)(Math.log10(i)+1)];
		
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		
		for(int e = 0 ; e < digit.length ; e++) {
			digit[e] = i%10;
			i /=10;
		}
		
		for(int e = 0; e< digit.length-1 ; e++) {
			list.add(digit[e] - digit[e+1]);
		}
		
		Iterator<Integer> iter = list.iterator();
		int x = iter.next();
		while(iter.hasNext()){
			int re = iter.next();
			if(x != re) {
				check = false;
			}
		}
		return check;
	}
	
}
