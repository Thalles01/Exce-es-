package br.unipe.cc.aula09;
/**
 * Exception SaqueNegativo
 * @author Thalles Robert
 *
 */
public class SaqueNegativoException extends Exception{

	
	private static final long serialVersionUID = 1L;

	public SaqueNegativoException(){
		super("Esperava receber valor positivo!");
	}
	
}