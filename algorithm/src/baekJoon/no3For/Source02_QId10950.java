package baekJoon.no3For;
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
import java.util.Scanner;

public class Source02_QId10950 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[scan.nextInt()];
		
		for(int i = 0 ; i < arr.length ; i++)
			arr[i] = scan.nextInt() + scan.nextInt();
		
		for(int i : arr)
			System.out.println(i);
	}
}
