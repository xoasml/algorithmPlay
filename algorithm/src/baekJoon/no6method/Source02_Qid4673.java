package baekJoon.no6method;

public class Source02_Qid4673 {
	final static int MAX_NUM = 10001;
	
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		selfFinder(sb);
		
		System.out.println(sb);
		
	}
	
	static void selfFinder(StringBuilder sb) {
		int[] unSelfArr = new int[MAX_NUM];
		unSelfFinder(unSelfArr);
		
		for(int i = 0 ; i < MAX_NUM ; i++) {
			if(1 == unSelfArr[i]) {
				sb.append(i + "\n");
			}
		}
	}
	
	
	static void unSelfFinder(int[] unSelfArr) {
		int[] arr = unSelfArr;
		int num = 0;
		int tmp = 0;
		
		for(int i = 0 ; i < MAX_NUM ; i++) {
			tmp = i;
			while(tmp != 0) {
				num += tmp % 10;
				tmp /= 10;
			}
			
			if(num > MAX_NUM) break; 
			arr[num] = 1;
		}
		
	}
}
