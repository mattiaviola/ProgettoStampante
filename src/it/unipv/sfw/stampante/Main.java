package it.unipv.sfw.stampante;
import it.unipv.sfw.stampante.*;
import it.unipv.sfw.stampante.forme.*;

public class Main {

	public static void main(String[] args) {
		
		RGBColor c1 = new RGBColor(104, 67, 58);
		RGBColor c2 = new RGBColor(115, 147, 126);
		RGBColor c3 = new RGBColor(88, 123, 163);  
		
		Forme f1 = new Quadrato(5, c1);
		Forme f2 = new Rettangolo(2, 3, c2);
		Forme f3 = new Cerchio(5, c3);
		Forme[] fvett1 = {f1, f2, f3};
		
		ImgVett i1 = new ImgVett(3);
		i1.setForme(fvett1);
		
		Stampante s = new Stampante();
		
		System.out.println(s.inchiostroResiduo());
		
		System.out.println(s.stampaImmagine(i1));
		
		System.out.println(s.inchiostroResiduo());
		
		System.out.println(s.sostituisciCartuccia(Colori.VERDE));
		
		System.out.println(s.inchiostroResiduo());
		
		System.out.println(s.stampaImmagine(i1));
		System.out.println(s.stampaImmagine(i1));
		System.out.println(s.stampaImmagine(i1));
		
	}

}
