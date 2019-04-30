class Memento {

	private String texto;

	public Memento(String textoParaSalvar) {
		texto = textoParaSalvar;
	}

	public String getTextoSalvado() {
		return texto;
	}
}