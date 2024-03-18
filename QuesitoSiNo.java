class QuesitoSiNo extends Quesito {
    public QuesitoSiNo(String domanda, String rispostaCorretta, int punteggio) {
        super(domanda, rispostaCorretta, punteggio);
    }

    @Override
    public int ask() {
        System.out.println(domanda + " (rispondere si o no)");
        String risposta = "risposta_utente";
        
        while (!risposta.equalsIgnoreCase("si") && !risposta.equalsIgnoreCase("no")) {
            risposta = "risposta_utente";
        }
       
        if (risposta.equalsIgnoreCase(rispostaCorretta)) {
            return punteggio;
        } else {
            return 0;
        }
    }
}

