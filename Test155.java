/*
■■■ 컬렉션(Collection) ■■■
*/

import java.util.Stack;

public class Test155
{
	// 정적 문자열 배열 선언 및 초기화
	private static final String[] colors = {"검정", "노랑", "초록", "파랑", "빨강", "연두"};
	
	// 생성자
	public Test155()
	{
		// st 라는 Stack 자료구조 생성
		// 제네릭을 활용하여 자료구조에 담기는 데이터 표현 → String
		Stack<String> st = new Stack<String>();

		// st 라는 Stack 자료구조에 데이터(colors) 담기
		//st = colors;	// 이렇게 처리 불가

		/* 방법 1
		st.push(colors[0]);
		st.push(colors[1]);
		st.push(colors[2]);
		st.push(colors[3]);
		st.push(colors[4]);
		st.push(colors[5]);
		*/

		/* 방법 2
		for (int i = 0; i < colors.length; i++)
			st.push(colors[i]);
		*/
		
		// 방법 3
		for(String color : colors)
		{
			st.push(color);		// st.add(color);
		}

		st.push("보라");	// 데이터 추가 가능 → 제일 마지막에 적재 했으므로 출력은 제일 먼저 됨
		
		//st.push(10);
		//st.push(10.0);
		// → 제네릭 표현식을 통해 선언하고 있는
		//    String 이 아닌 다른 자료형(int 나 double)을
		//    스택 자료구조 st 에 push() 하려고 했기 때문에
		//    (Stack 요소로 String 을 담기로 했기에 int 나 double 을 넣으면 컴파일 에러)
		
		// 출력 메소드 호출
		popStack(st);

	}
	
	private void popStack(Stack<String> st)	
	{		
		System.out.print("pop : ");

		while (!st.empty())		// isEmpty()
		{
			System.out.print(st.pop() + " ");	
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		Test155 ob = new Test155();
	}
}

/*
실행 결과

pop : 연두 빨강 파랑 초록 노랑 검정			// 가장 먼저 넣은게 가장 나중에 나온 것 확인!!
계속하려면 아무 키나 누르십시오 . . .

→ 데이터 추가 후
pop : 보라 연두 빨강 파랑 초록 노랑 검정			// 가장 먼저 넣은게 가장 나중에 나온 것 확인!!
계속하려면 아무 키나 누르십시오 . . .
*/