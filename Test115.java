/*
■■■ 클래스 고급 ■■■
	- 추상 클래스(abstract)
*/

/*
○ 추상 클래스(abstract) 는

	선언만 있고 정의는 없는 하나 이상의 메소드(추상 메소드)를 갖는 클래스로
	하위 클래스(자식 클래스)에서 오버라이딩(Overriding)할 것으로 예상되는 메소드에 대해
	메모리 낭비 없이 미리 호출 계획을 세워두기 위해 만든다


○ 형식 및 구조

	[접근 제어 지시자] abstract class 클래스명
	{
		[접근 제어 지시자] abstract 자료형 메소드명([매개변수], ...);
	}


○ 특징

	클래스가 적어도 하나 이상의 추상 메소드를 포함할 때
	그 클래스는 클래스 앞에 abstract 키워드를 붙여
	추상 클래스로 명시해야 하며
	추상 클래스로 선언한 경우에는
	불완전한 형태의 클래스이므로 객체를 생성할 수 없다
	추상 메소드가 존재하지 않는 추상 클래스 마저도
	객체를 생성할 수 없는 것이다

	즉, 추상 클래스는 독립적으로 존재할 수 없기 때문에
	상속을 위해서만 존재하며
	추상 클래스를 상속받은 하위 클래스에서는
	반드시 추상 메소드를 오버라이딩(Overriding) 해야 한다


※ abstract 키워드는

	클래스와 메소드에서만 사용할 수 있으며
	멤버 변수나 로컬 변수에서는 사용할 수 없다


*/

// 추상 클래스
abstract class SortInt115
{
	private int[] value;

	protected void sort(int[] value)
	{
		this.value = value;
		sorting();
	}
	

	// 추상 메소드
	protected abstract void sorting();

	protected int dataLength()
	{
		return value.length;
	}
	
	// final 키워드로 인해
	// 이 클래스(SortInt115)를 상속받는 클래스에서
	// 이 메소드를 재정의(Method Overriding)할 수 없다
	protected final int compare(int i, int j)
	{
		int x = value[i];
		int y = value[j];
		if (x==y)
			return 0;
		else if (x > y)
			return 1;
		else
			return -1;
	}

	// final 키워드로 인해
	// 이 클래스(SortInt115)를 상속받는 클래스에서
	// 이 메소드를 재정의(Method Overriding)할 수 없다
	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}


} // end SortInt115



// SortInt115(추상클래스)를 상속받은 클래스 → 일단은 추상 클래스
//public abstract class Test115 extends SortInt115

// 추상 메소드(sorting())를 Override → 일반 정상 클래스
public class Test115 extends SortInt115
{
	int i, j;

	static int[] data = {7, 10, 3, 28, 7};

	@Override
	protected void sorting()
	{
		// selection sort
		for (int i = 0; i < dataLength()-1; i++)
		{
			for (int j = i+1; j < dataLength(); j++)
			{
				if (compare(i,j) > 0)
				{
					swap(i,j);
				}
			}
		}

		//for (int i = 0; i < data.length; i++)			// 웅~~~	→ 비교기준 데이터 (0	  1		2	  3)
		//{
		//	for (int j = i+1; j < data.length; j++)		// 숑숑~	→ 비교기준 데이터 (1234  234   34    4)
		//	{
		//		//if (a[i] < a[j])		// 내림차순
		//		if (data[i] > data[j])		// 오름차순
		//		{
		//			// 자리 바꾸기
		//			data[i] = data[i] ^ data[j];
		//			data[j] = data[j] ^ data[i];
		//			data[i] = data[i] ^ data[j];
		//		}
		//	}
		//}

	}
	
	public static void main(String[] args)
	{
		System.out.print("Source Data : ");
		for (int n : data)
			System.out.print(n + " ");
		System.out.println();

		Test115 ob = new Test115();
		ob.sort(data);
		//ob.sorting();

		System.out.print("Sorted Data : ");
		for (int n : data)
			System.out.print(n + " ");
		System.out.println();
	}
}