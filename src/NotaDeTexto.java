/**
 * 
 * @author José Ignacio García Prieto, , .
 * @author Alejandro Tejada Rodriguez
 * @author Alberto Sabuco Larrosa
 * @since 2019-04-30
 * @version 1.1 
 * Versión que incluye comentarios en JavaDoc y la documentación generada el JavaDoc.
 * Esta clase se encarga de recuperar los datos guardados en la clase Memento para mostrarla por pantalla.
 * Contiene 2 métodos Set y 2 métodos Get.
 */
class NotaDeTexto {

	private String texto;

	/**
	 * Método Set
	 * @param texto
	 */
	public void setEstado(String texto) {
		System.out.println("----\nNOTA DE TEXTO: Situando texto a:\n" + texto);
		this.texto = texto;
	}

	/**
	 * Método Get
	 * @return
	 */
	private String getEstado() {
		return texto;
	}
	
	/**
	 * Método Get
	 * @return
	 */
	public Memento salvandoParaMemento() {
		System.out.println("----\nNOTA DE TEXTO: Guardando a Memento.");
		return new Memento(getEstado());
	}
	
	/**
	 * Método Set
	 * @param m
	 */
	public void recuperandoDesdeMemento(Memento m) {
		setEstado(m.getTextoSalvado());
		System.out.println("----\nNOTA DE TEXTO: Texto despues de restaurar desde Memento:\n" + getEstado());
	}

}