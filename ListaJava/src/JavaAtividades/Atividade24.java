package JavaAtividades;

import java.util.Scanner;

public class Atividade24 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor = 0, soma = 0;

		while (valor >= 0){
			System.out.println("Digite o valor: ");
			valor = entrada.nextInt();
			soma += valor;
		}
		System.out.println("Valor final: " + soma);
	}
}