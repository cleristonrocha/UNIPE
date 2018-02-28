
import java.util.Scanner;

public class Par {

	public static void main(String[] args) {
		
		int numero;
		int i;
		Scanner leitor = new Scanner(System.in);
		
		for (i=0; i<10; i++){
			
			System.out.println("Digite um numero inteiro diferente de 0: ");
			numero = leitor.nextInt();
			
			if(numero % 2 == 0){
				
				System.out.printf(numero + " é par\n");
				
			} else {
				
				System.out.printf(numero + " é impar\n");
			}
		}
		
		leitor.close();
	}
}
