import java.io.IOException;

public class UserCheck extends UserCall
{

	// [예매내역 확인]하는 메서드 (C,7)
	public void reservedCheck() throws IOException
	{
		System.out.println(); 
		System.out.println("[예매내역 확인] ==============================");
		System.out.println();
		System.out.println("예매번호를 입력해주세요.");
		System.out.println();	
		System.out.println("==============================================");	
		System.out.println("0. 이전 메뉴로 돌아가기");
		System.out.println();
		System.out.print("예매번호 : ");

		bookNumber = sc.next();		// 사용자가 입력한 예매번호를 저장(임시저장변수 bookNumber)
		//System.out.println();
		
		
		if (reservedNum == null)	// 생성한 예매번호들의 값을 저장해놓은 reservedNum 벡터 구조에 아무것도 없을 경우
		{
			unknownCheck();			// 존재하지 않는 예매번호라고 출력하는 unknownCheck() 메소드 화면으로 전환
			return;					// 기능이 계속 이어지지 않도록 화면 전환 후 return 을 추가하여 프로그램 종료
		}
		
		if (bookNumber.equals("0"))	// 사용자가 입력한 값이 0 인 경우
		{
			UmenuDisp();	//-- 이전화면 출력(관람객모드 처음 화면)
		}
		else if (reservedNum.contains(bookNumber)==true) //-- bookNumber 문자값(예매번호) 과 동일한 값이 reservedNum(벡터) 안에 있는 경우
		{
			reservedCheck2(); //-- 다음 화면(예매내역 확인 화면 D열) 전환
		}
		else
		{
			unknownCheck(); //-- 없는 예매번호 입력 시 화면 전환(bookNumber 문자값(예매번호) 과 동일한 값이 reservedNum(벡터) 안에 없는 경우)
		}
		
	} //end reservedCheck method


	// [예매번호 입력] (D,7)
	public void reservedCheck2() throws IOException
	{
		int udIndex = reservedNum.indexOf(bookNumber);	// 사용자가 입력한 예매번호(bookNumber)와 동일한 값이 
														// reservedNum 벡터구조의 몇 번째에 위치하고 있는지 찾아서 위치값을 저장
		ReservedData res_ud = ud.get(udIndex);			// ReservedData 벡터구조에 저장된 값을 가져오기 위한 구문, (벡터구조에서) 위에서 찾은 위치값을 가져와라
		System.out.println(); 
		System.out.println("[예매내역 확인] ==============================");
		System.out.println(); 
		System.out.print  ("예매번호  : " + bookNumber);				// 사용자가 입력한 예매번호
		System.out.println();
		System.out.println("영화 제목 : " + res_ud.getTitle());			// 위에서 찾은 벡터의 위치값에 저장된 영화제목을 가져옴
		System.out.println("시간      : " + res_ud.getTime());			//									  시간을 가져옴
		System.out.println("상영관    : " + res_ud.getScreen() + "관"); //									  상영관을 가져옴
		System.out.println("인원      : " + res_ud.getInwon() + "명");  //									  인원을 가져옴
		System.out.println("좌석      : " + res_ud.getSeatNumber());    //									  좌석정보를 가져옴
		System.out.println();
		System.out.println("==============================================");	
		System.out.print("0. 이전 메뉴로 돌아가기 : ");

		sel = sc.nextInt();			// 사용자가 현재 화면에서 입력한 값 저장
		//System.out.println();

		switch(sel)
		{
			case 0: UmenuDisp(); //-- 입력한 값이 0인 경우 관람객모드 처음 화면으로 전환
		}
		
	} //end reservedcheck2 method


	// 없는 예매번호 입력 시 (D,8)
	public void unknownCheck() throws IOException
	{
		System.out.println(); 
		System.out.println("[예매내역 확인] ==============================");
		
		System.out.println(); 
		System.out.println("존재하지 않는 예매번호입니다.");
		System.out.println("다시 입력해 주세요.");
		System.out.println();

		System.out.println("==============================================");
		//System.out.println();

		reservedCheck();  // 재입력 할 수 있도록 메소드 호출로 화면전환
	}
}