import java.util.Scanner;

public class uno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner (System.in);
	
	String vocales = "aeiou";
	String palabra = "";
	
	System.out.println("Introduce una palabra");
	palabra = sc.nextLine();
	palabra = palabra.toLowerCase();
	
	int contador [] = {0,0,0,0,0};
	for (int i = 0; i < palabra.length(); i++) {
		for (int j = 0; j < vocales.length(); j++) {
			if(palabra.charAt(i) == vocales.charAt(j)) {
				contador[j]++;
				}
			}
		}   
	 if(contador[0] != 0 && contador[1] != 0 && contador[2] != 0 && contador[3] != 0 && contador[4] != 0) {
		System.out.println("La palabra tiene aeiou -Tururú");
	 	}
	 else {
		System.out.println("Le faltan vocales");
	 }
	}	
}



