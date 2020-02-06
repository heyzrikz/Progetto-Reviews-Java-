
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class RegistrazioneFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCognome;
	private JTextField txtUsername;
	private JPasswordField passwordField;
	private JPasswordField conferma_passwordField;
	private JLabel lblPasswordAsterisco;
	private JLabel lblConfermaPasswordAsterisco;
	private JLabel lblErroreUsername;
	private JLabel lblErroreMinPassword;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registrazione frame = new Registrazione();
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
	public RegistrazioneFrame(Controller ctrl) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegistrazioneFrame.class.getResource("/Images/add_moderatore.png")));
		setResizable(false);
		Controller controller=ctrl;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 738);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 451, 699);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRAZIONE");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 29));
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setBounds(123, 28, 225, 35);
		panel.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(new Color(255, 215, 0));
		lblNome.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNome.setBounds(38, 124, 131, 29);
		panel.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setSelectionColor(new Color(178, 34, 34));
		txtNome.setOpaque(false);
		txtNome.setForeground(new Color(255, 165, 0));
		txtNome.setFont(new Font("Trebuchet MS", Font.ITALIC, 19));
		txtNome.setColumns(10);
		txtNome.setBorder(null);
		txtNome.setBounds(38, 149, 322, 41);
		panel.add(txtNome);
		txtNome.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txtNome.getText().length() >= 15 )
		            e.consume(); 
		    }  
		});
		
		JLabel lblNomeAsterisco = new JLabel("*");
		lblNomeAsterisco.setForeground(new Color(255, 0, 0));
		lblNomeAsterisco.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNomeAsterisco.setBounds(389, 150, 20, 30);
		lblNomeAsterisco.setVisible(false);
		panel.add(lblNomeAsterisco);
		
		JLabel lblErrorePassword = new JLabel("Errore le due password non corrispondono");
		lblErrorePassword.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblErrorePassword.setForeground(Color.RED);
		lblErrorePassword.setVisible(false);
		lblErrorePassword.setBounds(60, 586, 312, 20);
		panel.add(lblErrorePassword);
		
		lblErroreUsername = new JLabel("Username gi\u00E0 in uso");
		lblErroreUsername.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblErroreUsername.setForeground(Color.RED);
		lblErroreUsername.setVisible(false);
		lblErroreUsername.setBounds(135, 363, 161, 35);
		panel.add(lblErroreUsername);
		
		lblErroreMinPassword = new JLabel("La password deve contenere almeno 8 caratteri");
		lblErroreMinPassword.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblErroreMinPassword.setForeground(Color.RED);
		lblErroreMinPassword.setVisible(false);
		lblErroreMinPassword.setBounds(48, 456, 353, 20);
		panel.add(lblErroreMinPassword);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 215, 0));
		separator.setBackground(new Color(255, 215, 0));
		separator.setBounds(38, 180, 348, 21);
		panel.add(separator);
		
		JLabel lblCognome = new JLabel("Cognome");
		lblCognome.setForeground(new Color(255, 215, 0));
		lblCognome.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblCognome.setBounds(38, 217, 131, 29);
		panel.add(lblCognome);
		
		txtCognome = new JTextField();
		txtCognome.setSelectionColor(new Color(178, 34, 34));
		txtCognome.setOpaque(false);
		txtCognome.setForeground(new Color(255, 165, 0));
		txtCognome.setFont(new Font("Trebuchet MS", Font.ITALIC, 19));
		txtCognome.setColumns(10);
		txtCognome.setBorder(null);
		txtCognome.setBounds(38, 244, 322, 41);
		panel.add(txtCognome);
		txtCognome.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txtCognome.getText().length() >= 15 )
		            e.consume(); 
		    }  
		});
		
		JLabel lblCognomeAsterisco = new JLabel("*");
		lblCognomeAsterisco.setForeground(new Color(255, 0, 0));
		lblCognomeAsterisco.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblCognomeAsterisco.setBounds(389, 245, 20, 30);
		lblCognomeAsterisco.setVisible(false);
		panel.add(lblCognomeAsterisco);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(255, 215, 0));
		separator_1.setBackground(new Color(255, 215, 0));
		separator_1.setBounds(38, 275, 348, 21);
		panel.add(separator_1);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(new Color(255, 215, 0));
		lblUsername.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblUsername.setBounds(38, 301, 131, 29);
		panel.add(lblUsername);
		
		txtUsername = new JTextField();
		txtUsername.setSelectionColor(new Color(178, 34, 34));
		txtUsername.setOpaque(false);
		txtUsername.setForeground(new Color(255, 165, 0));
		txtUsername.setFont(new Font("Trebuchet MS", Font.ITALIC, 19));
		txtUsername.setColumns(10);
		txtUsername.setBorder(null);
		txtUsername.setBounds(38, 332, 322, 41);
		txtUsername.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txtUsername.getText().length() >= 15 )
		            e.consume(); 
		    }  
		});
		panel.add(txtUsername);
		
		JLabel lblUsernameAsterisco = new JLabel("*");
		lblUsernameAsterisco.setForeground(new Color(255, 0, 0));
		lblUsernameAsterisco.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblUsernameAsterisco.setBounds(389, 333, 20, 30);
		lblUsernameAsterisco.setVisible(false);
		panel.add(lblUsernameAsterisco);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(255, 215, 0));
		separator_2.setBackground(new Color(255, 215, 0));
		separator_2.setBounds(38, 362, 348, 21);
		panel.add(separator_2);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(255, 215, 0));
		lblPassword.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblPassword.setBounds(38, 389, 131, 29);
		panel.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setOpaque(false);
		passwordField.setForeground(new Color(255, 165, 0));
		passwordField.setFont(new Font("Trebuchet MS", Font.ITALIC, 19));
		passwordField.setBorder(null);
		passwordField.setBounds(38, 414, 348, 41);
		passwordField.addKeyListener(new KeyAdapter() {
		    @SuppressWarnings("deprecation")
			public void keyTyped(KeyEvent e) { 
		        if (passwordField.getText().length() >= 15 )
		            e.consume(); 
		    }  
		});
		panel.add(passwordField);
		
		
		lblPasswordAsterisco = new JLabel("*");
		lblPasswordAsterisco.setForeground(new Color(255, 0, 0));
		lblPasswordAsterisco.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblPasswordAsterisco.setBounds(389, 425, 20, 30);
		lblPasswordAsterisco.setVisible(false);
		panel.add(lblPasswordAsterisco);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(new Color(255, 215, 0));
		separator_3.setBackground(new Color(255, 215, 0));
		separator_3.setBounds(38, 449, 348, 21);
		panel.add(separator_3);
		
		JLabel lblConfermaPassword = new JLabel("Conferma Password");
		lblConfermaPassword.setForeground(new Color(255, 215, 0));
		lblConfermaPassword.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblConfermaPassword.setBounds(38, 471, 174, 29);
		panel.add(lblConfermaPassword);
		
		conferma_passwordField = new JPasswordField();
		conferma_passwordField.setOpaque(false);
		conferma_passwordField.setForeground(new Color(255, 165, 0));
		conferma_passwordField.setFont(new Font("Trebuchet MS", Font.ITALIC, 19));
		conferma_passwordField.setBorder(null);
		conferma_passwordField.setBounds(38, 492, 348, 41);
		conferma_passwordField.addKeyListener(new KeyAdapter() {
		    @SuppressWarnings("deprecation")
			public void keyTyped(KeyEvent e) { 
		        if (conferma_passwordField.getText().length() >= 15 )
		            e.consume(); 
		    }  
		});
		panel.add(conferma_passwordField);
		
		
		lblConfermaPasswordAsterisco = new JLabel("*");
		lblConfermaPasswordAsterisco.setForeground(new Color(255, 0, 0));
		lblConfermaPasswordAsterisco.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblConfermaPasswordAsterisco.setBounds(389, 493, 20, 30);
		lblConfermaPasswordAsterisco.setVisible(false);
		panel.add(lblConfermaPasswordAsterisco);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(new Color(255, 215, 0));
		separator_4.setBackground(new Color(255, 215, 0));
		separator_4.setBounds(38, 527, 348, 21);
		panel.add(separator_4);
		
		JRadioButton rdbtnProprietario = new JRadioButton("Proprietario Di Attivit\u00E0");
		rdbtnProprietario.setForeground(new Color(255, 215, 0));
		rdbtnProprietario.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		rdbtnProprietario.setBackground(new Color(128, 0, 0));
		rdbtnProprietario.setBounds(38, 545, 263, 29);
		panel.add(rdbtnProprietario);
		
		JButton btnRegistrati = new JButton("Registrati");
		btnRegistrati.setFocusPainted(false);
		btnRegistrati.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if(controller.gestisciEccezioniRegistrazione(lblNomeAsterisco, lblCognomeAsterisco, lblUsernameAsterisco, lblPasswordAsterisco, lblConfermaPasswordAsterisco, txtNome, txtCognome, txtUsername, passwordField, conferma_passwordField, lblErrorePassword,lblErroreMinPassword)==true){
					try {
						if(controller.verificaUsernameInUso(txtUsername.getText())==true){
							lblErroreUsername.setVisible(false);
							controller.inserisciUtente(txtNome.getText(),txtCognome.getText(),txtUsername.getText(), passwordField.getText(),rdbtnProprietario.isSelected());
							controller.setVisibleHome(true);
							controller.setDefaultRegistrazioneFrame(txtNome, txtCognome, txtUsername, passwordField, conferma_passwordField,lblNomeAsterisco, lblCognomeAsterisco, lblUsernameAsterisco, lblPasswordAsterisco, lblConfermaPasswordAsterisco,lblErrorePassword,lblErroreMinPassword);
							setVisible(false);
						}else{
							lblErroreUsername.setVisible(true);
							lblErroreMinPassword.setVisible(false);}}
					 catch (Exception e1) {
						 System.err.println(e1);
						System.err.println("Errore inserimento utente db");
					}}}});
		
		
		btnRegistrati.setForeground(new Color(165, 42, 42));
		btnRegistrati.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnRegistrati.setBorder(null);
		btnRegistrati.setBackground(new Color(255, 165, 0));
		btnRegistrati.setBounds(230, 642, 153, 41);
		panel.add(btnRegistrati);
		
		JButton btnTornaIndietro = new JButton("");
		btnTornaIndietro.setFocusPainted(false);
		btnTornaIndietro.setIcon(new ImageIcon(RegistrazioneFrame.class.getResource("/Images/undo.png")));
		btnTornaIndietro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				controller.setVisibleHome(true);
				controller.setDefaultRegistrazioneFrame(txtNome, txtCognome, txtUsername, passwordField, conferma_passwordField,lblNomeAsterisco,lblCognomeAsterisco,lblUsernameAsterisco,lblPasswordAsterisco,lblConfermaPasswordAsterisco,lblErrorePassword,lblErroreMinPassword);
				
			}
		});
		btnTornaIndietro.setOpaque(false);
		btnTornaIndietro.setContentAreaFilled(false);
		btnTornaIndietro.setBorderPainted(false);
		btnTornaIndietro.setBorder(null);
		btnTornaIndietro.setBounds(165, 642, 47, 41);
		panel.add(btnTornaIndietro);
		
		
		
		JLabel Sfondo = new JLabel("");
		Sfondo.setIcon(new ImageIcon(RegistrazioneFrame.class.getResource("/Images/Registrazione_Sfondo.png")));
		Sfondo.setBounds(0, 0, 451, 699);
		panel.add(Sfondo);
	}

}
