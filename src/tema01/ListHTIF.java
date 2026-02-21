package tema01;

import tema01.SequenceIF;

/*
 * Diseñar un interfaz ListHTIF<E> que defina las operaciones de las Listas
 * Primero-Siguiente (o Cabeza-Cola: Head-Tail) en las que el acceso y la
 * modificación sólo puede realizarse sobre el primer elemento de la lista. Todas
 * las operaciones, además, deberán devolver un valor (es decir, su tipo de salida
 * no puede ser void). ¿Dónde situaría este interfaz en el mapa de TAD de la
 * asignatura?
 * Estaría situado debajo de Sequence que, a su vez, estaría situado debajo de Collection.
 */

public interface ListHTIF<E> extends SequenceIF<E> {

	/*
	 * Insert an element in the list replacing the one existing in the passed position.
	 * @Pre: !isEmpty().
	 * @Pos: size == size() + 1.
	 * @param e The element to be set as the head.
	 * return: true if the element was inserted; false if not.
	 */
	public boolean setHead(E e);

	/*
	 * Get the head of the list.
	 * @Pre: !isEmpty().
	 * return the head of a list.
	 */
	public ListHTIF<E> getHead();

	/*
	 * Set the tail of a list.
	 * @param e The list to insert as a tail.
	 * return true if the insertion was correct or false otherwise.
	 */
	public boolean setTail(ListHTIF e);

	/*
	 * Return the tail of a list.
	 * @Pre: !isEmpty().
	 * return the tail list.
	 */
	public ListHTIF<E> getTail();

	/*
	 * Remove the head.
	 * @Pre: !isEmpty().
	 * return true if the head has been removed; false otherwise.
	 */
	public boolean removeHead();

}
