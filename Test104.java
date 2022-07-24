/*
■■■ 클래스와 인스턴스 ■■■
	- 메소드 오버로딩(Method Overloading)이 가능한 형태와 불가능한 형태
*/

public class Test104
{
	public static void main(String[] args)
	{
		print(3.14);
		//double result = print(3.14);
		// 자바 입장에선 10번이나 11번이나 똑같다
		// 왜? = 기준으로 오른쪽부터 읽기때문
		// 11번은 30번을 부르는게 아님

	}
	
	public static void print() {}
	//public static void print() {}							// - X → 매개변수가 같기 때문
	
	public static void print(int i) {}
	//public static void print(int j) {}					// - X → 자료형이 같기 때문에(변수명은 상관없음)
	public static void print(char c) {}						// - O → 가능은 하나 조심해서 써야 함
															//		  자동 형 변환 규칙 체크해야 함
	public static void print(int i, int j) {}
	public static void print(double d) {}					// - O → 가능은 하나 조심해서 써야 함
															//		  자동 형 변환 규칙 체크해야 함
	//public static void print(double e) {return 10.0;}		// return 타입이 실수인데 void라 넘겨주는 게 없으므로 안 됨
															// 쉽게 말해 정의 불가능(엉망인 구문)
	//public static double print(double e) {return 10.0;}	// - X → 안되는 이유 기억해두기 → main 12~14에 써 둠


	
}