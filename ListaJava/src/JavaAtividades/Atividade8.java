package JavaAtividades;
import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			double IPI;
			int codigo1;
			double valor1;
			int qtde1;
			int codigo2;
			double valor2;
			int qtde2;
			double total;
			
			System.out.println("Insira o valor percentual da IPI: ");
			IPI = entrada.nextDouble();
			
			System.out.println("Insira o codigo da peça 1: ");
			codigo1 = entrada.nextInt();
			
			System.out.println("Insira o valor da peça 1: ");
			valor1 = entrada.nextDouble();
			
			System.out.println("Insira a quantidade da peça 1: ");
			qtde1 = entrada.nextInt();
			
			System.out.println("Insira o codigo da peça 2: ");
			codigo2 = entrada.nextInt();
			
			System.out.println("Insira o valor da peça 2: ");
			valor2 = entrada.nextDouble();
			
			System.out.println("Insira a quantidade da peça2: ");
			qtde2 = entrada.nextInt();
			
			total = (valor1*qtde1 + valor2*qtde2)*(IPI/100 + 1);
			
			System.out.println("O total eh: " + total);
		}
				
	}

}