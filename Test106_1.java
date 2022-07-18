/*
■■■ 주민등록번호 유효성 검사 ■■■
*/

/*
○ 주민등록번호 검증 공식
	①. 마지막 자리를 제외한 앞자리 수를 규칙에 맞게 곱한다
		123456-1234567 (주민번호)
		****** *******	---------------------각 자릿수에 곱하기
		234567 892345  (각 자리에 곱해질 수)
	
	②. 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다
		
	ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
		* * * * * *   * * * * * *
		2 3 4 5 6 7   8 9 2 3 4 5
		----------------------------
	→ 14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15
		= 217

	③. 더해진 결과값을 11로 나누어 '나머지'를 취한다.
		→ 8
	
	④. 11에서 나머지 8을 뺀 결과값을 구한다
		→ 3

		※④-1. 
			③(21번줄)의 처리 과정에서 나머지가 0인 경우 → 11 - 0 → 11
									   나머지가 1인 경우 → 11 - 1 → 10

			이를 다시 10으로 나누어 나머지를 취한다			11 → 1
															10 → 0

	⑤. ④(24번줄)의 연산 결과가 주민번호를 구성하는 마지막 숫자와
	일치하는지의 여부를 비교하여 확인한다

		일치   → 유효한 주민번호
		불일치 → 잘못된 주민번호



실행 예)
주민번호 입력(xxxxxx - xxxxxxx) : 123456 - 12345678 → 입력 개수 초과
>> 입력 오류
계속하려면...

주민번호 입력(xxxxxx - xxxxxxx) : 123456 - 123456 → 입력 개수 미달
>> 입력 오류
계속하려면...

주민번호 입력(xxxxxx - xxxxxxx) : 123456 - 12345667 → 유효한 주민번호
>> 잘못된 주민번호
계속하려면...

주민번호 입력(xxxxxx - xxxxxxx) : 123456 - 1234567 → 유효한 주민번호
>> 정확한 주민번호
계속하려면...


※ 문제 해결을 위한 추가 팁
	배열.length				→ 배열의 길이(배열방의 개수) 반환 → 속성값
	문자열.length()			→ 문자열의 길이 반환				→ 메소드
	문자열.substring()		→ 문자열 추출
	문자열.substring(m, n)	→ 문자열 m번째 위치에서 n-1번째 위치까지 추출(인덱스는 0부터)
	문자열.substring(m)		→ 문자열 m번째 위치에서 문자열의 끝까지 추출(인덱스는 0부터)

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test106_1
{
	public static void main(String[] args) throws IOException
	{
		/*
		String strTemp = "김인교";
		System.out.println(strTemp.length());
		// → 3
		
		strTemp = "동해물과 백두산이";
		System.out.println(strTemp.length());
		// → 9 (공백 포함)

		strTemp = "study-hard";
		System.out.println(strTemp.length());
		// → 10 (공백 포함)
		
		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(13, 17));
		// → NOPQ
		//System.out.println(strTemp.substring(13, 57));
		// → 런타임 에러(범위 초과)
		//		StringIndexOutOfBoundsException:

		System.out.println(strTemp.substring(13));
		// → NOPQRSTUVWXYZ
		*/

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;

		int[] temp = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};

		int sum = 0;

		System.out.print("주민번호 입력(xxxxxx-yyyyyy) : ");
		str = br.readLine();

		// 주민번호 길이가 숫자(13개)와 "-"(1개)의 합인 14자리인지 확인
		if (str.length() != 14)
		{
			System.out.println(">> 입력오류~!!!");
			return;
		}

		for (int i = 0; i < 13; i++)
		{
			if (i == 6)		// '-' 부분을 패스하기 위한 구문
				continue;
			sum += temp[i] * Integer.parseInt(str.substring(i,(i+1)));
		}

		int total = 11 - sum % 11;
		if(total == 10) total = 0;
		if(total == 11) total = 1;

		if (total == Integer.parseInt(str.substring(13)))
			System.out.println("정확한 주민번호");
		else
			System.out.println("잘못된 주민번호");

		
	}
}