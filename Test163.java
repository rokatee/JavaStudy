/*
■■■ 컬렉션(Collection) ■■■
*/

/*
Test163 클래스를 완성하여 다음 기능을 가진 프로그램을 구현한다

실행 예)

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	=====================
	>> 메뉴 선택(1~6) : 1

	1번째 요소 입력 : 떡볶이
	1번째 요소 입력 성공~!!!
	요소 입력 계속(Y/N)? : Y
	
	2번째 요소 입력 : 탕수육
	2번째 요소 입력 성공~!!!
	요소 입력 계속(Y/N)? n

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	=====================
	>> 메뉴 선택(1~6) : 2

	[벡터 전체 출력]
		떡볶이
		탕수육
	벡터 전체 출력 완료~!!!

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	=====================
	>> 메뉴 선택(1~6) : 3

	검색할 요소 입력 : 냉면

	[검색 결과 출력]
	항목이 존재하지 않습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	=====================
	>> 메뉴 선택(1~6) : 3

	검색할 요소 입력 : 떡볶이

	[검색 결과 출력]
	항목이 존재합니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	=====================
	>> 메뉴 선택(1~6) : 4

	삭제할 요소 입력 : 그릭요거트

	[삭제 결과 출력]
	항목이 존재하지 않아 삭제할 수 없습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	=====================
	>> 메뉴 선택(1~6) : 4

	삭제할 요소 입력 : 탕수육

	[삭제 결과 출력]
	탕수육 항목이 삭제되었습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	=====================
	>> 메뉴 선택(1~6) : 5

	변경할 요소 입력 : 밥

	[변경 결과 출력]
	변경할 대상이 존재하지 않습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	=====================
	>> 메뉴 선택(1~6) : 5

	변경할 요소 입력 : 떡볶이
	수정할 내용 입력 : 치킨

	[변경 결과 출력]
	변경이 완료되었습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	=====================
	>> 메뉴 선택(1~6) : 6

	프로그램 종료~!!
	계속하려면...
*/

import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Menus    //--완성
{
	public static final int E_ADD  = 1;		// 요소 추가
	public static final int E_DISP = 2;		// 요소 출력
	public static final int E_FIND = 3;		// 요소 검색
	public static final int E_DEL  = 4;		// 요소 삭제
	public static final int E_CHA  = 5;		// 요소 변경
	public static final int E_EXIT = 6;		// 종료
}

public class Test163
{
	// 주요 속성 구성 -- 완성
	private static final Vector<Object> vt;	// 자료구조
	private static BufferedReader br;		// 입력 시 활용
	private static Integer sel;				// 선택 값
	private static String con;				// 계속 여부

	// static 초기화 블럭 -- 완성
	static
	{
		//Vector 자료구조 생성
		vt = new Vector<Object>();

		// BufferedReader 인스턴스 생성
		br = new BufferedReader(new InputStreamReader(System.in));

		// 사용자 입력값 초기화
		sel = 1;
		con = "Y";
	}

	//메뉴 출력 메소드
	public static void menuDisp()
	{
		System.out.println("\n[메뉴 선택]");
		System.out.println("1. 요소 추가");
		System.out.println("2. 요소 출력");
		System.out.println("3. 요소 검색");
		System.out.println("4. 요소 삭제");
		System.out.println("5. 요소 변경");
		System.out.println("6. 종     료");
		System.out.println("=====================");
	}
	
	// 메뉴 선택 메소드
	public static void menuSelect() throws IOException, NumberFormatException
	{
		do
		{
			System.out.print(">> 메뉴 선택(1~6) : ");   //-- 여기에 해도 상관없음
			sel = Integer.parseInt(br.readLine());	
		}
		while (sel < 1 || sel > 6);		// 메뉴선택 범위
		System.out.println();
	}

	// 선택된 메뉴 실행에 따른 기능 호출 메소드
	public static void menuRun() throws IOException
	{
		/*
		// 방법 1
		if (sel == 1)
			addElement();
		else if (sel == 2)
			dispElement();
		else if (sel == 3)
			findElement();
		else if (sel == 4)
			delElement();
		else if (sel == 5)
			chaElement();
		else if (sel == 6)
			exit();
		*/

		/*
		// 방법 2
		switch (sel)
		{
			case 1 : addElement();  break;
			case 2 : dispElement(); break;
			case 3 : findElement(); break;
			case 4 : delElement();  break;
			case 5 : chaElement();  break;
			case 6 : exit(); break;
			default : System.out.println(">> 입력 오류"); break;
		
		}
		*/

		// 방법 3
		switch (sel)
		{
			case Menus.E_ADD  : addElement();  break;
			case Menus.E_DISP : dispElement(); break;
			case Menus.E_FIND : findElement(); break;
			case Menus.E_DEL  : delElement();  break;
			case Menus.E_CHA  : chaElement();  break;
			case Menus.E_EXIT : exit(); break;
			default : System.out.println(">> 입력 오류"); break;
		
		}
	}

