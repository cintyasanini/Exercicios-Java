package JavaAtividades;
import java.util.Scanner;

public class Atividade16 {

	public static void main(String[] args) {
		
		int i = 0;
		int idade = 0;
		int soma = 0;
		int media = 0;
		
		try (Scanner entrada = new Scanner (System.in)) {
		
			while(i <= 20) {
				System.out.println("Insira uma idade: ");
				idade = entrada.nextInt();
				soma = soma + idade;
				i++;
				
				media = soma/20;
			}
		}
	
		System.out.println("a media de idades e: " + media);
		
	

	}


	}


