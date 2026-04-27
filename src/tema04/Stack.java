package tema04;

public class Stack<E> extends Sequence<E> implements StackIF<E> {

	public Stack() {
		super();
	}

	public Stack(Stack<E> s) {
		super(s);
	}

	@Override
	public E getTop() {
		return this.firstNode.getValue();
	}

	@Override
	public void push(E e) {
		NodeSequence node = new NodeSequence(e);

		if (!this.isEmpty()) {
			node.setNext(this.firstNode);
		}

		this.firstNode = node;
		this.size++;
	}

	@Override
	public void pop() {
		this.firstNode = this.firstNode.getNext();
		this.size--;
	}
}
