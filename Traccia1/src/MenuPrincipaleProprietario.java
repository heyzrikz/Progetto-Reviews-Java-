import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class MenuPrincipaleProprietario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipaleProprietario frame = new MenuPrincipaleProprietario();
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
	public MenuPrincipaleProprietario(Controller ctrl) {
		setResizable(false);
		Controller controller=ctrl;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 984);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 0));
		panel.setBounds(0, 0, 684, 928);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblErroreInserisciAttivita = new JLabel("Non hai Attivit\u00E0 aggiunte");
		lblErroreInserisciAttivita.setForeground(new Color(255, 0, 0));
		lblErroreInserisciAttivita.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblErroreInserisciAttivita.setVisible(false);
		lblErroreInserisciAttivita.setBounds(253, 602, 363, 40);
		panel.add(lblErroreInserisciAttivita);
		
		JLabel lblAttivitaPresente = new JLabel("Modifica le tue Attivit\u00E0");
		lblAttivitaPresente.setForeground(new Color(255, 215, 0));
		lblAttivitaPresente.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblAttivitaPresente.setBounds(253, 602, 345, 40);
		panel.add(lblAttivitaPresente);
		
		JLabel lblNewLabel = new JLabel("MENU' PRINCIPALE");
		lblNewLabel.setFont(new Font("Corbel Light", Font.BOLD, 50));
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setBounds(118, 16, 457, 60);
		panel.add(lblNewLabel);
		
		JButton btnAggiungiAttività = new JButton("");
		btnAggiungiAttività.setHorizontalAlignment(SwingConstants.LEFT);
		btnAggiungiAttività.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnAggiungiAttività.setBorder(null);
		btnAggiungiAttività.setIcon(new ImageIcon(MenuPrincipaleProprietario.class.getResource("/Images/addLocation.png")));
		btnAggiungiAttività.setOpaque(false);
		btnAggiungiAttività.setContentAreaFilled(false);
		btnAggiungiAttività.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				lblErroreInserisciAttivita.setVisible(false);
				lblAttivitaPresente.setVisible(true);
				controller.setVisibleAggiungiAttivitaFrame(true);
			}
		});
		btnAggiungiAttività.setBounds(76, 166, 522, 134);
		panel.add(btnAggiungiAttività);
		
		JLabel lblModeratore = new JLabel("Proprietario");
		lblModeratore.setForeground(new Color(255, 165, 0));
		lblModeratore.setFont(new Font("Corbel Light", Font.BOLD | Font.ITALIC, 25));
		lblModeratore.setBounds(273, 62, 131, 40);
		panel.add(lblModeratore);
		
		JButton btnBack = new JButton("\r\n");
		btnBack.setBounds(616, 879, 37, 33);
		panel.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblErroreInserisciAttivita.setVisible(false);
				lblAttivitaPresente.setVisible(true);
				setVisible(false);
				controller.setVisibleHome(true);
			}
		});
		
		btnBack.setIcon(new ImageIcon(MenuPrincipaleUtente.class.getResource("/Images/logout.png")));
		btnBack.setOpaque(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		btnBack.setBorder(null);
		
		
		
		JButton btnRicerca = new JButton("\r\n");
		btnRicerca.setHorizontalAlignment(SwingConstants.LEFT);
		btnRicerca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblErroreInserisciAttivita.setVisible(false);
				lblAttivitaPresente.setVisible(true);
				controller.setVisibleCercaRecensioneFrame(true);
				setVisible(false);
			}
		});
		btnRicerca.setIcon(new ImageIcon(MenuPrincipaleUtente.class.getResource("/Images/search_icon.png")));
		btnRicerca.setBounds(76, 367, 425, 142);
		btnRicerca.setBorder(null);
		btnRicerca.setOpaque(false);
		btnRicerca.setContentAreaFilled(false);
		panel.add(btnRicerca);
		
		JButton btnModificaAttivita = new JButton("\r\n");
		btnModificaAttivita.setHorizontalAlignment(SwingConstants.LEFT);
		btnModificaAttivita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					controller.setElencoProprieAttivita();
					controller.aggiungiTabellaProprieAttivita(controller.getTabellaProprieAttivita(), lblErroreInserisciAttivita,lblAttivitaPresente);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnModificaAttivita.setBounds(76, 560, 532, 148);
		panel.add(btnModificaAttivita);
		btnModificaAttivita.setIcon(new ImageIcon(MenuPrincipaleProprietario.class.getResource("/Images/writing.png")));
		btnModificaAttivita.setBorder(null);
		btnModificaAttivita.setOpaque(false);
		btnModificaAttivita.setContentAreaFilled(false);
		
		JLabel lblNewLabel_1 = new JLabel("Aggiungi la tua Attivit\u00E0");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNewLabel_1.setForeground(new Color(255, 215, 0));
		lblNewLabel_1.setBounds(253, 213, 345, 40);
		panel.add(lblNewLabel_1);
		
		JLabel lblRicerca = new JLabel("Cerca Recensioni");
		lblRicerca.setForeground(new Color(255, 215, 0));
		lblRicerca.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblRicerca.setBounds(253, 413, 261, 40);
		panel.add(lblRicerca);
		
		
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 215, 0));
		separator.setBackground(new Color(255, 215, 0));
		separator.setBounds(48, 101, 571, 21);
		panel.add(separator);
		
		
	}
}
