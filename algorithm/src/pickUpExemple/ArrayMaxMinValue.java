package pickUpExemple;

import java.util.Arrays;

/* 
 * 배열의 요소 중 제일 큰 값과 제일 작은 값 구하기
 */
public class ArrayMaxMinValue {
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = (int)(Math.random() *10);
		}
		System.out.println(Arrays.toString(arr));
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i<arr.length ; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			
			if(min > arr[i]) {
				min = arr[i];
			}
			
		}
		
		System.out.println(String.format("최대 : %d, 최소 : %d", max, min));
	}
}
