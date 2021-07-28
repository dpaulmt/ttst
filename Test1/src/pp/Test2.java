package pp;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Gasto> lista = new ArrayList<Gasto>();

		lista.add(new Gasto("A", 80));
		lista.add(new Gasto("B", 50));
		lista.add(new Gasto("C", 70));
		lista.add(new Gasto("D", 95));

		double totalPago = 0;

		for (Gasto g : lista) {

			if (g.getImporte() * 1.21 < 100) {

				totalPago = totalPago + g.getImporte() * 1.21;

			}
		}

		System.out.println(totalPago);

		double resultado = lista.stream().mapToDouble(gasto -> gasto.getImporte() * 1.21).filter(gasto -> gasto < 100)
				.sum();

		
//		lista.stream().
		System.out.println(resultado);

	}

}
