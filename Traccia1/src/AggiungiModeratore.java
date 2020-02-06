

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class AggiungiModeratore extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtNome;
	private JTextField txtCognome;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	/**public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AggiungiModeratore frame = new AggiungiModeratore();
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
	public AggiungiModeratore(Controller ctrl) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AggiungiModeratore.class.getResource("/Images/add_moderatore.png")));
		Controller controller=ctrl;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 677);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblModeratoreAggiunto = new JLabel("Moderatore aggiunto");
		lblModeratoreAggiunto.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblModeratoreAggiunto.setForeground(Color.GREEN);
		lblModeratoreAggiunto.setBounds(79, 570, 168, 20);
		lblModeratoreAggiunto.setVisible(false);
		contentPane.add(lblModeratoreAggiunto);
		
		JLabel lblIdAsterisco = new JLabel("*");
		lblIdAsterisco.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblIdAsterisco.setForeground(Color.RED);
		lblIdAsterisco.setBounds(421, 143, 22, 36);
		lblIdAsterisco.setVisible(false);
		contentPane.add(lblIdAsterisco);
		
		JLabel lblNomeAsterisco = new JLabel("*");
		lblNomeAsterisco.setForeground(Color.RED);
		lblNomeAsterisco.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNomeAsterisco.setBounds(421, 228, 22, 36);
		lblNomeAsterisco.setVisible(false);
		contentPane.add(lblNomeAsterisco);
		
		JLabel lblCognomeAsterisco = new JLabel("*");
		lblCognomeAsterisco.setForeground(Color.RED);
		lblCognomeAsterisco.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblCognomeAsterisco.setBounds(421, 340, 22, 36);
		lblCognomeAsterisco.setVisible(false);
		contentPane.add(lblCognomeAsterisco);
		
		JLabel lblPasswordAsterisco = new JLabel("*");
		lblPasswordAsterisco.setForeground(Color.RED);
		lblPasswordAsterisco.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblPasswordAsterisco.setBounds(421, 453, 22, 36);
		lblPasswordAsterisco.setVisible(false);
		contentPane.add(lblPasswordAsterisco);
		
		JLabel lblErroreMinPassword = new JLabel("Devi inserire almeno 8 caratteri");
		lblErroreMinPassword.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblErroreMinPassword.setForeground(Color.RED);
		lblErroreMinPassword.setVisible(false);
		lblErroreMinPassword.setBounds(130, 496, 226, 20);
		contentPane.add(lblErroreMinPassword);
		
		JLabel lblErroreId = new JLabel("ID gi\u00E0 presente nel database\r\n");
		lblErroreId.setForeground(Color.RED);
		lblErroreId.setVisible(false);
		lblErroreId.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblErroreId.setBounds(140, 518, 226, 20);
		contentPane.add(lblErroreId);
		
		txtId = new JTextField();
		txtId.setFont(new Font("Trebuchet MS", Font.ITALIC, 20));
		txtId.setForeground(new Color(255, 140, 0));
		txtId.setBounds(52, 143, 371, 36);
		txtId.setOpaque(false);
		txtId.setBorder(null);
		contentPane.add(txtId);
		txtId.setColumns(10);
		txtId.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txtId.getText().length() >= 15 )
		            e.consume(); 
		    }  
		});
		
		JLabel lblNewLabel = new JLabel("ID\r\n\r\n");
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(52, 122, 69, 20);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 215, 0));
		separator.setBackground(new Color(255, 215, 0));
		separator.setBounds(52, 174, 371, 21);
		contentPane.add(separator);
		
		txtNome = new JTextField();
		txtNome.setOpaque(false);
		txtNome.setForeground(new Color(255, 140, 0));
		txtNome.setFont(new Font("Trebuchet MS", Font.ITALIC, 20));
		txtNome.setColumns(10);
		txtNome.setBorder(null);
		txtNome.setBounds(52, 232, 371, 36);
		contentPane.add(txtNome);
		txtNome.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txtNome.getText().length() >= 15 )
		            e.consume(); 
		    }  
		});
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(new Color(255, 215, 0));
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNome.setBounds(52, 211, 69, 20);
		contentPane.add(lblNome);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(255, 215, 0));
		separator_1.setBackground(new Color(255, 215, 0));
		separator_1.setBounds(52, 263, 371, 21);
		contentPane.add(separator_1);
		
		txtCognome = new JTextField();
		txtCognome.setOpaque(false);
		txtCognome.setForeground(new Color(255, 140, 0));
		txtCognome.setFont(new Font("Trebuchet MS", Font.ITALIC, 20));
		txtCognome.setColumns(10);
		txtCognome.setBorder(null);
		txtCognome.setBounds(52, 340, 371, 36);
		contentPane.add(txtCognome);
		txtCognome.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txtCognome.getText().length() >= 15 )
		            e.consume(); 
		    }  
		});
		
		JLabel lblCognome = new JLabel("Cognome");
		lblCognome.setForeground(new Color(255, 215, 0));
		lblCognome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCognome.setBounds(52, 300, 109, 36);
		contentPane.add(lblCognome);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(255, 215, 0));
		separator_2.setBackground(new Color(255, 215, 0));
		separator_2.setBounds(52, 371, 371, 21);
		contentPane.add(separator_2);
		
		JLabel lblPassword = new JLabel("Password\t");
		lblPassword.setForeground(new Color(255, 215, 0));
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(52, 429, 109, 20);
		contentPane.add(lblPassword);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(new Color(255, 215, 0));
		separator_3.setBackground(new Color(255, 215, 0));
		separator_3.setBounds(52, 481, 371, 21);
		contentPane.add(separator_3);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(null);
		passwordField.setOpaque(false);
		passwordField.setForeground(new Color(255, 140, 0));
		passwordField.setBounds(52, 453, 371, 26);
		contentPane.add(passwordField);
		passwordField.addKeyListener(new KeyAdapter() {
		    @SuppressWarnings("deprecation")
			public void keyTyped(KeyEvent e) { 
		        if (passwordField.getText().length() >= 20 )
		            e.consume(); 
		    }  
		});
		
		JButton btnTornaIndietro = new JButton("");
		btnTornaIndietro.setFocusPainted(false);
		btnTornaIndietro.setIcon(new ImageIcon(RegistrazioneFrame.class.getResource("/Images/undo.png")));
		btnTornaIndietro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				controller.setVisibleMenuPrincipaleModeratore(true);
				controller.setDefaultAggiungiModeratoreFrame(txtNome, txtCognome, txtId, passwordField,lblIdAsterisco,lblNomeAsterisco,lblCognomeAsterisco,lblPasswordAsterisco,lblErroreMinPassword,lblErroreId,lblModeratoreAggiunto);
			}
		});
		btnTornaIndietro.setOpaque(false);
		btnTornaIndietro.setContentAreaFilled(false);
		btnTornaIndietro.setBorderPainted(false);
		btnTornaIndietro.setBorder(null);
		btnTornaIndietro.setBounds(250, 560, 47, 41);
		contentPane.add(btnTornaIndietro);
		
		JLabel lblRegistraModeratore = new JLabel("REGISTRA MODERATORE");
		lblRegistraModeratore.setForeground(new Color(255, 215, 0));
		lblRegistraModeratore.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblRegistraModeratore.setBounds(51, 16, 392, 36);
		contentPane.add(lblRegistraModeratore);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(new Color(255, 215, 0));
		separator_4.setBackground(new Color(255, 215, 0));
		separator_4.setBounds(52, 54, 391, 21);
		contentPane.add(separator_4);
		
		JButton btnRegistrati = new JButton("Registrati");
		btnRegistrati.setFocusPainted(false);
		btnRegistrati.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
	try{
		if(controller.gestisciEccezioniAggiungiModeratore(lblNomeAsterisco, lblCognomeAsterisco, lblIdAsterisco, lblPasswordAsterisco,txtNome, txtCognome, txtId, passwordField,lblErroreMinPassword)==true ){
		if(controller.verificaIdModeratoreInUso(txtId.getText())==false){
			controller.inserisciModeratore(txtId.getText(), txtNome.getText(), txtCognome.getText(),passwordField.getText());
			lblModeratoreAggiunto.setVisible(true);
			
		}else {lblErroreId.setVisible(true);
		lblModeratoreAggiunto.setVisible(false);}
		
		
	}
			}catch(Exception e){
				
			}}
		});
		btnRegistrati.setForeground(new Color(165, 42, 42));
		btnRegistrati.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnRegistrati.setBorder(null);
		btnRegistrati.setBackground(new Color(255, 165, 0));
		btnRegistrati.setBounds(310, 560, 153, 41);
		contentPane.add(btnRegistrati);
		
	
		
		
		
		
		
		
	}
}
