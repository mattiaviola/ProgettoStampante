package it.unipv.sfw.stampante;

public class ImgRaster extends Immagine {
	
	private RGBColor[][] pixel;
	private static final double COEFF_RAST = 0.05;

	public ImgRaster(RGBColor[][] pixel) {
		this.pixel = pixel;
	}

	@Override
	public double getAreaTotale() {
		return pixel.length * pixel[0].length;
	}

	@Override
	public double getConsumoR() {
		double somma = 0;
		for(int i=0; i<pixel.length; i++)
			for(int j=0; j<pixel[0].length; j++)
				somma += pixel[i][j].getR();
		return somma * COEFF_RAST;
	}

	@Override
	public double getConsumoG() {
		double somma = 0;
		for(int i=0; i<pixel.length; i++)
			for(int j=0; j<pixel[0].length; j++)
				somma += pixel[i][j].getG();
		return somma * COEFF_RAST;
	}

	@Override
	public double getConsumoB() {
		double somma = 0;
		for(int i=0; i<pixel.length; i++)
			for(int j=0; j<pixel[0].length; j++)
				somma += pixel[i][j].getB();
		return somma * COEFF_RAST;
	}

	@Override
	public void stampaContenuto() {
		double r = 0;
		double g = 0;
		double b = 0;
		for(int i=0; i<pixel.length; i++) {
			for(int j=0; j<pixel[0].length; j++) {
				r += pixel[i][j].getR();
				g += pixel[i][j].getG();
				b += pixel[i][j].getB();
			}
		}
		double somma = r + g + b;
		System.out.println("--- Immagine Raster ---");
		System.out.println("Pixel totali (Area): " + getAreaTotale());
		if(somma > 0) {
			System.out.println("Percentuale colori - R: " + ((r / somma) * 100) + 
	                   "%, G: " + ((g / somma) * 100) + 
	                   "%, B: " + ((b / somma) * 100) + "%");
		}
	}
}