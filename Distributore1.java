

import java.io.Serializable;
import java.util.ArrayList;

public class Distributore1 implements Serializable {
	
	private ArrayList <Chiavetta> elencoChiavette;
	
	public Distributore1() {
		elencoChiavette = new ArrayList<>();
	}
	
	public boolean checkID(int id) {
		return id >= 0 && id < elencoChiavette.size();
	}

    public ArrayList<Chiavetta> getChiavette() {
        return elencoChiavette;
    }
	
	public int creaChiavetta() {
	    int newID = elencoChiavette.size();
	    Chiavetta chiavetta = new Chiavetta(newID);
	    elencoChiavette.add(chiavetta);
	    return newID;
	}
	
	public void addChiavetta(Chiavetta chiavetta) {
		elencoChiavette.add(chiavetta);
	}
	
	public void erogaCaffè(int id) {
		elencoChiavette.get(id).saldo -= 1;
	}
	
	public void erogaThe(int id) {
		elencoChiavette.get(id).saldo -= 2;
	}
	
	public void erogaAcqua(int id) {
		elencoChiavette.get(id).saldo -= 1;
	}
	
	public void ricaricaChiavetta(int id, int importo) {
		elencoChiavette.get(id).versa(importo);
	}
	
	public int visualizzaSaldo(int id) {
		return elencoChiavette.get(id).saldo();
	}
}