import java.util.ArrayList;

class Libro {
    private String titolo;
    private String autore;
    private String stato;

    public Libro(String titolo, String autore, String stato) {
        this.titolo = titolo;
        this.autore = autore;
        this.stato = stato;
    }

    public void cambiaStato() {
        if (stato.equals("disponibile"))
            stato = "in prestito";
        else if (stato.equals("in prestito"))
            stato = "disponibile";
    }

    public void setLibro() {
        stato = "non disponibile";
    }
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", stato='" + stato + '\'' +
                '}';
    }
}

public class GestoreLibri {
    private ArrayList<Libro> libri;

    public GestoreLibri() {
        this.libri = new ArrayList<>();
    }

    public void aggiungiLibro(Libro libro) {
        libri.add(libro);
    }

    public void stampaLibri() {
        for (Libro libro : libri) {
            System.out.println(libro);
        }
    }

    public static void main(String[] args) {
        GestoreLibri gestore = new GestoreLibri();

        Libro libro1 = new Libro("Il signore degli anelli", "J.R.R. Tolkien", "disponibile");
        Libro libro2 = new Libro("1984", "George Orwell", "disponibile");
        Libro libro3 = new Libro("Guerra e pace", "Lev Tolstoj", "disponibile");
        Libro libro4 = new Libro("Il nome della rosa", "Umberto Eco", "non disponibile");

        gestore.aggiungiLibro(libro1);
        gestore.aggiungiLibro(libro2);
        gestore.aggiungiLibro(libro3);
        gestore.aggiungiLibro(libro4);

        System.out.println("Libri prima di cambiare lo stato:");
        gestore.stampaLibri();

        libro1.cambiaStato();
        libro4.cambiaStato();

        System.out.println("\nLibri dopo aver cambiato lo stato:");
        gestore.stampaLibri();
    }
}
