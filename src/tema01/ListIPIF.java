package tema01;

import tema01.SequenceIF;

public interface ListIPIF<E> extends SequenceIF<E> {

	/*
	 * Return the next element in the list.
	 * @Pre: there are elements in the list.
	 * @return: the next element.
	 */
	public E get();

	/*
	 * Modify the current position of the iterator with the value of e.
	 * @param e The element to set.
	 */
	public void set(E e);

	/*
	 * Remove the element in the position of the iterator.
	 */
	public void remove();

	/*
	 * Move the iterator one position backwards.
	 */
	public void moveBackwards();

	/*
	 * Move the iterator one position forwards.
	 */
	public void moveForwards();

}
