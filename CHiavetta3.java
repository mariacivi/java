

import java.io.Serializable;

public class CHiavetta3 implements Serializable {

	public int id;
	public int saldo;
	
	public CHiavetta3(int id) {
		this.id = id;
		saldo = 20;
	}

	public int getID() {
		return this.id;
	}
	
	public int saldo() {
		return saldo;
	}
	
	public void versa(int importo) {
		saldo += importo;
	}
	
	public void preleva(int importo) {
		if (saldo >= importo) {
			saldo -= importo;
		} else {
			System.out.println("Saldo non sufficiente.");
		}
	}
}