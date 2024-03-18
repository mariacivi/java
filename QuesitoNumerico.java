import java.util.Scanner;

class QuesitoNumerico extends Quesito {
	Scanner 
    public QuesitoNumerico(String domanda, String rispostaCorretta, int punteggio) {
        super(domanda, rispostaCorretta, punteggio);
    }

    @Override
    public int ask() {
        System.out.println(domanda + " (rispondere con un valore numerico intero)");
        int rispostaUtente = scanner.nextInt();
        while (risposta == 0) {
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