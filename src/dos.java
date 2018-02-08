import java.util.Scanner;

public class dos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner (System.in);

	String vocales = "aeiou";
	String frase = "";
	
	System.out.println("Introduce una cadena de caracteres");
	frase = sc.nextLine();
	frase = frase.toLowerCase();
	
	for (int i = 0; i < frase.length(); i++) {
		for (int j = 0; j < vocales.length(); j++) {
			if(frase.charAt(i)==vocales.charAt(j)) {
				frase = frase.replace(frase.charAt(i),vocales.charAt(0));
			}
		}
	}
	System.out.println(frase);
	
	for (int i = 0; i < frase.length(); i++) {
		for (int j = 0; j < vocales.length(); j++) {
			if(frase.charAt(i)==vocales.charAt(j)) {
				frase = frase.replace(frase.charAt(i),vocales.charAt(1));
			}
		}
	}
	System.out.println(frase);
		
	for (int i = 0; i < frase.length(); i++) {
		for (int j = 0; j < vocales.length(); j++) {
			if(frase.charAt(i)==vocales.charAt(j)) {
				frase = frase.replace(frase.charAt(i),vocales.charAt(2));
			}
		}
	}
	System.out.println(frase);
	
	for (int i = 0; i < frase.length(); i++) {
		for (int j = 0; j < vocales.length(); j++) {
			if(frase.charAt(i)==vocales.charAt(j)) {
				frase = frase.replace(frase.charAt(i),vocales.charAt(3));
			}
		}
	}
	System.out.println(frase);
	
	for (int i = 0; i < frase.length(); i++) {
		for (int j = 0; j < vocales.length(); j++) {
			if(frase.charAt(i)==vocales.charAt(j)) {
				frase = frase.replace(frase.charAt(i),vocales.charAt(4));
			}
		}
	}
	System.out.println(frase);
	}
}

	