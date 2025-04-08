package projetoSimples;

import java.util.Scanner;

public class calculo {
	public static void main (String []args) {
		System.out.println("OLA! SOU SUA CALCULADORA DIGITAL \n");
		Scanner scanner = new Scanner (System.in);
		System.out.println("Digite o primeiro numero:\n ");
		double num1 = scanner.nextDouble();
		System.out.println("Digite o segundo numero:\n ");
		double num2 = scanner.nextDouble();
		System.out.println("Digite a operacao : +, -, *, /.");
		char operador= scanner.next().charAt(0);
		
		scanner.close();
		
		double result;
		
		switch(operador) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 + num2;
				break;
			case '*':
				result = num1 + num2;
				break;
			case '/':
				result = num1 + num2;
				break;
			default:
				System.out.println("Operaçao Invalida!");
				return;
			
		}
		
		System.out.println(num1+" "+ operador+" "+num2+" = "+result);
	}
}
