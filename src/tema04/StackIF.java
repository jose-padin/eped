package tema04;

import tema01.SequenceIF;

public interface StackIF<E> extends SequenceIF<E> {

	public E getTop();

	public void push(E e);

	public void pop();
}
