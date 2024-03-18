
public class Boolean {
	
	public static void main(String[] args) {
	Visibilit`a delle variabili (2)
	Limitare la visibilit`a di una variabile al blocco che la contiene consente di
	riutilizzare nomi di variabili in parti diverse del programma
	anche con tipi diversi
	boolean leggiIntero = ....;
	if ( leggiIntero ) {
	int val = input . nextInt ();
	System . out . print ( " Il numero letto e ’: " );
	System . out . println ( val );
	} else {
	double val = input . nextDouble ();
	System . out . print ( " Il numero letto e ’: " );
	System . out . println ( val );
	}
}
