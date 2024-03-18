import java . awt .*;
import javax . swing .*;
public class SommaPopUp {
public static void main ( String [] args ) {
int prodotto = 0;
int scelta ;
do {

String s = JOptionPane . showInputDialog ( " Inserisci un numero " );
String a = JOptionPane . showInputDialog ( " Inserisci un numero " );
prodotto = Integer.parseInt(s) * Integer.parseInt(a);
scelta = JOptionPane . showConfirmDialog ( null , " Vuoi continuare ? " ,
" Scelta " , JOptionPane . YES_NO_OPTION );
} while ( scelta != JOptionPane . NO_OPTION ); 

JOptionPane . showMessageDialog ( null , " Il prodotto è : " + prodotto );
}
}