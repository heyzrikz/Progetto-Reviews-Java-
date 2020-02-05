


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.border.BevelBorder;

@SuppressWarnings("serial")
public class AggiungiAttivitaFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeAttivita;
	private JTextField txtViaAttivita;
	private JLabel lblViaAsterisco;
	private JLabel lblNomeAsterisco;
	private JLabel lblDescrizioneAsterisco;

	/**
	 * Launch the application.
	 */
	/**public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AggiungiAttivitaFrame frame = new AggiungiAttivitaFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AggiungiAttivitaFrame(Controller ctrl) {
		setResizable(false);
		Controller controller = ctrl;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1046, 665);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1040, 625);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel Icona = new JLabel("");
		Icona.setIcon(new ImageIcon(AggiungiAttivitaFrame.class.getResource("/Images/home_login.png")));
		Icona.setBounds(108, 103, 274, 266);
		panel.add(Icona);
		
	
		
		JLabel lblNomeAttivit = new JLabel("Nome Attivit\u00E0");
		lblNomeAttivit.setForeground(new Color(255, 215, 0));
		lblNomeAttivit.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNomeAttivit.setBounds(543, 78, 131, 29);
		panel.add(lblNomeAttivit);
		
		
		lblNomeAsterisco = new JLabel("*");
		lblNomeAsterisco.setForeground(new Color(255, 0, 0));
		lblNomeAsterisco.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNomeAsterisco.setBounds(927, 119, 20, 30);
		lblNomeAsterisco.setVisible(false);
		panel.add(lblNomeAsterisco);
		
		
		lblViaAsterisco = new JLabel("*");
		lblViaAsterisco.setForeground(new Color(255, 0, 0));
		lblViaAsterisco.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblViaAsterisco.setBounds(798, 267, 20, 30);
		lblViaAsterisco.setVisible(false);
		panel.add(lblViaAsterisco);
		
		txtNomeAttivita = new JTextField();
		txtNomeAttivita.setText("Inserisci Nome Attivit\u00E0");
		txtNomeAttivita.setSelectionColor(new Color(178, 34, 34));
		txtNomeAttivita.setOpaque(false);
		txtNomeAttivita.setForeground(new Color(255, 165, 0));
		txtNomeAttivita.setFont(new Font("Trebuchet MS", Font.ITALIC, 19));
		txtNomeAttivita.setColumns(10);
		txtNomeAttivita.setBorder(null);
		txtNomeAttivita.setBounds(543, 103, 404, 41);
		txtNomeAttivita.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txtNomeAttivita.getText().length() >= 30 )
		            e.consume(); 
		    }  
		});
		panel.add(txtNomeAttivita);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 215, 0));
		separator.setBackground(new Color(255, 215, 0));
		separator.setBounds(543, 140, 386, 21);
		panel.add(separator);
		
		JLabel lblPosizione = new JLabel("Posizione");
		lblPosizione.setForeground(new Color(255, 215, 0));
		lblPosizione.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblPosizione.setBounds(543, 160, 131, 29);
		panel.add(lblPosizione);
		
		JComboBox<String> comboBoxPosizione = new JComboBox<String>();
		comboBoxPosizione.setLightWeightPopupEnabled(false);
		comboBoxPosizione.setModel(new DefaultComboBoxModel<String>(new String[] {"Abruzzo-L'Aquila", "Abruzzo-Chieti", "Abruzzo-Pescara", "Abruzzo-Teramo", "Basilicata-Potenza", "Basilicata-Matera", "Calabria-Reggio Calabria", "Calabria-Catanzaro", "Calabria-Crotone", "Calabria-Vibo Valentia Marina", "Calabria-Cosenza", "Campania-Napoli", "Campania-Avellino", "Campania-Caserta", "Campania-Benevento", "Campania-Salerno", "Emilia Romagna-Bologna", "Emilia Romagna-Reggio Emilia", "Emilia Romagna-Parma", "Emilia Romagna-Modena", "Emilia Romagna-Ferrara", "Emilia Romagna-Forl\u00EC Cesena", "Emilia Romagna-Piacenza", "Emilia Romagna-Ravenna", "Emilia Romagna-Rimini", "Friuli Venezia Giulia-Trieste", "Friuli Venezia Giulia-Gorizia", "Friuli Venezia Giulia-Pordenone", "Friuli Venezia Giulia-Udine", "Lazio-Roma", "Lazio-Latina", "Lazio-Frosinone", "Lazio-Viterbo", "Lazio-Rieti", "Lombardia-Milano", "Lombardia-Bergamo", "Lombardia-Brescia", "Lombardia-Como", "Lombardia-Cremona", "Lombardia-Mantova", "Lombardia-Monza e Brianza", "Lombardia-Pavia", "Lombardia-Sondrio", "Lombardia-Lodi", "Lombardia-Lecco", "Lombardia-Varese", "Marche-Ancona", "Marche-Ascoli Piceno", "Marche-Fermo", "Marche-Macerata", "Marche-Pesaro Urbino", "Molise-Campobasso", "Molise-Isernia", "Piemonte-Torino", "Piemonte-Asti", "Piemonte-Alessandria", "Piemonte-Cuneo", "Piemonte-Novara", "Piemonte-Vercelli", "Piemonte-Verbania", "Piemonte-Biella", "Valle D'Aosta-Aosta", "Puglia-Bari", "Puglia-Barletta-Andria-Trani", "Puglia-Brindisi", "Puglia-Foggia", "Puglia-Lecce", "Puglia-Taranto", "Sardegna-Cagliari", "Sardegna-Sassari", "Sardegna-Nuoro", "Sardegna-Oristano", "Sardegna-Carbonia Iglesias", "Sardegna-Medio Campidano", "Sardegna-Olbia Tempio", "Sardegna-Ogliastra", "Sicilia-Palermo", "Sicilia-Agrigento", "Sicilia-Caltanissetta", "Sicilia-Catania", "Sicilia-Enna", "Sicilia-Messina", "Sicilia-Ragusa", "Sicilia-Siracusa", "Sicilia-Trapani", "Toscana-Arezzo", "Toscana-Massa Carrara", "Toscana-Firenze", "Toscana-Livorno", "Toscana-Grosseto", "Toscana-Lucca", "Toscana-Pisa", "Toscana-Pistoia", "Toscana-Prato", "Toscana-Siena", "Trentino Alto Adige-Trento", "Trentino Alto Adige-Bolzano", "Umbria-Perugia", "Umbria-Terni", "Veneto-Venezia", "Veneto-Belluno", "Veneto-Padova", "Veneto-Rovigo", "Veneto-Treviso", "Veneto-Verona", "Veneto-Vicenza"}));
		comboBoxPosizione.setBackground(new Color(178, 34, 34));
		comboBoxPosizione.setForeground(new Color(255, 165, 0));
		comboBoxPosizione.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		comboBoxPosizione.setBounds(543, 189, 306, 26);
		comboBoxPosizione.setBorder(null);
		panel.add(comboBoxPosizione);
		
		JLabel lblVia = new JLabel("Via");
		lblVia.setForeground(new Color(255, 215, 0));
		lblVia.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblVia.setBounds(543, 231, 131, 29);
		panel.add(lblVia);
		
		
		lblDescrizioneAsterisco = new JLabel("*");
		lblDescrizioneAsterisco.setForeground(new Color(255, 0, 0));
		lblDescrizioneAsterisco.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblDescrizioneAsterisco.setBounds(950, 432, 20, 30);
		lblDescrizioneAsterisco.setVisible(false);
		panel.add(lblDescrizioneAsterisco);
		
		txtViaAttivita = new JTextField();
		txtViaAttivita.setText("Inserisci Via Attivit\u00E0");
		txtViaAttivita.setSelectionColor(new Color(178, 34, 34));
		txtViaAttivita.setOpaque(false);
		txtViaAttivita.setForeground(new Color(255, 165, 0));
		txtViaAttivita.setFont(new Font("Trebuchet MS", Font.ITALIC, 19));
		txtViaAttivita.setColumns(10);
		txtViaAttivita.setBorder(null);
		txtViaAttivita.setBounds(543, 256, 255, 41);
		txtViaAttivita.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txtViaAttivita.getText().length() >= 30 )
		            e.consume(); 
		    }  
		});
		panel.add(txtViaAttivita);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(255, 215, 0));
		separator_1.setBackground(new Color(255, 215, 0));
		separator_1.setBounds(543, 288, 240, 21);
		panel.add(separator_1);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setForeground(new Color(255, 215, 0));
		lblCategoria.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblCategoria.setBounds(543, 313, 89, 29);
		panel.add(lblCategoria);
		
		JComboBox<String> comboBoxRistorante = new JComboBox<String>();
		comboBoxRistorante.setModel(new DefaultComboBoxModel<String>(new String[] {"Cucina locale: Italiana", "Pizza", "Pesce", "Giapponese", "Steakhouse", "Caff\u00E8", "Cinese", "StreetFood"}));
		comboBoxRistorante.setForeground(new Color(255, 165, 0));
		comboBoxRistorante.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		comboBoxRistorante.setBorder(null);
		comboBoxRistorante.setVisible(true);
		comboBoxRistorante.setBackground(new Color(178, 34, 34));
		comboBoxRistorante.setBounds(687, 343, 141, 26);
		panel.add(comboBoxRistorante);
		
		JComboBox<String> comboBoxAlloggio = new JComboBox<String>();
		comboBoxAlloggio.setModel(new DefaultComboBoxModel<String>(new String[] {"Hotel", "B&B", "Ostello"}));
		comboBoxAlloggio.setForeground(new Color(255, 165, 0));
		comboBoxAlloggio.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		comboBoxAlloggio.setBorder(null);
		comboBoxAlloggio.setVisible(false);
		comboBoxAlloggio.setBackground(new Color(178, 34, 34));
		comboBoxAlloggio.setBounds(687, 343, 141, 26);
		panel.add(comboBoxAlloggio);
		
		JComboBox<String> comboBoxAttrazione = new JComboBox<String>();
		comboBoxAttrazione.setModel(new DefaultComboBoxModel<String>(new String[] {"Museo", "Tour", "Teatro", "Cinema", "Parco Divertimenti", "Lido"}));
		comboBoxAttrazione.setForeground(new Color(255, 165, 0));
		comboBoxAttrazione.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		comboBoxAttrazione.setBorder(null);
		comboBoxAttrazione.setVisible(false);
		comboBoxAttrazione.setBackground(new Color(178, 34, 34));
		comboBoxAttrazione.setBounds(687, 343, 141, 26);
		panel.add(comboBoxAttrazione);
		
		JComboBox<String> comboBoxRistorante_2 = new JComboBox<String>();
		comboBoxRistorante_2.setModel(new DefaultComboBoxModel<String>(new String[] {"", "Cucina locale: Italiana", "Pizza", "Pesce", "Giapponese", "Steakhouse", "Caff\u00E8", "Cinese", "StreetFood"}));
		comboBoxRistorante_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		comboBoxRistorante_2.setForeground(new Color(255, 165, 0));
		comboBoxRistorante_2.setBackground(new Color(178, 34, 34));
		comboBoxRistorante_2.setBounds(872, 343, 131, 26);
		comboBoxRistorante_2.setVisible(false);
		panel.add(comboBoxRistorante_2);
		
		JComboBox<String> comboBoxAlloggio_2 = new JComboBox<String>();
		comboBoxAlloggio_2.setModel(new DefaultComboBoxModel<String>(new String[] {"", "Hotel", "B&B", "Ostello"}));
		comboBoxAlloggio_2.setForeground(new Color(255, 165, 0));
		comboBoxAlloggio_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		comboBoxAlloggio_2.setVisible(false);
		comboBoxAlloggio_2.setBackground(new Color(178, 34, 34));
		comboBoxAlloggio_2.setBounds(872, 343, 131, 26);
		panel.add(comboBoxAlloggio_2);
		
		JComboBox<String> comboBoxAttrazione_2 = new JComboBox<String>();
		comboBoxAttrazione_2.setModel(new DefaultComboBoxModel<String>(new String[] {"", "Museo", "Tour", "Teatro", "Cinema", "Parco Divertimenti", "Lido"}));
		comboBoxAttrazione_2.setForeground(new Color(255, 165, 0));
		comboBoxAttrazione_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		comboBoxAttrazione_2.setVisible(false);
		comboBoxAttrazione_2.setBackground(new Color(178, 34, 34));
		comboBoxAttrazione_2.setBounds(872, 343, 131, 26);
		panel.add(comboBoxAttrazione_2);
		
		JComboBox<String> comboBoxCategoria = new JComboBox<String>();
		comboBoxCategoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBoxCategoria.getSelectedIndex()==0){
					comboBoxAlloggio_2.setVisible(false);
					comboBoxRistorante_2.setVisible(false);
					comboBoxAttrazione_2.setVisible(false);
					comboBoxRistorante.setVisible(true);
					comboBoxAlloggio.setVisible(false);
					comboBoxAttrazione.setVisible(false);}else
						if(comboBoxCategoria.getSelectedIndex()==1){
							comboBoxAlloggio_2.setVisible(false);
							comboBoxRistorante_2.setVisible(false);
							comboBoxAttrazione_2.setVisible(false);
							comboBoxRistorante.setVisible(false);
							comboBoxAlloggio.setVisible(true);
							comboBoxAttrazione.setVisible(false);
							}else
					if(comboBoxCategoria.getSelectedIndex()==2){
						comboBoxAlloggio_2.setVisible(false);
						comboBoxRistorante_2.setVisible(false);
						comboBoxAttrazione_2.setVisible(false);
						comboBoxRistorante.setVisible(false);
						comboBoxAlloggio.setVisible(false);
						comboBoxAttrazione.setVisible(true);
						
					}
			}
		});
		comboBoxCategoria.setModel(new DefaultComboBoxModel<String>(new String[] {"Ristorante", "Alloggio", "Attrazione"}));
		comboBoxCategoria.setForeground(new Color(255, 165, 0));
		comboBoxCategoria.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		comboBoxCategoria.setBorder(null);
		comboBoxCategoria.setBackground(new Color(178, 34, 34));
		comboBoxCategoria.setBounds(543, 343, 110, 26);
		panel.add(comboBoxCategoria);
		
		JLabel lblSottocategoria = new JLabel("Sottocategoria");
		lblSottocategoria.setForeground(new Color(255, 215, 0));
		lblSottocategoria.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblSottocategoria.setBounds(687, 313, 131, 29);
		panel.add(lblSottocategoria);
		
		JLabel lblSottocategoria_1 = new JLabel("Sottocategoria 2");
		lblSottocategoria_1.setForeground(new Color(255, 215, 0));
		lblSottocategoria_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblSottocategoria_1.setBounds(872, 313, 153, 29);
		panel.add(lblSottocategoria_1);
		
		JLabel lblDescrizione = new JLabel("Descrizione");
		lblDescrizione.setForeground(new Color(255, 215, 0));
		lblDescrizione.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblDescrizione.setBounds(543, 399, 131, 29);
		panel.add(lblDescrizione);
		
		JLabel lblErroreCategoria = new JLabel("La Sottocategoria 1 e la Sottocategoria 2 non possono corrispondere");
		lblErroreCategoria.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblErroreCategoria.setForeground(Color.RED);
		lblErroreCategoria.setVisible(false);
		
		JLabel lblAsterisco_immagine = new JLabel("*");
		lblAsterisco_immagine.setFont(new Font("Trebuchet MS", Font.BOLD, 27));
		lblAsterisco_immagine.setForeground(new Color(255, 0, 0));
		lblAsterisco_immagine.setBounds(916, 267, 31, 21);
		lblAsterisco_immagine.setVisible(false);
		panel.add(lblAsterisco_immagine);
		lblErroreCategoria.setBounds(525, 380, 500, 20);
		panel.add(lblErroreCategoria);
		
		
	
		
		JTextArea txtDescrizioneAttivita = new JTextArea();
		txtDescrizioneAttivita.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(178, 34, 34), new Color(178, 34, 34), new Color(178, 34, 34), new Color(178, 34, 34)));
		txtDescrizioneAttivita.setForeground(new Color(255, 165, 0));
		txtDescrizioneAttivita.setLineWrap(true);
		txtDescrizioneAttivita.setText("Inserisci qui la descrizione della tu\u00E0 attivit\u00E0...");
		txtDescrizioneAttivita.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		txtDescrizioneAttivita.setBackground(new Color(139, 0, 0));
		txtDescrizioneAttivita.setBounds(543, 432, 404, 137);
		txtDescrizioneAttivita.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txtDescrizioneAttivita.getText().length() >= 250 )
		            e.consume(); 
		    }  
		});
		
		JButton btnTornaIndietro = new JButton("");
		btnTornaIndietro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				controller.setVisibleMenuPrincipaleProprietario(true);
				controller.setDefaultAggiungiAttivitaFrame(txtNomeAttivita, txtViaAttivita, txtDescrizioneAttivita,lblAsterisco_immagine);
			}
		});
		
		panel.add(txtDescrizioneAttivita);
		
		JButton btnAggiungiFoto = new JButton("");
		btnAggiungiFoto.setIcon(new ImageIcon(AggiungiAttivitaFrame.class.getResource("/Images/addPicture.png")));
		btnAggiungiFoto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAggiungiFoto.setOpaque(false);
		btnAggiungiFoto.setContentAreaFilled(false);
		btnAggiungiFoto.setBorderPainted(false);
		btnAggiungiFoto.setBorder(null);
		btnAggiungiFoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controller.scegliImmagine();
				
					
				
			}
		});
		btnAggiungiFoto.setBounds(861, 256, 54, 41);
		panel.add(btnAggiungiFoto);
		btnTornaIndietro.setIcon(new ImageIcon(AggiungiAttivitaFrame.class.getResource("/Images/undo.png")));
		btnTornaIndietro.setOpaque(false);
		btnTornaIndietro.setContentAreaFilled(false);
		btnTornaIndietro.setBorderPainted(false);
		btnTornaIndietro.setBorder(null);
		btnTornaIndietro.setBounds(900, 568, 47, 41);
		panel.add(btnTornaIndietro);
		
		JButton btnAggiungiCategoria = new JButton("");
		btnAggiungiCategoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSottocategoria_1.setVisible(true);
				if(comboBoxCategoria.getSelectedIndex()==0){
				comboBoxRistorante_2.setVisible(true);
				comboBoxAttrazione_2.setVisible(false);
				comboBoxAlloggio_2.setVisible(true);
				}else 
					if(comboBoxCategoria.getSelectedIndex()==1){
						comboBoxAlloggio_2.setVisible(true);
						comboBoxRistorante_2.setVisible(false);
						comboBoxAttrazione_2.setVisible(false);
					}else
						if(comboBoxCategoria.getSelectedIndex()==2){
							comboBoxAlloggio_2.setVisible(false);
							comboBoxRistorante_2.setVisible(false);
							comboBoxAttrazione_2.setVisible(true);
						}
			
				
			}
		});
		
		
		btnAggiungiCategoria.setIcon(new ImageIcon(AggiungiAttivitaFrame.class.getResource("/Images/add (1).png")));
		btnAggiungiCategoria.setBounds(872, 343, 37, 26);
		btnAggiungiCategoria.setBorder(null);
		btnAggiungiCategoria.setContentAreaFilled(false);
		btnAggiungiCategoria.setOpaque(false);
		panel.add(btnAggiungiCategoria);
		
		JButton btnAggiungiAttivita = new JButton("");
		btnAggiungiAttivita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 if(controller.gestisciEccezioniAggiungiAttivita(lblNomeAsterisco, txtNomeAttivita, lblViaAsterisco, txtViaAttivita, lblDescrizioneAsterisco,lblAsterisco_immagine,txtDescrizioneAttivita)==true){
			String sottocategoria_scelta = controller.sceltaSottocategoria(comboBoxCategoria, comboBoxRistorante, comboBoxAlloggio, comboBoxAttrazione);
			String sottocategoria_seconda_scelta=controller.sceltaSottocategoria(comboBoxCategoria, comboBoxRistorante_2, comboBoxAlloggio_2, comboBoxAttrazione_2);
			if(!sottocategoria_scelta.equals(sottocategoria_seconda_scelta)){
				lblErroreCategoria.setVisible(false);
			try {
				if(controller.verificaPresenzaAttivita(txtNomeAttivita.getText(),comboBoxPosizione.getSelectedItem().toString())==true){
					controller.inserisciAttivitaDatabase(txtNomeAttivita.getText(),comboBoxPosizione.getSelectedItem().toString(),txtViaAttivita.getText(), comboBoxCategoria.getSelectedItem().toString(),sottocategoria_scelta,sottocategoria_seconda_scelta,txtDescrizioneAttivita.getText(),controller.generaCodiceAttivita());
					controller.setDefaultAggiungiAttivitaFrame(txtNomeAttivita, txtViaAttivita, txtDescrizioneAttivita,lblAsterisco_immagine);}
			}catch (Exception e1) {	
				lblAsterisco_immagine.setVisible(true);}
			}else 	lblErroreCategoria.setVisible(true);
		 }}});
		
		btnAggiungiAttivita.setIcon(new ImageIcon(AggiungiAttivitaFrame.class.getResource("/Images/plus (2).png")));
		btnAggiungiAttivita.setBounds(950, 568, 45, 41);
		btnAggiungiAttivita.setBorder(null);
		btnAggiungiAttivita.setContentAreaFilled(false);
		btnAggiungiAttivita.setOpaque(false);
		panel.add(btnAggiungiAttivita);
		
		
		
		JLabel Sfondo = new JLabel("");
		Sfondo.setIcon(new ImageIcon(AggiungiAttivitaFrame.class.getResource("/Images/AggiungiAttivit\u00E0Men\u00F9_sfondo.jpg")));
		Sfondo.setBounds(0, 0, 1040, 625);
		panel.add(Sfondo);
	}
}
