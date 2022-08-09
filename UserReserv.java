import java.util.Scanner;
import java.util.Random;
import java.util.Vector;
import java.util.Arrays;
import java.io.IOException;

	
//========================================================================(A)

public class UserReserv extends UserCall
{

	// 예매번호 생성 메소드(예매번호: 0-9 까지로 이루어진 숫자 10자리로 구성)
	public void reservNumber()
	{
		Random rd = new Random();
		int n;
		int[] num = new int[10];	

		for (int cnt=0; cnt<10; cnt++)	// 0 ~ 9 까지 반복
		{
			n = rd.nextInt(10);			// 0 ~ 9 중 랜덤한 숫자 발생
			num[cnt] = n;				// num 배열에 위에서 발생한 랜덤 숫자 저장
		}

		String str = "";				// 임시저장용으로 문자열타입의 str 변수 선언(nullpoint 오류 방지를 위해 = "" 추가)
		str = Arrays.toString(num).replaceAll("[^0-9]","");		//-- num[10] 정수형 배열 값을 문자열로 변환하여 str 변수에 저장, 
																//   toString으로 출력시 '[', ',' 같이 나와서 그 부분 제외하기 위해 ("[^0-9]","") 추가작성

		// 벡터의 첫 번째 값 존재 여부 판단하기
		if (reservedNum == null)	// reservedNum 벡터구조에 값이 없을 경우
		{
			reservedNum.add(str);	//-- 없을 시, 일단 저장
		}
		else if (reservedNum.contains(str) == false)	//-- 있을 시, 그 값이 현재 저장되어 있는지 확인 후 저장
		{
			reservedNum.add(str);	//-- str 값 벡터에 추가			
		}


		// 난수 발생 방법 ②
		// String str = (rd.nextInt(90000)+10000) + "" + (rd.nextInt(90000)+10000);   //-- 99999 + 99999 (8자리) + 10000

	} //end reservNumber method


	// 1. [영화] 선택 후 다음 메뉴 (D,2)
	public void moviePick() throws IOException
	{					 
		System.out.println();
		System.out.println("[예매하기] ======================================");
		System.out.println();
		//System.out.println("관리자가 등록한 영화 목록 출력");
		
		// 상영관에 등록된 영화 정보 저장된 배열(현재 등록되어 있는 영화 정보 출력)
		for (int i=0; i<screen.length; i++)		// i=0 1관, i=1 2관, i=2 3관
		{
			if (screen[i] != null)	// 상영관에 영화가 등록되어 있을 경우에만
			{
				System.out.printf(" 상영관: %d관\n 영화 제목 : %s(%d)\n", (i+1), screen[i].title, screen[i].grade);	// 상영관에 등록된 영화 제목과, 영화등급을 가져와서 출력
				System.out.println();
			}		
		}
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println ("=================================================");
		System.out.println();
		System.out.print("예매하실 영화제목을 입력해주세요 : ");

		tempTitle = sc.next();	//-- 사용자가 입력한 영화제목 값을 상영관에 저장되어 있는 값과 문자열 형태로 비교하기 위해 
								//	 String 형태의 tempTitle 이라는 변수에 저장
		//System.out.println();

		//if (tempTitle == "0")
		//{
		//	UmenuDisp(); //-- 이전화면 출력(관람객모드 처음 화면)
		//}
		//System.out.println();

		//// 사용자가 입력한 값이 상영관 내 값과 동일한 경우
		//if (tempTitle.equals(screen[0].title) || tempTitle.equals(screen[1].title) || tempTitle.equals(screen[2].title))
		//{
		//	roundPick();
		//}
		//else
		//{
		//	System.out.println("입력 값이 잘못되었습니다");
		//	System.out.println("다시 입력해주세요");
		//	System.out.println();
		//	moviePick();	//-- 현재 화면 호출 (재입력)
		//}
		
		// 상영관에 등록된 영화 정보 저장된 배열(사용자가 입력한 값과 비교하기 위한 구문)
		for (int i=0; i<screen.length; i++)						// i=0 1관, i=1 2관, i=2 3관
		{	
			//아래의 if문 제대로 작동하는지 확인하기 위한 문구
			//System.out.println(screen.toString());
			
			if (screen[i] != null)								// 영화정보가 등록된 상영관인 경우
			{
				if (tempTitle.equals(screen[i].title))			// 사용자가 입력한 값과 동일한 제목의 영화가 등록된 상영관을 찾으면
					roundPick();								// 회차를 선택할 수 있는 화면으로 전환
				else											// 사용자가 입력한 값과 동일한 제목의 영화가 등록된 상영관이 없으면
				{
					System.out.println();
					System.out.println("입력 값이 잘못되었습니다");
					System.out.println("다시 입력해주세요");
					//System.out.println();
					moviePick();								// 영화선택하는 화면으로 전환해라(재입력)
				}
			}
			else
				continue;
		}

	} //end moviePick method


