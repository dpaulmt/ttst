package pp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Tewst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> a = new ArrayList<>();

		a.add("a");
		a.add("d");
		a.add("c");
		a.add("b");

		List<List<String>> aa = new ArrayList<>();
		List<String> b = new ArrayList<>();

		b.add("a");
		b.add("b");
		b.add("c");
		b.add("d");

		aa.add(a);

		Collections.sort(a);

//	a.removeIf(n -> (n.charAt(0) == 'S'));
//
//	
//	a.removeIf(n -> (n.compareToIgnoreCase("a") == 0 || n=="b"));

		// convert a String to a Hex
		Consumer<String> printTextInHexConsumer = (String x) -> {
			StringBuilder sb = new StringBuilder();
			for (char c : x.toCharArray()) {
				String hex = Integer.toHexString(c);
				sb.append(hex);
			}
			System.out.println(String.format("%n%-10s:%s", x, sb.toString()));
		};

		a.forEach(printTextInHexConsumer);

//    stream.forEach(printTextInHexConsumer);

		Predicate<String> predicado = new Predicate<String>() {
//			@Override
//			public boolean test(Factura f) {
//				System.out.println(" iteracion ");
//				return f.getImporte() > 300;
//			}

			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				
				
				return t.compareToIgnoreCase("c")==0;
			}
		};

//		String nodo = a.stream().filter(n -> n.compareToIgnoreCase("b") == 0).findFirst().get();
		
		String nodo= a.stream().filter(predicado).findFirst().get();

		System.out.println("nodo:" + nodo.toString());

	}

}
