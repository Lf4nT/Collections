import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Iterator;

public class Prada {

	public static void main(String[] args) {

		Random r = new Random();

		List<Integer> lista = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			lista.add(r.nextInt(100) + 1);
		}
		mostrarColeccion(lista);

		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < 100; i++) {
			set.add(r.nextInt(100) + 1);
		}
		mostrarColeccion(set);
	}

	static void mostrarColeccion(Collection<Integer> c) {
		Iterator<Integer> i = c.iterator();
		while (i.hasNext()) {
			Integer numero = i.next();
			if (i.hasNext())
				System.out.print(numero + ", ");
		}
		System.out.println();
		System.out.println("Numero de numeros hallados " + c.size());
	}
}
