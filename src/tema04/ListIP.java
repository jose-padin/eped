package tema04;

import tema04.Iterator;
import tema04.ListIPIF;
import tema04.Sequence;

public class ListIP<E> extends Sequence<E> implements ListIPIF<E> {

	public Iterator iterator() {
		return new Iterator();
	}

}
