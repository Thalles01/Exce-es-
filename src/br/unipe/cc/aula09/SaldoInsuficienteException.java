package br.unipe.cc.aula09;
/**
 * Exception SaldoInsuficiente
 * @author Thalles Robert
 *
 */
public class SaldoInsuficienteException extends Exception{
	
	
	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteException(){
		super("Sem saldo na conta!");
	}

}