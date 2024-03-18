public class UsaConto {
public static void main ( String [] args ) {
// crea un nuovo conto corrente inizializzato con 1000 euro
ContoCorrente cc = new ContoCorrente (1000);
// versa 700 euro
cc . versa (700);
// fa un po ’ di prelievi , controllando prima il saldo
if ( cc . saldo >200) cc . preleva (200);
if ( cc . saldo >900) cc . preleva (900);
System . out . println ( " Saldo finale : " + cc . saldo );
}
}