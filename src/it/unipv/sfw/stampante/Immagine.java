package it.unipv.sfw.stampante;

public abstract class Immagine implements Comparable<Immagine>, Stampabile {
	public abstract double getAreaTotale();
	public abstract double getConsumoR();
	public abstract double getConsumoG();
	public abstract double getConsumoB();
	public abstract void stampaContenuto();
	
	@Override
	public int compareTo(Immagine i) {
		return Double.compare(this.getAreaTotale(), i.getAreaTotale());
	}
}
