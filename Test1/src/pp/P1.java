package pp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class P1 {

	public static void main(String[] args) {

		List<String> repository = new ArrayList<String>();

		repository.add("monitor");
		repository.add("mousepad");
		repository.add("mobile");
		repository.add("moneypot");
		repository.add("mouse");

		String query = "mouse";

		arr(repository, query);
	}

	static List<List<String>> arr(List<String> repository, String query) {

		List<List<String>> res = new ArrayList<List<String>>();

		List<String> queryList = endQueryList(query);

		List<String> nueva = new ArrayList<String>();

//		nueva = repository.stream().filter(n -> queryList.stream().anyMatch(o -> o.compareToIgnoreCase(n) == 0))
//				.collect(Collectors.toList());

		Collections.sort(repository);

//		repository.forEach(n -> System.out.println(n));

		nueva = repository.stream().filter(n -> queryList.stream().anyMatch(o -> o.compareToIgnoreCase(n) == 0))
				.collect(Collectors.toList());

		nueva.forEach(n -> System.out.println(n));

		return null;

	}

	static List<String> endQueryList(String query) {

		List<String> queryList = new ArrayList<String>();

		for (int i = 2; i <= query.length(); i++) {

//			System.out.println(query.substring(0, i));
			queryList.add(query.substring(0, i));
		}

		return queryList;
	}

}
