import java . util . Scanner ;
public class ProdottoPotenza {
public static void main ( String [] args ) {
Scanner input = new Scanner ( System . in );
System . out . println ( " Inserire due numeri interi : " );
int x = input . nextInt ();
int y = input . nextInt ();
System . out . println ( " Inserire 1 per prodotto , 2 per potenza : " );
int scelta = input . nextInt ();
if ( scelta ==1)
System . out . println ( prodotto (x , y )); // chiama prodotto qui ...
else if ( scelta ==2) {
int ris =1;
for ( int i =0; i < y ; i ++) ris = prodotto ( ris , x ); // ... e anche qui !
System . out . println ( ris );
}
else System . out . println ( " ERRORE " );
}
// calcola ( banalmente ) il prodotto di due numeri
private static int prodotto ( int x , int y ) {
return x * y ;
}
}