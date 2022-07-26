/*
■■■ 예외 처리(Exception Handling) ■■■
*/

// 다른 예외 다시 던지기

public class Test153
{
	public int getValue(int value) throws Exception			// ⑦ 예외 던지기 (파랑 폭탄)
	{
		int a = 0;

		try
		{
			a = getData(-2);								// ③ 예외 발생 (빨강 폭탄)
			
		}
		catch (Exception e)									// ④ 예외 잡아내기 (빨강 폭탄)
		{
			// ⑤ 예외 처리 (빨강 폭탄)
			System.out.println("printStackTrace........");
			e.printStackTrace();

			// 체크 포인트~!!
			// ⑥ 또다른 예외 발생 시키기 가능 (파랑 폭탄)
			throw new Exception("Value 가 음수입니다");
		}


		return a;
	}

	public int getData(int data) throws Exception			// ② 예외 던지기 (빨강 폭탄)
	{
		if (data < 0)
		{
			throw new Exception("data가 0보다 작습니다");	// ① 예외 발생 (빨강 폭탄)
		}
		return data + 10;
	}
	
	public static void main(String[] args)
	{
		Test153 ob = new Test153();
		
		try
		{
			int a = ob.getValue(-2);							// ⑧ 예외 발생 (파랑 폭탄)
			System.out.println("a : " + a);
		}
		catch (Exception e)										// ⑨ 예외 잡아내기 (파랑 폭탄)
		{
			// ⑩ 예외 처리 (파랑 폭탄)
			System.out.println("printStackTrace...");
			e.printStackTrace();
		}
	}
}

/*
실행 결과

printStackTrace........
java.lang.Exception: data가 0보다 작습니다
        at Test153.getData(Test153.java:37)
        at Test153.getValue(Test153.java:15)
        at Test153.main(Test153.java:48)
printStackTrace...
java.lang.Exception: Value 가 음수입니다
        at Test153.getValue(Test153.java:26)
        at Test153.main(Test153.java:48)
계속하려면 아무 키나 누르십시오 . . .
*/