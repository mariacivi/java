public class Main {
    public static void main(String[] args) {
        Dipendente dipendente1 = new Dipendente("Rossi", 1001, 1500.0);
        Dipendente dipendente2 = new Dipendente("Bianchi", 1002, 1800.0);
        Dipendente dipendente3 = new Dipendente("Verdi", 1003, 2000.0);

        dipendente1.aggiungiBonus();
        dipendente2.aggiungiBonus();
        dipendente3.aggiungiBonus();

        System.out.println("Informazioni dipendente 1:");
        System.out.println("Cognome: " + dipendente1.getCognome());
        System.out.println("Matricola: " + dipendente1.getMatricola());
        System.out.println("Stipendio: " + dipendente1.getStipendio());

        System.out.println("\nInformazioni dipendente 2:");
        System.out.println("Cognome: " + dipendente2.getCognome());
        System.out.println("Matricola: " + dipendente2.getMatricola());
        System.out.println("Stipendio: " + dipendente2.getStipendio());

        System.out.println("\nInformazioni dipendente 3:");
        System.out.println("Cognome: " + dipendente3.getCognome());
        System.out.println("Matricola: " + dipendente3.getMatricola());
        System.out.println("Stipendio: " + dipendente3.getStipendio());
    }
}
