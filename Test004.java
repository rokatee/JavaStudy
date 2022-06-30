// 자바의 개요 및 특징
//  - 변수와 자료형
//  - 키워드 및 식별자



public class Test004
{
	public static void main(String[] args)
	{
		double height = 180.3;
		int age = 30;
		char degree = 'A';
		
		String name = "Kim";
		// 스코프 영역 안에서 변수명은 식별자
		
		//String #name = "Choi";
		// 변수 이름엔 특수문자 $와 _만 사용가능
		// 활용 가능한 특수문자도 함부로 사용 x
		// 일반적 규칙을 갖고 사용할 수 있도록

		String _tel = "01012345678";
		// 폰번호의 경우 맨 앞이 0으로 시작하기에 문자열로 처리해야함
		// 숫자 형식 절대 안 됨

		String 주소 = "경기도";
		// 문법적으론 변수명을 한글로 사용해도 되나, 
		// 실무적인 측면에서 절대 사용하지 말 것.

		//결과 출력
		
		System.out.println("name : " + name);
		System.out.println("_tel : " + _tel);
		System.out.println("주소 : " + 주소);

		/*
		name : Kim
		_tel : 01012345678
		주소 : 경기도
		*/
		
	}
}