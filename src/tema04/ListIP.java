package tema04;

import tema01.IteratorIF;
import tema01.ListIPIF;
import tema04.Sequence;

public class ListIP<E> extends Sequence<E> implements ListIPIF<E> {

	private int pointer;

	public ListIP() {
		super();
	}

	public ListIP(ListIP<E> list) {
		super(list);
	}


	public int getPointer() {
		return this.pointer;
	}

	public void resetPointer() {
		this.pointer = 0;
	}

	public void moveToEnd() {
		this.pointer = this.size - 1;
	}

	public E get() {
		NodeSequence node = this.firstNode;
		for (int i = 0; i < this.pointer; i++) {
			node = node.getNext();
		}
		return node.getValue();
	}

	// TODO: as it inserts always in the pointer position, this is not needed.
	public void set(E e) {}

	public void insert(E e) {
		if (this.size == 0) {
			this.firstNode = new NodeSequence(e);
		} else if (this.pointer == 0) {
			NodeSequence newNode = new NodeSequence(e);
			newNode.setNext(this.firstNode);
			this.firstNode = newNode;
		} else if (this.pointer == this.size) {
			NodeSequence newNode = new NodeSequence(e);
			NodeSequence lastNode = this.getNode(this.pointer - 1);
			newNode.setNext(lastNode.getNext());
			lastNode.setNext(newNode);
		} else {
			NodeSequence prevNode = this.getNode(pointer - 1);
			NodeSequence newNode = new NodeSequence(e);
			newNode.setNext(prevNode.getNext());
			prevNode.setNext(newNode);
		}
		this.size++;
	}

	public boolean remove() {
		if (this.pointer == 0) {
			this.firstNode = this.firstNode.getNext();
			return true;
		}

		NodeSequence prevNode = this.getNode(pointer - 1);
		prevNode.setNext(prevNode.getNext().getNext());
		this.size--;
		return true;
	}

	public void moveBackwards() {
		if (this.pointer > this.size) {
			this.pointer--;
		}
	}

	public void moveForwards() {
		if (this.pointer < this.size) {
			this.pointer++;
		}
	}

	public boolean hasPrevious() {
		return this.size != 0;
	}
}
