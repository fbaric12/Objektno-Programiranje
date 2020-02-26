package pckg.fst;

import java.util.Scanner;

public class AppCls {

	public static void main(String[] args) {
// 		int m = 5;
		int suma = 0;
		System.out.println("Unesite jedan broj: ");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		for (int i = 0; i <= m; i++) {
			suma = suma + i;
		
		}	
		System.out.println("Suma je " + suma);
	sc.close();
	}
	
	

}
