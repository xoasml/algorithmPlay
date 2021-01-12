package pickUpExemple;

import java.util.Arrays;

// 배열에 어떤 값이 몇개 저장되어있는지 CNT
public class ArrayElementCnt {
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = (int)(Math.random() *10);
		}
		System.out.println(Arrays.toString(arr));
		
		int[] cnt = new int[10];
		
		for(int i = 0 ; i<arr.length ; i++) {
			cnt[arr[i]] ++;
		}
		
		for(int i = 0; i<cnt.length ; i++) {
			System.out.println(String.format("%d는 %d개", i, cnt[i]));
		}
		
		
		
	}
}
