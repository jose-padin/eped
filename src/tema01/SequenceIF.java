package tema01;

import tema01.CollectionIF;
import tema01.IteratorIF;

public interface SequenceIF<E> extends CollectionIF<E> {

	public IteratorIF<E> iterator();
}
