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
	 * Return the pointer position.
	 * @return: and integer indicating the pointer position in the list.
	 */
	public int getPointer();

	/*
	 * Establish the pointer at the beginning of the list. If the list is empty, do nothing.
	 */
	public void resetPointer();

	/* Move the pointer to the end of the list.
	 * @Pre: !isEmpty().
	 * @Post: the pointer is at the end of the list, after the last element.
	 */
	public void moveToEnd();

	/*
	 * Return the element placed in the position of the iterator.
	 * @Pre: !isEmpty().
	 * @return: the next element.
	 */
	public E get();

	/*
	 * Modify the current position of the iterator with the value of e.
	 * @param e The element to be set.
	 * @Pre: !isEmpty().
	 * @Post: size will remain the same.
	 */
	public void set(E e);

	/*
	 * Inserts the passed element in the current iterator position.
	 * @param e The element to be inserted.
	 * @Post: size++.
	 */
	public void insert(E e);

	/*
	 * Remove the element in the position of the iterator.
	 * return: true if the element has been removed. False otherwise.
	 * @Pre: !isEmpty().
	 * @Post: size--.
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
	 * @Pre: !isEmpty() && getPointer() <= size;
	 * @Post: the iterator is moved one position forwards.
	 */
	public void moveForwards();

	/*
	 * Check if there are elements before the iterator position.
	 * @Pre: !isEmpty();
	 */
	public boolean hasPrevious();

}
