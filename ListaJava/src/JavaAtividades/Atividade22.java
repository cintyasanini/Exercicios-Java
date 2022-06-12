package JavaAtividades;
import java.util.Scanner;

public class Atividade22 {

	public static void main(String[] args) {
		
		int[] numero = new int[20];
		int contador = 20;
		
		try (Scanner entrada = new Scanner(System.in)) {
			for(int i = 0; i < numero.length; i++) {
				System.out.printf("Digite um número %d: ", i + 1);
				numero[i] = entrada.nextInt();
			
				if(numero[i] >= 0 && numero[i] >= 100 ) {
					contador--;
				}
			}
		}
		
		System.out.println("Estao entre 100: " + contador);
	}
}
	