package idea;

public class charToNumConvert {
	public static void main(String[] args) {
		/*
		 * 유니코드의 차이를 이용해서 문자에서 숫자로 바꾸기 
		 * 문자와 숫자의 유니코드(정수) 차이는 48였다!
		 */
	
		String numStr = "1234431";
		StringBuffer sb = new StringBuffer(numStr);
		// 배열에 그냥 담으면 1, 2, 3, 4  : ch[0] = 1 의도적으로 4가 먼저 나오게 문자열을 뒤집어 주었다
		numStr = sb.reverse().toString();
				
		char[] ch = numStr.toCharArray();	//배열에 문자타입의 숫자를 넣어주고
				
		long result = 0;
				
		for(int i = 0; i < ch.length ; i++) {
			// i가 0일때 ch[0] : ('4' - 48) * (long)Math.pow(10, 0)
		    // i가 0일때 ch[0] : ((int 자동형변환 )'4' - 48) * 1L
		    // i가 0일때 ch[0] : (52 - 48) * 1L
		    // i가 0일때 ch[0] : 4 * 1L = 4L (피연산자중 long이 있음으로 long으로 자동 형변환)
		    // result = result + 4L
		    // 이렇게 1의 자리는 4가 들어가게 된다.
	
			result = result + (ch[i] - 48) * (long)Math.pow(10, i);
		}
		System.out.println(result); 
	}
}
