import java.util.Scanner;
import java.io.IOException;

public class MovieManagement extends AdminCall
{    
	// 변수 클래스로 이동
	//Scanner sc = new Scanner(System.in);
	//// 영화목록
	//MovieData[] movies = new MovieData[100];
	//// 프로그램 실행 flag
	//boolean isRun = true;
	//// 메인 메뉴 선택 번호
	//int selectNo = 0;
	//// 영화관리 번호
	//int count=1;

	public void movieManage() throws IOException
	{
		System.out.println("\n[상영관 관리]==================\n");
		System.out.println("1. 영화 정보 등록");
		System.out.println("2. 등록된 영화 삭제");
		System.out.println("3. 영화 목록 확인");
		System.out.println();
		System.out.println("99. 관리자 메뉴로 돌아가기");
		System.out.println("=================================");

		do
		{
			System.out.print("\n메뉴 선택 : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel < 1 || sel > 3 && sel != 99);
		
		System.out.println();

		switch(sel) 
		{
			case 1 :
				registerMovie();
				break;
			case 2 :
				deleteMovie();
				break;
			case 3 : 
				selectMovie();
				break;
			case 99 : 
				AmenuDisp();
				break;
			default : 
				System.out.println("등록된 메뉴가 아닙니다.");
		}
	}

	// 영화 등록
	public void  registerMovie() throws IOException
	{
		System.out.println();
		System.out.println("[영화 정보 등록]=======================\n");
		System.out.println("등록을 원하는 영화 정보를 입력해주세요.\n");
		System.out.println("=======================================\n");

		System.out.print("제목			: ");
		String title = sc.next();
		System.out.print("관람 등급(0 / 15 / 19)  : ");
		int grade = sc.nextInt();
		System.out.print("러닝타임 입력(분)	: ");
		int playTime = sc.nextInt();
		System.out.println();
		
		
		for (int i = 0; i < movies.length; i++)
		{
			if(movies[i] == null) 
			{
				movies[i] = new MovieData(title, grade, playTime);
				vt.add(movies[i]);

				System.out.println("[영화 정보 등록]=======================\n");
				System.out.println(movies[i].toString()+"\n\n등록완료");
				break;
			}
		}

//======================================================================↓
		//String title = getData("등록할 영화의 제목 입력	: ");
		//int grade =	getNum("등록할 영화의 관람 등급 입력(0 / 15 / 19) : ");
		//int playTime = getNum("등록할 영화의 러닝타임 입력 : ");
		//System.out.println();
		
		//for(int i=0; i < movies.length; i++) 
		//{
		//	if(movies[i] == null) 
		//	{
		//		count = i+1;
		//		movies[i] = new MovieData(title,grade,playTime);
		//		System.out.println();
		//		System.out.println("등록완료");
		//		break;
		//	}
		//}

		//for(MovieData m : movies) 
		//{
		//	if(m != null) 
		//	{
		//		printMovieInfo(m);
		//	}
		//}
//======================================================================↑

		System.out.println();
		System.out.println(" 0. 이전 메뉴로 돌아가기");
		System.out.println("99. 관리자 메뉴로 돌아가기");
		System.out.println("=======================================");

		do
		{
			System.out.print("\n메뉴 선택 : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel != 0 && sel != 99);
		
		System.out.println();

		switch(sel) 
		{
			case 0 : 
				movieManage(); 
				break;
			case 99 : 
				AmenuDisp();
				break;
			default : 
				System.out.println("등록된 메뉴가 아닙니다.");
		}
	}

	// 영화 목록 출력
	public void selectMovie() throws IOException
	{
		System.out.println("[영화 목록 확인] ======================\n");
//======================================================================↓
		//for (int i = 0; i < movies.length; i++)
		//{
		//	try
		//	{
		//		System.out.println(movies[i].title);
		//		System.out.println(movies[i].grade);
		//		System.out.println(movies[i].playTime);
		//		
		//	}
		//	catch (NullPointerException e)
		//	{
		//		System.out.println("등록된 영화가 없습니다");
		//		System.out.println();
		//	}
		//}
//======================================================================↑

		for(MovieData m : vt) 
		{
			if(m != null) 
			{
				printMovieInfo(m);
			}
		}

		System.out.println();
		System.out.println(" 0. 이전 메뉴로 돌아가기");
		System.out.println("99. 관리자 메뉴로 돌아가기");
		System.out.println("=======================================\n");
		do
		{
			System.out.print("\n메뉴 선택 : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel != 0 && sel != 99);
		
		System.out.println();

		switch(sel) 
		{
			case 0 : 
				movieManage(); 
				break;
			case 99 : 
				AmenuDisp();
				break;
			default : 
				System.out.println("등록된 메뉴가 아닙니다.");
		}
	}

	/*
	// 영화 정보 수정
	public void updateMovie() throws IOException
	{
		System.out.println();
		System.out.println("5. 영화수정");
		System.out.println();
		String movieTitle = getSelectData("수정할 영화의 제목을 입력하세요 : ");

		MovieData m = findMovie(movieTitle);

		if(m == null)
		{
			System.out.println("입력하신 제목의 영화가 존재하지 않습니다");
			return;
		}

		boolean isUpdate = true;

		while(isUpdate) 
		{

			System.out.println("=====================================================================================================================");
			System.out.println(" 1. 제목수정 | 2. 등급수정 | 3. 러닝타임수정 | 4. 수정완료 | 0. 이전 메뉴로 돌아가기 | 99. 관리자 메뉴로 돌아가기");
			System.out.println("=====================================================================================================================");

			selectNo = getSelectNum("번호 입력 >> ");

			switch (selectNo) 
			{

				case 1:
					String title = getData("제목 수정 : ");
					m.setTitle(title);
					System.out.println("제목 수정완료");    
					break;
				case 2:
					int grade = getNum("관람 등급 수정 : ");
					m.setGrade(grade);
					System.out.println("관람 등급 수정완료");
					break;
				case 3:
					int playTime = getNum("러닝타임 수정 : ");
					m.setPlayTime(playTime);
					System.out.println("러닝타임 수정완료");
					break;
				case 4:
					System.out.println("수정메뉴 종료");
					isUpdate = false;
					break;
				case 0 : 
					movieManage(); 
					break;
				case 99 : 
					//bAM.AmenuDisp();
					AmenuDisp();
					break;
			} // switch end

		} // while end

		System.out.println();

		selectNo = getSelectNum(" 0. 이전 메뉴로 돌아가기 | 99. 관리자 메뉴로 돌아가기");
		switch (selectNo)
		{
			case 0 : 
				movieManage(); 
				break;
			case 99 : 
				AmenuDisp();
				break;
			default : 
				System.out.println("등록된 메뉴가 아닙니다.");
		}

	} // MovieUpdate end
	*/

	// 영화 목록에서 영화 정보 삭제
	public void deleteMovie() throws IOException
	{
		System.out.println("\n[등록된 영화 삭제] ======================\n");
		System.out.println("삭제할 영화 제목을 입력해주세요.\n");
		System.out.println("========================================\n");

//======================================================================↓
		System.out.print("제목 입력 : ");
		tempTitle = sc.next();
		//MovieData m = findMovie(movieTitle);

		
		//for (int i = 0; i < movies.length; i++) 
		//{
		//	if(movies[i] != null && movies[i].getTitle().equals(movieTitle)) 
		//	{
		//		movies[i] = null;
		//		System.out.println("삭제 완료");
		//		//return;
		//	}
		//	//else
		//	//{
		//	//	System.out.println("입력하신 제목의 영화가 존재하지 않습니다");
		//	//	return;
		//	//}

		//}

		for (int n=0; n<vt.size(); n++)
		{
			if (( vt.get(n).getTitle() ).equals(tempTitle) == true)
			{
				boolean flag = ( vt.get(n).getTitle() ).equals(tempTitle);
				
				if (flag)
					tempIndex = n;
			}
		}

		if (tempIndex == -1)
		{
				System.out.println("입력하신 제목의 영화가 존재하지 않습니다");
				//return;
		}
		else
		{
			vt.removeElementAt(tempIndex);
			System.out.println("[등록된 영화 삭제] ======================\n");
			System.out.println("영화 삭제 완료\n");
		}

//======================================================================↑
		System.out.println(" 0. 이전 메뉴로 돌아가기");
		System.out.println("99. 관리자 메뉴로 돌아가기");
		System.out.println("========================================\n");

		do
		{
			System.out.print("\n메뉴 선택 : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel != 0 && sel != 99);
		
		System.out.println();

		switch(sel) 
		{
			case 0 : 
				movieManage(); 
				break;
			case 99 : 
				AmenuDisp();
				break;
			default : 
				System.out.println("등록된 메뉴가 아닙니다.");
		}
	}
//======================================================================↓
	// 영화 정보 출력
	public void printMovieInfo(MovieData m) 
	{
		System.out.println(m.toString() + "\n");
	}

	// 영화 제목으로 영화 정보 찾기
	public MovieData findMovie(String title) 
	{
		for (int i = 0; i < movies.length; i++) 
		{
			if(movies[i] != null && movies[i].getTitle().equals(title)) 
			{
				return movies[i];
			}
		}

		return null;
	}

	//// 사용자에게 메시지를 전달 받아 출력하고 문자열 값 받아 반환
	//String getData(String message) 
	//{
	//	System.out.println(message);
	//	return sc.next();
	//}


	//// 사용자에게 메시지를 전달 받아 출력하고 숫자 값 받아 반환
	//int getNum(String message) 
	//{
	//	System.out.println(message);
	//	return sc.nextInt();
	//}

	//// 번호 선택 받기
	//int getSelectNum(String message) 
	//{
	//	System.out.println(message);
	//	return sc.nextInt();
	//}

	// 제목 선택 받기
	String getSelectData(String message) 
	{
		System.out.print(message);
		return sc.next();
	}
//======================================================================↑

	//public static void main(String[] args)
	//{
	//	new MovieManagement();
	//}
}
