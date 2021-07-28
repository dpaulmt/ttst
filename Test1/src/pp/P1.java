package pp;

import java.util.ArrayList;
import java.util.List;

public class P1 {

	public static void main(String[] args) {

		List<String> repository = new ArrayList<String>();

		repository.add("monitor");
		repository.add("mousepad");
		repository.add("mobile");
		repository.add("moneypot");
		repository.add("mouse");

		String query = "mouse";

	}

	static List<List<String>> arr(List<String> repository, String query) {

		List<List<String>> res = new ArrayList<List<String>>();

		List<String> queryList = endQueryList(query);
		
		

		return null;
		

	}

	static List<String> endQueryList(String query) {

		List<String> queryList = new ArrayList<String>();

		for (int i = 2; i <= query.length(); i++) {

			queryList.add(query.substring(0, 2));
		}

		return queryList;
	}

}
