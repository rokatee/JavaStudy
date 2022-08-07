import java.io.IOException;

public class UserCheck extends UserCall
{

	// [예매내역 확인]하는 메서드 (C,7)
	public void reservedCheck() throws IOException
	{
		System.out.println("[예매내역 확인] ========");
		System.out.println();
		System.out.println("예매번호를 입력해주세요.");
		System.out.println();	
		System.out.println("========================");
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println();
		System.out.print("예매번호 : ");

		bookNumber = sc.next();
		System.out.println();

		if (reservedNum == null)
		{
			unknownCheck();
			return;
		}
		
		if (bookNumber.equals("0"))
		{
			UmenuDisp();	//-- 이전화면 출력(관람객모드 처음 화면)
		}

		else if (reservedNum.contains(bookNumber)==true) //-- str 문자값(예매번호) 이 reservedNum(벡터) 값에 없는 경우 
		{
			reservedCheck2(); //-- 다음 화면(예매내역 확인 화면 D열) 전환
		}
		else
		{
			unknownCheck(); //-- 없는 예매번호 입력 시 화면 전환
		}
		
	} //end reservedCheck method


	// [예매번호 입력] (D,7)
	public void reservedCheck2() throws IOException
	{
		int udIndex = reservedNum.indexOf(bookNumber);
		ReservedData res_ud = ud.get(udIndex);
		System.out.println("[예매내역 확인] ============");
		System.out.println(); 
		System.out.print  ("예매번호  : " + bookNumber);
		System.out.println();
		System.out.println("영화 제목 : " + res_ud.getTitle());
		System.out.println("시간      : " + res_ud.getTime());
		System.out.println("상영관    : " + res_ud.getScreen() + "관");
		System.out.println("인원      : " + res_ud.getInwon() + "명");
		System.out.println("좌석      : " + res_ud.getSeatNumber());
		System.out.println();
		System.out.println("============================");
		System.out.print("0. 이전 메뉴로 돌아가기 : ");

		sel = sc.nextInt();
		System.out.println();

		switch(sel)
		{
			case 0: UmenuDisp(); //-- 이전화면 출력(관람객모드 처음 화면)
		}
		
	} //end reservedcheck2 method


	// 없는 예매번호 입력 시 (D,8)
	public void unknownCheck() throws IOException
	{
		System.out.println("[예매내역 확인] =============");
		
		System.out.println(); 
		System.out.println("존재하지 않는 예매번호입니다.");
		System.out.println("다시 입력해 주세요.");
		System.out.println();

		System.out.println("=============================");
		System.out.println();

		reservedCheck(); 
	}
}