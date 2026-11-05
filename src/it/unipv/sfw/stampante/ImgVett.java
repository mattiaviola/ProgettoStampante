package it.unipv.sfw.stampante;

import java.util.ArrayList;
import java.util.List;

public class ImgVett extends Immagine{
	
	private List<Forme> forme;
	private static final double COEFF_VETT = 0.01;
	
	public ImgVett() {
		this.forme = new ArrayList<Forme>();
	}
	
	public ImgVett(List<Forme> forme) {
		this.forme = forme;
	}

	public List<Forme> getForme() {
		return forme;
	}

	public void setForme(List<Forme> forme) {
		this.forme = forme;
	}
	
	@Override
	public double getAreaTotale() {
		double area = 0;
		for(Forme f : forme) {
			area += f.area();
		}
		return area;
	}
	
	@Override
	public double getConsumoR() {
		double somma = 0;
		for(Forme f : forme) {
			somma += f.area() * f.getColore().getR();
		}
		return somma * COEFF_VETT;
	}
	
	@Override
	public double getConsumoG() {
		double somma = 0;
		for(Forme f : forme) {
			somma += f.area() * f.getColore().getG();
		}
		return somma * COEFF_VETT;
	}
	
	@Override
	public double getConsumoB() {
		double somma = 0;
		for(Forme f : forme) {
			somma += f.area() * f.getColore().getB();
		}
		return somma * COEFF_VETT;
	}
	
	@Override
	public void stampaContenuto() {
		double totR = 0;
		double totG = 0;
		double totB = 0;
		
		for (Forme f : forme) {
		    totR += f.area() * f.getColore().getR();
		    totG += f.area() * f.getColore().getG();
		    totB += f.area() * f.getColore().getB();
		}
		
		double totaleColori = totR + totG + totB;
		
		System.out.println("--- Immagine Vettoriale ---");
		System.out.println("Area Totale: " + getAreaTotale());
		if(totaleColori > 0) {
			System.out.println("Percentuale colori - R: " + (totR / totaleColori * 100) + 
	                   "%, G: " + (totG / totaleColori * 100) + 
	                   "%, B: " + (totB / totaleColori * 100) + "%");
		}
	}
}
