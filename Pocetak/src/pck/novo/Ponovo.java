package pck.novo;

import java.util.Scanner;

public class Ponovo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite bilo sto:\n");
		
		if (sc.hasNextInt()) {
			System.out.println("Unijeli ste cjelobrojnu vrijednost -> " + sc.nextInt());
		}else if(sc.hasNextDouble()) {
			System.out.println("Unijeli ste realnu vrijednost -> " + sc.nextDouble());
		}else if(sc.hasNextBoolean()) {
			System.out.println("Unijeli ste -> " + sc.nextBoolean());
		}else {
			System.out.println("Unijeli ste znak ili string -> " + sc.next());
		}
		sc.close();
	}
}
