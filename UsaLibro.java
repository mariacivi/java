public class UsaLibro{
public static void main(String[] args) {
		// TODO Auto-generated method stub
 
 
		Libro l1 = new Libro("Libro 1","Autore 1");
		System.out.println(l1);
		Libro l2 = new Libro("Libro 2","Autore 2");
		System.out.println(l2);
		Libro l3 = new Libro("Libro 3","Autore 3");
		System.out.println(l3);
		l1.setstato();
 
		System.out.println(l1);
 
	}
}