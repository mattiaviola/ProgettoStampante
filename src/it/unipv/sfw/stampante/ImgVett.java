package it.unipv.sfw.stampante;

public class ImgVett {
	
	private Forme[] forme;
	private int maxforme;
	
	public ImgVett(Forme[] forme,int maxforme) {
		this.forme = new Forme[maxforme];
		this.forme = forme;
	}

	public int getMaxforme() {
		return maxforme;
	}

	public void setMaxforme(int maxforme) {
		this.maxforme = maxforme;
	}

	public Forme[] getForme() {
		return forme;
	}

	public void setForme(Forme[] forme) {
		this.forme = forme;
		this.maxforme = forme.length;
	}
	
}
