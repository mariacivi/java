import java . util . Scanner ;
public class Divisione {
public static void main ( String [] args ) {
Scanner input = new Scanner ( System . in );
int num1 , num2 ;
System . out . println ( " Inserisci due numeri interi : " );
num1 = input . nextInt ();
num2 = input . nextInt ();
// controlla che num2 sia diverso da zero
// prima di calcolare num1 / num2
if ( num2 ==0) {
System . out . println ( " ERRORE : divisione per zero " );
} else {
System . out . print ( " Quoziente : " );
System . out . println ( num1 / num2 );
System . out . print ( " Resto : " );
System . out . println ( num1 % num2 );
}
}
}