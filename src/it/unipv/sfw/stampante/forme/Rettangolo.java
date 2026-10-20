package it.unipv.sfw.stampante.forme;
import it.unipv.sfw.stampante.*;

public class Rettangolo extends Forme {
	
	private double base, altezza;
	
	public Rettangolo(double base, double altezza, RGBColor c) {
		super(c);
		this.base = base;
		this.altezza = altezza;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	
	public double area() {
		return base * altezza;
	}
	
	public double perimetro() {
		return (base * 2) + (altezza * 2);
	}
	
}
