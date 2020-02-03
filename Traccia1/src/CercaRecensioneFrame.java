

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class CercaRecensioneFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/**public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CercaRecensioneFrame frame = new CercaRecensioneFrame();
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
	public CercaRecensioneFrame(Controller ctrl) {
		setResizable(false);
		Controller controller=ctrl;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 337);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDove = new JLabel("Dove?");
		lblDove.setForeground(new Color(255, 215, 0));
		lblDove.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblDove.setBounds(93, 106, 73, 29);
		contentPane.add(lblDove);
		
		JLabel lblCercaSuReviews = new JLabel("CERCA SU REVIEWS");
		lblCercaSuReviews.setForeground(new Color(255, 215, 0));
		lblCercaSuReviews.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblCercaSuReviews.setBounds(195, 16, 273, 46);
		contentPane.add(lblCercaSuReviews);
		
		JLabel lblCosaScegli = new JLabel("Cosa scegli ?");
		lblCosaScegli.setForeground(new Color(255, 215, 0));
		lblCosaScegli.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblCosaScegli.setBounds(423, 106, 118, 29);
		contentPane.add(lblCosaScegli);
		
		JComboBox<String> comboBoxPosizione = new JComboBox<String>();
		comboBoxPosizione.setModel(new DefaultComboBoxModel<String>(new String[] {"Abruzzo-L'Aquila", "Abruzzo-Chieti", "Abruzzo-Pescara", "Abruzzo-Teramo", "Basilicata-Potenza", "Basilicata-Matera", "Calabria-Reggio Calabria", "Calabria-Catanzaro", "Calabria-Crotone", "Calabria-Vibo Valentia Marina", "Calabria-Cosenza", "Campania-Napoli", "Campania-Avellino", "Campania-Caserta", "Campania-Benevento", "Campania-Salerno", "Emilia Romagna-Bologna", "Emilia Romagna-Reggio Emilia", "Emilia Romagna-Parma", "Emilia Romagna-Modena", "Emilia Romagna-Ferrara", "Emilia Romagna-Forl\u00EC Cesena", "Emilia Romagna-Piacenza", "Emilia Romagna-Ravenna", "Emilia Romagna-Rimini", "Friuli Venezia Giulia-Trieste", "Friuli Venezia Giulia-Gorizia", "Friuli Venezia Giulia-Pordenone", "Friuli Venezia Giulia-Udine", "Lazio-Roma", "Lazio-Latina", "Lazio-Frosinone", "Lazio-Viterbo", "Lazio-Rieti", "Lombardia-Milano", "Lombardia-Bergamo", "Lombardia-Brescia", "Lombardia-Como", "Lombardia-Cremona", "Lombardia-Mantova", "Lombardia-Monza e Brianza", "Lombardia-Pavia", "Lombardia-Sondrio", "Lombardia-Lodi", "Lombardia-Lecco", "Lombardia-Varese", "Marche-Ancona", "Marche-Ascoli Piceno", "Marche-Fermo", "Marche-Macerata", "Marche-Pesaro Urbino", "Molise-Campobasso", "Molise-Isernia", "Piemonte-Torino", "Piemonte-Asti", "Piemonte-Alessandria", "Piemonte-Cuneo", "Piemonte-Novara", "Piemonte-Vercelli", "Piemonte-Verbania", "Piemonte-Biella", "Valle D'Aosta-Aosta", "Puglia-Bari", "Puglia-Barletta-Andria-Trani", "Puglia-Brindisi", "Puglia-Foggia", "Puglia-Lecce", "Puglia-Taranto", "Sardegna-Cagliari", "Sardegna-Sassari", "Sardegna-Nuoro", "Sardegna-Oristano", "Sardegna-Carbonia Iglesias", "Sardegna-Medio Campidano", "Sardegna-Olbia Tempio", "Sardegna-Ogliastra", "Sicilia-Palermo", "Sicilia-Agrigento", "Sicilia-Caltanissetta", "Sicilia-Catania", "Sicilia-Enna", "Sicilia-Messina", "Sicilia-Ragusa", "Sicilia-Siracusa", "Sicilia-Trapani", "Toscana-Arezzo", "Toscana-Massa Carrara", "Toscana-Firenze", "Toscana-Livorno", "Toscana-Grosseto", "Toscana-Lucca", "Toscana-Pisa", "Toscana-Pistoia", "Toscana-Prato", "Toscana-Siena", "Trentino Alto Adige-Trento", "Trentino Alto Adige-Bolzano", "Umbria-Perugia", "Umbria-Terni", "Veneto-Venezia", "Veneto-Belluno", "Veneto-Padova", "Veneto-Rovigo", "Veneto-Treviso", "Veneto-Verona", "Veneto-Vicenza"}));
		comboBoxPosizione.setForeground(new Color(255, 140, 0));
		comboBoxPosizione.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		comboBoxPosizione.setBackground(new Color(178, 34, 34));
		comboBoxPosizione.setBounds(93, 139, 188, 26);
		contentPane.add(comboBoxPosizione);
		
		JComboBox<String> comboBoxCategoria = new JComboBox<String>();
		comboBoxCategoria.setModel(new DefaultComboBoxModel<String>(new String[] {"Ristorante", "Alloggio", "Attrazione"}));
		comboBoxCategoria.setForeground(new Color(255, 140, 0));
		comboBoxCategoria.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		comboBoxCategoria.setBackground(new Color(178, 34, 34));
		comboBoxCategoria.setBounds(423, 139, 146, 26);
		contentPane.add(comboBoxCategoria);
		
		JButton btnBack = new JButton("\r\n");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				controller.gestisciVisiblitaMenu();
			}
		});
		btnBack.setIcon(new ImageIcon(AggiungiRecensioneFrame.class.getResource("/Images/undo.png")));
		btnBack.setBounds(545, 244, 37, 33);
		btnBack.setOpaque(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		btnBack.setBorder(null);
		contentPane.add(btnBack);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 215, 0));
		separator.setBackground(new Color(255, 215, 0));
		separator.setBounds(36, 233, 595, 21);
		contentPane.add(separator);
		
		JButton btnRicerca = new JButton("");
		btnRicerca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controller.gestisciSceltaSottocategoria(comboBoxPosizione.getSelectedItem().toString(), comboBoxCategoria.getSelectedItem().toString())==true){
					setVisible(false);
				}else{
					setVisible(false);
					controller.setVisibleErroreRisultatoNonTrovatoDialog(true);
				}
			}
		});
		btnRicerca.setIcon(new ImageIcon(CercaRecensioneFrame.class.getResource("/Images/detective.png")));
		btnRicerca.setBounds(590, 243, 41, 38);
		btnRicerca.setOpaque(false);
		btnRicerca.setContentAreaFilled(false);
		btnRicerca.setBorderPainted(false);
		btnRicerca.setBorder(null);
		contentPane.add(btnRicerca);
	}
}
