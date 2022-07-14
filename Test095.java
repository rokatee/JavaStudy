/*
■■■ 배열 ■■■ 
	- 배열과 난수 처리(※ Random 클래스 활용)
*/

/*
사용자로부터 임의의 정수를 입력받아
그 정수의 개수만큼 난수(1~100)를 발생시켜 배열에 넣고
배열에 담겨있는 데이터들 중
가장 큰 값과 가장 작은 값을 선택하여
결과를 출력하는 프로그램을 구현한다

실행 예)
발생시킬 난수의 개수 입력 : 10
(50 7 24 81 72 45 61 38 1 99 → 무작위로 발생한 정수들...)
int[] arr = {50, 7, 24, 81, 72, 45, 61, 38, 1, 99} → 배열에 담아내기(배열 구성))
가장 큰 값 : 99, 가장 작은 값 : 1

계속하려면...

*/

import java.util.Scanner;
import java.util.Random;

public class Test095
{
	public static void main(String[] args)
	{
		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// 주요 변수 선언
		int size;			// 사용자의 입력값을 담을 변수

		// 안내 메세지 출력
		System.out.print("발생시킬 난수의 개수 입력 : ");
		size = sc.nextInt();

		// size 변수에 담아낸 수 만큼의 배열방 만들기(배열 길이)
		// (배열 선언 및 메모리 할당)
		int[] arr = new int[size];

		// 무작위 정수(난수)를 발생시키기 위해서는
		// 난수 발생 전용 객체가 필요하다.
		// → java.util.Random
		Random rd = new Random();
		//--Random 클래스 인스턴스 생성
		
		// ※ Random 클래스의 nextInt() 메소드
		//	  0 ~ 매개변수로 넘겨받은 정수 n-1 까지의 수 중
		//	  무작위 정수(난수) 1개를 발생시킨다.
		
		//rd.nextInt(10);	// 0 ~ 9 중 난수 1개 발생
		// 테스트
		//System.out.println("발생한 난수 : " + rd.nextInt(10));
		// 0 ~ 9 까지의 범위 내에서 무작위 정수 한 개 발생

		// 배열 구성
		//for (int i = 0; i < arr.length; i++)
		for (int i = 0; i < size; i++)
		{
			//rd.nextInt(101);
			// → 0 ~ 100 중 1개
			//rd.nextInt(100);
			// → 0 ~ 99 중 1개
			
			arr[i] = rd.nextInt(100) + 1;
			//		 ---------------
			//		 0 ~ 99
			//		 --------------------
			//		 1 ~ 100

			//rd.nextInt(100);			 → 0 ~  99 까지의 무작위 정수 한 개 발생
			//rd.nextInt(100) + 1;		 → 1 ~ 100 까지의 무작위 정수 한 개 발생


			
		}

		// 테스트 → 구성된 배열의 전체 요소 출력
		int max;
		int mim;

		max = arr[0];
		mim = arr[0];

		for (int i = 1; i < arr.length; i++)		//int i = 1인 이유? → 어차피 arr[0]을 max와 mim에 담을테니
		{											//						arr[1]부터 시작하면 된다
			System.out.printf("%4d\n", arr[i]);
			/*
			발생시킬 난수의 개수 입력 : 10
				15  50  91  70  64  91   2  16  69  29
			발생시킬 난수의 개수 입력 : 10
				68  68  90   7  96  82  22  58  62  32
			발생시킬 난수의 개수 입력 : 10
				67  32  65  61  69  84  20  95  70  10
			*/
			//------------------------------------------여기까지 수행하면 배열 구성 완료

			if (max < arr[i])
			{
				//max = max^arr[i];
				//arr[i] = arr[i]^max;
				//max = max^arr[i];
				max = arr[i];
			}

			if (mim > arr[i])
			{
				//mim = mim^arr[i];
				//arr[i] = arr[i]^mim;
				//mim = mim^arr[i];
				mim = arr[i];
			}

		}
		System.out.printf("가장 큰 값 : %d, 가장 작은 값 : %d\n",max, mim);

	}
}