package JavaAtividades;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		
		int numero = 0;
		boolean divisivel = false;
		
		try (Scanner entrada = new Scanner (System.in)) {
			System.out.println("Qual numero deseja saber se e divisivel?: ");
			numero = entrada.nextInt();
		}
		
		if(numero % 2 == 0){
			System.out.println(numero + " e divisivel por 2");
			divisivel = true;
		}if(numero % 5 == 0){
			System.out.println(numero + " e divisivel por 5");
			divisivel = true;
		}if(numero % 10 == 0 ) {
			System.out.println(numero + " e divisivel por 10");
			divisivel = true;
		}else if(divisivel == false){
			System.out.println("Erro");
		}
		
	}

}
