/*
■■■ 자바의 주요(중요) 클래스 ■■■
	- 자바에서 기본적으로 제공하는 주요 클래스들
	- Random 클래스
*/

/*
○ java.util.Random 클래스는
	
	여러 형태의 난수를 발생시켜 제공하는 클래스이다
	Math 클래스의 정적 메소드인 random() 메소드도 난수를 제공하는 메소드이지만
	0.0 ~ 1.0 사이의 실수 형태만 발생하게 되므로
	필요한 여러 형태의 난수를 만들어내기 위해서는 추가적인 연산을 수행해야 한다
	그래서 자바는 여러 형태의 난수를 발생시켜주는
	전용 클래스인 Random 클래스를 별도로 제공하고 있다


로또 번호 생성(난수 발생 프로그램)

프로그램이 실행되면 기본적으로 로또를
5게임 수행하는 프로그램을 구현한다

실행 예)
   1   2   7   9  19  23
   3  12  16  23  44  45
  17  22  34  36  40  42
  10  15  26  32  39  45
   4   6   9  12  17  33
계속하려면...

*/
import java.util.Random;
import java.util.Arrays;

class Lotto
{
	// 배열 변수 선언 및 메모리 할당 → 로또 번호를 담아둘 배열방 6칸
	private int[] num;


	// 생성자
	Lotto()
	{
		num = new int[6];
	}

	// getter
	public int[] getNum()
	{
		return num;
	}

	// 6개의 난수를 발생시키는 메소드 정의
	public void start()
	{
		Random rd = new Random();

		// 방법 1
		//for (int i = 0; i < num.length; i++)
		//{
		//	num[i] = rd.nextInt(45) + 1;

		//	for (int j = 0; j < i; j++)
		//	{
		//		if (num[i]==num[j])
		//		{
		//			i--;
		//			break;
		//		}
		//	}
		//}
		

		// 방법 2
		//for (int i = 0; i < 5; i++)
		//{
		//	for (int j = 0; j < 6; j++)
		//	{
		//		num[j] = rd.nextInt(45) + 1;
		//		
		//		for (int k = 0; k < 6; k++)
		//		{
		//			if (j == k)
		//			{
		//				break;
		//			}
		//			else if (num[j] == num[k])
		//			{
		//				num[j] = rd.nextInt(45) + 1;
		//				k = 0;
		//			}
		//		}
		//	}
		//}
		
		
		// 방법 3
		int n;
		int cnt = 0;

		jump:	// 세미콜론 아니고 ":" 이다
				// 빈번하게 사용하지 말 것

		while (cnt < 6)						// 웅~~ 0 1 2 3 4 5	
		{
			n = rd.nextInt(45) + 1;			// 0 ~ 44 → +1 → 0 ~ 45
			
			for (int i = 0; i < cnt; i++)	// 숑숑~~ cnt→4 / i→123
			{
				if (num[i] == n)
				{
					continue jump;
				}
			}

			num[cnt++] = n;
		}

		// 정렬 메소드 호출
		sorting();
	}
	
	// 정렬 메소드 정의
	private void sorting()
	{
		Arrays.sort(num);	//API 찾아보자~!  num 넘겨주면 알아서 다 기본 오름차순 정렬됨
							//내림차순은 어떻게 해야하는지 찾아보자!
	}
}

public class Test146
{
	public static void main(String[] args)
	{
		// Lotto 클래스 기반 인스턴스 생성
		Lotto lotto = new Lotto();

		// 기본 5게임
		for (int i = 1; i< = 5; i++)
		{
			// 로또 게임 수행
			lotto.start();
			
			// 결과 출력
			for (int n : lotto.getNum())
			{
				System.out.printf("%4d",n);
			}
			System.out.println();
		}

	}
}

/*
실행 결과

   1   5  10  33  34  42
  19  20  30  34  41  45
  10  19  22  29  34  40
   1   4   5   6  22  45
   3  13  19  24  32  45
계속하려면 아무 키나 누르십시오 . . .
*/