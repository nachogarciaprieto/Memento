class NotaDeTexto {

	private String texto;

	// SET
	public void setEstado(String texto) {
		System.out.println("----\nNOTA DE TEXTO: Situando texto a:\n" + texto);
		this.texto = texto;
	}

	// GET
	private String getEstado() {
		return texto;
	}

	public Memento salvandoParaMemento() {
		System.out.println("----\nNOTA DE TEXTO: Guardando a Memento.");
		return new Memento(getEstado());
	}

	public void recuperandoDesdeMemento(Memento m) {
		setEstado(m.getTextoSalvado());
		System.out.println("----\nNOTA DE TEXTO: Texto despues de restaurar desde Memento:\n" + getEstado());
	}

}