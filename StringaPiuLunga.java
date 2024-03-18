public class StringaPiuLunga {
public static void main ( String [] args ) {
String [] animali = { " gatto " ," cane " ," topo " ," criceto " ," pesce " };
String piuLunga = " " ; // memorizza la stringa
for ( String s : animali )
if ( s . length () > piuLunga . length ()) piuLunga = s ;
}
System.out.println( " La piu ’ lunga e ’: " + piuLunga );
}