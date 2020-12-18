package baekJoon.No5Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

//두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
//수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
public class Source04_QId3052 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[10];
		
		for(int i = 0 ; i<arr.length ; i++) {
			arr[i] = (Integer.parseInt(br.readLine())) % 42;
		}
		int cnt = 0;
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for(int i=0 ; i<arr.length ; i++) {
			hmap.put(arr[i], 1);
		}
		System.out.println(hmap.size());
	}
}
