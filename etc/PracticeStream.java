package com.doosan.test.prac;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import com.doosan.test.SampleVO;

public class PracticeStream {
	
	// 1.2 컬렉션 스트림
	// 컬렉션 타입(Collection, List, Set)의 경우 인터페이스에 추가된 디폴트 메소드 stream 을 이용해서 스트림을 만들 수 있다.
	public interface Collection<E> extends Iterable<E> {
		default Stream<E> stream() {
			return StreamSupport.stream(spliterator(), false);
		}
	}
	
	// 1.3 비어있는 스트림
	// 빈 스트림은 요소가 없을 때 null 대신 사용할 수 있다.
	public Stream<String> streamOf(List<String> list) {
		return list == null || list.isEmpty()
				? Stream.empty()
				: list.stream();
	}
	
	
	public static void main(String[] args) {
		// 링크 : https://futurecreator.github.io/2018/08/26/java-8-streams/
		
		/**
		 * 스트림은 '데이터의 흐름'이다. 배열 또는 컬렉션 인스턴스에 함수 여러 개를 조합해서 원하는 결과를 필터링하고 가공된 결과를 얻을 수 있다.
		 * 또한 람다를 이용하여 코드의 양을 줄이고 간결하게 표현할 수 있다. 즉, 배열과 컬렉션ㅇ르 함수형으로 처리할 수 있다.
		 * 
		 * 장정
		 * - 간단하게 병렬처리가 가능하다 : 하나의 작업을 둘 이상의 작업으로 잘게 나눠서 동시에 진행하는 것을 병렬 처리라고 한다. 즉 쓰레드를 이용해 많은 요소들을 빠르게 처리할 수 있다.
		 */
		
		/**
		 * 1. 생성하기 : 스트림 인스턴스 생성.
		 * 2. 가공하기 : 필터링 및 맵핑 등 원하는 결과를 만들어가는 중간 작업.
		 * 3. 겨로가 만들기 : 최종적으로 결과를 만들어내는 작업
		 */
		
		// 1. 생성하기
		// 1.1 배열 스트림
		// 스트림은 배열 또는 컬렉션 인스턴스를 이용해서 생성할 수 있다. 배열은 Arrays.stream 메소드를 사용한다.
		String[] arr = new String[] {"a", "b", "c"};
		Stream<String> stream = Arrays.stream(arr);
		Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3); // 1~2 요소 [b, c]
		
		// 1.2 컬렉션 스트림
		List<String> list = Arrays.asList("a", "b", "c");
		Stream<String> stream_2 = list.stream();
		Stream<String> parallelStream = list.parallelStream(); // 병렬 처리 스트림
		
		// 1.4 Stream.builder()
		// 빌더를 사용하면 스트림에 직접적으로 원하는 값을 넣을 수 있다. 마지막에 build 메소드로 스트림을 리턴한다.
		Stream<String> builderStream = 
				Stream.<String>builder()
				.add("Eric").add("Elena").add("Java")
				.build(); // [Eric, Elena, Java]
		

		// 1.5 Stream.generate()
		// generate 메소드를 이용하면 Supplier<T> 에 해당하는 람다로 값을 넣을 수 있다. Supplier<T> 는 인자는 없고 리턴값만 있는 함수형 인터페이스이며 람다에서 리턴하는 값이 들어간다.
		Stream<String> generatedStream = Stream.generate(() -> "gen").limit(5); // 5개의 "gen"이 들어간 스트림이 생성된다.
		
		// 1.6 Stream.iterate() 
		// iterate 메소드를 이용하면 초기값과 해당 값을 다루는 람다를 이용해서 스트림에 들어갈 요소를 만든다. 요소가 다음 요소의 인풋으로 들어간다. 스트림으 ㅣ사이즈가 무한하기 때문에 특정 사이즈로 재한해야 한다.
		Stream<Integer> iteratedStream = Stream.iterate(30, n -> n + 2).limit(5); // [30, 32, 34, 36, 38]
		
