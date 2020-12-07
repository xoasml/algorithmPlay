package pickUpExemple;

import java.util.Arrays;

// 배열안의 내용 무작위로 섞기
public class ArrayShuffle {
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = i;
		}
		System.out.println(Arrays.toString(arr));
		
		int tmp;
		for(int i = 0 ; i<arr.length ; i++) {
			int r = (int)(Math.random()*arr.length);
			tmp = arr[i];
			arr[i] = arr[r];
			arr[r] = tmp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
