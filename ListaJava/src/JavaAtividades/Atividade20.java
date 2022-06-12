package JavaAtividades;
import java.util.Scanner;

public class Atividade20 {

	public static void main(String[] args) {
		
		double numero;
		int i = 0;
		int soma = 0;
		
		try (Scanner entrada = new Scanner(System.in)) {
			while(i < 20) {
				System.out.println("Insira um numero: ");
				numero = entrada.nextDouble();
				if(numero > 8) {
					soma++;
				}
				i++;
			}
		}
		
		System.out.println(soma + " dos numeros sao maiores que 8");
		}
			}