		// 1.7 기본 타입형 스트림
		// 제네릭을 사용하면 리스트나 배열을 이용해서 기본 타입 스트림을 생성할 수 있다. 하지만 제네릭을 사용하지 않고 직접적을 ㅗ해당 타입의 스트림을 다룰 수도 잇다.
		IntStream intStream = IntStream.range(1, 5); // [1, 2, 3, 4]
		LongStream longStream = LongStream.rangeClosed(1, 5); // [1, 2, 3, 4, 5]
		
		// 제네릭을 사용하지 않기 깨문에 불필요한 오토박싱이 일어나지 않습니다. 필요한 경우 boxed 메소드를 이용해서 박싱할 수 있다.
		Stream<Integer> boxedIntStream = IntStream.range(1, 5).boxed();
		
		// Random 클래스는 난수를 가지고 세 가지 타입의 스트림(int, long, double)을 만들어 낼 수 있다.
		DoubleStream doubles = new Random().doubles(3); // 난수 3개 생성
		
		// 1.8 문자열 스트림
		// 문자열을 이용해서 스트림을 생성할 수도 있다. 
		IntStream charsStream = "Stream".chars(); // [83, 116, 114, 101, 97, 109]
		
		// 정규표현식(RegEx)을 이용해서 문자열을 자르고, 각 요소들로 스트림을 만드는 예제
		Stream<String> stringStream = Pattern.compile(", ").splitAsStream("Eric, Elena, Java"); // [Eric, Elena, Java]
		
