/*
■■■ 지역 변수와 전역 변수 ■■■ 
*/

// CircleTest.java 파일과 세트

/*
원의 넓이와 둘레 구하기
원의 넓이와 둘레를 구할 수 있는 클래스를 설계한다
클래스명 : CircleTest) → CircleTest.java
BufferedReader 의 readLine()

원의 넓이 = 반지름 * 반지름 * 3.14
원의 둘레 = 반지름 * 2 * 3.14

실행 예)
반지름 입력 : xxx

>> 반지름이 xxx인 원의
>> 넓이 :  / 둘레 : 
계속하려면.....
*/

import java.io.IOException;

public class Test071
{
	public static void main(String[] args)  throws IOException
	{
		CircleTest ct = new CircleTest();
		ct.input();
		double area = ct.calArea();
		double length = ct.calLength();
		ct.print(area, length);
	}
}

/*
실행 결과

반지름 입력 : 3
>> 반지름이 3인 원의
>> 넓이 : 28.26
>> 둘레 : 18.84
계속하려면 아무 키나 누르십시오 . . .
*/