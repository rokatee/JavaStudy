/*
■■■ 정렬(Sort) 알고리즘 ■■■
*/

/*
○ 정렬
	: 데이터를 특정한 규칙(기준)에 맞게 순서대로 나열(오름차순, 내림차순)

○ 정렬의 목적
	: 데이터 처리 과정의 편의성이나 가독성을 높이기 위함
	  → 보기 편하려고

○ 정렬의 종류
	: 선택 정렬, 버블 정렬, 삽입 정렬, 힙 정렬, 퀵 정렬, 쉘 정렬.....

 → 
향상된 버블 정렬(Bubble Sort)
	 → "Selection Sort" 와 "Bubble Sort" 는 비교 횟수(반복문 수행 횟수)가 같으므로, 둘의 성능은 같다
		하지만, "향상된 Bubble Sort" 는 대상 데이터의 구조에 따라서
		일반 "Bubble Sort" 이나 "Selection Sort" 에 비해 성능이 좋을 수 있다.


원본 데이터 : 61 15 20 22 30
			  15 20 22 30 61  -  1회전 (스왑 발생 → true)  → 다음 회전 진행 O
			  15 20 22 30 61  -  2회전 (스왑 발생 → false) → 다음 회전 진행 X


1회전 수행...2회전 수행...을 해보았더니
2회전에서 스왑(자리바꿈)이 전혀 일어나지 않았기 때문에
불필요한 추가 연산(더 이상의 회전)은 무의미한 것으로 판단하여
수행하지 않는다


실행 예)

Source Data : 10 50 20 30 40
Sorted Data : 10 20 30 40 50
계속하려면...
*/


public class Test109
{
	public static void main(String[] args)
	{
		int[] a = {10, 50, 20, 30, 40};
		/*
			10 50 20 30 40
			== --
			↓
			10 50 20 30 40
			   == --
			   ↓
			10 20 50 30 40
				  == --
				  ↓
			10 20 30 50 40
				  == --
				  ↓
			10 20 30 50 40
				     == --
				     ↓
			10 20 30 40 50
			---------------------1회전
			10 20 30 40 50
			== --
			↓
			10 20 30 40 50
			   == --
			   ↓
			10 20 30 40 50
			      == --
			      ↓
			10 20 30 40 50
			----------------------2회전 스왑 발생하지 않음
					x
			----------------------3회전 x
					x
			----------------------4회전 x
		*/

		System.out.println("Source Data : ");
		for (int n : a)
		{
			System.out.print(n + " ");
		}
		System.out.println();


		boolean flag;
		int pass = 0;

		// 웅~~~
		do
		{
			flag = false;			// 이번 회전에서 자리 바꿈이 일어나지 않을 것이다
			pass++;
			
			// 숑숑~~
			for (int i = 0; i < a.length-pass; i++)
			{
				// 테스트
				System.out.println("숑숑~~");

				if (a[i] > a[i+1])	// 하지만 자리바꿈이 일어나면(flag = true)
				{					// while을 계속 돌린다
					
					a[i]   = a[i]  ^ a[i+1];
					a[i+1] = a[i+1]^ a[i];
					a[i]   = a[i]  ^ a[i+1];

					flag = true;
					// 단 한 번이라도 스왑(자리 바꿈)이 발생하게 되면
					// flag 변수는 true로 변경
				}
			}
		}
		while (flag);
		// flag 변수가 false 라는 것은
		// 회전이 구분적으로 발생하는 동안 스왑이 일어나지 않은 경우로
		// 더 이상의 반복문 수행은 무의미한 것으로 판단 가능



		//오답
		/*
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				do
				{
					// 테스트
					System.out.println("숑숑~~");
					if (a[i] < a[j])
					{
						a[i] = a[i]^a[j];
						a[j] = a[j]^a[i];
						a[i] = a[i]^a[j];
					}
				}
				while (false);
			}
		}
		*/

		System.out.println("Sorted Data : ");
		for (int n : a)
		{
			System.out.print(n + " ");
		}
		System.out.println();
	}
}