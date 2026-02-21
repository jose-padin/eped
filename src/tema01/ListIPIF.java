package tema01;

import tema01.SequenceIF;

/*
 *  Diseñar un interfaz ListIPIF<E> que defina las operaciones de las Listas con
 *  Punto de Interés (Interest Point). Recuerde que en este tipo de listas existe un
 *  puntero que puede desplazarse hacia adelante y hacia atrás y que todas las
 *  operaciones de consulta y modificación se realizan en la posición del puntero.
 *  ¿Dónde situaría este interfaz en el mapa de TAD de la asignatura?
 *  Respuesta: estaría situado debajo de Sequence que, a su vez, estaría situado debajo de Collection.
 */
public interface ListIPIF<E> extends SequenceIF<E> {

	/*
	 * Establish the pointer at the beginning of the list.
	 */
	public void resetPointer();

	/*
	 * Return the element placed in the position of the iterator.
	 * @Pre: !isEmpty().
	 * @return: the next element.
	 */
	public E get();

	/*
	 * Modify the current position of the iterator with the value of e.
	 * @param e The element to be set.
	 */
	public void set(E e);

	/*
	 * Inserts the passed element in the current iterator position.
	 * @param e The element to be inserted.
	 */
	public void insert(E e);

	/*
	 * Remove the element in the position of the iterator.
	 * return: true if the element has been removed. False otherwise.
	 */
	public boolean remove();

	/*
	 * Move the iterator one position backwards.
	 * @Pre: !isEmpty() && hasPrevious().
	 * @Post: the iterator is moved one position backwards.
	 */
	public void moveBackwards();

	/*
	 * Move the iterator one position forwards.
	 * @Pre: !isEmpty()
	 * @Post: the iterator is moved one position forwards.
	 */
	public void moveForwards();

	/*
	 * Check if there are elements before the iterator position.
	 * @Pre: !isEmpty();
	 */
	public boolean hasPrevious();

}
