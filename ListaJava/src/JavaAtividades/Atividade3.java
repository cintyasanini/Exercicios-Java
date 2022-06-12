package JavaAtividades;
import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		float media;
		double operacao;
		
		try (Scanner entrada = new Scanner (System.in)) {
			System.out.println("Digite seu saldo medio: ");
			media = entrada.nextFloat();
		}
		if(media <= 500) {
			System.out.println("Nao ha credito.");
		}else if(media <= 1000) {
			operacao = media * (30.00/100.00);
			System.out.println("seu saldo medio e de: " + media + " e credito e no valor de " + operacao);
		}else if(media <= 3000) {
			operacao = media * (40.00/100.00);
			System.out.println("seu saldo medio e de: " + media + " e credito e no valor de " + operacao);
		}else if (media >= 3001) {
			operacao = media * (50.00/100.00);
			System.out.println("seu saldo medio e de: " + media + " e credito e no valor de " + operacao);
		}
		

	}

}