	// [영화선택] 후 회차 고르기 (E,2)
	public void roundPick() throws IOException
	{					  
		System.out.println();
		System.out.println("[예매하기] ======================================");
		System.out.println();
		
		// 사용자가 선택한 영화제목이 등록된 상영관 값 출력하기
		for (int i=0; i<screen.length; i++)
		{ 
			if (screen[i] != null)							// 영화정보가 등록된 상영관을 찾은 경우
			{
				if (screen[i].title.equals(tempTitle))		// 사용자가 입력한 값과 동일한 영화제목 값이 저장된 상영관을 찾아 
				{
					System.out.print(screen[i].title + " ");		// 그 상영관 내 저장된 영화제목을 가져오기
					System.out.printf("(%d)\n", screen[i].grade);	// 상영관 내 저장된 영화등급 가져오기
					System.out.println();
					System.out.printf("상영관 : %d관", (i+1));		// 해당 상영관 출력 (몇 관인지)
					System.out.println();
					
					runTime = screen[i].playTime;	//-- 위에서 찾은 상영관 내 저장된 영화의 러닝타임 값 저장
					tempScreen = (i+1);				//-- 사용자가 선택한 영화가 등록된 상영관 정보 저장 (몇 관인지)
					break;
				}		
			}
		}

		int startTime = 9;		//-- 운영시작 시간 9시 값 startTime 변수에 저장

		if (tempScreen == 1)	//-- 1관 7회차 출력 (2시간 간격 운영)
		{
			for (int i=0; i<7; i++)  // 0~6 반복 (7회)
			{
				int endTime = (startTime*60 + runTime) / 60;		// 영화 끝나는 시간 계산하여 저장(시 hour)
				int endMinute = (startTime*60 + runTime) % 60;		// 영화 끝나는 시간 계산하여 저장(분 minute)
				System.out.printf("%d회차 : ", (i+1));	
				
				// 해당 회차의 시작시간, 끝시간(시, 분) 정보를 이후 하나의 문자열로 만들기 위한 작업
				// 일단 각각의 값을 문자열 타입으로 담을 수 있도록 변수 선언
				String st = "";		//-- start time
				String et=  "";		//-- end time
				String em = "";		//-- end minute

				if(startTime == 9)							// 회차 시작시간이(hour) 9시인 경우 
					st = "0"+Integer.toString(startTime);	// 출력문이 09 로 나올수 있도록 앞에 "0" 추가해서 값 저장
				else 
					st= Integer.toString(startTime);		// 나머지 경우에는 시간이 두자리 형태로 나오기 때문에 나온 값 그대로 문자열 형태로 저장
				 
				if(endTime >= 0 && endTime <= 9)			// 0 < 회차 끝나는 시간(hour) <= 9 인 경우 
					et = "0"+Integer.toString(endTime);		// 출력문 형태가 두 자리로 나올 수 있도록 앞에 "0" 추가해서 값 저장
				else 
					et= Integer.toString(endTime);			// 나머지 경우에는 시간이 두자리 형태로 나오기 때문에 나온 값 그대로 문자열 형태로 저장

				if(endMinute >= 0 && endMinute <= 9)		// 회차 끝나는 시간의 분(minute)이 0~9 한자리 값으로 나올경우	
					em = "0"+Integer.toString(endMinute);   // 출력문 형태가 두 자리로 나올 수 있도록 앞에 "0" 추가해서 값 저장
				else 
					em = Integer.toString(endMinute);		// 그 외의 경우 나온 값 그대로 문자열 형태로 저장

				System.out.printf("%s:00 ~ %s:%s \n", st, et, em);  // 위에서 저장한 시작시간, 끝시간(hour, minute) 값 출력
				startTime += 2;										// 1관의 경우 2시간 간격 운영이기 때문에 2씩 더해줌
			}
		}

		else if (tempScreen == 2)	//-- 2관 5회차 출력 (3시간 간격 운영)
		{
			for (int i=0; i<5; i++)	// 0~4 반복 (5회)
			{
				int endTime = (startTime*60 + runTime) / 60;	//-- end time
				int endMinute = (startTime*60 + runTime) % 60; //-- end minute
				System.out.printf("%d회차 : ", (i+1));
				String st = "";
				String et=  "";
				String em = "";
				if(startTime == 9) st = "0"+Integer.toString(startTime); else st= Integer.toString(startTime);			
				if(endTime >= 0 && endTime <= 9) et = "0"+Integer.toString(endTime); else et= Integer.toString(endTime);
				if(endMinute >= 0 && endMinute <= 9) em = "0"+Integer.toString(endMinute); else em= Integer.toString(endMinute);
				System.out.printf("%s:00 ~ %s:%s \n", st, et, em);
				startTime += 3;		// 2관 운영시간 3시간 간격
			}
		}

		else if (tempScreen == 3)	//-- 3관 3회차 출력 (4시간 간격 운영)
		{
			for (int i=0; i<3; i++)
			{
				int endTime = (startTime*60 + runTime) / 60;	//-- end time
				int endMinute = (startTime*60 + runTime) % 60; //-- end minute
				System.out.printf("%d회차 : ", (i+1));
				String st = "";
				String et=  "";
				String em = "";
				if(startTime == 9) st = "0"+Integer.toString(startTime); else st= Integer.toString(startTime);
				if(endTime >= 0 && endTime <= 9) et = "0"+Integer.toString(endTime); else et= Integer.toString(endTime);
				if(endMinute >= 0 && endMinute <= 9) em = "0"+Integer.toString(endMinute); else em= Integer.toString(endMinute);
				System.out.printf("%s:00 ~ %s:%s \n", st, et, em);
				startTime += 4;		// 3관 운영시간 4시간 간격
			}
		}
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println("=================================================");
		System.out.println();
		System.out.print("회차 선택 : ");

		sel = sc.nextInt();
		tempRound = sel;		// 사용자가 선택한(입력한) 회차 값을 tempRound 변수에 저장

		// 1관일 때
		if (tempScreen == 1)
		{
			// sel이 1~7회차 아닐 때			// sel이 조건문에 해당하지 않으면 sel은 그냥 tempRound값 그대로라 switch문으로 바로 이동!
			if (!(sel>0 && sel<8))				// 사용자가 1,2,3,4,5,6,7 중 하나의 값을 회차로 입력하면 아래 스위치문에서 inwonPick() 로 화면전환
			{
				sel = 8;	// sel(사용자가 입력한 회차 값) 을 8로 변경하겠음!
			}
		}

		// 2관일 때
		else if (tempScreen == 2)
		{
			// sel이 1~5회차 아닐 때
			if (!(sel>0 && sel<6))
			{
				sel = 8;
			}
		}

		// 3관일 때
		else if (tempScreen == 3)
		{
			// sel이 1~3회차 아닐 때
			if (!(sel>0 && sel<4))
			{
				sel = 8;
			}
		}

		switch(sel)	// sel이 8이 돼버림!
		{
			case 0: UmenuDisp(); break; // 이전화면 출력(관람객모드 처음 화면)
			case 1: case 2: case 3: case 4: case 5: case 6: case 7: 
					inwonPick(); break;
			default: roundPick(); break; // 0~7 이외의 값 입력 시 roundPick() 화면으로 전환(재입력)
		}
	} //end roundPick method


