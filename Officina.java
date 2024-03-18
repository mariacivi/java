class Officina {
    public double ripara(Veicolo veicolo) {
        double prezzoIntervento = 0.0;
        if (veicolo.isGuasto()) {
          
            if (veicolo instanceof Vettura) {
                prezzoIntervento = 200.0; 
            } else if (veicolo instanceof Motociclo) {
                prezzoIntervento = 100.0; 
            }
            veicolo.setGuasto(false);
        } else {
            prezzoIntervento = 0.0;
        }
        return prezzoIntervento;
    }
}
