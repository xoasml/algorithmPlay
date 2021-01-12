package idea;
/*
 * 비트 연산에 대해 공부하다가 ^(XO연산자)를 활용한 
 * 암호화, 복호화를 할수 있는 클래스를 만들어 볼까.. 하는 생각에
 * 만들어봤음  
 */

/*
 * 클래스 이름은 단순 무식하게 그냥 암호화복호화를 
 * 영어로 번역해서 Encryption(암호화)Decryption(복호화)
 */
public class EncryptionDecryption {
	
	final static int ED_WROD = 1234;
	
	public static void main(String[] args) {
		
		String target = "암호라구요";
		System.out.println("암호화 대상 : " + target);
		
		String encVar = EncryptionDecryption.encryption(target);
		String decVar = EncryptionDecryption.decryption(encVar);
		
		System.out.println("암호화 = " + encVar);
		System.out.println("복호화 = " + decVar);
		
	}
	
	// 암호화 메소드
	
	/*
	 * 암호화된 데이터를 다시 암호화에 넣어도 복호화가 이루어 지겠지만
	 * 어떤 데이터가 암호화 된 것인지부터 구별하기 위해 메소드를 2개로 나누었다.
	 * 나누고 나니 암호화된 데이터를 명시해주기 위한 표시가 필요했고 
	 * 문자열 "encryption"을 붙이기로 했다.. 사실 이것마저 암호화 할까 했지만.. 크흠..
	 */
	public static String encryption(String target) {
		
		// 암호화된 대상을 또 암호화 하는 일이 생기지 않게 
		// 암호화 할때 문자열 "encryption"을 붙여 
		// 암호화된 문자열 앞에는 encryption를 붙이게 했다.
		if(target.contains("encryption")) {
			throw new RuntimeException("이미 암호화된 대상입니다.");	//암호화 된 문자열을 또 암호화 하면 예외 발생
		}
		
		char[] targetAr = target.toCharArray();	//문자열을 정수로 바꾸기 위한 사전작업으로 char[] targetAr에 넣어줌
		
		String result = "encryption";	//암호화된 문자열 앞에 encryption를 붙여주기 위한 사전작업
		for(int i = 0 ; i < targetAr.length ; i++) {
			//targetAr[]각 index마다 int로 캐스팅 후 XOR연산 하여 
			result = result + (char)((int)targetAr[i] ^ ED_WROD); // result = result + XOR결과
			// 이렇게 실행하면 문자열의 문자 하나하나를 암호화 해서 다시 result에 + 시킨다.
		}
		
		return result;
	}
	
	// 복호화 메소드
	public static String decryption(String target) {	
		// 암호화 되지 않은 대상을 암호화 하는 일이 발생하지 않게 하기 위한 장치
		if(!target.contains("encryption")) {
			throw new RuntimeException("아직 암호화된 대상이 아닙니다.");
		}
		
		// 암호화 될 때 붙은 문자열 "encryption"를 지운다.
		target = target.replace("encryption", "");
		
		char[] targetAr = target.toCharArray();
		
		String result = "";
		
		for(int i = 0 ; i < targetAr.length ; i++) {
			//targetAr[]각 index마다 int로 캐스팅 후 XOR연산 하여 
			result = result + (char)((int)targetAr[i] ^ ED_WROD); // result = result + XOR결과
			// 이렇게 실행하면 문자열의 문자 하나하나를 복호화 해서 다시 result에 + 시킨다
		}
		return result;
	}
	
}


