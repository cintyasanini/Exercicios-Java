package JavaAtividades;
import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		
		int numero;
		int antecessor;
		int sucessor;
		
		 try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Insira o numero que deseja saber o sucessor e antecessor: ");
			numero = entrada.nextInt();
		}
		 
		 	antecessor = numero - 1;
			sucessor = numero + 1;
			
			System.out.println("O seu numero e o: " + numero + "\n" + "O seu numero sucessor e: " + sucessor + "\n" + "O seu antecessor e: " + antecessor);
			
		
		
		
	}

}
