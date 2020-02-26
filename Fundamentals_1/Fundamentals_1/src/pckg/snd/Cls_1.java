package pckg.snd;

public class Cls_1 {

	public static void main(String[] args) {
		String str = "Uh što mi je zanimljivo kod barba Ante na predavanju :-)";
		char[] niz = str.toCharArray();
		
		for (char ch :niz) {
			System.out.println(ch);
		}
		System.out.println("\n***************************************");
		for (int k = 0; k < niz.length; k++) {
			System.out.println(niz[k]);
		}
	}
	

}
