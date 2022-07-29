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

	- Hashtable 클래스와 마찬가지로 Map 인터페이스에서 상속받은
	  Hashtable 클래스의 기능은 Hashtable 과 동일하지만
	  Synchronization 이 없기 때문에 동시성 문제가 없다면
	  (즉, 멀티 스레드 프로그램이 아닌 경우라면)
	  HashMap 을 사용하는 것이 성능을 향상시킬 수 있다

	- 또한, HashMap 은 Hashtable 클래스와 달리 null 을 허용한다
	  
*/

import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test171
{
	public static void main(String[] args) throws IOException
	{
		// HashMap 자료구조 인스턴스 생성
		//HashMap<String, String> map = new HashMap<String, String>();
		Map<String, String> map = new HashMap<String, String>();

		// map 이라는 Hashmap 자료구조에 요소 추가
		// → put();
		map.put("영화", "범죄도시2");
		map.put("드라마", "이태원클라스");
		map.put("만화", "슬램덩크");

		// 테스트 → 더미 확인
		System.out.println(map);
		// → {드라마=이태원클라스, 영화=범죄도시2, 만화=슬램덩크}
		// 데이터 매핑 구조 확인
		// 데이터 요소 격납 순서가 추가 순서와 관계 없음
		

		// ※ null 관련 처리
		//	  아래의 데이터 입력 유형에 따라 모든 종류의 데이터 입력이 가능하지만
		//	  마지막 null 을 key 로 매핑된 "모나리자" 가
		//	  최초 null 을 key 로 매핑하는 null 을 덮어쓰는 상황이 발생하게 된다
		//	  즉, HashMap 은 null 을 하나의 고유한 key 로 간주한다(인식한다)

		// key 와 value 모두 null
		map.put(null, null);
		// 테스트 → 더미 확인
		System.out.println(map);
		// → {null=null, 드라마=이태원클라스, 영화=범죄도시2, 만화=슬램덩크}
		//	   ---------

		// value 가 null
		map.put("동화", null);
		// 테스트 → 더미 확인
		System.out.println(map);
		// → {null=null, 드라마=이태원클라스, 영화=범죄도시2, 동화=null, 만화=슬램덩크}
		//	   ---------									   ---------

		// key 가 null
		map.put(null, "모나리자");
		// 테스트 → 더미 확인
		System.out.println(map);
		// → {null=모나리자, 드라마=이태원클라스, 영화=범죄도시2, 동화=null, 만화=슬램덩크}
		//	   -------------									   ---------

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("카테고리, 타이틀 입력(컴마 구분) : ");
		String[] temp;

		for (String str; ((str = br.readLine()) != null); )
		{
			temp = str.split(",");
			if (temp.length < 2)
			{
				System.out.print("카테고리, 타이틀 입력(컴마 구분) : ");
				continue;
			}

			map.put(temp[0].trim(), temp[1].trim());
			System.out.println(map);
		}
	}
}