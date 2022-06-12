package JavaAtividades;
import java.util.Scanner;

public class Atividade14 {

	public static void main(String[] args) {
		
		int numero = 0;
		int soma = 0;
		
		try (Scanner entrada = new Scanner (System.in)) {
			for(int i = 1; i <= 10; i++) {
				System.out.println("Digite um número:");
				numero = entrada.nextInt();
				
				soma = soma + numero;	
				
			}
		}
		
		System.out.println("A soma dos números digitados é: " + soma);
		
	

	}

}