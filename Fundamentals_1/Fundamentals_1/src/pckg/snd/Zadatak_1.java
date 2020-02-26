package pckg.snd;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		boolean flag;
		
		for (int k = 0; k < arr.length; k++) {
			flag = true;
			while(flag) {
				System.out.println("Unesite jedan cijeli broj na -> " + k + " poziciju: ");
				if(sc.hasNextInt()) {
					arr[k] = sc.nextInt();
					System.out.println("In " + k + " position you have entered -> " + arr[k]);
					flag = false;
				}
				else {
					System.out.println("Niste unijeli cijeli broj - integer!");
				}
				sc.nextLine();
			}
			
		}
		sc.close();
		System.out.println(Arrays.toString(arr));
	}
}
