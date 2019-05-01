/**
 * 
 * @author Jos� Ignacio Garc�a Prieto
 * @author Alejandro Tejada Rodriguez
 * @author Alberto Sabuco Larrosa
 * @since 2019-04-30
 * @version 1.1 
 * Esta clase contiene dos m�todos y el string.
 * Esta clase guarda el texto tecleado.
 */


class Memento {

	private String texto;

	public Memento(String textoParaSalvar) {
		texto = textoParaSalvar;
	}

	public String getTextoSalvado() {
		return texto;
	}
}