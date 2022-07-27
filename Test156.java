/*
■■■ 컬렉션(Collection) ■■■
*/

/*
○ 큐(Queue)
	
	큐(Queue) 는 선입선출의 FIFO(First Input, First Output) 구조로
	먼저 입력된 자료를 먼저 출력하며
	Queue 인터페이스를 구현한 클래스는 큐와 관련한 다양한 기능을 제공한다

※ Queue 인터페이스 인스턴스를 생성하기 위해서는
   new 연산자를 이용하여 Queue 인터페이스를 구현한(implements)
   클래스의 생성자를 호출한다

   ex) Queue ob = new LinkedList();


○ 주요 메소드
	* head 요소 란? 큐에서 가장 앞에 있는(출력할 때 가장 먼저 나오는) 녀석을 말함
	
	- E element()
	  큐의 head 요소를 반환하며 삭제하지 않는다

	- boolean offer(E o)
	  지정된 요소를 큐에 삽입한다
	
	- E peek()
	  큐의 head 요소를 반환하고 삭제하지 않으며
	  큐 자료구조가 empty 인 경우 null 을 반환한다

	- E poll()
	  큐의 head 요소를 반환하고 삭제하며
	  큐 자료구조가 empty 인 경우 null 을 반환한다

	- E remove()
	  큐의 head 요소를 반환하고 삭제한다
*/

import java.util.Queue;
import java.util.LinkedList;

public class Test156
{
	public static void main(String[] args)
	{
		// Queue 자료구조 생성
		//Queue myQue = new Queue();	// Queue는 인터페이스 이므로 객체 생성 불가능
		Queue<Object> myQue = new LinkedList<Object>();

		// 데이터 준비
		String str1 = "유재석";
		String str2 = "박명수";
		String str3 = "정준하";
		String str4 = "정형돈";

		// myQue 라는 Queue 자료구조에 데이터 추가
		myQue.offer(str1);
		myQue.offer(str2);
		myQue.offer(str3);
		//myQue.offer(str4);
		boolean test = myQue.offer(str4);			// 위 구문과 동일한 구문

		System.out.println("test : " + test);		// 다만 boolean에 넣어주면
		// → test : true							// 값이 제대로 들어갔는지 확인이 가능하다

		// 테스트
		System.out.println(myQue);
		// → [유재석, 박명수, 정준하, 정형돈]		// 더미

		// Queue 자료구조 myQue 에서
		// 요소를 제거하지 않고 head 요소 반환
		System.out.println("값1 : " + (String)myQue.element());
		System.out.println("값2 : " + (String)myQue.element());
		System.out.println("값3 : " + (String)myQue.element());
		// → 값1 : 유재석
		//    값2 : 유재석
		//    값3 : 유재석

		System.out.println();	// 개행

		String val;
		
		/*
		// ①
		//peek()
		// 큐의 head 요소 반환, 제거 안함
		// 큐가 empty 일 경우 null 을 반환
		while (myQue.peek() != null)
		{
			// poll()
			// 큐의 head 요소 반환, 제거함
			// 큐가 empty 일 경우 null 을 반환
			val = (String)myQue.poll();
			System.out.println("요소 : " + val);
		}
		System.out.println();
		// → 요소 : 유재석
		//	  요소 : 박명수
		//	  요소 : 정준하
		//	  요소 : 정형돈
		*/
		
		/*
		// 테스트
		while (myQue.poll() != null)
		{
			// poll()
			// 큐의 head 요소 반환, 제거함
			// 큐가 empty 일 경우 null 을 반환
			val = (String)myQue.poll();
			System.out.println("요소 : " + val);
		}
		// → 요소 : 박명수
		//	  요소 : 정형돈
		//	처음 poll에서 유재석이 빠지고 출력은 박명수만,
		//  다음 두번째 바퀴 poll에서 정준하가 빠지고 출력은 정형돈만
		*/
		
		/*
		// ②
		while (true)	// while문에 true 란? 무한반복
		{
			val = (String)myQue.poll();
		
			if (val == null)
				break;
			else
				System.out.println("요소 : " + val);
		}
		System.out.println();
		// → 요소 : 유재석
		//	  요소 : 박명수
		//	  요소 : 정준하
		//	  요소 : 정형돈
		*/

		/*
		// ③
		while (!myQue.isEmpty())
		{
			val = (String)myQue.poll();
			System.out.println("요소 : " + val);
		}
		System.out.println();
		// → 요소 : 유재석
		//	  요소 : 박명수
		//	  요소 : 정준하
		//	  요소 : 정형돈
		*/
	}
}