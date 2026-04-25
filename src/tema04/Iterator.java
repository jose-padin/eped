package tema04;

import tema01.IteratorIF;

public class Iterator<E> implements IteratorIF<E> {

	private int current = 0;
	private E node;

	public E getNext() {
		...
	}

	public boolean hasNext() {
		...
	}

	public void reset() {
		...
	}

}
