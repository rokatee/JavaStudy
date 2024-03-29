/*
■■■ 컬렉션(Collection) ■■■
*/

import java.util.Queue;
import java.util.LinkedList;

public class Test157
{
	// 정적 문자열 배열 선언 및 초기화
	private static final String[] colors = {"검정", "노랑", "초록", "파랑", "빨강", "연두"};

	public static void main(String[] args)
	{
		// Queue 자료 구조 생성
		Queue<String> qu = new LinkedList<String>();
		// Queue 인터페이스 기반의 인스턴스를 생성하기 위해서는
		// new 연산자를 이용하여 Queue 인터페이스를 implements 한
		// 하위 클래스의 생성자를 호출해야 한다

		// qu 라는 Queue 자료구조에
		// colors 배열의 데이터 입력
		for (String color : colors)
			qu.offer(color);

		// qu 라는 Queue 자료구조의 모든 데이터 전체 출력
		// peek()
		//  : 큐의 head 요소를 반환하고 삭제하지 않으며
		//	  큐 자료구조가 비어있는 상태가 되면 null 반환
		// poll()
		//	: 큐의 head 요소를 반환하고 삭제하며
		//	  큐 자료구조가 비어있는 상태가 되면 null 반환
		
		// 강사님 풀이
		while (qu.peek() != null)
			System.out.print(qu.poll() + " ");
		System.out.println();
		// → 검정 노랑 초록 파랑 빨강 연두

		/*
		// 내 풀이
		String val;

		while(true)
		{
			val = qu.poll();

			if (val == null)
				break;
			else
				System.out.println("요소 : " + val);
		}
		System.out.println();
		// → 요소 : 검정
		//	  요소 : 노랑
		//	  요소 : 초록
		//	  요소 : 파랑
		//	  요소 : 빨강
		//	  요소 : 연두
		*/

	}
}