		// 1.9 파일 스트림
		// 자바 NIO 의 Files 클래스의 lines 메소드는 해당 파일의 각 라인을 스트링 타입의 스트림을 만들어준다.
		try {
			Stream<String> lineStream = Files.lines(Paths.get("file.txt"), Charset.forName("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		// 1.10 병렬 스트림
		// 스트림 생성 시 사용하는 stream 대신 parallelStream 메소드를 사용해서 병렬 스트림을 쉽게 생성할 수 있다. 내부적으로는 쓰레드를 처리하기 위해 자바 7부터 도입된 Fork/Join framework 를 사용한다.
		// 병렬 스트림 생성
		List<Product> productList = new ArrayList();
		Stream<Product> parallelStream_2 = productList.parallelStream();
		
		// 병렬 여부 확인
		boolean isParallel = parallelStream_2.isParallel();
		
		// 각 작업을 쓰레드를 이용해 병렬처리하는 코드이다.
		boolean isMany = parallelStream_2
				.map(product -> product.getAmount() * 10)
				.anyMatch(amount -> amount > 200);
		
		// 배열을 이용해서 병렬 스트림을 생성하는 경우이다.
		Arrays.stream(arr).parallel();
		
		// 컬렉션과 배열이 아닌 경우는 다음과 같이 parallel 메소드를 이용해서 처리한다.
		IntStream intStream_2 = IntStream.range(1, 150).parallel();
		boolean isParallel_2 = intStream_2.isParallel();
		
		// 다시 시퀀셜 모드로 돌리고 싶다면 sequential 메소드를 사용한다. 반드시 병렬 스트림이 좋은 것은 아니다.
		IntStream intStream_3 = intStream.sequential();
		boolean isParallel_3 = intStream_3.isParallel();
		
		// 1.11 스트림 연결하기
		// Stream.concat 메소드를 이용해 두 개의 스트림을 연결해서 새로운 스트림을 만들어 낼 수 있다.
		Stream<String> stream1 = Stream.of("Java", "Scala", "Groovy");
		Stream<String> stream2 = Stream.of("Python", "Go", "Swift");
		Stream<String> concat = Stream.concat(stream1, stream2);
		// [Java, Scala, Groovy, Python, Go, Swift]
		
		// 2. 가공하기
		// 전체 요소 중에서 다음과 같은 API 를 이용해서 내가 원하는 것만 뽑아낼 수 있다. 이러한 가공 단계를 중간 작업이라고 하는데, 이러한 작업은 스트림을 리턴하기 때문에 여러 작업을 이어 붙여서 작성할 수 있다.
		List<String> names = Arrays.asList("Eric", "Elena", "Java");
		
		// 2.1 Filtering
		// 필터는 스트림 내 요소들을 하나씩 평가해서 걸러내는 작업이다. 인자로 받은 Pridicate 는 boolean 을 리턴하는 함수형 인터페이스로 평가식이 들어가게 된다.
		Stream<String> stream_3 = 
				names.stream()
					 .filter(name -> name.contains("a"));
		// [Elena, Java]
		
		// 2.2 Mapping
		// 맵은 스트림 내 요소들을 하나씩 특정 값으로 변환해준다. 이 때 값을 변환하기 위한 람다를 인자로 받는다.
		Stream<String> stream_4 = 
				names.stream()
					 .map(String::toUpperCase);
		// [ERIC, ELENA, JAVA]
		
		Stream<Integer> stream_5 = 
				productList.stream()
						   .map(Product::getAmount);
		
		// map 이외에도 조금 더 복잡한 flatMap 메소드도 있다
		// 인자로 mapper 를 받고 있는데, 리턴 타입이 Stream 이다. 즉, 새로운 스트림을 생성해서 리턴하는 람다를 넘겨야한다. flatMap 은 중첩 구조를 한 단계 제거하고 단일 컬렉션으로 만들어주는 역할을 한다. 이러한 작업을 플래트닝이라고 한다.
		List<List<String>> list_2 = 
				  Arrays.asList(Arrays.asList("a"), 
				                Arrays.asList("b"));
		// [[a], [b]]
		
		// 이를 flatMap 을 사용해서 중첩 구조를 제거한 후 작업할 수 있다.
//		List<String> flatList = 
//				  list_2.stream()
//					    .flatMap(Collection::stream)
//					    .collect(Collectors.toList());
		// [a, b]
		
		// 이번엔 객체에 적용한다.
		// 학생 객체를 가진 스트림에서 학생의 국영수 점수를 뽑아 새로운 스트림을 만들어 평균을 구하는 코드이다.
		// map 메소드 자체만으로는 한 번에 할 수 없는 기능이다.
//		students.stream()
//			.flatMapToInt(student ->
//							IntStream.of(student.getKor(),
//										 student.getEng(),
//										 student.getMath()))
//			.average().ifPresent(avg ->
//							System.out.println(Math.round(avg * 10) / 10.0));
		
		// 2.3 Sorting
		// 정렬의 방법은 다른 정렬과 마찬가지로 Comparator 를 이용한다.
		// 인자없이 그냥 호출할 경우 오름차순으로 정렬한다.
		IntStream.of(14, 11, 20, 39, 23)
			.sorted()
			.boxed()
			.collect(Collectors.toList());
		// [11, 14, 20, 23, 39]
		
		// 인자를 넘기는 경우와 비교해 본다. 스트링 리스트에서 알페벳 순으로 정렬한 코드와 Comparator 를 넘겨서 역순으로 정렬한 코드이다.
		List<String> lang = 
				Arrays.asList("Java", "Scala", "Groovy", "Python", "Go", "Swift");
		
		lang.stream()
			.sorted()
			.collect(Collectors.toList());
		// [Go, Groovy, Java, Python, Scala, Swift]
		
		lang.stream()
			.sorted(Comparator.reverseOrder())
			.collect(Collectors.toList());
		// [Swift, Scala, Python, Java, Groovy, Go]
		
		// Comparator 의 compare 메소드는 두 인자를 비교해서 값을 리턴한다. 이를 이용해서 문자열 길이를 기준으로 정렬한다.
		lang.stream()
			.sorted(Comparator.comparingInt(String::length))
			.collect(Collectors.toList());
		// [Go, Java, Scala, Swift, Groovy, Python]
		
		lang.stream()
			.sorted((s1, s2) -> s2.length() - s1.length())
			.collect(Collectors.toList());
		// [Groovy, Python, Scala, Swift, Java, Go]
		
		// 2.4 Iterating
		// 스트림 내 요소들 각각을 대상으로 특정 연산을 수행하는 메소드로는 peek 이 있다. 'peek'은 그냥 확인해본다는 단어 뜻처럼 특정 결과를 반환하지 않는 함수형 인터페이스 Consumer 를 인자로 받는다.
		// 따라서 스트림 내 요소들 각각에 특정 작업을 수행할 뿐 결과에 영향을 미치지 않는다.
		int sum = IntStream.of(1, 3, 5, 7, 9)
				.peek(System.out::println)
				.sum();
		
		// 3. 결과 만들기
		// 가공한 스트림ㅇ르 가지고 내가 사용할 결과값으로 만들어내는 단계이다. 따라서 스트림을 끝내는 최종 작업이다.
		
		// 3.1 Calculating
		// 스트림 API 는 다양한 종료 작업을 제공한다. 최소, 최대, 합, 평균 등 기본형 타입으로 결과를 만들어낼 수 있다.
		long count = IntStream.of(1, 3, 5, 7, 9).count();
		long sim = LongStream.of(1, 3, 5, 7, 9).sum();
		
		// 만약 스트림이 비어 있는 경우 count 와 sum 은 0을 출력하면 된다. 하지만 평균, 최소, 최대의 경우에는 표현할 수가 없기 때문에 Optional 을 이용해 리턴한다.
		OptionalInt min = IntStream.of(1, 3, 5, 7, 9).min();
		OptionalInt max = IntStream.of(1, 3, 5, 7, 9).max();
		
		// 스트림에서 바로 ifPresent 메소드를 이용해서 Optional 을 처리할 수 있다.
		DoubleStream.of(1.1, 2.2, 3.3, 4.4, 5.5)
			.average()
			.ifPresent(System.out::println);
		
		// 3.2 Reduction
		/**
		 *  스트림은 reduce 라는 메소드를 이용해서 결과를 만들어낸다. 스트림에 있는 여러 요소의 총합을 낼 수도 있다.
		 *  reduce 메소드는 세 가지의 인자를 받을 수 있다.
		 *  accumulator : 각 요소를 처리하는 계산 로직. 각 요소가 올 때마다 중간 결과를 생성하는 로직.
		 *  identity : 계산을 위한 초기값으로 스트림이 비어서 계산할 내용이 없더라도 이 값은 리턴.
		 *  combiner : 병렬 스트림에서 나눠 계산한 결과를 하나로 합치는 동작을 하는 로직 
		 */
		
		// 인자 하나인 경우에서 BinaryOperator<T> 는 같은 타입의 인자 두 개를 받아 같은 타입으 ㅣ결과를 반환하는 함수형 인터페이스이다. 두 값을 더하는 람다를 넘겨준다
		// accumulator
		OptionalInt reduced = 
				IntStream.range(1, 4) // [1, 2, 3]
				.reduce((a, b) -> {
					return Integer.sum(a, b);
				});
		// 6 : (1 + 2 + 3)
		
		// 인자 두 개 받는 경우
		// identity
		int reducedTwoParams = 
				IntStream.range(1, 4) // [1, 2, 3]
				.reduce(10, Integer::sum); // method reference
		// 16 : (10 + 1 + 2 + 3)
		
		// 인자 세 개 받는 경우. 마지막 인자인 combiner 는 실행되지 않는다.
		// combiner
		Integer ReducedParams = Stream.of(1, 2, 3)
				.reduce(10,  // identity
						Integer::sum, // accumlator
						(a, b) -> {
					System.out.println("combiner was called");
					return a + b;
				});
		
		// Combiner 는 병렬 처리 시 각자 다른 쓰레드에서 실행한 결과를 마지막에 합치는 단계이다. 따라서 병렬 스트림에서만 동작한다.
		Integer reducedParallel = Arrays.asList(1, 2, 3)
				.parallelStream()
				.reduce(10,
						Integer::sum,
						(a, b) -> {
							System.out.println("combiner was called");
							return a + b;
						});
		// 결과는 36이 나온다. accumulator 는 촟 세 번 동작한다. 초기값 10에 각 스트림 값을 더한 세 개의 값(10 + 1 = 11, 10 + 2 = 12, 10 + 3 = 13)을 계산한다.
		// Combiner 는 identity와 accumulator 를 가지고 여러 쓰레드에서 나눠 계산한 결과를 합치는 역할이다. 12 + 13 = 25, 25 + 11 = 36 두 번 호출한다.
		/**
		 * combiner was called
		 * combiner was called
		 * 36
		 */
		// 병렬 스트림이 무조건 스퀀셜보다 좋은 것은 아니다. 오히려 간단한 경우에는 이렇게 부가적인 처리가 필요하기 때문에 오히려 느릴 수도 있다.
		
		// 3.3 Collecting
		// collect 메소드는 또 다른 종료 작업이다. Collector 타입의 인자를 받아서 처리를 하는데, 자주 사용하는 작업은 Collectors 객체에서 제공하고 있다.
		List<Product> productList_2 = 
				Arrays.asList(new Product(23, "potatoes"),
							  new Product(14, "orange"),
							  new Product(13, "lemon"),
							  new Product(23, "bread"),
							  new Product(13, "sugar"));
		// 주소값을 반환
		
		// Collectors.toList()
		// 스트림에서 작업한 결과를 담은 리스트로 반환한다.
		List<String> collectorCollection =
				productList_2.stream()
						.map(Product::getName)
						.collect(Collectors.toList());
//		System.out.println(collectorCollection);
		// [potatoes, orange, lemon, bread, sugar]
		
		// Collectors.joining()
		// 스트림에서 작업한 결과를 하나의 스트링으로 이어 붙일 수 있다.
		String listToString = 
				productList_2.stream()
					.map(Product::getName)
					.collect(Collectors.joining());
		// potatoesorangelemonbreadsugar
		
		/**
		 * 또한 세 개의 인자를 받을 수 있다.
		 * delimiter : 각 요소 중간에 들어가 요소를 구분시켜주는 구분자
		 * prefix : 결과 맨 앞에 붙는 문자
		 * suffix : 결과 맨 뒤에 붙는 문자
		 */
		String listToString_2 = 
				productList_2.stream()
				.map(Product::getName)
				.collect(Collectors.joining(",", "<", ">"));
		// <potatoes, orange, lemon, bread, sugar>
		
		// Collectors.averageingInt()
		// 숫자 값의 평균을 낸다
		Double averageAmount = 
				productList_2.stream()
					.collect(Collectors.averagingInt(Product::getAmount));
		// 17.2
		
		// Collectors.summingInt()
		// 숫자값의 합을 낸다.
		Integer summingAmount = 
				productList_2.stream()
					.collect(Collectors.summingInt(Product::getAmount));
		// 86
		Integer summingAmount_2 = 
				productList_2.stream()
					.mapToInt(Product::getAmount)
					.sum(); // 86
		
		// Collectors.summarizingInt()
		// 합계와 평균 모두 한 번에 얻을 수 있는 방법
		IntSummaryStatistics statistics = 
				productList_2.stream()
					.collect(Collectors.summarizingInt(Product::getAmount));
		// IntSummaryStatistics {count=5, sum=86, min=13, average=17.200000, max=23}
		// 갯수, 합계, 평균, 최소, 최대
		
		// Collectors.groupingBy()
		// 특정 조건으로 요소들을 그룹지을 수 있다.
		Map<Integer, List<Product>> collectorMapOfLists =
				productList_2.stream()
					.collect(Collectors.groupingBy(Product::getAmount));
		/**
		 *  {23=[Product{amount=23, name='potatoes'}, 
			     Product{amount=23, name='bread'}], 
			 13=[Product{amount=13, name='lemon'}, 
			     Product{amount=13, name='sugar'}], 
			 14=[Product{amount=14, name='orange'}]}
		 */
		
		// Collectors.paritioningBy()
		// 위의 groupingBy 함수형 인터페이스 Function 을 이용해서 특정 값을 기준으로 스트림 내 요소들을 묶었다면, partitioningBy 는 함수형 인터페이스 Predicate 를 받는다. Predicate 는 인자를 받아서 boolean 값을 반환한다.
		Map<Boolean, List<Product>> mapPartitioned = 
				productList_2.stream()
					.collect(Collectors.partitioningBy(el -> el.getAmount() > 15));
		/**
		 *  {false=[Product{amount=14, name='orange'}, 
			        Product{amount=13, name='lemon'}, 
			        Product{amount=13, name='sugar'}], 
			 true=[Product{amount=23, name='potatoes'}, 
			       Product{amount=23, name='bread'}]}
		 */

		// Collectors.collectingAndThen()
		// 특정 타입으로 결과를 collect 한 이후에 추가 작업이 필요한 경우에 사용할 수 있다. 이 메소드의 시그니쳐는 다음과 같다. finisher 는 collect 를 한 후에 실행할 작업을 의미한다.
		// Collectors.toSet 을 이용해서 결과를 Set 으로 collect 한 후 수정불가한 Set 으로 변환하는 작업하는 코드이다.
		Set<Product> unmodifiableSet = 
				productList_2.stream()
					.collect(Collectors.collectingAndThen(Collectors.toSet(), 
														  Collections::unmodifiableSet));
		
		// Collector.of()
		// collector 를 직접 만들 수도 있다.
		Collector<Product, ?, LinkedList<Product>> toLinkedList =
				Collector.of(LinkedList::new, 
							 LinkedList::add, 
							 (first, second) -> {
								first.addAll(second);
								return first;
							 });
		
		LinkedList<Product> linkedListOfPersons = 
				productList_2.stream()
					.collect(toLinkedList);
		
		// 3.4 Matching
		// 매칭은 조건식 람다 Predicate 를 받아서 해당 조건을 만족하는 요소가 있는지 체크한 결과를 반환한다. 다음과 같은 세 가지 메소드가 있다.
		/**
		 * anyMatch : 하나라도 조건을 만족하는 요소가 있는지
		 * allMatch : 모두 조건을 만족하는지
		 * noneMatch : 모두 조건을 만족하지 않는지
		 */
		List<String> names_2 = Arrays.asList("Eric", "Elena", "Java");
		boolean anyMatch = names_2.stream()
				.anyMatch(name -> name.contains("a"));
		boolean allMatch = names_2.stream()
				.allMatch(name -> name.length() > 3);
		boolean noneMatch = names_2.stream()
				.noneMatch(name -> name.endsWith("s"));
		// 모두 true
		
		// 3.5 Iterating
		// forEach 는 요소를 돌면서 실행되는 최종 작업이다. 보통 System.out.println 메소드를 넘겨서 결과를 출력할 때 사용한다. peek 와는 중간 작업과 최종 작업의 차이가 있다.
		names_2.stream().forEach(System.out::println);
		
		
		
		
		
		PracticeStream ps = new PracticeStream();
		System.out.println("getModelList : " + ps.getModelList());
	}
	
	public List<Map<String, Object>> getModelList() {
		List<Map<String, Object>> returnList = new ArrayList<>();
		List<SampleVO> voList = new ArrayList<>();
		for(int i = 0; i < 4; i++) {
			SampleVO model = new SampleVO();
			model.setNum(1);
			model.setS("s");
			model.setStr("str");
			voList.add(model);
		}
		returnList.addAll(voList.stream().map(this::setMapData).collect(Collectors.toList()));
		return returnList;
	}
	
	private Map<String, Object> setMapData(SampleVO vo) {
		Map<String, Object> returnMap = new HashMap<>();
		returnMap.put("str", vo.getStr());
		returnMap.put("num", vo.getNum());
		returnMap.put("s", vo.getS());
		return returnMap;
	}
}
