package it.unipv.sfw.stampante.forme;
import it.unipv.sfw.stampante.*;
import java.lang.Math;

public class Cerchio extends Forme{

	private double raggio;
	
	public Cerchio(double raggio, RGBColor c) {
		super(c);
		this.raggio = raggio;
	}

	public double getRaggio() {
		return raggio;
	}

	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}
	
	public double area() {
		return Math.PI * raggio * raggio;
	}
	
	public double perimetro() {
		return 2 * Math.PI * raggio;
	}
	
}
