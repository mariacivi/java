import javax.swing.*;

public class InterfacciaGrafica {
    public static void main(String[] args) {
        // Crea un nuovo frame
        JFrame frame = new JFrame("La mia interfaccia");
        
        // Imposta l'operazione di chiusura
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Crea un nuovo pannello
        JPanel panel = new JPanel();
        
        // Crea un nuovo bottone
        JButton button = new JButton("Clicca qui");
        
        // Aggiunge il bottone al pannello
        panel.add(button);
        
        // Aggiunge il pannello al frame
        frame.getContentPane().add(panel);
        
        // Imposta la dimensione del frame
        frame.setSize(300, 200);
        
        // Rende visibile il frame
        frame.setVisible(true);
    }
}

