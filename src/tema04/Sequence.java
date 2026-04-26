package tema04;

import tema01.SequenceIF;
import tema01.IteratorIF;
import tema04.Collection;

public abstract class Sequence<E> extends Collection<E> implements SequenceIF<E> {

	protected NodeSequence firstNode;

	public Sequence() {
		super();
		this.firstNode = null;
	}

	public Sequence(Sequence<E> s) {
		this();
		if (!s.isEmpty()) {
			this.size = s.size;
			NodeSequence nodeS = s.getFirstNode();
			NodeSequence previousNode = new NodeSequence(nodeS.getValue());
			this.firstNode = previousNode;

			while (nodeS.getNext() != null) {
				nodeS = nodeS.getNext();
				NodeSequence nNode = new NodeSequence(nodeS.getValue());
				previousNode.setNext(nNode);
				previousNode = nNode;
			}
		}
	}

	protected class NodeSequence {
		private E value;
		private NodeSequence nextNode;

		NodeSequence() {
			this.value = null;
			this.nextNode = null;
		}

		NodeSequence(E e) {
			this.value = e;
			this.nextNode = null;
		}

		public E getValue() {
			return this.value;
		}

		public void setValue(E e) {
			this.value = e;
		}

		public NodeSequence getNext() {
			return this.nextNode;
		}

		public void setNext(NodeSequence node) {
			this.nextNode = node;
		}
	}

	private class SequenceIterator implements IteratorIF<E> {

		private NodeSequence currentNode;

		SequenceIterator() {
			this.currentNode = firstNode;
		}

		public E getNext() {
			E value = this.currentNode.getValue();
			this.currentNode = this.currentNode.getNext();
			return value;
		}

		public boolean hasNext() {
			return this.currentNode != null;
		}

		public void reset() {
			this.currentNode = firstNode;
		}
	}

	public IteratorIF<E> iterator() {
		return new SequenceIterator();
	}

	private NodeSequence getFirstNode() {
		return this.firstNode;
	}

	protected NodeSequence getNode(int i) {
		NodeSequence node = this.firstNode;
		for (int aux = 1; aux < i; aux++) {
			node = node.getNext();
		}
		return node;
	}

	public void clear() {
		super.clear();
		this.firstNode = null;
	}

	public boolean contains(E e) {
		NodeSequence node = this.firstNode;
		while (node != null) {
			if (node.getValue().equals(e)) {
				return true;
			}
			node = node.getNext();
		}
		return false;
	}
}
