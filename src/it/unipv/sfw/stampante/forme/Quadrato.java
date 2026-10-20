package it.unipv.sfw.stampante.forme;
import it.unipv.sfw.stampante.*;

public class Quadrato extends Forme{
	
	private double lato;
	
	public Quadrato(double l, RGBColor c) {
		super(c);
		this.lato = l;
	}
	
	public double getLato() {
		return this.lato;
	}
	
	public void setLato(double lato) {
		this.lato = lato;
	}
	
	public double area() {
		return lato * lato;
	}
	
	public double perimetro() {
		return lato * 4;
	}
	
}
