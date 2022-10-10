package ContaCorrente;

import java.util.Scanner;

public class ContaCorrenteMain {
	
	public static void main(String[] args) {
	
		Scanner leitura = new Scanner(System.in);
		
		ContaCorrente pessoa = new ContaCorrente();
		
		System.out.println("Digite seu nome: ");
		pessoa.NomeDoTitular = leitura.nextLine();
		System.out.println("digite seu cpf: ");
		pessoa.cpf = leitura.nextLong();
		System.out.println("digite o numero da sua conta");
		pessoa.NumeroDaConta = leitura.nextLong();
		System.out.println("informe o saldo");
		pessoa.saldo = leitura.nextFloat();
		
		System.out.println("Qual ação você deseja realizar?");
		System.out.println("1- sacar valor");
		System.out.println("2- depositar valor");
		System.out.println("3 visualizar seus dados");
		int i = leitura.nextInt();
		
		if(i==1) {
			float quantidade = leitura.nextFloat();
			pessoa.sacar(quantidade);
			System.out.println(pessoa.saldo);
		}
		
		if(i==2) {
			Float quantidade = leitura.nextFloat();
			pessoa.depositar(quantidade);
			System.out.println(pessoa.saldo);
		}
		
		if(i==3) {
			pessoa.MostrarDados();
		}
		
		
		
		
	}
}
