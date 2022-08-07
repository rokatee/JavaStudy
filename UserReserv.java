import java.util.Scanner;
import java.util.Random;
import java.util.Vector;
import java.util.Arrays;
import java.io.IOException;

	
//========================================================================(A)

public class UserReserv extends UserCall
{

	// 예매번호 생성 메소드
	public void reservNumber()
	{
		Random rd = new Random();
		int n;
		int[] num = new int[10];	

		for (int cnt=0; cnt<10; cnt++)	// 0 ~ 9
		{
			n = rd.nextInt(10);			// 0 ~ 9 중 랜덤한 숫자
			num[cnt] = n;         
		}

		String str = "";
		str = Arrays.toString(num).replaceAll("[^0-9]","");		//-- num[10] 정수형 배열 값을 문자열로 변환하여 str 변수에 저장

		// 벡터의 첫 번째 값 존재 여부 판단하기
		if (reservedNum.firstElement() == null)
		{
			reservedNum.add(str);	//-- 없을 시, 일단 저장
		}
		else if (reservedNum.contains(str) == false)	//-- 있을 시, 그 값이 현재 저장되어 있는지 확인 후 저장
		{
			reservedNum.add(str);	//-- str 값 벡터에 추가			
		}

	} //end reservNumber method


	// 1. [영화] 선택 후 다음 메뉴 (D,2)
	public void moviePick() throws IOException
	{
		System.out.println();
		System.out.println("[예매하기] ======================");
		System.out.println();
		//System.out.println("관리자가 등록한 영화 목록 출력");
		
		// 상영관에 등록된 영화 정보 저장된 배열
		for (int i=0; i<screen.length; i++)
		{
			if (screen[i] != null)	// 상영관에 영화가 등록되어 있을 경우에만
			{
				System.out.printf(" 상영관: %d관\n 영화 제목 : %s(%d)\n", (i+1), screen[i].title, screen[i].grade);
				System.out.println();
			}		
		}
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println("=================================");
		System.out.println();
		System.out.print("예매하실 영화제목을 입력해주세요 : ");

		tempTitle = sc.next();	//-- 영화제목 검색 시 문자열 비교하기 위해 String 형태의 tempTitle 이라는 변수에 저장
		System.out.println();

		if (tempTitle == "0")
		{
			UmenuDisp(); //-- 이전화면 출력(관람객모드 처음 화면)
		}
		System.out.println();

		// 사용자가 입력한 값이 상영관 내 값과 동일한 경우
		for (int i = 0; i < screen.length; i++)
		{
			if (screen[i].title != null)
			{
				if (tempTitle.equals(screen[0].title) || tempTitle.equals(screen[1].title) || tempTitle.equals(screen[2].title))
				{
					roundPick();
				}
				else
				{
					System.out.println("입력 값이 잘못되었습니다");
					System.out.println("다시 입력해주세요");
					System.out.println();
					moviePick();	//-- 현재 화면 호출 (재입력)
				}
			}
		}
	
	} //end moviePick method


	// [영화선택] 후 회차 고르기 (E,2)
	public void roundPick() throws IOException
	{
		System.out.println("[예매하기] ============");
		System.out.println();
		
		// 사용자가 선택한 영화제목이 등록된 상영관 값 출력하기
		for (int i=0; i<screen.length; i++)
		{
			if (screen[i].title.equals(tempTitle))	
			{
				System.out.print(screen[i].title + " ");
				System.out.printf("(%d)\n", screen[i].grade);
				System.out.println();
				System.out.printf("상영관 : %d관", (i+1));
				System.out.println();
				
				runTime = screen[i].playTime;	//-- 사용자가 선택한 영화의 러닝타임 값 저장
				tempScreen = (i+1);				//-- 사용자가 선택한 영화가 등록된 상영관 정보 저장 (몇 관인지)
				break;
			}		
		}

		int startTime = 9;	

		if (tempScreen == 1)	//-- 1관 7회차 출력 (2시간 간격 운영)
		{
			for (int i=0; i<7; i++)
			{
				int endTime = (startTime*60 + runTime) / 60;	
				int endMinute = (startTime*60 + runTime) % 60;  
				System.out.printf("%d회차 : ", (i+1));
				String st = "";		//-- start time
				String et=  "";		//-- end time
				String em = "";		//-- end minute
				if(startTime == 9) 
					st = "0"+Integer.toString(startTime); 
				else 
					st= Integer.toString(startTime);
				if(endTime >= 0 && endTime <= 9) 
					et = "0"+Integer.toString(endTime); 
				else 
					et= Integer.toString(endTime);
				if(endMinute >= 0 && endMinute <= 9) 
					em = "0"+Integer.toString(endMinute); 
				else 
					em = Integer.toString(endMinute);
				System.out.printf("%s:00 ~ %s:%s \n", st, et, em);
				startTime += 2;
			}
		}

		else if (tempScreen == 2)	//-- 2관 5회차 출력 (3시간 간격 운영)
		{
			for (int i=0; i<5; i++)
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
				startTime += 3;
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
				startTime += 4;
			}
		}
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println("=======================");
		System.out.println();
		System.out.print("회차 선택 : ");

		sel = sc.nextInt();
		tempRound = sel;
		System.out.println();

