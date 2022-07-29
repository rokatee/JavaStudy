/*
■■■ 컬렉션(Collection) ■■■
*/

/*
○ Map → Hashtable, HashMap
	
	- 두 개의 기능은 비슷. 해시테이블은 동기화 기능이 있고 해시맵은 동기화 기능이 없다.
	
	- java.util.Map 인터페이스는
	  키(key)를 값(value)에 매핑(mapping)하여
	  동일한 키를 등록할 수 없고, 유일해야 하며,
	  각 키는 한 개의 값만을 매핑해야 한다
	  즉, 하나의 키에 대응하는 하나의 값을 갖는 자료구조이다


○ Hashtable<K, V> 클래스
	
	- 해시테이블 구조를 객체 모델링한 클래스로
	  검색이 용이하기 때문에 사용 빈도가 높은 편에 속한다

	- 해시테이블이란 키(key)와 그에 상응하는 데이터(value)로
	  구분된 데이터 구조이다
	
	- 데이터를 저장하고, 검색하기 위해서 키(key)로 접근하며
	  이 구조에서는 키 값을 부여하면 해당 데이터가 변환된다
	
	- 또한, Hashtable 클래스는 key 또는 value 의 값으로 null 을 허용하지 않는다!!!
*/

import java.util.Hashtable;

public class Test170
{
	private static final String[] names
		= {"유재석", "박명수", "정준하", "정형돈", "노홍철", "하하"};

	private static final String[] tels
		= {"010-7202-6306", "010-2546-0266", "010-7236-0813"
			, "010-4016-6208", "010-4051-5510", "010-6375-7524"};


	public static void main(String[] args)
	{
		// Hashtable 자료구조 인스턴스 생성
		Hashtable<String, String> ht = new Hashtable<String, String>();
		
		// ht 라는 Hashtable 자료구조에
		// 배열(names, tels)에 담겨있는 데이터를 요소로 담아내기
		// → put(k, v);
		for (int i = 0; i < names.length; i++)
		{
			ht.put(names[i], tels[i]);
		}

		// ht 라는 Hashtable 자료구조에서
		// key 를 이용하여 데이터 검색
		// → get(k);
		String findName1 = "유재석";
		String str = ht.get(findName1);
		if (str != null)
		{
			System.out.println(findName1 + " 전화번호 : " + str);
		}
		//else
		//{
		//	System.out.println("찾는 이름이 없습니다");
		//}
		System.out.println();
		// → 유재석 전화번호 : 010-7202-6306

		// ht 라는 Hashtable 자료구조에... key 가 존재하는지의 여부 확인
		// → containsKey()
		String findName2 = "강호동";

		if (ht.containsKey(findName2))
			System.out.println(findName2 + " 데이터가 존재합니다");
		else
			System.out.println(findName2 + " 데이터가 존재하지 않습니다");
		System.out.println();
		// → 강호동 데이터가 존재하지 않습니다

		String findName3 = "박명수";
		if (ht.containsKey(findName3))
			System.out.println(findName3 + " 데이터가 존재합니다");
		else
			System.out.println(findName3 + " 데이터가 존재하지 않습니다");
		System.out.println();
		// → 박명수 데이터가 존재합니다


		// ht 라는 Hashtable 자료구조에.. value 가 존재하는지의 여부 확인
		// → contains()
		String findTel1 = "010-2546-0266";
		if (ht.contains(findTel1))
			System.out.println(findTel1 + " 데이터가 존재합니다");
		else
			System.out.println(findTel1 + " 데이터가 존재하지 않습니다");
		System.out.println();
		// → 010-2546-0266 데이터가 존재합니다

		
		// ht 라는 Hashtable 자료구조에서 노홍철 데이터 삭제
		// → remove()
		ht.remove("노홍철");

		// ※ remove() 메소드는 인자값으로 key 를 넘겨받지만
		//	  이 때, key 만 삭제되는 것이 아니다
		//	  해당 key 와 연결되어(매핑되어) 있는 value 도 함께 remove() 된다

		// 삭제(remove()) 이후 key 가 존재하는지 확인
		if (ht.containsKey("노홍철"))
			System.out.println("노홍철이 존재합니다");
		else
			System.out.println("노홍철이 존재하지 않습니다");
		System.out.println();
		// → 데이터가 존재하지 않습니다

		// 삭제(remove()) 이후 value 가 존재하는지 확인
		if (ht.contains("010-4051-5510"))
			System.out.println("노홍철 전화번호가 존재합니다");
		else
			System.out.println("노홍철 전화번호가 존재하지 않습니다");
		System.out.println();
		// → 노홍철 전화번호가 존재하지 않습니다

		// ※ null 관련 처리
		//ht.put(null, null);						// key, value 모두 null
		// → 런타임 에러 : NullPointerException
		
		//ht.put("이수근", null);					// value 가 null
		// → 런타임 에러 : NullPointerException

		//ht.put(null, "010-1234-5678");			// key 가 null
		// → 런타임 에러 : NullPointerException

		// 중복된 key 입력
		ht.put("정준하", "010-1111-1111");
		System.out.println(ht.get("정준하"));
		System.out.println();
		// → 010-1111-1111
		// 중복된 key 를 활용하여 데이터를 입력할 경우
		// 기존 "010-7236-0813" 에서 "010-1111-1111" 로 변경되었음을 확인
		// (덮어쓰기 개념)


		// 중복된 value 입력
		ht.put("은지원", "010-7202-6306");
		System.out.println(ht.get("유재석"));
		// → 010-7202-6306
		System.out.println(ht.get("은지원"));
		// → 010-7202-6306
		// ※ value 는 중복된 값이 입력되더라도 기존 데이터에 아무런 영향을 미치지 않음
		
	}
}