import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginModeratore extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginModeratore frame = new LoginModeratore();
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
	public LoginModeratore(Controller ctrl) {
		Controller controller=ctrl;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 823, 632);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REVIEWS");
		lblNewLabel.setFont(new Font("Goudy Old Style", Font.BOLD, 50));
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setBounds(68, 360, 229, 63);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pagina riservata ai moderatori\r\n");
		lblNewLabel_1.setForeground(new Color(255, 140, 0));
		lblNewLabel_1.setFont(new Font("Corbel Light", Font.BOLD, 19));
		lblNewLabel_1.setBounds(46, 414, 267, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblAsteriscoUsername = new JLabel("*");
		lblAsteriscoUsername.setForeground(new Color(255, 0, 0));
		lblAsteriscoUsername.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
		lblAsteriscoUsername.setBackground(new Color(255, 0, 0));
		lblAsteriscoUsername.setBounds(759, 166, 16, 20);
		lblAsteriscoUsername.setVisible(false);
		contentPane.add(lblAsteriscoUsername);
		
		JLabel lblAsteriscoPassword = new JLabel("*");
		lblAsteriscoPassword.setForeground(Color.RED);
		lblAsteriscoPassword.setFont(new Font("Trebuchet MS", Font.BOLD, 19));
		lblAsteriscoPassword.setBackground(Color.RED);
		lblAsteriscoPassword.setBounds(759, 272, 16, 20);
		lblAsteriscoPassword.setVisible(false);
		contentPane.add(lblAsteriscoPassword);
		
		JLabel lblErrore = new JLabel("Errore utente non trovato");
		lblErrore.setForeground(new Color(255, 0, 0));
		lblErrore.setBounds(491, 338, 186, 20);
		lblErrore.setVisible(false);
		contentPane.add(lblErrore);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(new Color(255, 215, 0));
		separator.setBackground(new Color(255, 215, 0));
		separator.setBounds(369, 36, 37, 494);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("\r\n");
		lblNewLabel_2.setIcon(new ImageIcon(LoginModeratore.class.getResource("/Images/tools.png")));
		lblNewLabel_2.setBounds(46, 84, 260, 280);
		contentPane.add(lblNewLabel_2);
		
		txtUsername = new JTextField();
		txtUsername.setForeground(new Color(255, 165, 0));
		txtUsername.setFont(new Font("Trebuchet MS", Font.ITALIC, 20));
		txtUsername.setBackground(new Color(128, 0, 0));
		txtUsername.setBounds(443, 163, 314, 26);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		txtUsername.setBorder(null);
		txtUsername.setOpaque(true);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(255, 215, 0));
		separator_2.setBackground(new Color(255, 215, 0));
		separator_2.setBounds(443, 298, 314, 24);
		contentPane.add(separator_2);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(255, 165, 0));
		passwordField.setBackground(new Color(128, 0, 0));
		passwordField.setBounds(443, 270, 314, 26);
		contentPane.add(passwordField);
		passwordField.setOpaque(true);
		passwordField.setBorder(null);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(255, 215, 0));
		separator_1.setBackground(new Color(255, 215, 0));
		separator_1.setBounds(443, 192, 314, 24);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_3 = new JLabel("Identificativo moderatore");
		lblNewLabel_3.setForeground(new Color(255, 215, 0));
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel_3.setBounds(443, 117, 234, 41);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(255, 215, 0));
		lblPassword.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblPassword.setBounds(443, 248, 98, 20);
		contentPane.add(lblPassword);
		
		JButton btnAccedi = new JButton("");
		btnAccedi.setIcon(new ImageIcon(LoginModeratore.class.getResource("/Images/login.png")));
		btnAccedi.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				if(controller.gestisciEccezioniLoginModeratore(lblAsteriscoUsername, lblAsteriscoPassword, txtUsername, passwordField)==true){
					try {
						controller.setModeratoreAcceduto(txtUsername.getText(), passwordField.getText());
						if(controller.cercaModeratoreNelDatabase()==true){
							lblErrore.setVisible(false);
							setVisible(false);
							controller.setDefaultHome(txtUsername, passwordField);
							controller.setVisibleMenuPrincipaleModeratore(true);
							}else lblErrore.setVisible(true);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				
			}
		});
		btnAccedi.setForeground(new Color(255, 215, 0));
		btnAccedi.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnAccedi.setBackground(new Color(255, 140, 0));
		btnAccedi.setBounds(696, 388, 50, 41);
		btnAccedi.setBorder(null);
		btnAccedi.setContentAreaFilled(false);
		btnAccedi.setOpaque(false);
		contentPane.add(btnAccedi);
		
		JButton btnTornaIndietro = new JButton("");
		btnTornaIndietro.setIcon(new ImageIcon(RegistrazioneFrame.class.getResource("/Images/undo.png")));
		btnTornaIndietro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUsername.setText("");
				txtUsername.setText("");
				passwordField.setText("");
				setVisible(false);
				controller.setVisibleHome(true);
			}
		});
		btnTornaIndietro.setOpaque(false);
		btnTornaIndietro.setContentAreaFilled(false);
		btnTornaIndietro.setBorderPainted(false);
		btnTornaIndietro.setBorder(null);
		btnTornaIndietro.setBounds(645, 388, 47, 41);
		contentPane.add(btnTornaIndietro);
	}
}
