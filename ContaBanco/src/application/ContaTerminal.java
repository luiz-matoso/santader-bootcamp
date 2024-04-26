package application;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Por favor, digite o número da agência: ");
		String agencia = sc.nextLine();
		
		System.out.println("Digite o número da conta: ");
		int numero = sc.nextInt();
		
		System.out.println("Digite o seu saldo: ");
		double saldo = sc.nextDouble();
		
		System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque");
		
		sc.close();
	}

}
