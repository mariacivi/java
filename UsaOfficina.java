public class UsaOfficina {
    public static void main(String[] args) {
        Veicolo vettura = new Vettura("AB123CD", "Fiat", "Punto", "utilitaria");
        Veicolo motociclo = new Motociclo("LM123NO", "Yamaha", "MT-07", 700);
        Officina officina = new Officina();
        vettura.setGuasto(true);
        motociclo.setGuasto(false);

        System.out.println("Prezzo riparazione vettura: " + officina.ripara(vettura));
        System.out.println("Prezzo riparazione motociclo: " + officina.ripara(motociclo));
    }
}