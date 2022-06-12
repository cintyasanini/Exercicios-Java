package JavaAtividades;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
try (Scanner entrada = new Scanner (System.in)) {
	int prato;
	int sobremesa;
	int bebida;
	int caloria = 0;
	
	System.out.println("Escolha um prato: (1 - Vegetariano, 2 - Peixe, 3 - Frango, 4 - Carne)");
	prato = entrada.nextInt();
	
	switch(prato) {
	case 1: 
		caloria = caloria + 180; 
		System.out.println("Os pratos escolhidos possuem " + caloria + " calorias.");
		break;
		
	case 2:
		caloria = caloria + 230;
		System.out.println("Os pratos escolhidos possuem " + caloria + " calorias.");
		break;
		
	case 3:
		caloria = caloria + 250;
		System.out.println("Os pratos escolhidos possuem " + caloria + " calorias.");
		break;
		
	case 4:
		caloria = caloria + 350;
		System.out.println("Os pratos escolhidos possuem " + caloria + " calorias.");
		break;
	}
	
	System.out.println("Escolha uma sobremesa: (1 - Abacaxi, 2 - Sorvete diet, 3 - Mouse diet, 4 - Mouse chocolate)");
	sobremesa = entrada.nextInt();
	
	switch(sobremesa) {
	case 1: 
		caloria = caloria + 75; 
		System.out.println("Os pratos escolhidos possuem " + caloria + " calorias.");
		break;
		
	case 2:
		caloria = caloria + 110;
		System.out.println("Os pratos escolhidos possuem " + caloria + " calorias.");
		break;
		
	case 3:
		caloria = caloria + 170;
		System.out.println("Os pratos escolhidos possuem " + caloria + " calorias.");
		break;
		
	case 4:
		caloria = caloria + 200;
		System.out.println("Os pratos escolhidos possuem " + caloria + " calorias.");
		break;
	}
	
	
	System.out.println("Escolha uma sobremesa: (1 - Abacaxi, 2 - Sorvete diet, 3 - Mouse diet, 4 - Mouse chocolate)");
	bebida = entrada.nextInt();
	
	switch(bebida) {
	case 1: 
		caloria = caloria + 20; 
		System.out.println("Os pratos escolhidos possuem " + caloria + " calorias.");
		break;
		
	case 2:
		caloria = caloria + 70;
		System.out.println("Os pratos escolhidos possuem " + caloria + " calorias.");
		break;
		
	case 3:
		caloria = caloria + 100;
		System.out.println("Os pratos escolhidos possuem " + caloria + " calorias.");
		break;
		
	case 4:
		caloria = caloria + 65;
		System.out.println("Os pratos escolhidos possuem " + caloria + " calorias.");
		break;
	}
}		
		
	}

}