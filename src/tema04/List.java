package tema04;

import tema01.IteratorIF;
import tema01.ListIF;

public class List<E> extends Sequence<E> implements ListIF<E> {

    /* Constructor por defecto: crea una lista vacía */
    public List(){
        super();
    }

    /* Constructor por copia: delega en el constructor por copia *
     * de la secuencia                                           */
    public List(List<E> s) {
        super(s);
    }

    /* Devuelve el elemento pos-ésimo de la lista */
    public E get(int pos) {
        NodeSequence node = getNode(pos);
        return node.getValue();
    }

    /* Modifica el elemento pos-ésimo de la lista */
    public void set(int pos, E e) {
        NodeSequence node = getNode(pos);
        node.setValue(e);
    }

    /* Inserta un nuevo elemento en la lista en la posición *
     * indicada                                             */
    public void insert(int pos, E elem) {
        NodeSequence newNode = new NodeSequence(elem);
        if (pos == 1) {
            newNode.setNext(this.firstNode);
            this.firstNode = newNode;
        } else {
            NodeSequence previousNode = getNode(pos - 1);
            NodeSequence nextNode = previousNode.getNext();
            previousNode.setNext(newNode);
            newNode.setNext(nextNode);
        }
        this.size++;
    }

    /* Elimina el elemento pos-ésimo de la lista */
    public void remove(int pos) {
        if (pos == 1) {
            this.firstNode = this.firstNode.getNext();
        } else {
            NodeSequence previousNode = getNode(pos - 1);
            NodeSequence nextNode = previousNode.getNext().getNext();
            previousNode.setNext(nextNode);
        }
        this.size--;
    }

    /* Programar dos versiones de un método:
	ListIF<E> invierte(ListIF<E> l)
	que invierta la lista dada por parámetro.
	a) Primera versión: utilizando iteradores.
	b) Segunda versión: sin utilizar iteradores.
	Compare el coste asintótico temporal en el caso peor de ambas
	implementaciones.
	*/
    /* Implementación a */
	public ListIF<E> invierte(ListIF<E> l) {
		ListIF<E> newList = new List<E>();
		IteratorIF it = l.iterator();

		while (it.hasNext()) {
			E value = (E) it.getNext();
			newList.insert(1, value);
		}
		return newList;
	}
}
