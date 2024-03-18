public class CreaDipendenti {
 
	public static void main(String[] args) {
 
		Dipendente d1 = new Dipendente("Rossi", 12340, 2000);
		Dipendente d2 = new Dipendente("Bianchi", 3456, 2500);
 
		System.out.println(d1.stipendio);
		d1.bonus();
		System.out.println(d1.stipendio);
 
 
 
 
	}
 
}