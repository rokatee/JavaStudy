import java.util.Scanner;
import java.io.IOException;

public class MovieManagement extends AdminCall
{    
	// 영화 정보를 관리하는 메뉴들을 띄워주는 상단 메뉴판
	public void movieManage() throws IOException	
	{
		System.out.println("\n[상영 영화 관리]==============================\n");
		System.out.println("1. 영화 정보 등록");
		System.out.println("2. 영화 목록 확인");
		System.out.println("3. 등록된 영화 삭제");
		System.out.println();
		System.out.println("99. 관리자 메뉴로 돌아가기");
		System.out.println  ("==============================================");

		do
		{
			System.out.print("\n메뉴 선택 : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel < 1 || sel > 3 && sel != 99);	// 메뉴 선택 범위
		
		System.out.println();

		switch(sel) 
		{
			case 1 :
				registerMovie();	// 영화 등록 메소드
				break;
			case 2 :
				selectMovie();		// 등록된 영화 목록 확인 메소드
				break;
			case 3 : 
				deleteMovie();		// 등록된 영화 삭제 메소드
				break;
			case 99 : 
				AmenuDisp();		// 관리자 메뉴로 돌아갈 메소드
				break;
			default : 
				System.out.println("\n등록된 메뉴가 아닙니다.");
		}
	}

	// 영화 등록
	public void  registerMovie() throws IOException
	{
		movies[0] = new MovieData();
		
		System.out.println();
		System.out.println("[영화 정보 등록]==============================\n");
		System.out.println("등록을 원하는 영화 정보를 입력해주세요.\n");
		System.out.println("==============================================\n");
						  
		System.out.print("제목			: ");
		tempTitle = br.readLine();
		movies[0].title = tempTitle;
		System.out.print("관람 등급(0 / 15 / 19)  : ");
		movies[0].grade = Integer.parseInt(br.readLine());
		System.out.print("러닝타임 입력(분)	: ");
		movies[0].playTime = Integer.parseInt(br.readLine());
		//System.out.println();
		
		// 중복되는 영화 제목이 있는지 여부를 체크하는 변수
		boolean tempCheck = false;
		
		if (vt.size() == 0)
		{
			vt.add(movies[0]);
			System.out.println("\n[영화 정보 등록]==============================\n");
			System.out.println( movies[0] +"\n\n등록완료");
		}
		else
		{
			for (int i = 0; i < vt.size(); i++)
			{	
				if (vt.size() == 0)
				{
					
					break;
				}

				if ( ( vt.get(i).getTitle() ).equals(tempTitle) )	// 사용자 입력값이 vt(벡터)에 저장된 title(제목)과 같으면
					tempCheck = true;								// tempCheck을 트루로 바꾸고
				
				//if ( ( vt.get(i).getTitle() ).equals(tempTitle) )
				//{
				//	System.out.println("이미 등록된 영화입니다. 다시 입력하세요.");
				//	System.out.println();
				//	System.out.println(" 0. 이전 메뉴로 돌아가기");
				//	System.out.println(" 1. 영화 정보 다시 입력하기");
				//	System.out.println("99. 관리자 메뉴로 돌아가기");
				//	System.out.println("=======================================");

				//	do
				//	{
				//		System.out.print("\n메뉴 선택 : ");
				//		sel = Integer.parseInt(br.readLine());
				//	}
				//	while (sel != 0 && sel != 1 && sel != 99);
				//	
				//	System.out.println();

				//	switch(sel) 
				//	{
				//		case 0 : 
				//			movieManage(); 
				//			break;
				//		case 1 : 
				//			registerMovie(); 
				//			break;
				//		case 99 : 
				//			AmenuDisp();
				//			break;
				//		default : 
				//			System.out.println("등록된 메뉴가 아닙니다.");
				//	}
				//	break;
				//}
				//else
				//{
				//	vt.add(movies[0]);
				//	System.out.println("[영화 정보 등록]=======================\n");
				//	System.out.println( movies[0] +"\n\n등록완료");
				//	break;
				//}
			}

			if (tempCheck)		// 트루이면 중복됐다는 문구 띄우기
			{					
				System.out.println();
				System.out.println("이미 등록된 영화입니다. 다시 입력하세요.");
				System.out.println();
				System.out.println(" 0. 이전 메뉴로 돌아가기");
				System.out.println(" 1. 영화 정보 다시 입력하기");
				System.out.println("99. 관리자 메뉴로 돌아가기");
				System.out.println("================================================");

				do
				{
					System.out.print("\n메뉴 선택 : ");
					sel = Integer.parseInt(br.readLine());
				}
				while (sel != 0 && sel != 1 && sel != 99);
				
				System.out.println();

				switch(sel) 
				{
					case 0 : 
						movieManage();		// 영화관리 상단 메뉴 메소드
						break;
					case 1 : 
						registerMovie();	// 영화 등록 메소드
						break;
					case 99 : 
						AmenuDisp();		// 관리자 메뉴로 돌아갈 메소드
						break;
					default : 
						System.out.println("\n등록된 메뉴가 아닙니다.");
				}
			}
			else
			{
				vt.add(movies[0]);
				System.out.println("\n[영화 정보 등록]==============================\n");
				System.out.println( movies[0] +"\n\n등록완료");
			}
		}

		//System.out.println();
		//System.out.println("[영화 정보 등록]=======================\n");
		//System.out.println("등록을 원하는 영화 정보를 입력해주세요.\n");
		//System.out.println("=======================================\n");

		//System.out.print("제목			: ");
		//tempTitle = sc.next();
		//System.out.print("관람 등급(0 / 15 / 19)  : ");
		//tempGrade = sc.nextInt();
		//System.out.print("러닝타임 입력(분)	: ");
		//tempPlayTime = sc.nextInt();
		//System.out.println();
		
		//for (int i = 0; i < movies.length; i++)
		//{
		//	if (movieCheck(tempTitle))
		//	{
		//		System.out.println("영화 제목 중복입니다. 다시 입력하세요.");
		//		break;
		//	}
		//	else
		//	{
		//		movies[i] = new MovieData(tempTitle, tempGrade, tempPlayTime);
		//		vt.add(movies[i]);
		//		System.out.println("[영화 정보 등록]=======================\n");
		//		System.out.println(movies[i].toString()+"\n\n등록완료");
		//		break;
		//	}
		//}


		System.out.println();
		System.out.println(" 0. 이전 메뉴로 돌아가기");
		System.out.println("99. 관리자 메뉴로 돌아가기");
		System.out.println("==============================================");
					
		do
		{
			System.out.print("\n메뉴 선택 : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel != 0 && sel != 1 && sel != 99);
		
		System.out.println();

		switch(sel) 
		{
			case 0 : 
				movieManage();		// 영화관리 상단 메뉴 메소드
				break;
			case 99 : 
				AmenuDisp();		// 관리자 메뉴로 돌아갈 메소드
				break;
			default : 
				System.out.println("\n등록된 메뉴가 아닙니다.");
		}
	}

	// 영화 목록 출력
	public void selectMovie() throws IOException
	{		
		System.out.println();
		System.out.println("[영화 목록 확인] =============================\n");

		for(MovieData m : vt) 
		{
			if(m != null) 
			{
				printMovieInfo(m);	// 영화 정보 출력하는 메소드
			}
		}

		System.out.println();
		System.out.println(" 0. 이전 메뉴로 돌아가기");
		System.out.println("99. 관리자 메뉴로 돌아가기");
		System.out.println("==============================================");
		do
		{
			System.out.print("\n메뉴 선택 : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel != 0 && sel != 99);

		//System.out.println();

		switch(sel) 
		{
			case 0 : 
				movieManage();	// 영화관리 상단 메뉴 메소드
				break;
			case 99 : 
				AmenuDisp();	// 관리자 메뉴로 돌아갈 메소드
				break;
			default : 
				System.out.println("\n등록된 메뉴가 아닙니다.");
		}
	}


	// 영화 목록에서 영화 정보 삭제
	public void deleteMovie() throws IOException
	{					    
		System.out.println("\n[등록된 영화 삭제] ===========================\n");

		// 벡터에 저장된 영화 정보 불러오기
		for(MovieData m : vt) 
		{
			if(m != null) 
			{
				printMovieInfo(m);		// 영화 정보 출력하는 메소드
			}
		}

		System.out.println();

		System.out.println("삭제할 영화 제목을 입력해주세요.\n");
		System.out.println("==============================================\n");
		System.out.print("제목 입력 : ");
		tempTitle = br.readLine();
		
		tempIndex = -1;
		
		// vt 내에 tempTitle과 같은 영화 제목이 어디 있는지 찾아 삭제하는 구문
		for (int n = 0; n < vt.size(); n++)
		{
			// tempTitle과 같은 영화 제목이 저장되어 있는 인덱스 찾는 구문
			if (( vt.get(n).getTitle() ).equals(tempTitle) == true)		// 사용자 입력값(tempTitle)이 vt(벡터)에 저장된 title(제목)과 같으면 트루
			{
				boolean flag = ( vt.get(n).getTitle() ).equals(tempTitle);	// 트루일때, flag에 담고
				
				if (flag)													// n값을 tempIndex에 담는다
					tempIndex = n;
			}
		}
		
		// 인덱스 값을 못 찾았으면 (= 인덱스값이 그대로면)
		if (tempIndex == -1)
		{
				System.out.println();
				System.out.println("해당 영화가 존재하지 않습니다.");
				System.out.println("영화 제목을 다시 입력하세요.");
				System.out.println();
				System.out.println(" 0. 이전 메뉴로 돌아가기");
				System.out.println(" 1. 영화 제목 다시 입력하기");
				System.out.println("99. 관리자 메뉴로 돌아가기");
				System.out.println("==============================================");
				
				do
				{
					System.out.print("\n메뉴 선택 : ");
					sel = Integer.parseInt(br.readLine());
				}
				while (sel != 0 && sel != 1 && sel != 99);
				
				//System.out.println();

				switch(sel) 
				{
					case 0 : 
						movieManage();	// 영화관리 상단 메뉴 메소드
						break;
					case 1 : 
						deleteMovie();	// 등록된 영화 삭제 메소드
						break;
					case 99 : 
						AmenuDisp();	// 관리자 메뉴로 돌아갈 메소드
						break;
					default : 
						System.out.println("\n등록된 메뉴가 아닙니다.");
				}
		}
		// 찾았으면( 인덱스값이 -1에서 다른 값(n)으로 바뀌었다면)
		else
		{
			vt.removeElementAt(tempIndex);	// 인덱스값을 벡터에서 삭제
			
							  
			System.out.println();
			System.out.println("[등록된 영화 삭제] ===========================\n");
			System.out.printf("[%s] 영화 삭제 완료\n", tempTitle);
			System.out.println();
		}

		// screen[] 내에 tempTitle과 같은 영화 제목이 어디 있는 찾아 삭제하는 구문
		// (등록된 영화를 삭제하면 상영 중인 영화 목록에서도 삭제됨)
		try
		{
			for (int n=0; n < screen.length; n++)
			{
				if ( tempTitle.equals( screen[n].title ) )	// 상영관에 올라갈 정보(제목,등급,상영시간)가 담겨있는 screen의 title값이
				{											// 사용자가 입력한 값과 같다면
					screen[n] = null;						// 삭제하기
					System.out.println(" 0. 이전 메뉴로 돌아가기");
					System.out.println("99. 관리자 메뉴로 돌아가기");
					System.out.println("==============================================");

					break;
				}
			}
		}
		catch (NullPointerException e)
		{
			System.out.println(" 0. 이전 메뉴로 돌아가기");
			System.out.println("99. 관리자 메뉴로 돌아가기");
			System.out.println("==============================================");
		}

		do
		{
			System.out.print("\n메뉴 선택 : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel != 0 && sel != 99);
		
		//System.out.println();

		switch(sel) 
		{
			case 0 : 
				movieManage();	// 영화관리 상단 메뉴 메소드
				break;
			case 99 : 
				AmenuDisp();	// 영화관리 상단 메뉴 메소드
				break;
			default : 
				System.out.println("\n등록된 메뉴가 아닙니다.");
		}
	}


	// 영화 정보 출력
	public void printMovieInfo(MovieData m)			// 영화 정보가 담긴 MovieData를 매개변수로 받아
	{
		System.out.println(m.toString() + "\n");	//toString으로 모두 출력하기
	}

	//// 영화 제목 중복 체크
	//private boolean movieCheck(String tempTitle)	// 사용자가 입력한 tempTitle(영화제목)을 매개변수로 받아
	//{
	//	boolean check = true;						
	//	MovieData md = findMovie(tempTitle);		// findMovie를 통해 사용자가 입력한 tempTitle을 찾고 그 값을 md에 담는다
	//	if (md == null)								// md가 없으면
	//	{		
	//		check = false;							// check을 false로
	//	}
	//	return check;
	//}

	// 영화 제목으로 영화 정보 찾기
	public MovieData findMovie(String tempTitle)			// 사용자가 입력한 tempTitle(영화제목)을 매개변수로 받아
	{
		for (int i = 0; i < vt.size(); i++)					// vt(벡터)의 사이즈만큼 
		{
			if (( vt.get(i).getTitle() ).equals(tempTitle))	// 사용자 입력값이 vt(벡터)에 저장된 title(제목)과 같으면
			{
				return movies[i];							// movies 라는 영화 정보가 담긴 배열 반환
			}
		}
		return null;
	}

	// 제목 선택 받기
	// 사용자에게 메시지를 전달 받아 출력하고 문자열 값 받아 반환
	String getSelectData(String message) throws IOException 
	{
		System.out.print(message);
		return br.readLine();
	}
}
