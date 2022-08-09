import java.io.IOException;

public class UserCancel extends UserCall
{
	
	// 예매 취소 첫 화면(예매 번호 입력하는 문구포함) (C,10)
	public void reservCancel() throws IOException
	{					  
		System.out.println();
		System.out.println("[예매취소] ===================================");
		System.out.println();
		System.out.println("예매 번호를 입력해주세요. (10자리)"); 
		System.out.println();
		System.out.println("==============================================\n");
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println();
		System.out.print("예매 번호 입력: ");
		
		bookNumber = sc.next();		// 사용자가 입력한 예매번호를 저장 (bookNumber - 저장을 위한 임시변수)
		//System.out.println();
			
		if (bookNumber.equals("0"))	// 사용자가 입력한 값이 0 이라면 
			UmenuDisp();		 //-- 이전화면 출력(관람객모드 처음 화면)
		else if (reservedNum.contains(bookNumber) == true)		//-- bookNumber 문자값(예매번호)이 reservedNum(벡터) 에 동일한 값이 저장되어 있으면
		{
			checkCancel();	 //-- 사용자가 입력한 예매번호에 해당하는 예매내역 출력하는 화면으로 전환
		}
		else
			unknownCancel(); //-- 없는 예매번호 입력 시 화면 전환(존재하지 않는 예매번호입니다 문구 화면으로)

		if (reservedNum == null)	// reserwvedNum (예매번호를 저장하는 벡터구조) 에 저장된 값이 없는 경우	
			unknownCancel();		// 존재하지 않는 예매번호 라는 내용이 포함된 출력문 메소드 호출

	} //end reservCancel method


	// [예매번호 입력] (D,9)
	public void checkCancel() throws IOException
	{
		int udIndex = reservedNum.indexOf(bookNumber);	// 사용자가 입력한 예매번호(bookNumber)와 동일한 값이 
														// reservedNum 벡터구조의 몇 번째에 위치하고 있는지 찾아서 위치값을 저장
		ReservedData res_ud = ud.get(udIndex);			// ReservedData 벡터구조에 저장된 값을 가져오기 위한 구문, (벡터구조에서) 위에서 찾은 위치값 정보를 가져와라

		System.out.println();
		System.out.println("[예매취소] ===================================");
		
		System.out.println(); 
		System.out.print  ("예매번호  : " + bookNumber);					// 사용자가 입력한 예매번호 출력
		System.out.println();
		System.out.println("영화 제목 : " + res_ud.getTitle());				// 위에서 찾은 벡터의 위치값에 저장된 영화제목을 가져옴
		System.out.println("시간      : " + res_ud.getTime());				//									  시간 값을 가져옴
		System.out.println("상영관    : " + res_ud.getScreen() + "관");		//									  상영관 값을 가져옴
		System.out.println("인원      : " + res_ud.getInwon() + "명");		//									  인원 값을 가져옴
		System.out.println("좌석      : " + res_ud.getSeatNumber());		//									  좌석 정보를 가져옴
		System.out.println();
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println("==============================================\n");
		System.out.println();

		System.out.print("정말 취소하시겠습니까? (Y/N) :");	

		String sel2 = sc.next();		// 사용자가 현재 화면에서 입력한 값을 저장

		//System.out.println();

		if (sel2.equals("y") || sel2.equals("Y"))		//-- 사용자가 입력한 값이 y 또는 Y 인 경우
		{	
			int i = reservedNum.indexOf(bookNumber);	//-- 이전화면에서 사용자가 입력했던 예매번호가 reservedNum 벡터에서 몇 번째에 위치하는지 찾아서 i 에 저장
			reservedNum.remove(i);						//-- reservedNum 백터 구조에서 위에서 찾은 위치값에 저장된 정보를 삭제 
			reservCancelY();						    //-- 예매가 취소되었다는 문구 출력하는 화면
		}
		else if (sel2.equals("n") || sel2.equals("N"))	//-- 사용자가 입력한 값이 n 또는 N 인 경우
			reservCancel();							    //-- 이전메뉴(예매번호 취소메뉴의 예매번호 입력하는 화면)로 전환
		else if (sel2.equals("0"))						//-- 사용자가 입력한 값이 0 인 경우
			UmenuDisp();								//-- 관람객 모드 첫 화면으로 전환
		else											//-- 그 외의 값을 사용자가 입력한 경우
		{
			System.out.println();
			System.out.println("존재하지 않는 기능입니다.");	
			checkCancel();										//-- 이전메뉴(예매번호 취소메뉴의 예매번호 입력하는 화면)로 전환 
		}

	} //end checkCancel method


	// 없는 예매번호 입력 시 (D,8), (D,11)
	public void unknownCancel() throws IOException
	{					  
		System.out.println();
		System.out.println("[예매취소] ===================================");
		System.out.println(); 
		System.out.println("존재하지 않는 예매번호입니다.");
		System.out.println("다시 입력해 주세요.");
		System.out.println();
		System.out.println("==============================================\n");
		//System.out.println();

		reservCancel(); 
	}


	// [예매 취소] (E,9)
	public void reservCancelY() throws IOException
	{
		System.out.println();
		System.out.println("[예매취소] ===================================");
		System.out.println(); 
		System.out.println("예매를 취소했습니다.");
		System.out.println();
		System.out.print("0. 관람객 메뉴로 돌아가기 : ");
		System.out.println("==============================================\n");

		sel = sc.nextInt();
		//System.out.println();

		switch(sel)
		{
			case 0: UmenuDisp(); // 이전화면 출력(관람객모드 처음 화면)
		}
	}


	//// 현재 상영관에 등록된 영화 정보 출력하는 메소드
	//public void movieList()
	//{
	//	//상영관에 등록된 영화 정보 저장된 배열
	//	for (int i=0; i<screen.length; i++)
	//	{
	//		System.out.printf("영화 제목 : %s, 상영관: %d관\n", screen[i].title, (i+1));
	//	}
	//}
}