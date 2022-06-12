package JavaAtividades;
import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner (System.in)) {
			int idade;
			
			System.out.println("Digite sua idade: ");
			idade = entrada.nextInt();
			
			if(idade < 16) {
				System.out.println("Nao pode votar");
			}else if(idade >= 18 && idade <= 70) {
				System.out.println("Voto obrigatorio");
			}else {
				System.out.println("Voto facultativo");
			}
		}
	}
}