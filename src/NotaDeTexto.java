/**
 * Clase NotaDeTexto
 * 
 * @author Jose Ignacio Garcia Prieto
 * @author Alejandro Tejada Rodriguez
 * @author Alberto Sabuco Larrosa
 * @since 2019-04-30
 * @version 1.1 
 *
 */
class NotaDeTexto {

	/**
	 * texto : String del texto
	 */
	private String texto;

	/**
	 * Metodo SET
	 * 
	 * @param texto : String a establecer en 'texto' como estado
	 */
	public void setEstado(String texto) {
		System.out.println("----\nNOTA DE TEXTO: Situando texto a:\n" + texto);
		this.texto = texto;
	}

	/**
	 * Metodo GET
	 * 
	 * @return texto : String del estado
	 */
	private String getEstado() {
		return texto;
	}

	/**
	 * Metodo guardar estado a memento
	 * 
	 * @return nuevo objeto de la clase MEMENTO con el estado actual
	 */
	public Memento salvandoParaMemento() {
		System.out.println("----\nNOTA DE TEXTO: Guardando a Memento.");
		return new Memento(getEstado());
	}

	/**
	 * Metodo para recuperar el estado guardado en memento
	 * 
	 * @param m : memento guardado
	 */
	public void recuperandoDesdeMemento(Memento m) {
		setEstado(m.getTextoSalvado());
		System.out.println("----\nNOTA DE TEXTO: Texto despues de restaurar desde Memento:\n" + getEstado());
	}

}