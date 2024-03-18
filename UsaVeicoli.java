public class UsaVeicoli {
    public static void main(String[] args) {
        Veicolo[] veicoli = {
            new Vettura("AB123CD", "Fiat", "Punto", "utilitaria"),
            new Vettura("XY456ZW", "Ford", "Focus", "station wagon"),
            new Motociclo("EF789GH", "Honda", "CBR", 600),
            new Motociclo("LM123NO", "Yamaha", "MT-07", 700)
        };

        
        veicoli[0].setGuasto(true);
        veicoli[3].setGuasto(true);

        
        System.out.println("Veicoli guasti:");
        for (Veicolo veicolo : veicoli) {
            if (veicolo.isGuasto()) {
                System.out.println(veicolo.getMarca());
            }
        }
    }
}
