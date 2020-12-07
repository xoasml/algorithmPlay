package pickUpExemple;

import java.util.Arrays;

// 배열 정렬하기 sort메서드 사용 불가
public class ArraySort {
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = (int)(Math.random() *10);
		}
		System.out.println(Arrays.toString(arr));
		
		int tmp = 0;
		for(int i = 0 ; i<arr.length-1 ; i++) {
			boolean chg = false;
			for(int e = 0 ; e < arr.length-1-i; e++) {
				if(arr[e] > arr[e+1]){
					tmp = arr[e];
					arr[e] = arr[e+1];
					arr[e+1] = tmp;
					chg = true;
				}
			}
			if(!chg) break;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
