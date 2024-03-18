public class ContoCorrente {
// variabile che memorizza lo stato del conto
public double saldo ;
// costruttore della classe
public ContoCorrente ( double saldoIniziale ) {
saldo = saldoIniziale ;
}
// metodo per il versamento di somme
public void versa ( double somma ) {
saldo += somma ;
}
// metodo per il prelievo di somme
public void preleva ( double somma ) {
saldo -= somma ;

public double saldo ;
public ContoCorrente ( double saldoIniziale ) {
saldo = saldoIniziale ;
}
public void versa ( double somma ) {
saldo += somma ;
}
public void preleva ( double somma ) {
saldo -= somma ;
}
}
}
}
