package pckg.snd;

import java.util.Arrays;

public class While {

	public static void main(String[] args) {
		
		int[] ar1 = new int[5];
		String[] st1 = {"prvi", "drugi", "treci", "cetvrti"};
		
		int brojac = 0;
		while (brojac < st1.length) {
			System.out.println("str1[ " + brojac + " ] --> " + st1[brojac]);
		brojac += 1;
		
		
		}
		System.out.println(Arrays.toString(ar1));
	}
}
