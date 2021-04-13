package com.doosan.test.prac;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class PracticeStream {
	
	// 1.2 �÷��� ��Ʈ��
	// �÷��� Ÿ��(Collection, List, Set)�� ��� �������̽��� �߰��� ����Ʈ �޼ҵ� stream �� �̿��ؼ� ��Ʈ���� ���� �� �ִ�.
	public interface Collection<E> extends Iterable<E> {
		default Stream<E> stream() {
			return StreamSupport.stream(spliterator(), false);
		}
	}
	
	// 1.3 ����ִ� ��Ʈ��
	// �� ��Ʈ���� ��Ұ� ���� �� null ��� ����� �� �ִ�.
	public Stream<String> streamOf(List<String> list) {
		return list == null || list.isEmpty()
				? Stream.empty()
				: list.stream();
	}
	
	
	public static void main(String[] args) {
		// ��ũ : https://futurecreator.github.io/2018/08/26/java-8-streams/
		
		/**
		 * ��Ʈ���� '�������� �帧'�̴�. �迭 �Ǵ� �÷��� �ν��Ͻ��� �Լ� ���� ���� �����ؼ� ���ϴ� ����� ���͸��ϰ� ������ ����� ���� �� �ִ�.
		 * ���� ���ٸ� �̿��Ͽ� �ڵ��� ���� ���̰� �����ϰ� ǥ���� �� �ִ�. ��, �迭�� �÷��Ǥ��� �Լ������� ó���� �� �ִ�.
		 * 
		 * ����
		 * - �����ϰ� ����ó���� �����ϴ� : �ϳ��� �۾��� �� �̻��� �۾����� �߰� ������ ���ÿ� �����ϴ� ���� ���� ó����� �Ѵ�. �� �����带 �̿��� ���� ��ҵ��� ������ ó���� �� �ִ�.
		 */
		
		/**
		 * 1. �����ϱ� : ��Ʈ�� �ν��Ͻ� ����.
		 * 2. �����ϱ� : ���͸� �� ���� �� ���ϴ� ����� ������ �߰� �۾�.
		 * 3. �ܷΰ� ����� : ���������� ����� ������ �۾�
		 */
		
		// 1. �����ϱ�
		// 1.1 �迭 ��Ʈ��
		// ��Ʈ���� �迭 �Ǵ� �÷��� �ν��Ͻ��� �̿��ؼ� ������ �� �ִ�. �迭�� Arrays.stream �޼ҵ带 ����Ѵ�.
		String[] arr = new String[] {"a", "b", "c"};
		Stream<String> stream = Arrays.stream(arr);
		Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3); // 1~2 ��� [b, c]
		
		// 1.2 �÷��� ��Ʈ��
		List<String> list = Arrays.asList("a", "b", "c");
		Stream<String> stream_2 = list.stream();
		Stream<String> parallelStream = list.parallelStream(); // ���� ó�� ��Ʈ��
		
		// 1.4 Stream.builder()
		// ������ ����ϸ� ��Ʈ���� ���������� ���ϴ� ���� ���� �� �ִ�. �������� build �޼ҵ�� ��Ʈ���� �����Ѵ�.
		Stream<String> builderStream = 
				Stream.<String>builder()
				.add("Eric").add("Elena").add("Java")
				.build(); // [Eric, Elena, Java]
		

		// 1.5 Stream.generate()
		// generate �޼ҵ带 �̿��ϸ� Supplier<T> �� �ش��ϴ� ���ٷ� ���� ���� �� �ִ�. Supplier<T> �� ���ڴ� ���� ���ϰ��� �ִ� �Լ��� �������̽��̸� ���ٿ��� �����ϴ� ���� ����.
		Stream<String> generatedStream = Stream.generate(() -> "gen").limit(5); // 5���� "gen"�� �� ��Ʈ���� �����ȴ�.
		
		// 1.6 Stream.iterate() 
		// iterate �޼ҵ带 �̿��ϸ� �ʱⰪ�� �ش� ���� �ٷ�� ���ٸ� �̿��ؼ� ��Ʈ���� �� ��Ҹ� �����. ��Ұ� ���� ����� ��ǲ���� ����. ��Ʈ���� �ӻ���� �����ϱ� ������ Ư�� ������� �����ؾ� �Ѵ�.
		Stream<Integer> iteratedStream = Stream.iterate(30, n -> n + 2).limit(5); // [30, 32, 34, 36, 38]
		
		// 1.7 �⺻ Ÿ���� ��Ʈ��
		// ���׸��� ����ϸ� ����Ʈ�� �迭�� �̿��ؼ� �⺻ Ÿ�� ��Ʈ���� ������ �� �ִ�. ������ ���׸��� ������� �ʰ� �������� ���ش� Ÿ���� ��Ʈ���� �ٷ� ���� �մ�.
		IntStream intStream = IntStream.range(1, 5); // [1, 2, 3, 4]
		LongStream longStream = LongStream.rangeClosed(1, 5); // [1, 2, 3, 4, 5]
		
		// ���׸��� ������� �ʱ� ������ ���ʿ��� ����ڽ��� �Ͼ�� �ʽ��ϴ�. �ʿ��� ��� boxed �޼ҵ带 �̿��ؼ� �ڽ��� �� �ִ�.
		Stream<Integer> boxedIntStream = IntStream.range(1, 5).boxed();
		
		// Random Ŭ������ ������ ������ �� ���� Ÿ���� ��Ʈ��(int, long, double)�� ����� �� �� �ִ�.
		DoubleStream doubles = new Random().doubles(3); // ���� 3�� ����
		
		// 1.8 ���ڿ� ��Ʈ��
		// ���ڿ��� �̿��ؼ� ��Ʈ���� ������ ���� �ִ�. 
		IntStream charsStream = "Stream".chars(); // [83, 116, 114, 101, 97, 109]
		
		// ����ǥ����(RegEx)�� �̿��ؼ� ���ڿ��� �ڸ���, �� ��ҵ�� ��Ʈ���� ����� ����
		Stream<String> stringStream = Pattern.compile(", ").splitAsStream("Eric, Elena, Java"); // [Eric, Elena, Java]
		
		// 1.9 ���� ��Ʈ��
		// �ڹ� NIO �� Files Ŭ������ lines �޼ҵ�� �ش� ������ �� ������ ��Ʈ�� Ÿ���� ��Ʈ���� ������ش�.
		try {
			Stream<String> lineStream = Files.lines(Paths.get("file.txt"), Charset.forName("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		// 1.10 ���� ��Ʈ��
		// ��Ʈ�� ���� �� ����ϴ� stream ��� parallelStream �޼ҵ带 ����ؼ� ���� ��Ʈ���� ���� ������ �� �ִ�. ���������δ� �����带 ó���ϱ� ���� �ڹ� 7���� ���Ե� Fork/Join framework �� ����Ѵ�.
		// ���� ��Ʈ�� ����
		List<Product> productList = new ArrayList();
		Stream<Product> parallelStream_2 = productList.parallelStream();
		
		// ���� ���� Ȯ��
		boolean isParallel = parallelStream_2.isParallel();
		
		// �� �۾��� �����带 �̿��� ����ó���ϴ� �ڵ��̴�.
		boolean isMany = parallelStream_2
				.map(product -> product.getAmount() * 10)
				.anyMatch(amount -> amount > 200);
		
		// �迭�� �̿��ؼ� ���� ��Ʈ���� �����ϴ� ����̴�.
		Arrays.stream(arr).parallel();
		
		// �÷��ǰ� �迭�� �ƴ� ���� ������ ���� parallel �޼ҵ带 �̿��ؼ� ó���Ѵ�.
		IntStream intStream_2 = IntStream.range(1, 150).parallel();
		boolean isParallel_2 = intStream_2.isParallel();
		
		// �ٽ� ������ ���� ������ �ʹٸ� sequential �޼ҵ带 ����Ѵ�. �ݵ�� ���� ��Ʈ���� ���� ���� �ƴϴ�.
		IntStream intStream_3 = intStream.sequential();
		boolean isParallel_3 = intStream_3.isParallel();
		
		// 1.11 ��Ʈ�� �����ϱ�
		// Stream.concat �޼ҵ带 �̿��� �� ���� ��Ʈ���� �����ؼ� ���ο� ��Ʈ���� ����� �� �� �ִ�.
		Stream<String> stream1 = Stream.of("Java", "Scala", "Groovy");
		Stream<String> stream2 = Stream.of("Python", "Go", "Swift");
		Stream<String> concat = Stream.concat(stream1, stream2);
		// [Java, Scala, Groovy, Python, Go, Swift]
		
		// 2. �����ϱ�
		// ��ü ��� �߿��� ������ ���� API �� �̿��ؼ� ���� ���ϴ� �͸� �̾Ƴ� �� �ִ�. �̷��� ���� �ܰ踦 �߰� �۾��̶�� �ϴµ�, �̷��� �۾��� ��Ʈ���� �����ϱ� ������ ���� �۾��� �̾� �ٿ��� �ۼ��� �� �ִ�.
		List<String> names = Arrays.asList("Eric", "Elena", "Java");
		
		// 2.1 Filtering
		// ���ʹ� ��Ʈ�� �� ��ҵ��� �ϳ��� ���ؼ� �ɷ����� �۾��̴�. ���ڷ� ���� Pridicate �� boolean �� �����ϴ� �Լ��� �������̽��� �򰡽��� ���� �ȴ�.
		Stream<String> stream_3 = 
				names.stream()
					 .filter(name -> name.contains("a"));
		// [Elena, Java]
		
		// 2.2 Mapping
		// ���� ��Ʈ�� �� ��ҵ��� �ϳ��� Ư�� ������ ��ȯ���ش�. �� �� ���� ��ȯ�ϱ� ���� ���ٸ� ���ڷ� �޴´�.
		Stream<String> stream_4 = 
				names.stream()
					 .map(String::toUpperCase);
		// [ERIC, ELENA, JAVA]
		
		Stream<Integer> stream_5 = 
				productList.stream()
						   .map(Product::getAmount);
		
		// map �̿ܿ��� ���� �� ������ flatMap �޼ҵ嵵 �ִ�
		// ���ڷ� mapper �� �ް� �ִµ�, ���� Ÿ���� Stream �̴�. ��, ���ο� ��Ʈ���� �����ؼ� �����ϴ� ���ٸ� �Ѱܾ��Ѵ�. flatMap �� ��ø ������ �� �ܰ� �����ϰ� ���� �÷������� ������ִ� ������ �Ѵ�. �̷��� �۾��� �÷�Ʈ���̶�� �Ѵ�.
		List<List<String>> list_2 = 
				  Arrays.asList(Arrays.asList("a"), 
				                Arrays.asList("b"));
		// [[a], [b]]
		
		// �̸� flatMap �� ����ؼ� ��ø ������ ������ �� �۾��� �� �ִ�.
//		List<String> flatList = 
//				  list_2.stream()
//					    .flatMap(Collection::stream)
//					    .collect(Collectors.toList());
		// [a, b]
		
		// �̹��� ��ü�� �����Ѵ�.
		// �л� ��ü�� ���� ��Ʈ������ �л��� ������ ������ �̾� ���ο� ��Ʈ���� ����� ����� ���ϴ� �ڵ��̴�.
		// map �޼ҵ� ��ü�����δ� �� ���� �� �� ���� ����̴�.
//		students.stream()
//			.flatMapToInt(student ->
//							IntStream.of(student.getKor(),
//										 student.getEng(),
//										 student.getMath()))
//			.average().ifPresent(avg ->
//							System.out.println(Math.round(avg * 10) / 10.0));
		
		// 2.3 Sorting
		// ������ ����� �ٸ� ���İ� ���������� Comparator �� �̿��Ѵ�.
		// ���ھ��� �׳� ȣ���� ��� ������������ �����Ѵ�.
		IntStream.of(14, 11, 20, 39, 23)
			.sorted()
			.boxed()
			.collect(Collectors.toList());
		// [11, 14, 20, 23, 39]
		
		// ���ڸ� �ѱ�� ���� ���� ����. ��Ʈ�� ����Ʈ���� ���亪 ������ ������ �ڵ�� Comparator �� �Ѱܼ� �������� ������ �ڵ��̴�.
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
		
		// Comparator �� compare �޼ҵ�� �� ���ڸ� ���ؼ� ���� �����Ѵ�. �̸� �̿��ؼ� ���ڿ� ���̸� �������� �����Ѵ�.
		lang.stream()
			.sorted(Comparator.comparingInt(String::length))
			.collect(Collectors.toList());
		// [Go, Java, Scala, Swift, Groovy, Python]
		
		lang.stream()
			.sorted((s1, s2) -> s2.length() - s1.length())
			.collect(Collectors.toList());
		// [Groovy, Python, Scala, Swift, Java, Go]
		
		// 2.4 Iterating
		// ��Ʈ�� �� ��ҵ� ������ ������� Ư�� ������ �����ϴ� �޼ҵ�δ� peek �� �ִ�. 'peek'�� �׳� Ȯ���غ��ٴ� �ܾ� ��ó�� Ư�� ����� ��ȯ���� �ʴ� �Լ��� �������̽� Consumer �� ���ڷ� �޴´�.
		// ���� ��Ʈ�� �� ��ҵ� ������ Ư�� �۾��� ������ �� ����� ������ ��ġ�� �ʴ´�.
		int sum = IntStream.of(1, 3, 5, 7, 9)
				.peek(System.out::println)
				.sum();
		
		// 3. ��� �����
		// ������ ��Ʈ������ ������ ���� ����� ��������� ������ �ܰ��̴�. ���� ��Ʈ���� ������ ���� �۾��̴�.
		
		// 3.1 Calculating
		// ��Ʈ�� API �� �پ��� ���� �۾��� �����Ѵ�. �ּ�, �ִ�, ��, ��� �� �⺻�� Ÿ������ ����� ���� �� �ִ�.
		long count = IntStream.of(1, 3, 5, 7, 9).count();
		long sim = LongStream.of(1, 3, 5, 7, 9).sum();
		
		// ���� ��Ʈ���� ��� �ִ� ��� count �� sum �� 0�� ����ϸ� �ȴ�. ������ ���, �ּ�, �ִ��� ��쿡�� ǥ���� ���� ���� ������ Optional �� �̿��� �����Ѵ�.
		OptionalInt min = IntStream.of(1, 3, 5, 7, 9).min();
		OptionalInt max = IntStream.of(1, 3, 5, 7, 9).max();
		
		// ��Ʈ������ �ٷ� ifPresent �޼ҵ带 �̿��ؼ� Optional �� ó���� �� �ִ�.
		DoubleStream.of(1.1, 2.2, 3.3, 4.4, 5.5)
			.average()
			.ifPresent(System.out::println);
		
		// 3.2 Reduction
		/**
		 *  ��Ʈ���� reduce ��� �޼ҵ带 �̿��ؼ� ����� ������. ��Ʈ���� �ִ� ���� ����� ������ �� ���� �ִ�.
		 *  reduce �޼ҵ�� �� ������ ���ڸ� ���� �� �ִ�.
		 *  accumulator : �� ��Ҹ� ó���ϴ� ��� ����. �� ��Ұ� �� ������ �߰� ����� �����ϴ� ����.
		 *  identity : ����� ���� �ʱⰪ���� ��Ʈ���� �� ����� ������ ������ �� ���� ����.
		 *  combiner : ���� ��Ʈ������ ���� ����� ����� �ϳ��� ��ġ�� ������ �ϴ� ���� 
		 */
		
		// ���� �ϳ��� ��쿡�� BinaryOperator<T> �� ���� Ÿ���� ���� �� ���� �޾� ���� Ÿ���� �Ӱ���� ��ȯ�ϴ� �Լ��� �������̽��̴�. �� ���� ���ϴ� ���ٸ� �Ѱ��ش�
		// accumulator
		OptionalInt reduced = 
				IntStream.range(1, 4) // [1, 2, 3]
				.reduce((a, b) -> {
					return Integer.sum(a, b);
				});
		// 6 : (1 + 2 + 3)
		
		// ���� �� �� �޴� ���
		// identity
		int reducedTwoParams = 
				IntStream.range(1, 4) // [1, 2, 3]
				.reduce(10, Integer::sum); // method reference
		// 16 : (10 + 1 + 2 + 3)
		
		// ���� �� �� �޴� ���. ������ ������ combiner �� ������� �ʴ´�.
		// combiner
		Integer ReducedParams = Stream.of(1, 2, 3)
				.reduce(10,  // identity
						Integer::sum, // accumlator
						(a, b) -> {
					System.out.println("combiner was called");
					return a + b;
				});
		
		// Combiner �� ���� ó�� �� ���� �ٸ� �����忡�� ������ ����� �������� ��ġ�� �ܰ��̴�. ���� ���� ��Ʈ�������� �����Ѵ�.
		Integer reducedParallel = Arrays.asList(1, 2, 3)
				.parallelStream()
				.reduce(10,
						Integer::sum,
						(a, b) -> {
							System.out.println("combiner was called");
							return a + b;
						});
		// ����� 36�� ���´�. accumulator �� �Y �� �� �����Ѵ�. �ʱⰪ 10�� �� ��Ʈ�� ���� ���� �� ���� ��(10 + 1 = 11, 10 + 2 = 12, 10 + 3 = 13)�� ����Ѵ�.
		// Combiner �� identity�� accumulator �� ������ ���� �����忡�� ���� ����� ����� ��ġ�� �����̴�. 12 + 13 = 25, 25 + 11 = 36 �� �� ȣ���Ѵ�.
		/**
		 * combiner was called
		 * combiner was called
		 * 36
		 */
		// ���� ��Ʈ���� ������ �����Ⱥ��� ���� ���� �ƴϴ�. ������ ������ ��쿡�� �̷��� �ΰ����� ó���� �ʿ��ϱ� ������ ������ ���� ���� �ִ�.
		
		// 3.3 Collecting
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
