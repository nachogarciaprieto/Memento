import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int opcion = 1, index = -1;
		String texto1 = null;
		Scanner sc = new Scanner(System.in);

		Caretaker caretaker = new Caretaker();
		NotaDeTexto nota1 = new NotaDeTexto();

		// MENÚ
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

			switch (opcion) {
			case 0:
				break;

			case 1:
				System.out.print("Escribe el texto: ");
				sc.nextLine();
				texto1 = sc.nextLine();
				nota1.setEstado(texto1);
				break;

			case 2:
				caretaker.addMemento(nota1.salvandoParaMemento());
				index++;
				break;

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