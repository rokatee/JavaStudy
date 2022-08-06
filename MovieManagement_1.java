import java.util.Scanner;
import java.io.IOException;

public class MovieManagement_1 extends AdminCall
{    
	// 변수 클래스로 이동
	Scanner sc = new Scanner(System.in);
	// 영화목록
	MovieData[] movies = new MovieData[100];
	// 프로그램 실행 flag
	boolean isRun = true;
	// 메인 메뉴 선택 번호
	int selectNo = 0;
	// 영화관리 번호
	int count=1;

	public void movieManage() throws IOException
	{
		//BackAMenu bAM = new BackAMenu();

		while(isRun) 
		{
			System.out.println("===============================================================================");
			System.out.println(" 1. 영화등록 | 2. 영화목록 | 3. 영화삭제 | 4. 종료 | 99. 관리자 메뉴로 돌아가기");
			System.out.println("===============================================================================");
			selectNo = getSelectNum("번호를 선택하세요 : ");

			switch(selectNo) 
			{
				case 1 :
					registerMovie();
					break;
				case 2 :
					selectMovie();
					break;
				case 3 : 
					deleteMovie();
					break;
				case 4 : 
					terminate();
					break;    
				case 99 : 
					//bAM.AmenuDisp();
					AmenuDisp();
					break;
				default : 
					System.out.println("등록된 메뉴가 아닙니다.");
			}
		}
	}

	// 프로그램 종료
	public void terminate() 
	{
		System.out.println("프로그램 종료");
		isRun = false;
	}

	// 영화 등록
	public void  registerMovie() throws IOException
	{
		//BackAMenu bAM = new BackAMenu();

		System.out.println();
		System.out.println("1. 영화등록");
		String title = getData("등록할 영화의 제목 입력	: ");
		int grade =	getNum("등록할 영화의 관람 등급 입력(0 / 15 / 19) : ");
		int playTime = getNum("등록할 영화의 러닝타임 입력 : ");
		System.out.println();

		for(int i=0; i < movies.length; i++) 
		{
			if(movies[i] == null) 
			{
				count = i+1;
				movies[i] = new MovieData(title,grade,playTime);
				System.out.println();
				System.out.println("등록완료");
				break;
			}
		}

		System.out.println();

		selectNo = getSelectNum(" 0. 이전 메뉴로 돌아가기 | 99. 관리자 메뉴로 돌아가기");
		switch (selectNo)
		{
			case 0 : 
				movieManage(); 
				break;
			case 99 : 
				//bAM.AmenuDisp();
				AmenuDisp();
				break;
			default : 
				System.out.println("등록된 메뉴가 아닙니다.");
		}
	}

	// 영화 목록 출력
	public void selectMovie() throws IOException
	{
		//BackAMenu bAM = new BackAMenu();

		System.out.println();
		System.out.println("2. 영화목록");
		System.out.println();
		for(MovieData m : movies) 
		{
			if(m != null) 
			{
				printMovieInfo(m);
			}
		}

		System.out.println();

		selectNo = getSelectNum(" 0. 이전 메뉴로 돌아가기 | 99. 관리자 메뉴로 돌아가기");
		
		switch (selectNo)
		{
			case 0 : 
				movieManage(); 
				break;
			case 99 : 
				//bAM.AmenuDisp();
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
		//BackAMenu bAM = new BackAMenu();

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
				//bAM.AmenuDisp();
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
		//BackAMenu bAM = new BackAMenu();

		System.out.println();
		System.out.println("3. 영화삭제");
		String movieTitle = getSelectData("삭제할 영화의 제목 입력 : ");

		MovieData m = findMovie(movieTitle);

		if (m == null)
		{
			System.out.println("입력하신 제목의 영화가 존재하지 않습니다");
			//return;
		}
		
		for (int i = 0; i < movies.length; i++) 
		{

			if(movies[i] != null && movies[i].getTitle().equals(movieTitle)) 
			{
				movies[i] = null;
				System.out.println("삭제 완료");
				//return;
			}
			//else
			//{
			//	System.out.println("입력하신 제목의 영화가 존재하지 않습니다");
			//	return;
			//}

		}

		System.out.println();

		selectNo = getSelectNum(" 0. 이전 메뉴로 돌아가기 | 99. 관리자 메뉴로 돌아가기");
		switch (selectNo)
		{
			case 0 : 
				movieManage(); 
				break;
			case 99 : 
				//bAM.AmenuDisp();
				AmenuDisp();
				break;
			default : 
				System.out.println("등록된 메뉴가 아닙니다.");
		}
	}

	// 영화 정보 출력
	public void printMovieInfo(MovieData m) 
	{
		System.out.println(m.toString());
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

	// 사용자에게 메시지를 전달 받아 출력하고 문자열 값 받아 반환
	String getData(String message) 
	{
		System.out.println(message);
		return sc.next();
	}


	// 사용자에게 메시지를 전달 받아 출력하고 숫자 값 받아 반환
	int getNum(String message) 
	{
		System.out.println(message);
		return sc.nextInt();
	}

	// 번호 선택 받기
	int getSelectNum(String message) 
	{
		System.out.println(message);
		return sc.nextInt();
	}

	// 제목 선택 받기
	String getSelectData(String message) 
	{
		System.out.println(message);
		return sc.next();
	}

	public static void main(String[] args) throws IOException
	{
		new MovieManagement();
		AmenuDisp();
	}
}
