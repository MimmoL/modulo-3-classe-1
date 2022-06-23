package com.mockito;



public class ContatoreService {

	private Contatore contatore;
	
	
	public ContatoreService(Contatore contatore) {
        this.contatore = contatore;
    }
	
	public int multiplyBy(int y) {
		return contatore.getX()*y;
	}
}
