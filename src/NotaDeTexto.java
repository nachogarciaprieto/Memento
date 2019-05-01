/**
 * 
 * @author Jos� Ignacio Garc�a Prieto, , .
 * @author Alejandro Tejada Rodriguez
 * @author Alberto Sabuco Larrosa
 * @since 2019-04-30
 * @version 1.1 
 * Versi�n que incluye comentarios en JavaDoc y la documentaci�n generada el JavaDoc.
 * Esta clase se encarga de recuperar los datos guardados en la clase Memento para mostrarla por pantalla.
 * Contiene 2 m�todos Set y 2 m�todos Get.
 */
class NotaDeTexto {

	private String texto;

	/**
	 * M�todo Set
	 * @param texto
	 */
	public void setEstado(String texto) {
		System.out.println("----\nNOTA DE TEXTO: Situando texto a:\n" + texto);
		this.texto = texto;
	}

	/**
	 * M�todo Get
	 * @return
	 */
	private String getEstado() {
		return texto;
	}
	
	/**
	 * M�todo Get
	 * @return
	 */
	public Memento salvandoParaMemento() {
		System.out.println("----\nNOTA DE TEXTO: Guardando a Memento.");
		return new Memento(getEstado());
	}
	
	/**
	 * M�todo Set
	 * @param m
	 */
	public void recuperandoDesdeMemento(Memento m) {
		setEstado(m.getTextoSalvado());
		System.out.println("----\nNOTA DE TEXTO: Texto despues de restaurar desde Memento:\n" + getEstado());
	}

}