/*
■■■ 클래스와 인스턴스 ■■■ 
*/

/*
사용자로부터 임의의 정수를 입력받아
1부터 입력받은 수까지의 합을 연산하여
결과값을 출력하는 프로그램을 구현한다

단, 지금까지처럼 main() 메소드에 모든 기능을 적용하는 것이 아니라
클래스와 인스턴스의 개념을 활용하여 처리할 수 있도록 한다
Hap 클래스 설계
또한, 데이터 입력 처리 과정에서 BufferedReader 의 readLine() 을 사용하며,
입력 데이터가 1보다 작거나 1000보다 큰 경우
다시 입력받을 수 있는 처리를 포함하여 프로그램을 구현할 수 있도록 한다

실행 예)
임의의 정수 입력(1~1000) : 1060
임의의 정수 입력(1~1000) : -45
임의의 정수 입력(1~1000) : 100
>> 1 ~ 100까지의 합 : 5050
계속하려면...

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap
{
	// 전역 변수 선언 및 초기화
	int num;	// 사용자 입력값 
	//int sum;	// 누적합 변수는 아래 연산 처리 메소드에서 선언해줘도 된다
	

	// 사용자 입력값을 불러올 코드 작성
	void input() throws IOException
	{
		// BufferedReader 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// do~while 문으로 1~1000 밖의 범위 입력 시 계속해서 정수 입력하도록 설정
		do
		{
			System.out.print("임의의 정수 입력(1~1000) : ");
			num = Integer.parseInt(br.readLine());
		}
		while (num < 1 || num > 1000);
	}
	
	// 연산 처리 메소드 → 사용자 입력값까지의 누적합
	int calSum()
	{
		int sum = 0;	// 누적합 변수는 연산에서만 필요하기에 전역변수 설정 필요 없음

		for (int a = 1; a <= num; a++)
		{
			sum+=a;
		}
		return sum;
	}
	
	// 결과 출력 메소드
	void print(int sum)
	{
		System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", num, sum);
	}
}


public class Test072
{
	public static void main(String[] args) throws IOException
	{
		// Hap 인스턴스 생성
		Hap ob = new Hap();
		
		// 생성한 인스턴스를 통해 입력 메소드 호출 → input()
		// ----------------------
		//     참조변수 활용
		ob.input();			// → new Hap().input();
		
		// 생성한 인스턴스를 통해 연산 처리 메소드 호출 → calSum() 
		int sum = ob.calSum();
		
		// 생성한 인스턴스(ob)를 통해 출력 메소드 호출 → print()
		//ob.print(ob.calSum()); // 이렇게 사용해도 무관
		ob.print(sum);

	}
}

/*
실행 결과

임의의 정수 입력(1~1000) : 2000
임의의 정수 입력(1~1000) : -10
임의의 정수 입력(1~1000) : 200
>> 1 ~ 200 까지의 합 : 20100
계속하려면 아무 키나 누르십시오 . . .
*/