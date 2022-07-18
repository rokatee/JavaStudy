/*
■■■ 클래스와 인스턴스 ■■■
	- 클래스와 인스턴스 활용
*/

/*
1~3 사이의 난수를 발생시켜서
가위 바위 보 게임 프로그램을 구현한다
단, 클래스의 개념을 활용하여 처리할 수 있도록 한다
또한 배열을 활용하여 처리할 수 있도록 한다
최종적으로 RpsGame 클래스를 완성할 수 있도록 한다

기준 데이터 → 1:가위, 2:바위, 3:보

실행 예)
1:가위, 2:바위, 3:보 중 입력(1~3) : 4
1:가위, 2:바위, 3:보 중 입력(1~3) : -2
1:가위, 2:바위, 3:보 중 입력(1~3) : 2

- 유저	 : 바위
- 컴퓨터 : 보

>> 승부 최종 결과 : 컴퓨터가 이겼씁니다~!!
계속하려면...

*/

import java.util.Scanner;
import java.util.Random;

//class RpsGame
//{
//}

public class Test102
{
	public static void main(String[] args)
	{	

		//main()만 사용했을 때 방법
		Scanner sc = new Scanner(System.in);
		String[] rps = {"가위", "바위", "보"};	// 가위 바위 보

		Random rd = new Random();
		int com = rd.nextInt(3)+1;

		int user;		// 사용자 입력값
		do
		{
			System.out.print("1:가위, 2:바위, 3:보 중 입력(1~3) : ");
			user = sc.nextInt();
		}
		while (user < 1 || user > 3);
		
		
		System.out.println("유저   : " + rps[user-1]);
		System.out.println("컴퓨터 : " + rps[com -1]);
		
		String result = "무승부 입니다";;

		if ((user == 1 && com == 2) || (user == 2 && com == 3) || (user == 3 && com == 1))
		{
			result = "컴퓨터가 승리하였습니다";
		}
		else if ((user == 2 && com == 1) || (user == 3 && com == 2) || (user == 1 && com == 3))
		{
			result = "유저가 승리하였습니다";
		}

		System.out.println(">> 승부 최종 결과 : " + result);
	}
}