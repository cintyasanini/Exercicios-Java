package JavaAtividades;
import java.util.Scanner;


public class Atividade19 {

	public static void main(String[] args) {
		
		double dolar;
		double cotacao;
		double real;
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Quanto de dolar você tem?");
			dolar = entrada.nextDouble();
			
			System.out.println("Qual e a cotaçao do dolar atualmente? ");
			cotacao = entrada.nextDouble();
		}
		
		real = dolar * cotacao;
		
		
		System.out.println("Voce tem em reais " + real);
	 }

}
