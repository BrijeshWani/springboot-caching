package springboot.cache;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class CacheService {

	@Cacheable("tableCache")
	public List<Integer> getTableOfNumber(final Integer number) {
		List<Integer> tableOfNumber = IntStream.iterate(1, i -> i + 1).mapToObj(Integer::valueOf).limit(10)
				.map(index -> index * number).collect(Collectors.toList());
		System.out.println("##########################");
		System.out.println("tableCache Method called");
		System.out.println("##########################");
		return tableOfNumber;
	}

	@Cacheable("addCache")
	public Integer add(Integer number1, Integer number2) {
		System.out.println("##########################");
		System.out.println("addCache Method called");
		System.out.println("##########################");
		return number1 + number2;
	}
}
