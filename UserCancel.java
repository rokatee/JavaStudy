import java.io.IOException;

public class UserCancel extends UserCall
{
	
	// 예매 취소 첫 화면(예매 번호 입력하는 문구포함) (C,10)
	public void reservCancel() throws IOException
	{
		System.out.println("[예매취소] =======================");
		System.out.println();
		System.out.println("예매 번호를 입력해주세요. (10자리)"); 
		System.out.println();
		System.out.println("==================================");
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println();
		System.out.print("예매 번호 입력: ");
		
		bookNumber = sc.next();
		System.out.println();
			
		if (bookNumber.equals("0"))
			UmenuDisp();		 //-- 이전화면 출력(관람객모드 처음 화면)
		else if (reservedNum.contains(bookNumber) == true)		//-- str 문자값(예매번호)이 reservedNum(벡터) 값에 없는 경우 
		{
			checkCancel();	 //-- 다음 화면(예매번호 입력화면 D열) 전환
		}
		else
			unknownCancel(); //-- 없는 예매번호 입력 시 화면 전환

		if (reservedNum == null)
			unknownCancel();

	} //end reservCancel method


	// [예매번호 입력] (D,9)
	public void checkCancel() throws IOException
	{
		int udIndex = reservedNum.indexOf(bookNumber);
		ReservedData res_ud = ud.get(udIndex);

		System.out.println("[예매취소] =================");
		
		System.out.println(); 
		System.out.print  ("예매번호  : " + bookNumber);
		System.out.println();
		System.out.println("영화 제목 : " + res_ud.getTitle());
		System.out.println("시간      : " + res_ud.getTime());
		System.out.println("상영관    : " + res_ud.getScreen() + "관");
		System.out.println("인원      : " + res_ud.getInwon() + "명");
		System.out.println("좌석      : " + res_ud.getSeatNumber());
		System.out.println();
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println("============================");
		System.out.println();

		System.out.print("정말 취소하시겠습니까? (Y/N) :");	

		String sel2 = sc.next();

		System.out.println();

		if (sel2.equals("y") || sel2.equals("Y"))
		{	
			int i = reservedNum.indexOf(bookNumber);	//-- 예매번호가 벡터에 몇 번째에 위치하는지 찾아서 i 에 저장
			reservedNum.remove(i);
			reservCancelY(); //-- 예매가 취소되었다는 문구 출력하는 화면
		}
		else if (sel2.equals("n") || sel2.equals("N"))
			reservCancel(); //-- 이전메뉴(예매번호 입력하는 화면)로 돌아가는 화면
		else if (sel2.equals("0"))
			UmenuDisp();
		else
		{
			System.out.println("존재하지 않는 기능입니다.");
			checkCancel();
		}

	} //end checkCancel method


	// 없는 예매번호 입력 시 (D,8), (D,11)
	public void unknownCancel() throws IOException
	{
		System.out.println("[예매취소] ==================");
		System.out.println(); 
		System.out.println("존재하지 않는 예매번호입니다.");
		System.out.println("다시 입력해 주세요.");
		System.out.println();
		System.out.println("=============================");
		System.out.println();

		reservCancel(); 
	}


	// [예매 취소] (E,9)
	public void reservCancelY() throws IOException
	{
		System.out.println("[예매취소] ==============");
		System.out.println(); 
		System.out.println("예매를 취소했습니다.");
		System.out.println();
		System.out.print("0. 관람객 메뉴로 돌아가기 : ");
		System.out.println("=========================");

		sel = sc.nextInt();
		System.out.println();

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