package baekJoon.no8Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Source01_Qid1712 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int make = Integer.parseInt(input[1]);
		int sale = Integer.parseInt(input[2]);
		
		if(1 > (sale - make)) {
			System.out.println(-1);
			System.exit(0);
		}
		
		int totalMake = Integer.parseInt(input[0]);
		int totalSale = 0;
		
		int saleCnt = 0;
		
		while(true) {
			saleCnt ++;
			
			totalMake += make;
			totalSale += sale;
			
			if((totalSale - totalMake) > 0) {
				break;
			}
		}
		System.out.println(saleCnt);
	}
}