	// [회차 또는 영화 선택] (F,3)
	public void inwonPick() throws IOException
	{
		MovieData selMovie = screen[tempScreen-1];	// 상영관에 저장된 영화정보를 가져오기 위해 선언
		int si = (tempScreen-1) * (7+(2-tempScreen)) + (tempRound-1);	//-- 회차별 좌석정보 (0~6: 1관 회차, 7~11: 2관 회차, 12~14: 3관 회차)
																		// (0,1,2,3,4,5,6) 총 7회 1관 // (7,8,9,10,11) 총 5회 2관 // (12,13,14) 총 3회 3관
		//        --------------------------------- (앞부분)
		//											    ------------- (뒷부분)
		// 앞에서 사용자가 선택한 영화에 해당하는 상영관 정보(tempScreen)로 세팅
		// 1관인 경우(tempScreen = 1) 사용자가 0~6 입력할 경우 존재(총 7회), (tempScreen-1) 로 앞부분을 0 값으로 만들고 뒤에 (tempRound-1) 부분에서 0~6 까지 나올 수 있도록 처리
		
		// 2관인 경우 사용자가 7~11 입력할 경우 존재(총 5회), (tempScreen-1) 로 앞부분을 1 값으로 만들고 
		// 2관은 회차가 7부터 나올 수 있도록 (7+(2-tempScreen)) 에서 7을 더해주었음
		//								1 *  (7+(2-     2    )) = 7,  앞부분 7 값으로 세팅되기 때문에
		// 그렇게 하면							+ (tempRound-1) 부분에서 7~11 까지 나올 수 있음

		// 3관인 경우 사용자가 12~14 입력할 경우 존재(총 3회), (tempScreen-1) 로 앞부분을 2 값으로 만들고
		// 3관은 회차가 12부터 나올 수 있어야함, (tempScreen-1) * (7+(2-tempScreen)) + (tempRound-1)
		//												2       *  7+(  2 -  3)  
		//										 ----------------------------------- 앞부분 12 값으로 설정되기에 (tempRound-1) 부분이 12~14 값이 나올 수 있음
													
		// tempScreen = 1,2,3 관의 경우 존재

		
		int startTime = 9;	//-- start time 운영시작 시간 9시
		
		if (si >= 0 && si < 7)		// 0,1,2,3,4,5,6,7 => 1관
		{
			startTime += (2*si);	// 운영시간 2시간 간격
		}
		else if(si >= 7 && si < 12)	// 7,8,9,10,11 => 2관
		{
			startTime += (3*(si-7)); // 운영시간 3시간 간격
		}
		else if(si >= 12 && si < 15) // 12,13,14 => 3관
		{
			startTime += (4*(si-12)); // 운영시간 4시간 간격
		}

		int endTime = (startTime*60 + selMovie.playTime) / 60;	//-- end time
		int endMinute = (startTime*60 + selMovie.playTime) % 60; //-- end minute

		int leftSeat = 25;	//-- 관별 총 좌석 수
		boolean[][] seatInfo = seatInfos[si];

		for (int i = 0; i < seatInfo.length; i++)
		{
			for (int j = 0; j < seatInfo[i].length; j++)
			{
				if (seatInfo[i][j])
					leftSeat--;		//-- 선택한 좌석 빠짐		                                
            }            
        }

		String st = "";
		String et=  "";
		String em = "";
		if(startTime == 9) st = "0"+Integer.toString(startTime); else st= Integer.toString(startTime);
		if(endTime >= 0 && endTime <= 9) et = "0"+Integer.toString(endTime); else et= Integer.toString(endTime);
		if(endMinute >= 0 && endMinute <= 9) em = "0"+Integer.toString(endMinute); else em= Integer.toString(endMinute);

		tempTime = st + ":00 ~ " + et + ":" + em;
						  
		System.out.println();
		System.out.println("[예매하기]=======================================");
	    System.out.println();
	    System.out.println(selMovie.title + "(" + selMovie.grade + ")");
	    System.out.println(tempTime);
	    System.out.println();
	    System.out.println("관람인원을 입력해주세요.");
	    System.out.println("잔여 좌석 : " + leftSeat);
	    System.out.println();   
	    System.out.println("-1. 이전 메뉴로 돌아가기");	// 성인이 0명인 경우로 인해 일단 5로 변경
	    System.out.println("=================================================");
	    //System.out.println();


		// 아래의 변수들은 전역변수이기에 메소드 재진입시 이전 정보를 계속 갖게 됨. 따라서 초기화 필요!
	    adult = 0;
	    teenager = 0;
	    kid = 0;

	    System.out.print("성인 : ");
	    adult = sc.nextInt();
	    if (adult == -1)
		{
			roundPick();  //-- 이전화면 출력
			return;
		}
	    System.out.print("청소년 (~18) : ");
	    teenager = sc.nextInt();
	    if (teenager == -1)
		{
			roundPick();  //-- 이전화면 출력
			return;
		}
	    System.out.print("어린이 (~14) : ");
	    kid = sc.nextInt();
	    if (kid == -1)
		{
			roundPick();  //-- 이전화면 출력
			return;
		}
		

	    switch (selMovie.grade)
	    {
			case 19: if (teenager != 0 && kid != 0)
				adultMovie(selMovie.title, selMovie.grade); break;
			case 15: if (kid != 0)
				adultMovie(selMovie.title, selMovie.grade); break;
			default: break;
	    }

	    total = adult + teenager + kid;
		System.out.println(total);
	   
	    // [상영관보다 많은 인원 입력 시] (G,6)
	    if (total > 25)
	    {					
			System.out.println();
			System.out.println("[예매하기] ======================================");
			System.out.println();
			System.out.println("해당 상영관의 좌석수가 부족합니다.");
			System.out.println("다시 선택해주세요.");
			System.out.println();
			System.out.println("=================================================");
			//System.out.println();

			inwonPick();
	    }

	    seatPick();
		//if(p_id.equals(UserMenu.MOVIEROUND)) return;

   } //end inwonPick method


