package it.unipv.sfw.stampante;

public class Stampante {
	
	private double cartucciaR;
	private double cartucciaG;
	private double cartucciaB;
	public final double MAX_INCHIOSTRO = 100;
	
	public Stampante() {
		inizializzaCartucce();
	}
	
	public void inizializzaCartucce() {
		cartucciaR = MAX_INCHIOSTRO;
		cartucciaG = MAX_INCHIOSTRO;
		cartucciaB = MAX_INCHIOSTRO;
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
			return "Sostituzione cartuccia di colore " + c + " effettuata con successo.";
		}else {
			return "Errore nella sostituzione.";
		}
	}
	
	public String stampaImmagine(Immagine imm) {
		double rosso = imm.getConsumoR();
		double verde = imm.getConsumoG();
		double blu = imm.getConsumoB();
		
		if(cartucciaR >= rosso && cartucciaG >= verde && cartucciaB >= blu) {
			cartucciaR -= rosso;
			cartucciaG -= verde;
			cartucciaB -= blu;
			return "Stampa effettuata con successo.";
		} else {
			return "Errore: Inchiostro insufficiente per completare la stampa.";
		}
	}
	
}
