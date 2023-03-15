package exl3;

import java.util.Scanner;

public class ex1 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		/* EX1a */
		System.out.printf("Inserisci stringa: (true=pari)");
		String stringanuova = scan.nextLine();
		System.out.println(stringaPariDispari(stringanuova));

		/* EX1b */
		System.out.printf("Inserisci anno: (true=bisest)");
		int annonuovo = scan.nextInt();
		System.out.println(annoBisestile(annonuovo));

		/* EX2 */
		System.out.printf("Inserisci un numero da 0 a 3:");
		int numero = scan.nextInt();
		System.out.println(testswitch(numero));

		/* EX3 */
		System.out.printf("Inserisci una stringa: (:q to quit)");
		splittastringa();

		/* EX4 */
		System.out.printf("Inserisci un numero basso possibilmente:");
		int cd = scan.nextInt();
		contoRovescia(cd);
	}

	public static boolean stringaPariDispari(String str) {
		int length = str.length();
		if (length % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean annoBisestile(int input) {
		if (input % 4 == 0) {
			return true;
		} else if (input % 100 == 0 || input % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static String testswitch(int num) {
		switch (num) {
		case 0:
			return "zero";
		case 1:
			return "uno";
		case 2:
			return "due";
		case 3:
			return "tre";
		default:
			return "Il valore non è compreso tra 0 e 3";
		}

	}

	public static void splittastringa() {
		String stringawhile = "";
		while (!stringawhile.equals(":q")) {
			stringawhile = scan.nextLine();
			String[] parts = stringawhile.split("");
			for (int i = 0; i < parts.length; i++) {
				System.out.print(parts[i] + ", ");
			}
		}
	}

	public static void contoRovescia(int n) {
		for (int i = n; i >= 0; i--) {
			System.out.println(i);
		}
	}

}
