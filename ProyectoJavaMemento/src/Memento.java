/**
 * Clase Memento.
 * 
 * @author Jose Ignacio Garcia Prieto
 * @author Alejandro Tejada Rodriguez
 * @author Alberto Sabuco Larrosa
 * @since 2019-04-30
 * @version 1.1 
 *
 */
class Memento {

	/**
	 * texto : String del texto
	 */
	private String texto;

	/**
	 * Constructor
	 * 
	 * @param textoParaSalvar : String a guardar en memento
	 */
	public Memento(String textoParaSalvar) {
		texto = textoParaSalvar;
	}

	/**
	 * Get String de Memento
	 * 
	 * @return String texto guardado
	 */
	public String getTextoSalvado() {
		return texto;
	}
}