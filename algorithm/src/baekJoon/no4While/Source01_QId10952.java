package baekJoon.no4While;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*입력은 여러 개의 테스트 케이스로 이루어져 있다.
각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
입력의 마지막에는 0 두 개가 들어온다.*/
public class Source01_QId10952 {
	public static void main(String[] args) throws IOException{
		
		int sum = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " "); 
			sum = (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			if(sum == 0) break;
			sb.append(sum+"\n");
		}
		br.close();
		System.out.println(sb);
	}
}
