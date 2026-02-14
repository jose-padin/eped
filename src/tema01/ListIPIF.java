package tema01;

import tema01.SequenceIF;

public interface ListIPIF<E> extends SequenceIF<E> {

	public E get();

	public E set(E e);

	public void remove();
}
