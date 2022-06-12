package JavaAtividades;
import java.util.Scanner;

public class Atividade9 {

	public static void main(String[] args) {
		int salario;
		int minSalario =  1212;
		int total;
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Qual e o seu salario? ");
			salario = entrada.nextInt();
		}
		
		total = salario / minSalario;
		
		System.out.println("Seu salario e relativo a " + total + " salarios minimos");
		
		

	}

}
