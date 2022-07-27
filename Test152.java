/*
■■■ 예외 처리(Exception Handling) ■■■
*/

// 예외 다시 던지기

public class Test152
{
	public static void main(String[] args)
	{
		Test152 ob = new Test152();

		try
		{
			int a = ob.getValue(-2);		// ⑧ 예외 발생
			System.out.println("a : " + a);
		}
		catch (Exception e)					// ⑨ 예외 잡아내기
		{
			// ⑩ 잡아낸 예외에 대한 처리(여기서 처리 했으니 main()에서 다시 던질 필요 없음)
			System.out.println("printStackTrace.........");
			e.printStackTrace();
		}
	}
								 // ② 발생한 예외 던지기~!!
	public int getData(int data) throws Exception
	{
		if (data < 0)
		{
			// ① 예외 발생
			throw new Exception("data가 0보다 작습니다");
		}
		
		return data + 10;
	}
								   // ⑦ "잡아낸 예외를 다시 던지는 것"(=⑥) 이 가능하도록 처리
	public int getValue(int value) throws Exception
	{
		int a = 0;

		try
		{
			a = getData(-2);	// ③ 예외 발생(②에서 던져진)
		}
		catch (Exception e)		// ④ 예외 잡아내기
		{
			// ⑤ 잡아낸 예외에 대한 처리
			System.out.println("printStackTrace......");
			e.printStackTrace();
			
			// 체크 포인트~!!
			// ⑥ 잡아서 처리한 예외를 다시 던지기
			throw e;
		}

		return a;
	}

}