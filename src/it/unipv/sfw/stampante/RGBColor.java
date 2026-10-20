package it.unipv.sfw.stampante;

public class RGBColor {
	
	public int R, G, B;
	public final int MAXCOL = 255;
	
	public RGBColor(int r, int g, int b) {
		this.R = R % MAXCOL;
		this.G = G % MAXCOL;
		this.B = B % MAXCOL;
	}
	
}
