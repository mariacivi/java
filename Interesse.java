
public class Interesse {

	public static void main(String[] args) {
	
		double capitale=10000;
		double tasso=0.5;
		double interesse;
		
		interesse = capitale * tasso;
		capitale +=interesse;
		System.out.println("Il capitale dopo un anno è " + capitale);
		interesse = capitale * tasso;
		capitale +=interesse;
		System.out.println("Il capitale dopo due anni è " + capitale);
		interesse = capitale * tasso;
		capitale +=interesse;
		
		System.out.println("Il capitale dopo tre anni è " + capitale);
	}

}
