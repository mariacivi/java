public class Rettangolo {

	
	// dichiarazione delle variabili d'istanza
	public double base;
	public double altezza;
	
	public Rettangolo(double base, double altezza) {
		
		this.base = base;
		this.altezza = altezza;
	}
	public double calcolaArea() {
		
		return base * altezza;
	}
	
	public double calcolaPerimetro() {
		return ((base *2) + (altezza *2));
	}
	
	public String toString() {
		
		return ("QUesto rettangolo ha la base di " + base + " cm" + " e l'altezza di " + altezza + "cm");
	}
}