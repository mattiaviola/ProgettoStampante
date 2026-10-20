package it.unipv.sfw.stampante;

public class Stampante {
	
	private double cartucciaR;
	private double cartucciaG;
	private double cartucciaB;
	
	public Stampante() {
		cartucciaR = 100;
		cartucciaG = 100;
		cartucciaB = 100;
	}

	public double getCartucciaR() {
		return cartucciaR;
	}

	public void setCartucciaR(double cartucciaR) {
		this.cartucciaR = cartucciaR;
	}

	public double getCartucciaG() {
		return cartucciaG;
	}

	public void setCartucciaG(double cartucciaG) {
		this.cartucciaG = cartucciaG;
	}

	public double getCartucciaB() {
		return cartucciaB;
	}

	public void setCartucciaB(double cartucciaB) {
		this.cartucciaB = cartucciaB;
	}
	
	public String inchiostroResiduo() {
		return "Rosso: " + this.getCartucciaR() + 
				"; verde: " + this.getCartucciaG() +
				"; blu: " + this.getCartucciaB();
	}
	
	public String sostituisciCartuccia(Colori c) {
		boolean done = false;
		switch(c) {
			case ROSSO:
				this.setCartucciaR(100);
				done = true;
				break;
			case VERDE:
				this.setCartucciaG(100);
				done = true;
				break;
			case BLU:
				this.setCartucciaB(100);
				done = true;
				break;
		}
		if(done) {
			return "Sostituzione effettuata con successo.";
		}else {
			return "Errore nella sostituzione.";
		}
	}
	
	public String stampaImmagine(ImgVett imm) {
		double rosso = 0;
		double verde = 0;
		double blu = 0;
		
		for(int i = 0; i < imm.getForme().length; i++) {
			rosso += ( imm.getForme()[i].getColore().R / 255 ) * 10;
			verde += ( imm.getForme()[i].getColore().G / 255 ) * 10;
			blu += ( imm.getForme()[i].getColore().B / 255 ) * 10;
		}
		
		if(this.cartucciaR >= rosso && this.cartucciaG >= verde && this.cartucciaB >= blu) {
			cartucciaR -= rosso;
			cartucciaG -= verde;
			cartucciaB -= blu;
			return "Stampa effettuata con successo";
		}else {
			return "Errore nella stampa";
		}
	}
	
}
