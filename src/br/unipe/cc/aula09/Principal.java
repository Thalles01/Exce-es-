package br.unipe.cc.aula09;
/**
 * Programa principal
 * @author Thalles Robert
 *
 */
public class Principal {

	public static void main(String[] args) throws SaldoInsuficienteException, SaqueNegativoException, ContaFechadaException{
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.abrirConta();
		conta.sacar(20.0f);
		
		System.out.println("Saldo restante: R$" + conta.getValor());
		
	}

}