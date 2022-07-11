/*메소드의 재귀 호출*/

public class InfRecul
{
	public static void main(String[] args)
	{
		showHi(3);
	}
	
	// 코드 내에서 2군데 위치 바꾸기

	public static void showHi(int cnt)
	{
		//틀린 부분과 이유 찾고 2군데를 옮겨 정답을 찾아봐라
		System.out.println("Hi~~");
		showHi(cnt--);					//showHi(3) -> 여기서 이미 다음 showHi메소드로 넘어간다
		if (cnt == 1)					//그러므로 여기는 체크하지 못한다(안한다)
			return;

		System.out.println("Hi~~");
		showHi(--cnt);					//showHi(2) -> 여기서 이미 다음 showHi메소드로 넘어간다
										//계속해서 showHi의 값만 내려간다 3 -> 2 -> 1 -> 0 -> -1
		if (cnt == 1)					//그러므로 여기는 체크하지 못한다(안한다)
			return;
		
		//정답
		System.out.println("Hi~~");		
		if (cnt == 1)					// 여기서 먼저 showHi의 값이 1인지 체크한다
			return;
		showHi(--cnt);					// 그 후 showHi( ) -> 1이 될 때 위의 if문에서 걸려 프로그램을 종료한다 
		

	}
}