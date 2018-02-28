
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		float salario;
		float aumento;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe seu salario: ");
		salario = leitor.nextFloat();
		
		System.out.println("Percentual de aumento: ");
		aumento = leitor.nextFloat();
		
		salario = salario*aumento/100 + salario;
		
		System.out.printf("Salario final: %.2f", salario);
		
		leitor.close();
	}
}
