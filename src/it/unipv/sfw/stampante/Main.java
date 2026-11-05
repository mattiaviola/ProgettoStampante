package it.unipv.sfw.stampante;

import it.unipv.sfw.stampante.forme.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		RGBColor rossoPuro = new RGBColor(255, 0, 0);
		RGBColor verdePuro = new RGBColor(0, 255, 0);
		RGBColor bluPuro = new RGBColor(0, 0, 255);
		RGBColor misto = new RGBColor(120, 80, 200);

		ImgVett iv1 = new ImgVett();
		iv1.getForme().add(new Quadrato(5, rossoPuro));
		iv1.getForme().add(new Rettangolo(2, 4, verdePuro));

		List<Forme> listaForme2 = new ArrayList<>();
		listaForme2.add(new Cerchio(10, bluPuro));
		listaForme2.add(new Quadrato(8, misto));
		ImgVett iv2 = new ImgVett(listaForme2);

		RGBColor[][] grigliaPixel = {
			{rossoPuro, verdePuro},
			{bluPuro, misto}
		};
		ImgRaster ir1 = new ImgRaster(grigliaPixel);

		List<Immagine> galleria = new ArrayList<>();
		galleria.add(iv2);
		galleria.add(iv1);
		galleria.add(ir1);

		System.out.println("=== ORDINAMENTO IMMAGINI PER AREA CRESCENTE ===");
		Collections.sort(galleria);

		for (Immagine img : galleria) {
			img.stampaContenuto();
			System.out.println("----------------------------------------");
		}

		System.out.println("\n=== SIMULAZIONE STAMPANTE ===");
		Stampante s = new Stampante();

		System.out.println("Stato iniziale cartucce:");
		System.out.println(s.inchiostroResiduo());
		System.out.println();

		for (int i = 0; i < galleria.size(); i++) {
			System.out.println("Stampa immagine #" + (i + 1) + ":");
			System.out.println(s.stampaImmagine(galleria.get(i)));
			System.out.println(s.inchiostroResiduo());
			System.out.println();
		}

		System.out.println("=== SOSTITUZIONE CARTUCCIA ===");
		System.out.println(s.sostituisciCartuccia(Colori.VERDE));
		System.out.println(s.inchiostroResiduo());
	}
}