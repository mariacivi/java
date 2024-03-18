public class UsoLibro2 {
    public static void main(String[] args) {
      
        Libro libro1 = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", "Disponibile");
        Libro libro2 = new Libro("Harry Potter e la Pietra Filosofale", "J.K. Rowling", "Disponibile");
        Libro libro3 = new Libro("1984", "George Orwell", "Disponibile");
        Libro libro4 = new Libro("Cronache del Ghiaccio e del Fuoco", "George R.R. Martin", "Non disponibile");

        System.out.println("Libro 1: " + libro1);
        System.out.println("Libro 2: " + libro2);
        System.out.println("Libro 3: " + libro3);
        System.out.println("Libro 4: " + libro4);

        System.out.println("\nTest del metodo prenota():");
        libro1.prenota();
        libro2.prenota();
        libro3.prenota();
        libro4.prenota();
        System.out.println("Dopo aver prenotato i libri:");
        System.out.println("Libro 1: " + libro1);
        System.out.println("Libro 2: " + libro2);
        System.out.println("Libro 3: " + libro3);
        System.out.println("Libro 4: " + libro4);
    }
}