		switch(sel)
		{
			case 0: UmenuDisp(); break; // 이전화면 출력(관람객모드 처음 화면)
			case 1: case 2: case 3: case 4: case 5: case 6: case 7: 
					inwonPick(); break;
			default: roundPick(); break;
		}
	} //end roundPick method


	// [회차 또는 영화 선택] (F,3)
	public void inwonPick() throws IOException
	{
		MovieData selMovie = screen[tempScreen-1];
		int si = (tempScreen-1) * (7+(2-tempScreen)) + (tempRound-1);	//-- 회차별 좌석정보 (0~6: 1관 회차, 7~11: 2관 회차, 12~15: 3관 회차)
		int startTime = 9;	//-- start time
		
		if (si >= 0 && si < 7)
		{
			startTime += (2*si);
		}
		else if(si >= 7 && si < 12)
		{
			startTime += (3*(si-7));
		}
		else if(si >= 12 && si < 15) 
		{
			startTime += (4*(si-12));
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

		System.out.println("[예매하기]==============");
	    System.out.println();
	    System.out.println(selMovie.title + "(" + selMovie.grade + ")");
	    System.out.println(tempTime);
	    System.out.println();
	    System.out.println("관람인원을 입력해주세요.");
	    System.out.println("잔여 좌석 : " + leftSeat);
	    System.out.println();   
	    System.out.println("-1. 이전 메뉴로 돌아가기");	// 성인이 0명인 경우로 인해 일단 5로 변경
	    System.out.println("========================");
	    System.out.println();


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
			System.out.println("[예매하기] =======================");
			System.out.println();
			System.out.println("해당 상영관의 좌석수가 부족합니다.");
			System.out.println("다시 선택해주세요.");
			System.out.println();
			System.out.println("==================================");
			System.out.println();

			inwonPick();
	    }

	    seatPick();
		//if(p_id.equals(UserMenu.MOVIEROUND)) return;

   } //end inwonPick method


	// [상영 불가 연령대 기입 시] (G,2) > 관리자 메뉴에서 기능 끌어오면 조건문 써서 inwonPick() 안에 넣기
	public void adultMovie(String title, int age) throws IOException
	{
		System.out.println("[예매하기] ===========================================");
		System.out.println();
		System.out.println(title + "은(는)" + age + " 세 미만 관람불가 영화입니다.");
		System.out.println("다시 선택해주세요.");
		System.out.println();
		System.out.println("======================================================");
		System.out.println();
		System.out.println();

		inwonPick();
	} //end adultMovie method


	// 좌석 보여주는 메소드 생성 (G,3)
	public void showSeat(boolean[][] seatInfo) throws IOException
	{
		System.out.println();
		System.out.println("※■로 표시된 좌석은 예약된 좌석입니다.");      
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
		System.out.println();
	}
	
	// [인원 입력] (G,3)
	// 좌석 선택 메소드 생성 (메소드 변수: seatPick)
	public void seatPick() throws IOException
	{
		//각 상영관 회차별 좌석정보를 처리하기 위해 0~6은 1관의 총 회차, 7~11은 2관의 총 회차, 12~14는 3관의 총 회차
		int si = (tempScreen-1) * (7 + (2-tempScreen)) + (tempRound-1);

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
			System.out.println("원하는 좌석을 선택해주세요. [알파벳 대문자로 입력해주세요.]");
			System.out.println("총 인원은 " + total + "명입니다.");
			System.out.print("좌석 입력: ");
			String s = sc.next();
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
		System.out.println("[예매하기] ===========");
		System.out.println();
		System.out.println("이미 선택된 좌석입니다");
		System.out.println("다시 선택해주세요.");
		System.out.println();
		System.out.println("======================");
		System.out.println();
	}

	// [좌석 선택 가능] (H,4)
	public void payCheck(int si, int rows, int cols) throws IOException
	{
		reservNumber();		//-- 난수 생성
		String str="";		//-- 문자열 변수 선언
		str = reservedNum.lastElement();	//-- 생성된 예매번호를 str 문자형 변수에 저장(밑에 결제취소할 경우 삭제처리 하기 위해)

		System.out.println("[예매하기] =================");
		System.out.println();
		System.out.print  ("예매번호 : " + str);	//-- 예매번호 불러와서 적용해야 함
		System.out.println();
		System.out.println("영화     : " + tempTitle);
		System.out.println("시간     : " + tempTime);
		System.out.println("상영관   : " + tempScreen + "관");
		System.out.println("인원     : " + total + "명");
		System.out.println("좌석     : " + tempSeat);
		System.out.println();
		System.out.println("============================");
		
		System.out.print("결제하시겠습니까? (Y/N) :");

		String sel2 = sc.next();

		System.out.println();

		if (sel2.equals("y") || sel2.equals("Y"))
		{	
			ud.add(new ReservedData(str, tempTitle, tempTime, tempScreen, total, tempSeat));
			endReserv(); //-- 예매가 완료되었다는 문구 출력하는 화면
		}
		
		// 관람객 메뉴로 돌아가기 (I,5)
		else if (sel2.equals("n") || sel2.equals("N"))
		{	
			reservedNum.remove(str);
			
			UmenuDisp();	
			
			for(int i=0; i<total; i++) 
			{
				int row = rows[i];
				int col = cols[i];
				seatInfos[si][row][col] = false;
			}
		}
		else
		{
			reservedNum.remove(str);
			System.out.println("존재하지 않는 기능입니다.");
			payCheck(si, rows, cols);
		}

	} //end payCheck method

	
	// 좌석 선택 기능에서 Y 누른 후 화면(I,4)
	public void endReserv() throws IOException
	{
		System.out.println("[예매하기] ===============");												
		System.out.println();
		System.out.println("예매가 완료되었습니다.");
		System.out.println();
		System.out.println("==========================");
		System.out.print("0. 관람객 메뉴로 돌아가기 : ");

		sel = sc.nextInt();
		System.out.println();

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