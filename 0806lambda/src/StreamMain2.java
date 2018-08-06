import java.util.Arrays;
import java.util.stream.Stream;

public class StreamMain2 {

	public static void main(String[] args) {
		String[] ar = { "김좌진", "김원봉", "남자현", "안중근", "신채호", "안창호", "홍범도", "윤봉길", "이봉창", "안중근" };

		// 스트림 변환
		Stream<String> stream = Arrays.stream(ar);
		// 모든 데이터 출력. 중간연산이라는 것은 stream과 forEach 사이에 집어넣는 것.
		// stream.forEach(name -> {System.out.println(name);});

		// 중복 제거
		// 기존의 방식으로는, 필터링을 하려면 반복문을 만들어서 돌려야 했는데 이 방식은 조건만 입력하면 된다.
//		stream.skip(2).limit(3).distinct().forEach(name -> {
//			System.out.println(name);
//		});

		// '김'으로 시작하는 데이터만 찾아서 출력
		// return 문장 하나밖에 없을 때는 return이라는 단어를 생략가능하다.
		// 수행되는 코드가 한 줄일 때는 {}을 생략가능하다.
//		stream.filter(name -> {
//			if (name.startsWith("김"))
//				return true;
//			else
//				return false;
//		}).forEach(name -> {
//			System.out.println(name);
//		});

		stream.filter(name -> name.length() != 3).forEach(name -> System.out.println(name));

	}
}
