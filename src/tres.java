import java.util.Scanner;
import java.util.ArrayList;

public class tres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner (System.in);

	ArrayList<Integer> numero = new ArrayList<Integer>();
	int aux = 0;
	
	do {
	System.out.println("Introduce un numero positivo");
	aux = sc.nextInt();
	numero.add(aux);
	} while(aux != -1);
	
	numero.remove(numero.size()-1);
	
	for (int i = 0; i < numero.size(); i++) {
		System.out.println((numero.get(i)*5)-3);
		}
	}
}
