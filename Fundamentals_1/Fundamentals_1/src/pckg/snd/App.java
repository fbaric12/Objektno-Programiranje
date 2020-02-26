package pckg.snd;

public class App {

	public static void main(String[] args) {
		int[] ar1 = new int[5];
		String[] st1 = {"prvi", "drugi", "treci", "cetvrti", "peti"};
		
		for (int k = 0; k < ar1.length; k++) {
			ar1[k] = k+1;
			System.out.println("ar1[" + k + "] --> " + ar1[k]);
		}
	}

}
