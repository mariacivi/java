package Prodotto;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ordina
 */
@WebServlet("/ordina")
public class ordina extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ordina() {
        super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "jdbc:mysql://localhost:3306/"; // URL del database
	    String dbName = "newdatabase"; // Nome del database
	    String user = "root"; // Nome utente
	    String password = "passwordnuova1"; 
	    
		String[] ordiniSelezionati = request.getParameterValues("ordini");
		request.setAttribute("lista", ordiniSelezionati);
		double totale = 0;
		for (int i = 0 ; i<ordiniSelezionati.length; i++) {
			String updateQuery = "UPDATE prodotti SET quantita = quantita-1 WHERE nome = (?)";
			String name = ordiniSelezionati[i];
			try {
				Connection conn = DriverManager.getConnection(url + dbName, user, password);
					
				PreparedStatement stmt = conn.prepareStatement(updateQuery);
					
				stmt.setString(1, name);
					
				stmt.executeUpdate();
					
			} catch (SQLException e) {
		
				System.out.println("Errore");
				e.printStackTrace();
			}
			
			String selectQuery = "SELECT prezzo FROM prodotti WHERE nome=?";
			
			
			try {
			         Connection conn = DriverManager.getConnection(url + dbName, user, password);
		             PreparedStatement stmt = conn.prepareStatement(selectQuery);
		             stmt.setString(1, name);
		             ResultSet rs = stmt.executeQuery();
		             if(rs.next()) {
		            	 double prezzo = rs.getDouble("prezzo");
		            	 totale += prezzo;
		             }
			}catch (SQLException e) {
	            // Gestione delle eccezioni per la connessione al database o la lettura dei dati
	            System.out.println("Errore durante la lettura dei dati dalla tabella 'prodotti':");
	            e.printStackTrace();
	        }     // Indirizzo email del mittente
			ServletContext context = getServletContext();
			String mail = (String) context.getAttribute("user");
			
	        String from = "civitillomaria91@gmail.com";
	        // Password dell'account email del mittente
	        String pass = "gjqe tpxz pxuj yitl";
	        // Indirizzo email del destinatario
	        String to = mail;
	        String prodotti = "";
		    for (String prod: ordiniSelezionati) {
		    	prodotti += " " + prod;
		    }
	        // Proprietà per la configurazione del server SMTP di Gmail
	        Properties props = new Properties();
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", "smtp.gmail.com");
	        props.put("mail.smtp.port", "587");
	 
	        // Creazione di un oggetto di autenticazione
	        Authenticator auth = new Authenticator() {
	            protected PasswordAuthentication getPasswordAuthentication() {
	                return new PasswordAuthentication(from, pass);
	            }
	        };
	 
	        // Creazione di una nuova sessione SMTP con autenticazione
	        Session session = Session.getInstance(props, auth);
	 
	        try {
	            // Creazione del messaggio email
	            Message message = new MimeMessage(session);
	            message.setFrom(new InternetAddress(from));
	            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
	            message.setSubject("Abbiamo ricevuto il tuo ordine! Sarà presto evaso!");
	            message.setText("Riepilogo ordine: "+ prodotti + "importo da pagare: " + totale);
	 
	            // Invio dell'email
	            Transport.send(message);
	 
	            System.out.println("Email inviata con successo!");
	        } catch (MessagingException e) {
	            e.printStackTrace();
	            System.out.println("Errore durante l'invio dell'email.");
	        }
	 
	        request.setAttribute("lista" , ordiniSelezionati);
		request.setAttribute("prezzototale" , totale);	
		  request.getRequestDispatcher("/risultato3.jsp").forward(request, response);
		
	}
}

	}