	// [상영 불가 연령대 기입 시] (G,2) > 관리자 메뉴에서 기능 끌어오면 조건문 써서 inwonPick() 안에 넣기
	public void adultMovie(String title, int age) throws IOException
	{					
		System.out.println();
		System.out.println("[예매하기] ======================================");
		System.out.println();
		System.out.println(title + "은(는)" + age + " 세 미만 관람불가 영화입니다.");
		System.out.println("다시 선택해주세요.");
		System.out.println();
		System.out.println("=================================================");
		//System.out.println();
		//System.out.println();

		inwonPick();
	} //end adultMovie method


	// 좌석 보여주는 메소드 생성 (G,3)
	public void showSeat(boolean[][] seatInfo) throws IOException
	{
		System.out.println();
		System.out.println("※■로 표시된 좌석은 예약된 좌석입니다.\n");    
		System.out.println("====== 스크린 ======");
		System.out.println();
        for (int i = 0; i < seatInfo.length; i++)
		{
			for (int j = 0; j < seatInfo[i].length; j++)
			{
				if (seatInfo[i][j])
					System.out.print("[■]");
                else                                     
					System.out.print("[" + (char)(65 + i) + (j+1) + "]");                                 
            }
            System.out.println();
        }
		//System.out.println();
	}

	// [인원 입력] (G,3)
	// 좌석 선택 메소드 생성 (메소드 변수: seatPick)
	public void seatPick() throws IOException
	{
		//각 상영관 회차별 좌석정보를 처리하기 위해 0~6은 1관의 총 회차, 7~11은 2관의 총 회차, 12~14는 3관의 총 회차
		int si = (tempScreen-1) * (7 + (2-tempScreen)) + (tempRound-1);

		// 선택한 좌석들 뭐뭐인지 배열에 담기 위한 선언
		int[] rows = new int[total];
		int[] cols = new int[total];

		boolean isFirst = true;
		tempSeat = "";

		for (int i=0; i<total; i++)
		{
			if (isFirst)
			{
				showSeat(seatInfos[si]);
				isFirst = false;
			}
			System.out.println();
			System.out.println("원하는 좌석을 선택해주세요. [알파벳 대문자로 입력해주세요.]");
			System.out.println("총 인원은 " + total + "명입니다.");
			System.out.print("좌석 입력: ");
			
			String s = sc.next();

			//do
			//{
			//	System.out.print("좌석 입력: ");
			//	s = sc.next();
			//}
			//while (s.charAt(0)<65 && s.charAt(0)>90 || s.charAt(1)<49 && s.charAt(1)>53);
			
			int row = s.charAt(0) - 65;	//-- 열
			int col = s.charAt(1) - 49;	//-- 행
			 
			if (seatInfos[si][row][col])
			{
				redun();
				i--;
			}
			else
			{
				seatInfos[si][row][col] = true;
				if (i == total-1)
				{
					tempSeat += s;
				}
				else
				{
					tempSeat += (s + ", ");
				}
				rows[i] = row;
				cols[i] = col;
			}
			showSeat(seatInfos[si]);
		}

		payCheck(si, rows, cols);

	} //end seatPick method


