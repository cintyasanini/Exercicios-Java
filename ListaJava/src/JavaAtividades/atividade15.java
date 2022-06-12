package JavaAtividades;
import java.util.Scanner;

public class atividade15 {

	public static void main(String[] args) {
		int i = 0;
		int idade = 0;
		int total = 0;
	
		try (Scanner entrada = new Scanner(System.in)) {
			while(i <= 20) {
				System.out.println("Insira uma idade: ");
				idade = entrada.nextInt();
				total = total + idade;
				i++;
			}
		}
		
		System.out.println("A soma das idades inseridas e: " + total);
		
	}

}
