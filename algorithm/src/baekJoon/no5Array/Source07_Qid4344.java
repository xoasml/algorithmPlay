package baekJoon.no5Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
public class Source07_Qid4344 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int cnt = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < cnt ; i++) {
			
			double sum = 0;
			double studentCnt = 0;
			
			
			String[] strArr = br.readLine().split(" ");
			double[] doArr = new double[strArr.length];
			// 1. 평균 점수 구하기
			for(int e = 0 ; e < strArr.length ; e++) {
				doArr[e] = Integer.parseInt(strArr[e]);
				if(e == 0) {
					studentCnt = doArr[e];
				} else {
					sum += doArr[e];
				}
			}
			double avgScore = sum / studentCnt;
			double avgUpCnt = 0; // 평균 점수보다 높은 사람 cnt
			
			// 2. 평균점수 보다 높은 점수 / 인원 * 100
			for(int e = 1 ; e < doArr.length ; e++) {
				if(avgScore < doArr[e]) {
					avgUpCnt++;
				}
			}
			
			sb.append(String.format("%.3f%%%n",(avgUpCnt / studentCnt) * 100));
		}
		System.out.println(sb);
	}
}
