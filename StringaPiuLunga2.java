public class StringaPiuLunga2 {
public static void main ( String [] args ) {
String [] animali = { " gatto " ," cane " ," topo " ," criceto " ," pesce " };
int posPiuLunga = 0; // memorizza la posizione
for ( int i =1; i < animali . length ; i ++) { // possiamo saltare 0!!
if ( animali [ i ]. length () > animali [ posPiuLunga ]. length ())
posPiuLunga = i ;
}
System.out.println ( " La piu ’ lunga e ’: " + animali [ posPiuLunga ]);
}
}