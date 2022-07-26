/*
■■■ 예외 처리(Exception Handling) ■■■
*/

// Test150.java 파일과 비교

// ※ throw		cf) throws
// throw는 우리가 일부러 예외를 만들 때 사용한다

class Demo
{
	private int value;

	public void setValue(int value) throws Exception
	{
		if (value <= 0)
		{
			//return;
			throw new Exception("value 는 0보다 작거나 같을 수 없습니다");
		}

		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
}

public class Test151
{
	public static void main(String[] args) //throws IOException
	{
		Demo ob = new Demo();
		
		try
		{
			ob.setValue(-3);
			int result = ob.getValue();
			System.out.println(result);
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}

	}
}