package JavaAtividades;
import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner (System.in)) {
			int a;
			int b;
			int c;

			System.out.println("Digite um número: ");
			a = entrada.nextInt();
			b = entrada.nextInt();
			c = entrada.nextInt();

			if( ( a > b && a > c) && ( b > c ) ) {
			   System.out.println(a);
			   System.out.println(b);
			   System.out.println(c);
			}
			else if( ( a > b && a > c ) && ( c > b ) ) {
			   System.out.println(a);
			   System.out.println(c);
			   System.out.println(b);
			}
			else if( ( b > a && b > c ) && ( a > c ) ) {
			   System.out.println(b);
			   System.out.println(a);
			   System.out.println(c);
			}
			else if( ( b > a && b > c ) && ( c > a ) ) {
			   System.out.println(b);
			   System.out.println(c);
			   System.out.println(a);
			}
			else if( ( c > a && c > b ) && ( a > b ) ) {
			   System.out.println(c);
			   System.out.println(a);
			   System.out.println(b);
			}
			else if( ( c > a && c > b ) && ( b > a ) ) {
			   System.out.println(c);
			   System.out.println(b);
			   System.out.println(a);
			}
		}
		}
		
	}

