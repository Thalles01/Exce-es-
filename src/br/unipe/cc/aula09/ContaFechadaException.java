package br.unipe.cc.aula09;
/**
 * Exception ContaFechada
 * @author Thalles Robert
 *
 */
public class ContaFechadaException extends Exception{
	
	
	private static final long serialVersionUID = 1L;

	public ContaFechadaException(){
		super("A conta está fechada!");
	}

}