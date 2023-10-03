package me.dio.conta_banco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		// obtendo o número da conta do cliente através do terminal
		Integer numero = obterNumero(scanner);

		// obtendo a agência do cliente através do terminal
		String agencia = obterAgencia(scanner);

		// obtendo o nome do cliente através do terminal
		String nomeCliente = obterNomeCliente(scanner);

		// obtendo o saldo inicial da conta bancária através do terminal
		Double saldo = obterSaldoInicial(scanner);
		
		Conta contaBancaria = new Conta(numero, agencia, nomeCliente, saldo);
		imprimirInformacoesConta(contaBancaria);
		
		scanner.close();
	}

	private static Integer obterNumero(Scanner scanner) {
		System.out.println("Informe o número da conta bancária: ");
		Integer numero = scanner.nextInt();
		scanner.nextLine();
		return numero;
	}

	private static String obterAgencia(Scanner scanner) {
		System.out.println("Informe a agência bancária: ");
		String agencia = scanner.nextLine();
		return agencia;
	}

	private static String obterNomeCliente(Scanner scanner) {
		System.out.println("Informe o nome do cliente da conta bancária: ");
		
		String nomeCliente = scanner.nextLine();
		return nomeCliente;
	}
	
	private static Double obterSaldoInicial(Scanner scanner) {
		System.out.println("Informe o saldo inicial da conta bancária: ");
		Double saldo = scanner.nextDouble();
		scanner.nextLine();
		return saldo;
	}
	
	private static void imprimirInformacoesConta(Conta conta) {
		System.out.println("***********************************************");
		System.out.printf("Olá [%s], obrigado por criar uma conta em nosso banco, sua agência é [%s], conta [%d], e seu saldo [%.2f] já está disponível para saque.%n",
		conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());
		System.out.println("***********************************************");
	}
}
