/*
■■■ 배열 ■■■ 
	- 배열의 선언과 초기화
	- 배열의 기본적 활용
*/

/*
사용자로부터 인원수를 입력받고
입력받은 인원 수 만큼의 학생 이름과 전화번호를 입력받고
이렇게 입력받은 데이터를 이름 배열과 전화번호 배열로 구성하여
결과를 출력할 수 있는 프로그램을 구현한다

실행 예)
입력 처리할 학생 수 입력(명, 1~10) : 27
입력 처리할 학생 수 입력(명, 1~10) : -5
입력 처리할 학생 수 입력(명, 1~10) : 3
이름 전화번호 입력[1](공백 구분) : 홍길동 010-1234-1234
이름 전화번호 입력[2](공백 구분) : 최동길 010-5678-5678
이름 전화번호 입력[3](공백 구분) : 김쌍용 010-1111-2222

------------------------
전체 학생 수 : 3
------------------------
 이름	  전화번호
홍길동	010-1234-1234
최동길  010-5678-5678
김쌍용  010-1111-2222
------------------------

계속하려면...
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Scanner;

public class Test082
{
	public static void main(String[] args) throws IOException
	{
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int stuNum;
		String name, phone;

		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
			stuNum = Integer.parseInt(br.readLine());
		}
		while (stuNum < 1 || stuNum > 10);


		Scanner sc = new Scanner(System.in);
		String[] arr = new String[stuNum];
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.printf("이름 전화번호 입력[%d](공백 구분) : ", (i+1));
			name = sc.next();
			phone = sc.next();
			arr[i] = name + "	   " + phone;
		}
		System.out.println("------------------------");
		System.out.printf("전체 학생 수 : %d\n", stuNum);
		System.out.println("------------------------");
		System.out.println("이름	전화번호");
		
		//테스트
		//System.out.println(arr[0]);
		

		for (int j = 0; j < arr.length; j++)
		{
			System.out.println(arr[j]);
		}
		System.out.println("------------------------");
		*/

		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// 사용자가 입력하는 학생 수를 담아낼 변수
		int memberCount = 0;
		
		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
			memberCount = sc.nextInt();
		}
		while (memberCount < 1 || memberCount > 10);

		// 테스트
		//System.out.println("사용자가 입력한 인원 수 : " + memberCount);
		// do~while 범위 테스트 완료

		// 사용자가 입력한 인원 수를 토대로
		// 이름 배열과 전화번호 배열을 생성해야 한다
		
		// 인원 수 만큼의 이름 저장 배열 구성
		String[] names = new String[memberCount];

		// 인원 수 만큼의 전화번호 저장 배열 구성
		//String[] tels = new String[memberCount];
		String[] tels = new String[names.length];

		// 인원 수 만큼의 안내 메세지 출력 및 입력값 담아내기
		//for (int i = 0; i < names.length; i++)
		//for (int i = 0; i < tels.length; i++)
		for (int i = 0; i < memberCount; i++)
		{
			System.out.printf("이름 전화번호 입력[%d](공백 구분) : ", (i+1));
			// 홍길동 010-1234-1234
			// ------
			names[i] = sc.next();

			// 홍길동 010-1234-1234
			//		  -------------
			tels[i] = sc.next();
		}
		
		// 최종 결과(이름, 전화번호) 출력
		System.out.println();
		System.out.println("------------------------");
		System.out.printf("전체 학생 수 : %d명\n", memberCount);
		System.out.println("------------------------");
		// memberCount == names.length == tels.length

		System.out.println("이름    전화번호");
		
		// 학생 리스트
		for (int i = 0; i < memberCount; i++)
			System.out.printf("%3s %14s\n", names[i], tels[i]);


		System.out.println("------------------------");

	}
}

/*
실행 결과

입력 처리할 학생 수 입력(명, 1~10) : 2
이름 전화번호 입력[1](공백 구분) : 홍길동 010-1111-2222
이름 전화번호 입력[2](공백 구분) : 최갑수 010-2222-3333

------------------------
전체 학생 수 : 2명
------------------------
이름    전화번호
홍길동  010-1111-2222
최갑수  010-2222-3333
------------------------
*/
