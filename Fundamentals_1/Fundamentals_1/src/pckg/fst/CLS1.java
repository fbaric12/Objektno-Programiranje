package pckg.fst;

public class CLS1 {

	public static void main(String[] args) {
		String nm = "petak";
		
		switch (nm) {
		case "ponedjeljak":
			System.out.println("Danas je -> " + nm);
			break;
		case "utorak":
			System.out.println("Danas je -> " + nm);
			break;
		case "srijeda":
			System.out.println("Danas je -> " + nm);
			break;
		case "cetvrtak":
			System.out.println("Danas je -> " + nm);
			break;
		
		default:System.out.println("Tog dana u tjednu nema !!!");
			break;
		}
		

	}

}
