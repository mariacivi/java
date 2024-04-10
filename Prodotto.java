package Prodotto;

public class Prodotto {
 
	private String nome;
	private double prezzo;
	private int quantita;
    private int Id;
 
	public Prodotto () {
 
	}
 
	public String getNome() {
		return nome;
	}
 
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
 
 
 
}