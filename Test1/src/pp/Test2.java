package pp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Gasto> lista = new ArrayList<Gasto>();

		lista.add(new Gasto("A", 80, "uno"));
		lista.add(new Gasto("D", 50, "uno"));
		lista.add(new Gasto("B", 70, "uno"));
		lista.add(new Gasto("E", 95, "dos"));
		lista.add(new Gasto("C", 95, "uno"));

		double totalPago = 0;

		for (Gasto g : lista) {

			if (g.getImporte() * 1.21 < 100) {

				totalPago = totalPago + g.getImporte() * 1.21;

			}
		}

		System.out.println(totalPago);

		double resultado = lista.stream().mapToDouble(gasto -> gasto.getImporte() * 1.21).filter(gasto -> gasto < 100)
				.sum();

		System.out.println(resultado);

		// allMatch
		System.out.println(lista.stream().allMatch(n -> n.getClave().compareToIgnoreCase("uno") == 0));

		// anyMatch si cualquiera coincide
		System.out.println(lista.stream().anyMatch(n -> n.getClave().compareToIgnoreCase("dos") == 0));

		lista.stream().sorted(Comparator.comparing(Gasto::getNombre)).forEach(n -> System.out.println(n.getNombre()));

//		lista.stream().sorted().forEach(n -> System.out.println(n.getNombre()));

		lista.stream().forEach(n -> System.out.println(n.getNombre()));

	}

}
