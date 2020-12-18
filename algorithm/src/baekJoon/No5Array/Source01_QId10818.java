package baekJoon.No5Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
*/
public class Source01_QId10818 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		String[] strArr = new String[cnt];
		strArr = br.readLine().split(" ");
		
		int[] arr = new int[strArr.length];
		for(int i = 0 ; i<arr.length ; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}
		
		int min = arr[0];
		int max = arr[0];
		for(int i = 0 ; i < arr.length ; i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		System.out.println(min + " " + max);
	}
}
