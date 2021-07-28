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
		repository.add("aerro");

		String query = "Mouse";

		for (List<String> a : arr(repository, query)) {

			a.forEach(n -> System.out.println(n));
			System.out.println("***");

		}

		System.out.println("---------------");

		for (List<String> a : arr2(repository, query)) {

			a.forEach(n -> System.out.println(n));
			System.out.println("***");

		}

	}

	static List<List<String>> arr(List<String> repository, String query) {

		List<List<String>> res = new ArrayList<List<String>>();

		List<String> queryList = endQueryList(query);

		List<String> nueva2 = new ArrayList<String>();

//		nueva = repository.stream().filter(n -> queryList.stream().anyMatch(o -> o.compareToIgnoreCase(n) == 0))
//				.collect(Collectors.toList());

		Collections.sort(repository);

//		repository.forEach(n -> System.out.println(n));

//		nueva = repository.stream()
//				.filter(n -> queryList.stream().anyMatch(o -> o.compareToIgnoreCase(n.substring(0, o.length())) == 0))
//				.collect(Collectors.toList());

		for (String w : queryList) {

			nueva2 = repository.stream().filter(n -> n.substring(0, w.length()).compareToIgnoreCase(w) == 0)
					.collect(Collectors.toList());

			if (nueva2.size() >= 3) {

				nueva2 = nueva2.subList(0, 3);
			}

			res.add(nueva2);

		}

		return res;

	}

	static List<List<String>> arr2(List<String> repository, String query) {

		List<List<String>> res = new ArrayList<List<String>>();

		List<String> queryList = endQueryList(query);

		Collections.sort(repository);

		for (String que : queryList) {

			List<String> nod = new ArrayList<String>();

			for (String rep : repository) {

				if (que.compareToIgnoreCase(rep.substring(0, que.length())) == 0) {

					nod.add(rep);

				}

			}
			if (nod.size() >= 3) {

				nod = nod.subList(0, 3);

			}
			res.add(nod);

		}

		return res;

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
