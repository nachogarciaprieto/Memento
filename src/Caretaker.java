import java.util.ArrayList;

class Caretaker {

	private ArrayList<Memento> estadosSalvados = new ArrayList<Memento>();

	public void addMemento(Memento mementoTexto) {
		getEstadosSalvados().add(mementoTexto);
	}

	public Memento getMemento(int index) {
		return getEstadosSalvados().get(index);
	}

	// GET
	public ArrayList<Memento> getEstadosSalvados() {
		return estadosSalvados;
	}

	// SET
	public void setEstadosSalvados(ArrayList<Memento> estadosSalvados) {
		this.estadosSalvados = estadosSalvados;
	}
}