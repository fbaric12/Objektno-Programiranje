package pckg.fst;

import java.util.Scanner;

public class WhilePetlja {

	public static void main(String[] args) {
		int suma = 0;
		int brojac = 0;
		System.out.println("Unesite broj: ");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		while (brojac <= m) {
			suma += brojac;
			brojac += 1;
		}
		System.out.println("Suma je " + suma);
		sc.close();
	}
	
}
