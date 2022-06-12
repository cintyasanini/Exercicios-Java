package JavaAtividades;
import java.util.Scanner;

public class Atividade13 {

	public static void main(String[] args) {
		
		double celsius;
		double fahrenheit;
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Qual e a temperatura em graus Celsius?");
			celsius = entrada.nextDouble();
		}
		
		fahrenheit = (9*celsius+160)/5; 
		
		System.out.println("Sua temperatura em Fahrenheit e " + fahrenheit + "F");

	}

}
