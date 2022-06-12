package JavaAtividades;
import java.util.Scanner;

public class Atividade18 {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			int menor = 0;
			int idade = 0;
			int i = 0;
			
			while(i < 10) {
				System.out.println("Insira uma idade: ");
				idade = entrada.nextInt();
				if(i == 0) {
					menor = idade;
				}else {
					if(idade < menor) {
						menor = idade;
					}
				}
				i++;
				
			}
			System.out.println("A pessoa mais nova tem : " + menor + " anos.");
		}
		

	}


	}

