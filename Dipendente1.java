public class Dipendente1 {
 
	public String cognome;
	public int matricola;
	public int stipendio;
	public Dipendente1 (String cognome, int matricola, int stipendio) {
		this.cognome = cognome;
		this.matricola = matricola;
		this.stipendio = stipendio;
	}
	public void bonus() {
		this.stipendio += 200;
	}
 
}