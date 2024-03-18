public class Lampadina {
    private boolean accesa;
    private int clickTotali;
    private int clickMassimi;

    public Lampadina(int clickMassimi) {
        this.accesa = false;
        this.clickTotali = 0;
        this.clickMassimi = clickMassimi;
    }
    public String stato() {
        if (clickTotali >= clickMassimi) {
            return "La lampadina è rotta";
        } else if (accesa) {
            return "La lampadina è accesa";
        } else {
            return "La lampadina è spenta";
        }
    }
    public void click() {
        if (clickTotali >= clickMassimi) {
            System.out.println("La lampadina è già rotta");
        } else {
            accesa = !accesa;
            clickTotali++;
        }
    }
}


