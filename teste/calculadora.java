package teste;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {

		//variaveis
		String calc;
		float num1, num2, result;
	
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.println("insira o metodo de calculo com os seguintes caracteres: \n"
				+ "/ para divisão. \n"
				+ "* para multiplicação. \n"
				+ "+ para adição. \n"
				+ "- para subtração.");
			
				
		calc = teclado.next();
		
				

	}

}
