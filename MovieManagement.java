import java.util.Scanner;
import java.io.IOException;

public class MovieManagement extends AdminCall
{    
	public void movieManage() throws IOException
	{
		System.out.println("\n[상영관 관리]==================\n");
		System.out.println("1. 영화 정보 등록");
		System.out.println("2. 영화 목록 확인");
		System.out.println("3. 등록된 영화 삭제");
		System.out.println();
		System.out.println("99. 관리자 메뉴로 돌아가기");
		System.out.println("=================================");

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
				System.out.println("등록된 메뉴가 아닙니다.");
		}
	}

	// 영화 등록
	public void  registerMovie() throws IOException
	{
		//==========================================================연수 방법
		//movies[0] = new MovieData();
		
		//System.out.println();
		//System.out.println("[영화 정보 등록]=======================\n");
		//System.out.println("등록을 원하는 영화 정보를 입력해주세요.\n");
		//System.out.println("=======================================\n");

		//System.out.print("제목			: ");
		//tempTitle = sc.next();
		//movies[0].title = tempTitle;
		//System.out.print("관람 등급(0 / 15 / 19)  : ");
		//movies[0].grade = sc.nextInt();
		//System.out.print("러닝타임 입력(분)	: ");
		//movies[0].playTime = sc.nextInt();
		//System.out.println();
		
		//for (int i = 0; i <= vt.size(); i++)
		//{	
		//	if (vt.size() == 0)
		//	{
		//		vt.add(movies[0]);
		//		System.out.println("[영화 정보 등록]=======================\n");
		//		System.out.println( movies[0] +"\n\n등록완료");
		//		break;
		//	}
		//	else if ( ( vt.get(i).getTitle() ).equals(tempTitle) )
		//	{
		//		System.out.println("이미 등록된 영화입니다. 다시 입력하세요.");
		//		registerMovie();
		//		break;
		//	}
		//	else
		//	{
		//		vt.add(movies[0]);
		//		System.out.println("[영화 정보 등록]=======================\n");
		//		System.out.println( movies[0] +"\n\n등록완료");
		//		break;
		//	}
		//}
		//==========================================================연수 방법


		System.out.println();
		System.out.println("[영화 정보 등록]=======================\n");
		System.out.println("등록을 원하는 영화 정보를 입력해주세요.\n");
		System.out.println("=======================================\n");

		System.out.print("제목			: ");
		tempTitle = sc.next();
		System.out.print("관람 등급(0 / 15 / 19)  : ");
		tempGrade = sc.nextInt();
		System.out.print("러닝타임 입력(분)	: ");
		tempPlayTime = sc.nextInt();
		System.out.println();
		
		for (int i = 0; i < movies.length; i++)
		{
			if (movieCheck(tempTitle))
			{
				System.out.println("영화 제목 중복입니다. 다시 입력하세요.");
				break;
			}
			else
			{
				movies[i] = new MovieData(tempTitle, tempGrade, tempPlayTime);
				vt.add(movies[i]);
				System.out.println("[영화 정보 등록]=======================\n");
				System.out.println(movies[i].toString()+"\n\n등록완료");
				break;
			}
		}

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


	// 영화 목록에서 영화 정보 삭제
	public void deleteMovie() throws IOException
	{
		System.out.println("\n[등록된 영화 삭제] ======================\n");

		for(MovieData m : vt) 
		{
			if(m != null) 
			{
				printMovieInfo(m);
			}
		}

		System.out.println();

		System.out.println("삭제할 영화 제목을 입력해주세요.\n");
		System.out.println("========================================\n");
		System.out.print("제목 입력 : ");
		tempTitle = sc.next();

		// vt 내에 tempTitle과 같은 영화 제목이 어디 있는지 찾아 삭제하는 구문
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
				System.out.println();
		}
		else
		{
			vt.removeElementAt(tempIndex);
			
			
			System.out.println();
			System.out.println("[등록된 영화 삭제] ======================\n");
			
			//for(MovieData m : vt) 
			//{	
			//	if(m != null) 
			//	{
			//		printMovieInfo(m);
			//	}
			//}
			
			System.out.println("영화 삭제 완료\n");
		}

		// screen[] 내에 tempTitle과 같은 영화 제목이 어디 있는 찾아 삭제하는 구문
		try
		{
			for (int n=0; n<screen.length; n++)
			{
				if ( tempTitle.equals( screen[n].title ) )
				{
					screen[n] = null;
					//System.out.println(" 0. 이전 메뉴로 돌아가기");
					//System.out.println("99. 관리자 메뉴로 돌아가기");
					//System.out.println("========================================\n");
					break;
				}
			}
		}
		catch (NullPointerException e)
		{
			System.out.println(" 0. 이전 메뉴로 돌아가기");
			System.out.println("99. 관리자 메뉴로 돌아가기");
			System.out.println("========================================\n");
		}


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


	// 영화 정보 출력
	public void printMovieInfo(MovieData m) 
	{
		System.out.println(m.toString() + "\n");
	}

	// 영화 제목 중복 체크
	private boolean movieCheck(String tempTitle)
	{
		boolean check = true;
		MovieData md = findMovie(tempTitle);
		if (md == null)
		{
			check = false;
		}
		return check;
	}

	// 영화 제목으로 영화 정보 찾기
	public MovieData findMovie(String tempTitle) 
	{

		for (int i = 0; i < vt.size(); i++) 
		{
			if (( vt.get(i).getTitle() ).equals(tempTitle))
			{
				return movies[i];
			}
		}

		return null;
	}

	// 제목 선택 받기
	String getSelectData(String message) 
	{
		System.out.print(message);
		return sc.next();
	}
}
