package it.unipv.sfw.stampante;

public class RGBColor {
	
	private int R, G, B;
	public final int MAXCOL = 255;
	
	public RGBColor(int r, int g, int b) {
		this.R = r % MAXCOL;
		this.G = g % MAXCOL;
		this.B = b % MAXCOL;
	}

	public int getR() {
		return R;
	}

	public void setR(int r) {
		R = r;
	}

	public int getG() {
		return G;
	}

	public void setG(int g) {
		G = g;
	}

	public int getB() {
		return B;
	}

	public void setB(int b) {
		B = b;
	}
	
}