	// [좌석 중복] (H,3)
	public void redun()
	{					
		System.out.println();
		System.out.println("[예매하기] ======================================");
		System.out.println();
		System.out.println("이미 선택된 좌석입니다");
		System.out.println("다시 선택해주세요.");
		System.out.println();
		System.out.println ("=================================================");
		//System.out.println();
	}

	// [좌석 선택 가능] (H,4)
	public void payCheck(int si, int[] rows, int[] cols) throws IOException
	{
		
		reservNumber();		//-- 난수 생성
		String str="";		//-- 문자열 변수 선언
		str = reservedNum.lastElement();	//-- 생성된 예매번호를 str 문자형 변수에 저장(밑에 결제취소할 경우 삭제처리 하기 위해)
						
		System.out.println();
		System.out.println("[예매하기] ======================================");
		System.out.println();
		System.out.print  ("예매번호 : " + str);	//-- 예매번호 불러와서 적용해야 함
		System.out.println();
		System.out.println("영화     : " + tempTitle);
		System.out.println("시간     : " + tempTime);
		System.out.println("상영관   : " + tempScreen + "관");
		System.out.println("인원     : " + total + "명");
		System.out.println("좌석     : " + tempSeat);
		System.out.println();
		System.out.println("=================================================");
		
		System.out.print("결제하시겠습니까? (Y/N) :");

		String sel2 = sc.next();

		//System.out.println();

		if (sel2.equals("y") || sel2.equals("Y"))
		{	
			// 현재 화면에서 출력되는 정보들(예매번호, 영화제목, 시간, 상영관, 인원, 좌석)을 ReserwvedData 벡터 구조에 저장
			ud.add(new ReservedData(str, tempTitle, tempTime, tempScreen, total, tempSeat)); 
			endReserv(str); //-- 예매가 완료되었다는 문구 출력하는 화면전환
		}
		
		// 관람객 메뉴로 돌아가기 (I,5)
		else if (sel2.equals("n") || sel2.equals("N"))
		{	
			reservedNum.remove(str);		// 예매를 취소하였으므로 예매번호가 저장되어있는 reservedNum 벡터구조에서 값을 지워줌	
			
			for(int i=0; i<total; i++)		// 입력했던 인원 수 만큼
			{
				int row = rows[i];			// 저장되었던 행 값
				int col = cols[i];			// 저장되었던 열 값
				seatInfos[si][row][col] = false;	// ture 였던 걸 false 로 변경하여 선택한 좌석정보를 없애줌
			}
			UmenuDisp();
		}
		else		
		{
			reservedNum.remove(str);		// 생성했던 예매번호 삭제
			System.out.println("\n존재하지 않는 기능입니다.");
			payCheck(si, rows, cols);		// payCheck 화면 호출(재입력)	
		}

	} //end payCheck method

	
	// 좌석 선택 기능에서 Y 누른 후 화면(I,4)
	public void endReserv(String resNum) throws IOException		
	{
		System.out.println("\n[예매하기] ======================================");												
		System.out.println();
		System.out.printf("예매번호 : %s", resNum);	// 직전 화면에서 부여했던 예매번호 값 삭제
		System.out.println();
		System.out.println("예매가 완료되었습니다.");
		System.out.println();
		System.out.println("=================================================");
		System.out.print("0. 관람객 메뉴로 돌아가기 : ");

		sel = sc.nextInt();
		//System.out.println();

		switch(sel)
		{
			case 0: UmenuDisp();	//-- 이전화면 출력(관람객모드 처음 화면)
		}
	} //end endReserv method


	// 현재 상영관에 등록된 영화 정보 출력하는 메소드
	public void movieList()
	{
		//상영관에 등록된 영화 정보 저장된 배열
		for (int i=0; i<screen.length; i++)
		{
			System.out.printf("영화 제목 : %s, 상영관: %d관\n", screen[i].title, (i+1));
		}
	}

// ============================================================ ↑ 예매하기	
} //end User class