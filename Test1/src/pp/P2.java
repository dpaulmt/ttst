package pp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class P2 {

	public static void main(String[] args) {

		List<String> codeList = new ArrayList<String>();

		codeList.add("orange");
		codeList.add("apple apple");
		codeList.add("banana orange apple");
		codeList.add("banana");

		List<String> shoppingList = new ArrayList<String>();

		shoppingList.add("orange");
		shoppingList.add("apple");
		shoppingList.add("apple");
		shoppingList.add("banana");
		shoppingList.add("orange");
		shoppingList.add("apple");
		shoppingList.add("banana");

		foo(codeList, shoppingList);
	}

	static boolean foo(List<String> codeList, List<String> shoppingList) {

		List<String> codeListFixed = codeListFix(codeList);
		
		

		return false;
	}

	static List<String> codeListFix(List<String> codeList) {

		List<String> codeListFixed = new ArrayList<String>();

		for (String code : codeList) {

			if (code.contains(" ")) {
				String[] cutted = code.split(" ");

				for (String s : cutted) {

					codeListFixed.add(s);

				}

			} else {

				codeListFixed.add(code);

			}

		}

		return codeListFixed;
	}

}
