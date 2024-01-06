import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws java.lang.Exception {

		// Constrói um Array com 10 posições

		int[] lista = { 4, 32, 34, 543, 3456, 654, 567, 87, 6789, 98 };

		// Coloca o Array em ordem crescente

		Arrays.sort(lista);

		// Lista o Array em ordem crescente

		System.out.print("Ordem crescente pares:    ");

		for (int j = 0; j < lista.length; j++) {
			// somente os pares em crescente
			if (lista[j] % 2 == 0) {

				System.out.print("\n" + lista[j]);
			}
		}

		System.out.print("\n");

		// Comparador

		for (int i = 0; i < lista.length; i++) {

			lista[i] = -lista[i];
		}

		Arrays.sort(lista);

		for (int i = 0; i < lista.length; i++) {

			lista[i] = -lista[i];
		}

		// Lista o Array em ordem descrescente
		System.out.print("\nOrdem decrescente:    ");

		for (int n : lista) {
			if (n % 3 == 0) {
				System.out.print("\n" + n);
			}
		}
	}
}
