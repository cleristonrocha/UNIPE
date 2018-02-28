
import java.util.Scanner;

public class Tabuada {
	
	public static void main(String[] args) {
		
		int numero;
		int i;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um numero para saber sua tabuada: ");
		numero = leitor.nextInt();
		
		for(i=1; i<10; i++){
			
			System.out.println(numero + " x " + i + " = " + (numero*i));
			
		}
		
		leitor.close();
	}

}
