package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.ContaTerminal;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da Agência!");
		int numero = scanner.nextInt();
		
		System.out.println("Por favor, informe a Agência!");
		scanner.nextLine();
		String agencia = scanner.nextLine();
		
		System.out.println("Por favor, digite o nome do Cliente!");
		String cliente = scanner.nextLine();
		
		System.out.println("Por favor, digite o valor do saldo inicial");
		Double saldo = scanner.nextDouble();
		
		ContaTerminal contaTerminal = new ContaTerminal(numero, agencia, cliente, saldo);
		
		System.out.println(contaTerminal);
	}
}
