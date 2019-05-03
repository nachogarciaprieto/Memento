import java.util.Scanner;

/**
 * Clase Principal.
 * 
 * @author Jose Ignacio Garcia Prieto
 * @author Alejandro Tejada Rodriguez
 * @author Alberto Sabuco Larrosa
 * @since 2019-04-30
 * @version 1.1
 */
public class Principal {

	/**
	 * Metodo MAIN
	 * Contiente el nucleo del programa
	 * Ofrece las opciones para introducir por consola.
	 */
	public static void main(String[] args) {

		/**
		 * opcion : opcion del menu
		 * index : posicion ArrayList de CARETAKER
		 * texto1 : String del texto
		 * sc : objeto de tipo Scanner
		 */
		int opcion = 1, index = -1;
		String texto1 = null;
		Scanner sc = new Scanner(System.in);

		Caretaker caretaker = new Caretaker();
		NotaDeTexto nota1 = new NotaDeTexto();

		/**
		 * Menu del programa.
		 * Permite elegir entre varias opciones.
		 */
		do {
			System.out.println("\n\n---------------------------------------------");
			System.out.println("  S E L E C C I O N E   U N A   O P C I O N");
			System.out.println("---------------------------------------------");
			System.out.println("1. EDITAR TEXTO\n");
			System.out.println("2. GUARDAR TEXTO\n");
			System.out.println("3. RESTAURAR TEXTO GUARDADO\n");
			System.out.println("0. SALIR DEL PROGRAMA\n\n");
			do {
				System.out.print("OPCION SELECCIONADA: ");
				opcion = sc.nextInt();
			} while (opcion > 3 && opcion < 1);

			/**
			 * Casos posible al seleccionar 0, 1, 2, o 3 en consola
			 */
			switch (opcion) {
			
			/**
			 * Caso 0: salir del programa
			 */
			case 0:
				break;

			/**
			 * Caso 1: Editar texto del string texto1 y enviar al estado
			 */
			case 1:
				System.out.print("Escribe el texto: ");
				sc.nextLine();
				texto1 = sc.nextLine();
				nota1.setEstado(texto1);
				break;

			/**
			 * Caso 2: Guardar texto en memento
			 */
			case 2:
				caretaker.addMemento(nota1.salvandoParaMemento());
				index++;
				break;

			/**
			 * Caso 3: Restaurar estaado guardado en memento del String texto1
			 */
			case 3:
				if (caretaker.getEstadosSalvados().size() == 0) { // Para evitar error de ArrayList vacio
					System.out.println("NO HAY NINGUN TEXTO GUARDADO");
					break;
				} else {
					if (index > 0) {
						index--;
					}
					nota1.recuperandoDesdeMemento(caretaker.getMemento(index));
					break;
				}
			}
		} while (opcion != 0);
	}
}