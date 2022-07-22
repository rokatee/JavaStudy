/*
■■■ 자바의 주요(중요) 클래스 ■■■
	- 자바에서 기본적으로 제공하는 주요 클래스들
	- String 클래스
*/

public class Test137
{
	public static void main(String[] args)
	{
		String s = "seoul korea";
		System.out.println("s : " + s);
		// → s : seoul korea


		// ○ 문자열 추출
		System.out.println(s.substring(6,9));
		// → kor

		// ※ String.substring(s, e)
		//	  String 문자열을 대상으로
		//	  s 번째에서... e-1 번째까지 추출
		//	  (단, 인덱스는 0 부터 시작)

		System.out.println(s.substring(7));
		// → orea

		// ※ String.substring(s)
		//	  String 문자열을 대상으로
		//	  s 번째에서... 끝까지 추출
		//	  (단, 문자열이 가진 길이만큼)


		// ○ 문자열의 데이터(값) 비교
		System.out.println(s.equals("seoul korea"));
		System.out.println(s.equals("seoul Korea"));
		// → true
		//    false
		//	대소문자 엄격히 구분

		System.out.println(s.equalsIgnoreCase("SEOUL KOREA"));
		// → true
		//	대소문자 구분 안함

		// ○ 찾고자 하는 대상 문자열(s)에
		//	  "kor" 문자열이 존재할까?
		//	  존재한다면.. 그 위치는 어떻게 될까?
		
		// "seoul korea"
		// 0123456789
		
		System.out.println(s.indexOf("kor"));
		// → 6

		System.out.println(s.indexOf("ea"));
		// → 9

		System.out.println(s.indexOf("e"));
		// → 1
		// 먼저 찾은 문자열의 인덱스를 반환하고 종료

		System.out.println(s.indexOf("tt"));
		// → -1
		// 찾고자 하는 문자열이 대상 문자열에 존재할 경우
		// 그 문자열의 인덱스를 반환하지만
		// 존재하지 않을 경우 음수를 반환하게 된다 (-1)
		
		// ○ 대상 문자열(s)이 rea 로 끝나는지의 여부 확인
		//	  (true / false)
		System.out.println(s.endsWith("rea"));
		System.out.println(s.endsWith("oul"));
		// → true
		//    false

		// ○ 찾고자 하는 대상 문자열(s)에
		//	  "e" 문자열이 존재할까?
		//	  존재한다면... 그 위치는 어떻게 될까?
		//	  (단, 뒤에서 부터 검사)

		// seoul korea
		System.out.println(s.indexOf("e"));
		// → 1
		System.out.println(s.indexOf("o"));
		// → 2
		System.out.println(s.lastIndexOf("e"));
		// → 9
		System.out.println(s.lastIndexOf("o"));
		// → 7

		// ○ 대상 문자열(s) 중
		//	  6 번째 인덱스 위치의 문자는?

		// seoul korea
		System.out.println(s.charAt(6));
		// → k

		//System.out.println(s.charAt(22));
		// → 런타임 에러
		//	  StringIndexOutOfBoundsException
		
		// ○ 대상 문자열(s)과 비교 문자열 "seoul corea 중
		//	  어떤 문자열이 더 큰가?	→ 문자열에 대한 크기 비교
		//	   → 두 문자열이 같다면    → 0
		//	   → 두 문자열이 다르다면  → 차이를 확인(사전식 배열)
		System.out.println(s.compareTo("seoul korea"));
		// → 0 → 두 문자열이 같다 (s 와 "seoul korea" 가...)
		System.out.println(s.compareTo("seoul corea"));
		// → 8
		// c ~ k → defghijk → 8
		
		// ○ 대상 문자열(s) 중
		//	  해당 문자열을 찾아서 원하는 형태로 수정된 문자열 반환
		s = "무한도전 유재석 박명수 유재석 박명수";
		s = s.replaceAll("유재석", "박명수");
		System.out.println("처리결과 : " + s);
		// → 처리결과 : 무한도전 박명수 박명수 박명수 박명수

		// ○ 공백 제거
		s = "          사          랑          ";
		System.out.println("|" + s + "|");			// 시각적으로 s의 출력결과 끝부분이 어디인지 알기 위함
		// → |          사          랑          |

		System.out.println("|" + s.trim() + "|");
		// → |사          랑|
		// 양쪽 가장자리 공백 제거

		
		
		
		
	}
}