	// 요소 추가(입력) 메소드
	public static void addElement() throws IOException
	{
		String name;
		do
		{
			// size() : 현재 벡터에 저장된 객체의 개수(size)를 반환한다
			System.out.printf("%d 번째 요소 입력 : ", vt.size()+1);	// 0번째부터 시작이니 +1
			name = br.readLine();

			//String클래스이므로 자동으로 Object 클래스로 업캐스팅 될 것
			vt.add(name);

			System.out.printf("%d 번째 요소 입력 성공~!!!\n", vt.size());	// 위에서 +1 해줬으니 여긴 안해도 됨
			System.out.printf("요소 입력 계속(Y/N)? : ");
			con = br.readLine();
		}
		//while (con == "Y" && con == "y");			// 이렇게 하면 다음 요소 입력이 아닌 메뉴선택지로 돌아감 왜?;;
		while (con.equals("Y") || con.equals("y"));	// equals 쓰니까 바로 해결되네... 킹받네...
		System.out.println();
	}

	// 요소 출력 메소드
	public static void dispElement() 
	{
		System.out.println("[벡터 전체 출력]");
		
		// 방법 1
		//for (Object v : vt)
		//	System.out.println(v);
		//System.out.println();
		
		// 방법 2
		for (int i = 0; i < vt.size(); i++)
		{
			System.out.printf("%s\n", vt.get(i));
		}
		System.out.println("벡터 전체 출력 완료~!!!");
		System.out.println();
			
	}

	// 요소 검색 메소드
	public static void findElement() throws IOException
	{
		String name = "";

		System.out.print("검색할 요소 입력 : ");
		name = br.readLine();
		
		// 주어진 객체가 저장된 위치를 반환한다
		// 존재하지 않을 경우 "음수"를 반환한다
		int search = vt.indexOf(name);

		System.out.println("[검색 결과 출력]");
		if (search < 0)	// = 존재하지 않으면(음수이면)
			System.out.print("항목이 존재하지 않습니다.");
		else
			System.out.print("항목이 존재합니다.");
		System.out.println();
	}

	// 요소 삭제 메소드
	public static void delElement() throws IOException
	{
		String name;
		System.out.print("삭제할 요소 입력 : ");

		name = br.readLine();
		
		// 벡터가 주어진 객체를 포함하고 있는지의 여부를 반환한다
		if (vt.contains(name))	// ① 데이터 있으면
		{
			int i = vt.indexOf(name);	// ② 위치 찾아서

			// 테스트(특정 데이터의 위치 잘 뽑히는지)
			//System.out.println(name + "→ index 위치 : " + i);

			vt.remove(i);				// ③ 해당 데이터 삭제
			System.out.println("[삭제 결과 출력]");
			System.out.printf("%s 항목이 삭제되었습니다.\n", name);
		}
		else					// ④ 데이터 없으면 출력 안되게 하기
		{
			System.out.println("[삭제 결과 출력]");
			System.out.println("항목이 존재하지 않아 삭제할 수 없습니다.");		
		}
		System.out.println();
	}

	// 요소 수정(변경) 메소드
	public static void chaElement() throws IOException
	{
		String name;	// 변경될 기존 이름
		String nameNew;	// 수정할 새로운 이름
		System.out.print("변경할 요소 입력 : ");
		name = br.readLine();

		if (vt.contains(name))	// ① 데이터 있으면
		{
			System.out.print("수정할 내용 입력 : ");
			nameNew = br.readLine();

			int i = vt.indexOf(name); // ② 위치 찾아서
			//set(name, nameNew)	// 이렇게 했다가
			//set(int, Object)	// 첫번째에 int형 들어가야 하는거 확인 후
			// ③ 데이터 담아주기
			vt.set(i, nameNew);	// name을 int에 담아 수정

			System.out.println("[변경 결과 출력]");
			System.out.println("변경이 완료되었습니다.");
		}
		else
		{
			System.out.println("[변경 결과 출력]");
			System.out.println("변경할 대상이 존재하지 않습니다.");
		}
		System.out.println();
	}

	//프로그램 종료 메소드 -- 완성
	public static void exit()
	{
		System.out.println("프로그램 종료~!!!\n");
		System.exit(-1);
	}
	
	// main() 메소드 -- 완성
	public static void main(String[] args) throws IOException, NumberFormatException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
	}	
}