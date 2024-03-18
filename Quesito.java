class Quesito {
    protected String domanda;
    protected String rispostaCorretta;
    protected int punteggio;

    public Quesito(String domanda, String rispostaCorretta, int punteggio) {
        this.domanda = domanda;
        this.rispostaCorretta = rispostaCorretta;
        this.punteggio = punteggio;
    }

    public int ask() {
        System.out.println(domanda);
        String risposta = "risposta_utente";
        if (risposta.equals(rispostaCorretta)) {
            return punteggio;
        } else {
            return 0;
        }
    }
}