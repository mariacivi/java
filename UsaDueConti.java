public class UsaDueConti {
public static void main ( String [] args ) {
// crea un nuovo conto corrente inizializzato con 1000 euro
ContoCorrente conto1 = new ContoCorrente (1000);
// crea un nuovo conto corrente inizializzato con 200 euro
ContoCorrente conto2 = new ContoCorrente (200);
// preleva 700 euro dal primo conto ...
conto1 . preleva (700);
// ... e li versa nel secondo
conto2 . versa (700);
System . out . println ( " Saldo primo conto : " + conto1 . saldo );
System . out . println ( " Saldo secondo conto : " + conto2 . saldo );
}
}
