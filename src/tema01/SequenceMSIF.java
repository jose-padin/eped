package tema01;

//Diseñar un interfaz SequenceMSIF<E> que defina las operaciones sobre
//secuencias con un tamaño máximo limitado (Max Size).
//¿Dónde situaría este interfaz en el mapa de TAD de la asignatura?
// La situaría debajo de Sequence. De este modo, hereda de Sequence (con su iterador) y de Collection.

/* We do not include a method to set the max size because that is a behavior of the
 * final implementation (the class)
 */
public interface SequenceMSIF {

	/*
	 * Return the max size allowed to the sequence.
	 * return int The squence's max size.
	 */
	public int getMaxSize();

	/*
	 * Check if it is allowed to add more elements to the sequence.
	 * return true if it is allowed or false otherwise.
	 */
	public boolean canAddMore();
}
