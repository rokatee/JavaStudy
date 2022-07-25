/*
■■■ 자바의 주요(중요) 클래스 ■■■
	- 자바에서 기본적으로 제공하는 주요 클래스들
	- 문자열 관련 클래스
	- 캐릭터 셋(CharacterSet)
*/

/*
■ 캐릭터 셋(CharacterSet)

	○ 유니코드(Unicode)

		국제 표준으로 제정된 2바이트 계의 만국 공통의 국제 문자부호
		체계(UCS : Universal Code System)를 말한다
		애플컴퓨터, IBM, 마이크로소프트 등이 컨소시엄으로 설립한
		유니코드(Unicode)가 1990년에 첫 버전을 발표하였고
		ISO/IEC JTC1에서 1995년 9월 국제표준으로 제정하였다
		공식 명칭은 ISO/IEC 10646-1(Universal Multiple-Octet Coded Character Set)이다

		데이터의 교환을 원활하게 하기 위하여 문자 1개에 부여되는 값을
		16비트로 통일하였다
		코드의 1문자 당 영어는 7비트 비영어는 8비트
		한글이나 일본어는 16빝트의 값을 가지게 되는데
		이들을 모두 16비트로 통일한 것이다


	○ UTF-8 과 UTF-16

		UTF-8 과 UTF-16의 차이를 한 마디로 말하면
		문자를 표현할 때의 단위가 다르다는 것이다
		UTF-8 은 8비트 가변장 멀티바이트에서 문자를 표현하고,
		UTF-16 은 16비트 가변장 멀티바이트에서 문자를 표현한다

		- UTF-8(8bit UCS Transformation Format)
		  웹에서 기본적으로 사용하는 코드
		  UCS-2로 정의되는 문자 집합을 이용하여 기술된 문자열을
		  바이트 열로 변환하는 방식의 1개 1문자를 1-6 바이트 가변장
		  멀티바이트로 변환한다
			
		- UTF-16(16bit UCS Transformation Format)
		  자바의 기본 코드, 자바에서는 문자 하나를 저장하면 바이트 수는
		  영문자이든, 한글문자이든 2바이트를 차지하게 된다
		  UCS-2 로 정의되는 문자 집합을 이용하여 기술된 문자열에
		  UCS-4 의 일부의 문자를 채워넣기 위한 인코딩 방식
		  UTF-8 과 병용할 수 있다
		  UCS-2 로 이용할 수 있는 문자 수를 대폭 늘릴 수 있다

		※ 자바단에서는 UTF-16 을 사용하고 웹에서는 UTF-8 을 사용하기 때문에
		   경우에 따라 변환해야 하는 상황이 발생할 수 있다


■ 문자 코드의 종류

	○ KSC5601
		한글 완성형 표준(한글 2,350 자 표현)
		한국 공업표준 정보처리분야(C)의 5601번 표준안

	○ KSC5636
		영문자에 대한 표준
		한국공업표준 정보처리분야(C)의 5636번 표준안
		기존 ASCII Code 에서 역슬래시(\)를 원(￦) 표시로 대체

	○ EUC-KR(MS949)
		Bell-Laboratiries 에서 유닉스 상에서 영문자 이외의 문자를
		지원하기 위해 제안한 확장 유니코드(Extend UNIX Code) 중
		한글 인코딩 방식
		영문은 KSC5636 으로 처리하고, 한글은 KC5601 로 처리
		즉, EUC-KR(MS949) = KC5636 + KC5601
	
	○ UTF-8
		영문과 숫자는 1바이트, 한글은 3바이트로 표현
		(웹에서 많이 사용. UTF-8 형식으로 JSP를 작성할 때에는
		파일도 UTF-8 형식으로 저장해야 한다)

	○ UTF-16
		자바 기본 문자 코드
		영문과 숫자는 1바이트, 한글은 2바이트로 표현

	○ ISO-8859-1
		서유럽 언어 표기에 필요한 US-ASCII 에 없는
		94개 글자의 순차적 나열
*/

import java.io.UnsupportedEncodingException;

public class Test141
{
	public static void main(String[] args) throws UnsupportedEncodingException
	{
		byte[] buf;
		String name = new String("최동현");

		System.out.println("디폴트 캐릭터셋 : " + System.getProperty("file.encoding"));
		// → 디폴트 캐릭터셋 : MS949
		
		// String.getBytes()
		//	: 디폴트 캐릭터셋으로 바이트 배열을 반환하는 메소드
		buf = name.getBytes();

		System.out.println("Length : " + buf.length);
		// → Length : 6
		// 6개의 방이 생겼으므로, 한 글자 당 2개씩 쪼개짐

		for (byte b : buf)
			System.out.println("[" + b + "]");
		System.out.println();
		// →
		/*
			[-61]
			[-42]
			[-75]
			[-65]
			[-57]
			[-10]
		*/

		// UTF-8 캐릭터셋으로 바이트 배열을 반환
		buf = name.getBytes("utf-8");
		// → 컴파일 에러 발생 → UnsupportedEncodingException → 88번 줄에서 예외로 던져줌으로서 해결
		
		// → 예외 처리 후 다시 확인
		System.out.println("Length : " + buf.length);
		// → Length : 9

		for (byte b : buf)
			System.out.println("[" + b + "]");
		System.out.println();
		// →
		/*
			[-20]
			[-75]
			[-100]
			[-21]
			[-113]
			[-103]
			[-19]
			[-104]
			[-124]
		*/

		// new String("최동현");
		// new String(바이트배열, 인코딩 방식);
		// new String(buf, "utf-8");

		// utf-8 형태로 저장된 바이트 배열을
		// String 객체로 파라미터 값 utf-8 을 부여하여 생성
		// → 즉, utf-8 기반으로 buf 바이트배열을 합쳐
		//	  문자열 객체 생성한 후 이름 출력
		System.out.println("Value 1 : " + new String(buf, "utf-8"));
		// → Value 1 : 최동현

		System.out.println();	// 개행
		
		// utf-8 형태로 저장된 바이트 배열을
		// String 객체로 파라미터 값 없이
		// 디폴트 캐릭터셋(MS949)을 부여하여 생성
		System.out.println("Value 2 : " + new String(buf));
		// → Value 2 : 理쒕룞?쁽

		System.out.println();	// 개행

		String convert = new String(name.getBytes("euc-kr"), "utf-8");
		System.out.println("Value 3 : " + convert);
		// → Value 3 : ?????;
		
		buf = convert.getBytes();
		System.out.println("Length : " + buf.length);
		// → Length : 5
		
		buf = convert.getBytes("utf-8");
		System.out.println("Length : " + buf.length);
		// → Length : 14

		/*
		※ check!!
			
			euc-kr 을 utf-8 로 변환하겠다는 의도로
			위와 같이 코딩을 해버리면
			이러한 변환(잘못된 변환) 으로 인해 배열이 깨져서
			euc-kr 이든 utf-8 이든
			어떠한 바이트 배열로 읽어오든
			결과물이 깨져있는 것을 확인할 수 있다

			이미 깨져서 생성된 String 객체의 바이트 배열은
			어떤 방식으로든 복구가 불가능하다
		*/
	}
}