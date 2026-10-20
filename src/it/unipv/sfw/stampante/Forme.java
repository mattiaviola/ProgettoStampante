package it.unipv.sfw.stampante;

public abstract class Forme {

	private RGBColor colore;
	
	public Forme(RGBColor c){
		this.colore = c;
	}
	
	public RGBColor getColore() {
		return this.colore;
	}
	
	public abstract double area();
	public abstract double perimetro();
	
}
