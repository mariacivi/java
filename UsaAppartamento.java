import java.util.ArrayList;

public class UsaAppartamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<appartamento> listaApp = new ArrayList<>();
		appartamento a1  = new appartamento(200, "rossi");
		AppartamentoInVendita a2 = new AppartamentoInVendita(200, "rossi", 350000);
		AppartamentoInAffitto a3 = new AppartamentoInAffitto(180, "bianchi", 2000);
		listaApp.add(a1);
		listaApp.add(a2);
		listaApp.add(a3);
		// è possibile chiamare i metodi in overriding
		
		for (int i = 0; i < listaApp.size(); i++) {
			System.out.println(listaApp.get(i).visualizza());
		}
		for (int i = 0; i < listaApp.size(); i++) {
			if (listaApp.get(i)  instanceof AppartamentoInVendita) {
				AppartamentoInVendita s = ( AppartamentoInVendita ) listaApp.get(i);
				System.out.println("Abbiamo scoperto il costo totale " + s.costoTotale);
			}
			
		}
		
		
	}

}