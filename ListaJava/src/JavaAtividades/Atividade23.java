package JavaAtividades;
import java.util.Scanner;

public class Atividade23 {

	public static void main(String[] args) {
try (Scanner entrada = new Scanner(System.in)) {
	int[] numero = new int[20];
	int contador1 = 0;
	int contador2 = 0;
	int contador3 = 0;

	for(int i = 0; i < numero.length; i++) {
		System.out.printf("Digite um numero %d: ", i + 1);
		numero[i] = entrada.nextInt();
	
		if(numero[i] >= 0 && numero[i] <= 100 ) {
			contador1++;
		}
		if(numero[i] >= 101 && numero[i] <= 200 ) {
			contador2++;
		}
		if(numero[i] >= 201) {
			contador3++;
		}
	}
	
	System.out.println("Estao entre 100:" + contador1);
	System.out.println("Estão entre 101 e 200:" + contador2);
	System.out.println("Sao maiores que 200:" + contador3);
}
	}
}