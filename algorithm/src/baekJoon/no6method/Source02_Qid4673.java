package baekJoon.no6method;

import java.util.HashSet;
import java.util.Iterator;

public class Source02_Qid4673 {
	final static int MAX_NUM = 10000;
	
	public static void main(String[] args) {
		
		HashSet<Integer> set = removeNum(numberMake());
		Iterator<Integer> iter = set.iterator();
		StringBuilder sb = new StringBuilder();
		while(iter.hasNext()) {
			sb.append(iter.next()+"\n");
		}
		System.out.println(sb);
	}
	
	
	public static HashSet<Integer> numberMake(){
		HashSet<Integer> numSet = new HashSet<Integer>();
		int result, num, number;
		result = num = number = 0;

		while(num++ <= MAX_NUM) {
			number = num;
			result = num;
			do {
				result += number%10;
				number = number/10;
			} while(number > 0);
			
			numSet.add(result);
		}
		return numSet;
	}
	
	public static HashSet<Integer> removeNum(HashSet<Integer> set) {
		HashSet<Integer> result = new HashSet<Integer>(10000);
		
		for(int i = 1; i<=MAX_NUM ; i++) {
			result.add(i);
		}
		
		result.removeAll(set);
		return result;
	}
}
