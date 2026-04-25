package tema04;

import tema01.IteratorIF;

//Realizar una implementación de ListIPIF<E> (Listas con Punto de Interés)
//utilizando dos pilas como Estructura de Datos de soporte. Calcular el coste de
//todas las operaciones públicas de esta implementación.
public class Main {

	public static void main(String[] args) {
		ListIP<Integer> list = new ListIP<Integer>();
		// The pointer is never moved (position == 1), so they must be inserted at the beginning.
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);

		IteratorIF<Integer> it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.getNext());
		}

		System.out.printf("pointer: %d\n", list.getPointer());
		list.moveForwards();
		System.out.printf("pointer: %d\n", list.getPointer());
		System.out.println(list.get());
		list.moveForwards();
		System.out.printf("pointer: %d\n", list.getPointer());
		System.out.println(list.get());
		list.remove();
		// It should print 4, 3, 1
		it.reset();
		System.out.println("**");
		while (it.hasNext()) {
			System.out.println(it.getNext());
		}
	}
}

