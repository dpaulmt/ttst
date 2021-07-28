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
		List<String> nueva2 = new ArrayList<String>();

//		nueva = repository.stream().filter(n -> queryList.stream().anyMatch(o -> o.compareToIgnoreCase(n) == 0))
//				.collect(Collectors.toList());

		Collections.sort(repository);

//		repository.forEach(n -> System.out.println(n));

		nueva = repository.stream()
				.filter(n -> queryList.stream().anyMatch(o -> o.compareToIgnoreCase(n.substring(0, o.length())) == 0))
				.collect(Collectors.toList());

		nueva.forEach(n -> System.out.println("fail: " + n));

		for (String w : repository) {

			nueva2 = queryList.stream().filter(n -> n.compareToIgnoreCase(w.substring(0, n.length())) == 0)
					.collect(Collectors.toList());

			nueva2.forEach(n -> System.out.println(n));
			System.out.println("-----");

		}

		return null;

	}

	static List<String> endQueryList(String query) {

		List<String> queryList = new ArrayList<String>();

		for (int i = 2; i <= query.length(); i++) {

//			System.out.println("mouse".length());
			queryList.add(query.substring(0, i).toLowerCase());
		}

		return queryList;
	}

}
