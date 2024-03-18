public class ContoCOrrente1 {
	
	
	// definiamo la proprietà saldo dell'oggetto
	public int saldo;
	
	// definiamo il costruttore
	
	 public ContoCOrrente1(int saldo) {
		 
		 this.saldo = saldo;
	 }

	// andiamo a definire il metodo preleva
	 public void preleva(int somma) {
		 
		 if(somma <= this.saldo) {
		 
		 this.saldo -= somma;
	 }
		 else {
			 System.out.println("somma non disponibile");
		 }
	 
	 }
	 
	 //andiamo adefinire il metodo versa
	 public void versa(int somma) {
		 this.saldo += somma;
	 }
}