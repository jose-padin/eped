package tema04;

import tema01.CollectionIF;

public abstract class Collection<E> implements CollectionIF<E> {

	protected int size;

	public Collection() {
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public abstract boolean contains(E e);

	public void clear() {
		this.size = 0;
	}
}
