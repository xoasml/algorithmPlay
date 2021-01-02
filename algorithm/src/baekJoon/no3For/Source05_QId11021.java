package baekJoon.no3For;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
 */

public class Source05_QId11021 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 1 ; i <= t ; i++) {
			System.out.printf("Case #%d: %d%n", i, Integer.parseInt(br.readLine())+Integer.parseInt(br.readLine()) );
		}
	
	}
}
