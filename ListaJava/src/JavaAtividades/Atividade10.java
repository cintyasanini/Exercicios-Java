package JavaAtividades;
import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {

		int saldo;
		double reajuste;
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Qual e o saldo? ");
			saldo = entrada.nextInt();
		}
		
		reajuste = saldo * (1.50/100.00);
		
		System.out.println("Seu saldo e de: " + saldo + "\n" + "Seu reajuste e de: " + reajuste);

	}

}
