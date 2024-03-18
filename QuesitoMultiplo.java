import java.util.Scanner;
class QuesitoMultiplo extends QuesitoNumerico {
    private int numeroOpzioni;
    Scanner input = new Scanner (System.in);
    public QuesitoMultiplo(String domanda, String rispostaCorretta, int punteggio, int numeroOpzioni) {
        super(domanda, rispostaCorretta, punteggio);
        this.numeroOpzioni = numeroOpzioni;
    }

    @Override
    public int ask() {
        System.out.println(domanda + " (rispondere con un numero da 1 a " + numeroOpzioni + ")");
        int risposta = 0;
        while (risposta < 1 || risposta > numeroOpzioni) {
            try {
                risposta = Integer.parseInt("risposta_utente");
            } catch (NumberFormatException e) {
            }
        }
        if (risposta == Integer.parseInt(rispostaCorretta)) {
            return punteggio;
        } else {
            return 0;
        }
    }
}