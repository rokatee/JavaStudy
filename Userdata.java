import java.util.Scanner;
import java.util.Random;
import java.util.Vector;
import java.util.Arrays;

class UserData
{
	protected Integer sel;		//-- 사용자 선택 값(정수형)
	protected String p_id;		//-- 특정 동작을 수행하기 위한 process id 변수 선언

	// 상영관에서 상영할 영화의 정보를 담는 배열
	static MovieData[] screen = new MovieData[3];

	public void setScreen(MovieData[] m)
	{
		screen = m;
	}

	// 예매하기 기능에서 예매번호 부여받는 화면에서 필요한 변수 선언
	//protected int num;			//-- 임시저장 변수, timePick() 에서 사용할 변수, 사용자가 선택한 시간대 값
	protected String tempTitle;		//-- 영화 검색 시, 사용자가 입력한 영화 제목 값
	protected int tempScreen;		//-- 사용자가 선택한 영화의 상영관 값
	protected int tempRound;		//-- 사용자가 선택한 영화의 회차 값
	protected int runTime;			//-- 영화별 러닝타임
	protected Vector<String> reservedNum = new Vector<String>();	//-- 예매번호 생성 시(난수 발생 시) 사용할 벡터
	protected Vector<reservedData> ud = new Vector<reservedData>();	//-- 사용자 예매하기 완료 화면에서 입력한 값들(예매정보) 을 저장하는 벡터

	//====================================================================================================================================
	protected String tempTime;		//-- 사용자가 선택한 시간 값
	//====================================================================================================================================

	// 좌석 선택 화면에서 사용하는 변수
	protected String tempSeat;		//-- 사용자가 선택한 자리
	protected int adult;			//-- 성인
	protected int teenager;			//-- 청소년
	protected int kid;				//-- 어린이
	protected int total;			//-- 총 인원 (선택한 성인 + 청소년 + 어린이 값)
	protected boolean[][][] seatInfos = new boolean[15][5][5];	//-- 영화 회차당 좌석정보 [총 영화 상영 회차][행][열]
	
	//====================================================================================================================================
	protected String adminPassword = "java002$";	//-- 초기화면(A,12) 의 관리자 비밀번호

	protected String bookNumber;	//-- 예매취소 메뉴에서 사용자가 입력한 값(예매번호) 저장할 변수
}