public class ParolaSpezzettata {
public static void main ( String [] args ) {
// parola da spezzettare
String parola = " S u p e r c a l i f r a g i l i s t i c h e s p i r a l i d o s o !! " ;
// scandisce la stringa 3 caratteri per volta
for ( int i =0; i < parola . length (); i +=3) {
/* assicura che la porzione considerata ( da i a i +3)
non superi la fine della stringa */
if ( i +3 < parola . length ())
System . out . println ( parola . substring (i , i +3));
else
System . out . println ( parola . substring (i , parola . length ()));
}
}
}
