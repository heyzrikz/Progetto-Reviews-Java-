import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class MenuPrincipaleModeratore extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipaleModeratore frame = new MenuPrincipaleModeratore();
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
	public MenuPrincipaleModeratore(Controller ctrl) {
		setResizable(false);
		Controller controller=ctrl;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 711);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 0));
		panel.setBounds(0, 0, 719, 744);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("MENU' PRINCIPALE");
		label.setForeground(new Color(255, 215, 0));
		label.setFont(new Font("Corbel Light", Font.BOLD, 50));
		label.setBounds(136, 35, 459, 60);
		panel.add(label);
		
		JButton btnBack = new JButton("\r\n");
		btnBack.setBounds(577, 608, 37, 33);
		panel.add(btnBack);
		
		
		btnBack.setIcon(new ImageIcon(MenuPrincipaleUtente.class.getResource("/Images/logout.png")));
		btnBack.setOpaque(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		btnBack.setBorder(null);
		
		JLabel lblUtente_1 = new JLabel("Moderatore\r\n");
		lblUtente_1.setForeground(new Color(255, 165, 0));
		lblUtente_1.setFont(new Font("Corbel Light", Font.BOLD | Font.ITALIC, 25));
		lblUtente_1.setBounds(301, 87, 122, 40);
		panel.add(lblUtente_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 215, 0));
		separator.setBackground(new Color(255, 215, 0));
		separator.setBounds(51, 138, 615, 21);
		panel.add(separator);
		
		JLabel lblSegnalazioneTrovata = new JLabel("Gestisci segnalazioni");
		lblSegnalazioneTrovata.setForeground(new Color(255, 215, 0));
		lblSegnalazioneTrovata.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblSegnalazioneTrovata.setBounds(201, 228, 345, 40);
		panel.add(lblSegnalazioneTrovata);
		
		JLabel lblSegnalazioneNonTrovata = new JLabel("Nessuna segnalazione presente");
		lblSegnalazioneNonTrovata.setForeground(Color.RED);
		lblSegnalazioneNonTrovata.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblSegnalazioneNonTrovata.setBounds(201, 228, 443, 40);
		lblSegnalazioneNonTrovata.setVisible(false);
		panel.add(lblSegnalazioneNonTrovata);
		
		JButton btnGestisciSegnalazioni = new JButton("\r\n");
		btnGestisciSegnalazioni.setHorizontalAlignment(SwingConstants.LEFT);
		btnGestisciSegnalazioni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(controller.verificaPresenzaSegnalazioni(lblSegnalazioneNonTrovata, lblSegnalazioneTrovata)){
						controller.setElencoSegnalazioni();
						controller.aggiungiTabellaSegnalazioni(controller.getTabellaRecensioniSegnalate());
						setVisible(false);
						controller.setVisibleMostraSegnalazioni(true);
					
					}
				
				}catch (Exception e) {
					e.printStackTrace();}}
		});
		btnGestisciSegnalazioni.setIcon(new ImageIcon(MenuPrincipaleModeratore.class.getResource("/Images/gestiscisegnalazioni.png")));
		btnGestisciSegnalazioni.setBounds(61, 175, 583, 157);
		btnGestisciSegnalazioni.setBorder(null);
		btnGestisciSegnalazioni.setOpaque(false);
		btnGestisciSegnalazioni.setContentAreaFilled(false);
		panel.add(btnGestisciSegnalazioni);
		
		JButton btnCreaModeratore = new JButton("\r\n");
		btnCreaModeratore.setIcon(new ImageIcon(MenuPrincipaleModeratore.class.getResource("/Images/add_moderatore.png")));
		btnCreaModeratore.setHorizontalAlignment(SwingConstants.LEFT);
		btnCreaModeratore.setBorder(null);
		btnCreaModeratore.setContentAreaFilled(false);
		btnCreaModeratore.setOpaque(false);
		btnCreaModeratore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				controller.setVisibleAggiungiModeratore(true);
				
				
				
			}
		});
		btnCreaModeratore.setBounds(61, 381, 398, 129);
		panel.add(btnCreaModeratore);
		
		JLabel lblNewLabel = new JLabel("Crea Moderatore");
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNewLabel.setBounds(211, 420, 248, 40);
		panel.add(lblNewLabel);
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSegnalazioneNonTrovata.setVisible(false);
				lblSegnalazioneTrovata.setVisible(true);
				setVisible(false);
				controller.setVisibleHome(true);
			}
		});
	}
}
