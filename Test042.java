
/*
■■■ 실행 흐름의 컨트롤(제어문) ■■■
	- switch 문 실습
*/

/*
사용자로부터 1부터 3까지의 정수 중 하나를 입력받아
입력받은 정수만큼의 별문자(★)가 출력되는 프로그램을 작성한다
단, 두가지 방법으로 구현할 수 있도록 한다

1. switch 문의 일반 모델을 사용하여 구현한다
2. switch 문의 기본 모델을 사용하여 구현한다
	break를 딱 한 번만 사용할 수 있도록 구현한다

실행 예)
임의의 정수 입력(1~3) : 3
★★★
계속하려면 아무 키나 누르세요...

임의의 정수 입력(1~3) : 1
★
계속하려면 아무 키나 누르세요...

임의의 정수 입력(1~3) : 7
입력 오류
계속하려면 아무 키나 누르세요...

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test042
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;

		System.out.print("임의의 정수 입력(1~3) : ");
		num = Integer.parseInt(br.readLine());
		
		//일반 모델
		//String result;
		/*
		switch (num)
		{
		case 1 : result = "★"; break;
		case 2 : result = "★★"; break;
		case 3 : result = "★★★"; break;
		default : result = "입력 오류"; break;

		}
		*/
		//System.out.println(result);

		//기본 모델
		//String result;

		switch (num)
		{
		case 1 : System.out.print("★");
		case 2 : System.out.print("★");
		case 3 : System.out.print("★\n");

		default : System.out.println("입력오류"); break;

		}

	}
}

/*
실행 결과


*/