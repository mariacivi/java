public class UsaTriangoloRettangolo5{
    public static void main(String[] args) {
        TriangoloRettangolo triangolo = new TriangoloRettangolo(3, 4);

        System.out.println("Area del triangolo: " + triangolo.calcolaArea());

        System.out.println("Perimetro del triangolo: " + triangolo.calcolaPerimetro());
       
        System.out.println(triangolo);
    }
}
