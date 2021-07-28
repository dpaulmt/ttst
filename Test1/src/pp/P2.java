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
		codeList.add("banana anything apple");
		codeList.add("banana");

		List<String> shoppingList = new ArrayList<String>();

		shoppingList.add("pina");
		shoppingList.add("mandarina");
		shoppingList.add("orange");
		shoppingList.add("apple");
		shoppingList.add("apple");
		shoppingList.add("banana");
		shoppingList.add("orange");
		shoppingList.add("apple");
		shoppingList.add("banana");

		System.out.println(foo(codeList, shoppingList));
	}

	static boolean foo(List<String> codeList, List<String> shoppingList) {

		if (codeList.isEmpty()) {
			return true;
		}

		List<String> codeListFixed = codeListFix(codeList);

		for (int i = 0; i < shoppingList.size(); i++) {

			if (shoppingList.get(i).compareToIgnoreCase(codeListFixed.get(0)) == 0) {

				List<String> shoppingListCutted = shoppingListCutted(shoppingList, i, codeListFixed.size());

				if (shoppingListCutted != null) {

					return fruitResult(codeListFixed, shoppingListCutted);

				} else {

					return false;
				}
			}

		}

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

	static List<String> shoppingListCutted(List<String> shoppingList, int i, int sizeCodeList) {

		if (shoppingList.size() >= (i + sizeCodeList)) {

			List<String> shoppingListCutted = shoppingList.subList(i, i + sizeCodeList);

			shoppingListCutted.forEach(n -> System.out.println(n));

			return shoppingListCutted;

		}

		return null;

	}

	static boolean fruitResult(List<String> codeListFixed, List<String> shoppingListCutted) {

		String anything = "anything";

		if (codeListFixed.contains(anything)) {

			for (int i = 0; i < codeListFixed.size(); i++) {

				if (codeListFixed.get(i).compareToIgnoreCase(anything) == 0) {

					shoppingListCutted.set(i, anything);

				}
			}

		}

		if (shoppingListCutted.equals(codeListFixed)) {

			return true;
		}

		return false;

	}

}
