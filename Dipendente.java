public class Dipendente {
    private String cognome;
    private int matricola;
    private double stipendio;
    
    public Dipendente(String cognome, int matricola, double stipendio) {
        this.cognome = cognome;
        this.matricola = matricola;
        this.stipendio = stipendio;
    }
    public void aggiungiBonus() {
        stipendio += 200;
    }
    public String getCognome() {
        return cognome;
    }
    public int getMatricola() {
        return matricola;
    }
    public double getStipendio() {
        return stipendio;
    }
}
