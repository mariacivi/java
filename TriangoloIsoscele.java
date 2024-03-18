public class TriangoloIsoscele {
    private double base;
    private double altezza;
    private static int numeroTriangoli = 0;

    public TriangoloIsoscele(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
        numeroTriangoli++;
    }
    public double calcolaPerimetro() {
        double lato = Math.sqrt(base * base / 4 + altezza * altezza);
        return 2 * lato + base;
    }
    public double calcolaArea() {
        return (base * altezza) / 2;
    }
}
