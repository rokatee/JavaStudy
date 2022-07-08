/*
■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- break 실습
*/

/*
break 키워드가 지니는 의미
멈춘다 + 그리고 빠져나간다

다음과 같은 처리가 이루어지는 프로그램을 구현한다
단, 입력받는 정수는 1 ~ 100 범위 안에서만
가능하도록 작성한다

실행 예)

임의의 정수 입력 : -10
임의의 정수 입력 : 0
임의의 정수 입력 : 2022
임의의 정수 입력 : 10
>> 1 ~ 10 까지의 합 : 55
계속하시겠습니까(Y/N)? : y

임의의 정수 입력 : 100
>> 1 ~ 100 까지의 합 : 5050
계속하시겠습니까(Y/N)? : N
계속하려면...


*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test065
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 체크 사항
		// 누적합 변수의 초기화 위치!!!
		// 맨 위에 해주면 임의의 정수를 할 때마다 나온 값을 계속 더하게 된다
		int n, s, i;
		// n -- 사용자 입력값을 담아둘 변수
		// s -- 누적합 연산 결과를 담아낼 변수
		// i -- 1부터 1씩 사용자 입력값까지 증가할 변수

		char ch;
		// 프로세스를 계속 진행할지 말지의 여부를 담아둘 변수

		// 무한 반복(무한 루프)
		while (true)
		{
			do
			{
				System.out.print("\n임의의 정수 입력 : ");
				n = Integer.parseInt(br.readLine());
			}
			while (n < 1 || n > 100);

			// 테스트(확인)
			//System.out.println("유효한 정수 입력 완료~!!");

			s = 0;	
			// 여기서 초기화를 안하면 아래 누적합 for문에 의해 값을 계속 더하게 된다
			// 10까지 정수 + 100까지 정수...

			for (i=1; i<=n; i++)
			{
				s += i;		// 누적합 연산
			}
			
			System.out.printf(">> 1 ~ %d 까지의 합 : %d\n ", n, s);

			System.out.print("계속 하시겠습니까(Y/N)? : ");
			ch = (char)System.in.read();
			// 계속할지 말지에 대한 여부(의사표현)
			
			// 그만할래 로 빠져나가야 함
			//if (ch == 'N' || ch == 'n')	// N 또는 n 입력한 거 맞아?
			//										↓
			//if (ch != 'Y' || ch != 'y')	// Y 또는 y 입력한 게 아닌 거 맞아?
											// → y를 입력했을 경우, "Y가 아니네" 하며 N로 받아들임
		  //if (ch == 'N' || ch == 'n')의 정반대	↓
			if (ch != 'Y' && ch != 'y')		// Y 그리고 y 입력한 게 아닌 거 맞아?
			//'열도 안나고'&&'기침도 안해야'
			// → 감기가 아니다
			{
				// 반복문을 멈추고 빠져나갈 수 있는 코드 작성 필요
				// 위와 같은 의사표현을 했다면
				// 그동안 수행했던 반복문을 멈추고 빠져나가야 한다
				break;
				// 멈춘다 + (그리고 빠져나간다)

			}//end if

			//엔터값(\r\n) 처리
			System.in.skip(2);
			// y가 아닌 다른 알파벳을 입력했을 경우 에러 없이 종료되는 이유?
			// 어차피 끝나는 프로그램이므로 남아있는 엔터값이 그냥 소멸된다
			// y나 Y의 경우 프로그램을 진행할 것이기에 엔터값이 남아 실행되므로 에러가 뜸

		}//end while(true)
		










		/*
		int n;			// 사용자 입력값
		int sum;		// 누적합
		int i;			// 루프 변수
		char ch;		// 계속 할건지 물어보기 위한 변수
		
		while(true)
		{
			do
			{
				System.out.print("임의의 정수 입력 : ");
				n = Integer.parseInt(br.readLine());		
			}
			while (n < 1 || n > 100);	

			sum = 0;		// 반드시 여기서 초기화 해주어야 함.
		
			for (i = 0; i <= n; i++)
			{
				sum += i;
			}

			System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", n, sum);
			System.out.print("계속하시겠습니까(Y/N)? : ");
			ch = (char)System.in.read();
			System.in.skip(2);

			if (ch != 'y' && ch != 'Y')
			{
				break;
			}
		}
		*/

	}//end main()

}//end class

/*
실행 결과


임의의 정수 입력 : 20
>> 1 ~ 20 까지의 합 : 210
 계속 하시겠습니까(Y/N)? : y

임의의 정수 입력 : 30
>> 1 ~ 30 까지의 합 : 465
 계속 하시겠습니까(Y/N)? : Y

임의의 정수 입력 : 50
>> 1 ~ 50 까지의 합 : 1275
 계속 하시겠습니까(Y/N)? : n
계속하려면 아무 키나 누르십시오 . . .

*/