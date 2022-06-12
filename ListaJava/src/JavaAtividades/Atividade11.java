package JavaAtividades;
import java.util.Scanner;

public class Atividade11 {

	public static void main(String[] args) {
		
		String nome;
		int salarioFixo;
		int comissao;
		double salarioTotal;
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Ola, qual e o seu nome? ");
			nome = entrada.next();
			
			System.out.println("Qual o seu salario fixo? ");
			salarioFixo = entrada.nextInt();
			
			System.out.println(" Qual e o total de vendas feitas por voce? (em dinheiro). ");
			comissao = entrada.nextInt();
		}
		
		salarioTotal = salarioFixo + (comissao*0.15);
		
		System.out.println("Ola, " + nome + ". Seu salario fixo e de " + salarioFixo + " e você ganhou " + comissao + " de comissao, sendo seu salario total de " + salarioTotal); 
	}

}
