package JavaAtividades;
import java.util.Scanner;

public class Atividade21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valor;
		double prestacoes;
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Insira o valor do produto: ");
			valor = entrada.nextDouble();
		}
		
		
		prestacoes = valor/5;
		
		System.out.println("Suas prestacoes sao no valor de: " + prestacoes);
	}

}
