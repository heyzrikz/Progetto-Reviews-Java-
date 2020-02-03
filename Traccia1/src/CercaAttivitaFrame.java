

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JSeparator;

@SuppressWarnings("serial")
public class CercaAttivitaFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CercaAttivitaFrame frame = new CercaAttivitaFrame();
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
	public CercaAttivitaFrame(Controller ctrl) {
		setResizable(false);
		Controller controller=ctrl;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 693, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 687, 295);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnCerca = new JButton("");
		btnCerca.setIcon(new ImageIcon(CercaAttivitaFrame.class.getResource("/Images/detective.png")));
		btnCerca.setVisible(true);
		
		JLabel lblCercaAttivit = new JLabel("CERCA ATTIVITA'");
		lblCercaAttivit.setForeground(new Color(255, 215, 0));
		lblCercaAttivit.setFont(new Font("Corbel Light", Font.BOLD, 30));
		lblCercaAttivit.setBounds(217, 16, 255, 46);
		panel.add(lblCercaAttivit);
		
		JComboBox<String> comboBoxNome = new JComboBox<String>();
		comboBoxNome.setVisible(false);
		comboBoxNome.setForeground(new Color(255, 140, 0));
		comboBoxNome.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		comboBoxNome.setBackground(new Color(178, 34, 34));
		comboBoxNome.setBounds(482, 138, 121, 26);
		panel.add(comboBoxNome);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setVisible(false);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setVisible(false);
		JLabel lblRegioneODestinazione = new JLabel("Posizione");
		lblRegioneODestinazione.setForeground(new Color(255, 215, 0));
		lblRegioneODestinazione.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblRegioneODestinazione.setBounds(41, 103, 85, 29);
		panel.add(lblRegioneODestinazione);
		
		JComboBox<String> comboBoxCategoria = new JComboBox<String>();
		comboBoxCategoria.setVisible(false);
		
		JComboBox<String> comboBoxRegione = new JComboBox<String>();
		comboBoxRegione.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBoxCategoria.setVisible(true);
				lblCategoria.setVisible(true);
				comboBoxNome.removeAllItems();
				try {
					for(Attivita elemento:controller.getElencoAttivita(comboBoxRegione.getSelectedItem().toString(),comboBoxCategoria.getSelectedItem().toString() )){
						comboBoxNome.addItem(elemento.getNome_attivita());
					}
				} catch (Exception e1) {
					System.err.println("Errore in action listener");
				}
			}
		});
		
		
		comboBoxCategoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNome.setVisible(true);
				comboBoxNome.setVisible(true);
				comboBoxNome.removeAllItems();
				
				try {
					for(Attivita elemento:controller.getElencoAttivita(comboBoxRegione.getSelectedItem().toString(),comboBoxCategoria.getSelectedItem().toString() )){
						comboBoxNome.addItem(elemento.getNome_attivita());
						
					}
					
				} catch (Exception e1) {
					
					System.err.println("Errore in action listener");
				}
				
			}
		});
		JButton btnBack = new JButton("\r\n");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBoxCategoria.setVisible(false);
				comboBoxNome.setVisible(false);
				comboBoxNome.setSelectedIndex(-1);
				lblNome.setVisible(false);
				lblCategoria.setVisible(false);
				
				setVisible(false);
				controller.setVisibleMenuPrincipaleUtente(true);
			}
		});
		btnBack.setIcon(new ImageIcon(AggiungiRecensioneFrame.class.getResource("/Images/undo.png")));
		btnBack.setBounds(545, 244, 37, 33);
		btnBack.setOpaque(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		btnBack.setBorder(null);
		panel.add(btnBack);
		
		comboBoxCategoria.setModel(new DefaultComboBoxModel<String>(new String[] {"Ristorante", "Alloggio", "Attrazione"}));
		comboBoxCategoria.setForeground(new Color(255, 140, 0));
		comboBoxCategoria.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		comboBoxCategoria.setBackground(new Color(178, 34, 34));
		comboBoxCategoria.setBounds(264, 137, 121, 26);
		panel.add(comboBoxCategoria);
		
		comboBoxRegione.setForeground(new Color(255, 140, 0));
		comboBoxRegione.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		comboBoxRegione.setModel(new DefaultComboBoxModel<String>(new String[] {"Abruzzo-L'Aquila", "Abruzzo-Chieti", "Abruzzo-Pescara", "Abruzzo-Teramo", "Basilicata-Potenza", "Basilicata-Matera", "Calabria-Reggio Calabria", "Calabria-Catanzaro", "Calabria-Crotone", "Calabria-Vibo Valentia Marina", "Calabria-Cosenza", "Campania-Napoli", "Campania-Avellino", "Campania-Caserta", "Campania-Benevento", "Campania-Salerno", "Emilia Romagna-Bologna", "Emilia Romagna-Reggio Emilia", "Emilia Romagna-Parma", "Emilia Romagna-Modena", "Emilia Romagna-Ferrara", "Emilia Romagna-Forl\u00EC Cesena", "Emilia Romagna-Piacenza", "Emilia Romagna-Ravenna", "Emilia Romagna-Rimini", "Friuli Venezia Giulia-Trieste", "Friuli Venezia Giulia-Gorizia", "Friuli Venezia Giulia-Pordenone", "Friuli Venezia Giulia-Udine", "Lazio-Roma", "Lazio-Latina", "Lazio-Frosinone", "Lazio-Viterbo", "Lazio-Rieti", "Lombardia-Milano", "Lombardia-Bergamo", "Lombardia-Brescia", "Lombardia-Como", "Lombardia-Cremona", "Lombardia-Mantova", "Lombardia-Monza e Brianza", "Lombardia-Pavia", "Lombardia-Sondrio", "Lombardia-Lodi", "Lombardia-Lecco", "Lombardia-Varese", "Marche-Ancona", "Marche-Ascoli Piceno", "Marche-Fermo", "Marche-Macerata", "Marche-Pesaro Urbino", "Molise-Campobasso", "Molise-Isernia", "Piemonte-Torino", "Piemonte-Asti", "Piemonte-Alessandria", "Piemonte-Cuneo", "Piemonte-Novara", "Piemonte-Vercelli", "Piemonte-Verbania", "Piemonte-Biella", "Valle D'Aosta-Aosta", "Puglia-Bari", "Puglia-Barletta-Andria-Trani", "Puglia-Brindisi", "Puglia-Foggia", "Puglia-Lecce", "Puglia-Taranto", "Sardegna-Cagliari", "Sardegna-Sassari", "Sardegna-Nuoro", "Sardegna-Oristano", "Sardegna-Carbonia Iglesias", "Sardegna-Medio Campidano", "Sardegna-Olbia Tempio", "Sardegna-Ogliastra", "Sicilia-Palermo", "Sicilia-Agrigento", "Sicilia-Caltanissetta", "Sicilia-Catania", "Sicilia-Enna", "Sicilia-Messina", "Sicilia-Ragusa", "Sicilia-Siracusa", "Sicilia-Trapani", "Toscana-Arezzo", "Toscana-Massa Carrara", "Toscana-Firenze", "Toscana-Livorno", "Toscana-Grosseto", "Toscana-Lucca", "Toscana-Pisa", "Toscana-Pistoia", "Toscana-Prato", "Toscana-Siena", "Trentino Alto Adige-Trento", "Trentino Alto Adige-Bolzano", "Umbria-Perugia", "Umbria-Terni", "Veneto-Venezia", "Veneto-Belluno", "Veneto-Padova", "Veneto-Rovigo", "Veneto-Treviso", "Veneto-Verona", "Veneto-Vicenza"}));
		comboBoxRegione.setBackground(new Color(178, 34, 34));
		comboBoxRegione.setBounds(41, 138, 188, 26);
		panel.add(comboBoxRegione);
		
		
		lblCategoria.setForeground(new Color(255, 215, 0));
		lblCategoria.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblCategoria.setBounds(264, 103, 92, 29);
		panel.add(lblCategoria);
		
		
		lblNome.setForeground(new Color(255, 215, 0));
		lblNome.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNome.setBounds(482, 103, 92, 29);
		panel.add(lblNome);
		
		JLabel lblAsterisco = new JLabel("*");
		lblAsterisco.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblAsterisco.setForeground(new Color(255, 0, 0));
		lblAsterisco.setBounds(610, 144, 23, 26);
		lblAsterisco.setVisible(false);
		panel.add(lblAsterisco);
		
		
		btnCerca.setBounds(581, 244, 44, 33);
		panel.add(btnCerca);
		btnCerca.setOpaque(false);
		btnCerca.setContentAreaFilled(false);
		btnCerca.setBorderPainted(false);
		btnCerca.setBorder(null);
		btnCerca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxNome.getSelectedIndex()!=-1){
				try {
					lblAsterisco.setVisible(false);
					setVisible(false);
					controller.cercaAttivita(comboBoxRegione.getSelectedItem().toString(), comboBoxCategoria.getSelectedItem().toString(), comboBoxNome.getSelectedItem().toString());
					controller.setVisibleAggiungiRecensioneFrame(true);
                    controller.getLabelAttivita();
                    controller.getImmagineAttivita();
                    
                    
					
					
				} catch (Exception e1) {
					e1.printStackTrace();}	
				}else lblAsterisco.setVisible(true);}
					
		});
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 215, 0));
		separator.setBackground(new Color(255, 215, 0));
		separator.setBounds(41, 229, 595, 21);
		panel.add(separator);
		
		JLabel sfondo = new JLabel("");
		sfondo.setIcon(new ImageIcon(CercaAttivitaFrame.class.getResource("/Images/Menu.png")));
		sfondo.setBounds(0, 0, 690, 311);
		panel.add(sfondo);
	}
}
