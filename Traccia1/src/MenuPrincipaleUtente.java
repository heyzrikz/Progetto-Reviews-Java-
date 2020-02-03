
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class MenuPrincipaleUtente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/**public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipaleUtente frame = new MenuPrincipaleUtente();
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
	public MenuPrincipaleUtente(Controller ctrl) {
		setResizable(false);
		Controller controller=ctrl;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 711);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 0));
		panel.setBounds(0, 0, 678, 744);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("MENU' PRINCIPALE");
		label.setForeground(new Color(255, 215, 0));
		label.setFont(new Font("Corbel Light", Font.BOLD, 50));
		label.setBounds(117, 52, 459, 60);
		panel.add(label);
		
		JLabel lblUtente = new JLabel("\r\n");
		lblUtente.setForeground(new Color(255, 215, 0));
		lblUtente.setFont(new Font("Goudy Old Style", Font.BOLD, 25));
		lblUtente.setBounds(417, 66, 79, 40);
		panel.add(lblUtente);
		
		JButton btnAggiungiRecensione = new JButton("\r\n");
		btnAggiungiRecensione.setHorizontalAlignment(SwingConstants.LEFT);
		btnAggiungiRecensione.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.setVisibleCercaAttivitaFrame(true);
				setVisible(false);
			}
		});
		btnAggiungiRecensione.setBounds(54, 394, 558, 157);
		btnAggiungiRecensione.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnAggiungiRecensione.setBorder(null);
		btnAggiungiRecensione.setIcon(new ImageIcon(MenuPrincipaleUtente.class.getResource("/Images/add_review.png")));
		btnAggiungiRecensione.setOpaque(false);
		btnAggiungiRecensione.setContentAreaFilled(false);
		panel.add(btnAggiungiRecensione);
		
		JButton btnRicerca = new JButton("\r\n");
		btnRicerca.setHorizontalAlignment(SwingConstants.LEFT);
		btnRicerca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controller.setVisibleCercaRecensioneFrame(true);
				setVisible(false);
			}
		});
		btnRicerca.setIcon(new ImageIcon(MenuPrincipaleUtente.class.getResource("/Images/search_icon.png")));
		btnRicerca.setBounds(54, 190, 322, 157);
		btnRicerca.setBorder(null);
		btnRicerca.setOpaque(false);
		btnRicerca.setContentAreaFilled(false);
		panel.add(btnRicerca);
		
		JButton btnBack = new JButton("\r\n");
		btnBack.setBounds(577, 608, 37, 33);
		panel.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				controller.setVisibleHome(true);
			}
		});
		
		btnBack.setIcon(new ImageIcon(MenuPrincipaleUtente.class.getResource("/Images/logout.png")));
		btnBack.setOpaque(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		btnBack.setBorder(null);
		
		JLabel lblUtente_1 = new JLabel("Utente");
		lblUtente_1.setForeground(new Color(255, 165, 0));
		lblUtente_1.setFont(new Font("Corbel Light", Font.BOLD | Font.ITALIC, 25));
		lblUtente_1.setBounds(290, 97, 86, 40);
		panel.add(lblUtente_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 215, 0));
		separator.setBackground(new Color(255, 215, 0));
		separator.setBounds(51, 138, 571, 21);
		panel.add(separator);
		
		JLabel lblAggiungiLaTua = new JLabel("Aggiungi la tua Recensione");
		lblAggiungiLaTua.setForeground(new Color(255, 215, 0));
		lblAggiungiLaTua.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblAggiungiLaTua.setBounds(232, 447, 390, 40);
		panel.add(lblAggiungiLaTua);
		
		JLabel lblDoveVuoiAndare = new JLabel("Ricerca");
		lblDoveVuoiAndare.setForeground(new Color(255, 215, 0));
		lblDoveVuoiAndare.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblDoveVuoiAndare.setBounds(232, 253, 123, 40);
		panel.add(lblDoveVuoiAndare);
	}
}
