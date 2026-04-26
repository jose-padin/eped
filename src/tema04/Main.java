package tema04;

import tema01.IteratorIF;
import tema01.ListIF;
import tema04.List;

//Realizar una implementación de ListIPIF<E> (Listas con Punto de Interés)
//utilizando dos pilas como Estructura de Datos de soporte. Calcular el coste de
//todas las operaciones públicas de esta implementación.
public class Main {

	public static void main(String[] args) {
		List<Integer> list = new List<Integer>();
		list.insert(1, 1);
		list.insert(2, 2);
		list.insert(3, 3);
		list.insert(4, 4);

		IteratorIF it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.getNext());
		}
		System.out.println("---");

		ListIF<Integer> inverted = list.invierte(list);
		IteratorIF it2 = inverted.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.getNext());
		}
	}
}
