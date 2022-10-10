package ContaCorrente;

public class ContaCorrente {

	public String NomeDoTitular;
	public Long cpf;
	public Long NumeroDaConta;
	public Float saldo;
	
	
	public Float sacar(float SacarValor) {
		if(Sacarvalor > saldo) {
			System.out.println("saldo insuficiente!");
		} else {
		saldo -= SacarValor;
		}
		return saldo;
	}
	
	
	public Float depositar(float DepositarValor) {
		saldo += DepositarValor;
		return saldo;
	}
	
	public void MostrarDados() {
		System.out.println("titular: " +NomeDoTitular);
		System.out.println("cpf: " +cpf);
		System.out.println("Conta: " +NumeroDaConta);
		System.out.println("saldo: " +saldo);
	}
	
}