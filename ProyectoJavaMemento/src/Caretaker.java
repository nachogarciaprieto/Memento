import java.util.ArrayList;

/**
 * Clase Caretaker
 * 
 * @author Jose Ignacio Garcia Prieto
 * @author Alejandro Tejada Rodriguez
 * @author Alberto Sabuco Larrosa
 * @since 2019-04-30
 * @version 1.1
 *
 */
class Caretaker {

	/**
	 * ArrayList de MEMENTO para guardar estados
	 */
	private ArrayList<Memento> estadosSalvados = new ArrayList<Memento>();

	/**
	 * Metodo para añadir al ArrayList
	 * 
	 * @param mementoTexto : objeto MEMENTO
	 */
	public void addMemento(Memento mementoTexto) {
		getEstadosSalvados().add(mementoTexto);
	}

	/**
	 * Metodo para obtener un estado guardado en MEMENTO
	 * 
	 * @param  index : numero de posición en el ArrayList
	 * @return objeto MEMENTO
	 */
	public Memento getMemento(int index) {
		return getEstadosSalvados().get(index);
	}

	/**
	 * Metodo GET
	 * 
	 * @return ArrayList
	 */
	public ArrayList<Memento> getEstadosSalvados() {
		return estadosSalvados;
	}

	/**
	 * Metodo SET
	 * 
	 * @param estadosSalvados : ArrayList
	 */
	public void setEstadosSalvados(ArrayList<Memento> estadosSalvados) {
		this.estadosSalvados = estadosSalvados;
	}
}