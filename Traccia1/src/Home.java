

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField textUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home(Controller ctrl) {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/Images/rating.png")));
		Controller controller=ctrl;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 793, 608);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 215, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(178, 34, 34));
		panel.setBounds(0, 0, 1011, 571);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnRegistrati = new JButton("Registrati");
		btnRegistrati.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnRegistrati.setBorder(null);
		btnRegistrati.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controller.setVisibleRegistrazione(true);
				setVisible(false);
			}
		});
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblUsername.setForeground(new Color(255, 215, 0));
		lblUsername.setBounds(408, 81, 131, 29);
		panel.add(lblUsername);
		
		JLabel lblErroreLogin = new JLabel("Errore Username e/o Password errate");
		lblErroreLogin.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblErroreLogin.setForeground(Color.RED);
		lblErroreLogin.setVisible(false);
		lblErroreLogin.setBounds(418, 264, 312, 20);
		panel.add(lblErroreLogin);
		
		textUsername = new JTextField();
		textUsername.setSelectionColor(new Color(178, 34, 34));
		textUsername.setForeground(new Color(255, 165, 0));
		textUsername.setFont(new Font("Trebuchet MS", Font.ITALIC, 19));
		textUsername.setOpaque(false);
		textUsername.setBorder(null);
		textUsername.setText("Inserisci Username");
		textUsername.setBounds(408, 106, 322, 41);
		panel.add(textUsername);
		textUsername.setColumns(10);
		
		JLabel lblUsernameAsterisco = new JLabel("*");
		lblUsernameAsterisco.setForeground(new Color(255, 0, 0));
		lblUsernameAsterisco.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblUsernameAsterisco.setBounds(707, 117, 20, 30);
		lblUsernameAsterisco.setVisible(false);
		panel.add(lblUsernameAsterisco);
		
		JLabel lblPasswordAsterisco = new JLabel("*");
		lblPasswordAsterisco.setForeground(Color.RED);
		lblPasswordAsterisco.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblPasswordAsterisco.setBounds(707, 219, 20, 30);
		lblPasswordAsterisco.setVisible(false);
		panel.add(lblPasswordAsterisco);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(255, 215, 0));
		separator.setForeground(new Color(255, 215, 0));
		separator.setBounds(408, 144, 296, 21);
		panel.add(separator);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(255, 215, 0));
		lblPassword.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblPassword.setBounds(408, 180, 131, 29);
		panel.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.addKeyListener(new KeyAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode()==KeyEvent.VK_ENTER){
					if(controller.gestisciEccezioniHome(lblUsernameAsterisco, lblPasswordAsterisco, textUsername, passwordField)==true){
						try {
							controller.setUtenteAcceduto(textUsername.getText(), passwordField.getText());
							if(controller.accedi()==true){
								lblErroreLogin.setVisible(false);
								controller.verificaTipologiaDiUtente();
								setVisible(false);
								controller.setDefaultHome(textUsername, passwordField);
								}else lblErroreLogin.setVisible(true);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}
					
				}
			}
		});
		passwordField.setToolTipText("Password");
		passwordField.setForeground(new Color(255, 165, 0));
		passwordField.setFont(new Font("Trebuchet MS", Font.ITALIC, 19));
		passwordField.setOpaque(false);
		passwordField.setBounds(408, 207, 348, 41);
		passwordField.setBorder(null);
		panel.add(passwordField);
		
		
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(255, 215, 0));
		separator_1.setBackground(new Color(255, 215, 0));
		separator_1.setBounds(408, 237, 296, 21);
		panel.add(separator_1);
		btnRegistrati.setBackground(new Color(255, 165, 0));
		btnRegistrati.setForeground(new Color(165, 42, 42));
		btnRegistrati.setBounds(506, 351, 153, 41);
		panel.add(btnRegistrati);
		
		
		JButton btnAccedi = new JButton("");
		btnAccedi.setBackground(new Color(173, 216, 230));
		btnAccedi.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if(controller.gestisciEccezioniHome(lblUsernameAsterisco, lblPasswordAsterisco, textUsername, passwordField)==true){
					try {
						controller.setUtenteAcceduto(textUsername.getText(), passwordField.getText());
						if(controller.accedi()==true){
							lblErroreLogin.setVisible(false);
							controller.verificaTipologiaDiUtente();
							setVisible(false);
							controller.setDefaultHome(textUsername, passwordField);
							}else lblErroreLogin.setVisible(true);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		btnAccedi.setIcon(new ImageIcon(Home.class.getResource("/Images/login.png")));
		btnAccedi.setOpaque(false);
		btnAccedi.setContentAreaFilled(false);
		btnAccedi.setBorderPainted(false);
		btnAccedi.setBorder(null);
		btnAccedi.setBounds(674, 351, 56, 41);
		panel.add(btnAccedi);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Home.class.getResource("/Images/rating.png")));
		lblNewLabel.setBounds(48, 35, 256, 264);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("REVIEWS");
		lblNewLabel_1.setFont(new Font("Goudy Old Style", Font.BOLD, 55));
		lblNewLabel_1.setForeground(new Color(255, 215, 0));
		lblNewLabel_1.setBounds(56, 363, 262, 71);
		panel.add(lblNewLabel_1);
		
		JLabel lblBenvenutoIn = new JLabel("Benvenuto in");
		lblBenvenutoIn.setForeground(new Color(255, 140, 0));
		lblBenvenutoIn.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblBenvenutoIn.setBounds(58, 351, 131, 29);
		panel.add(lblBenvenutoIn);
		
		JLabel lblViaggiaEsploraRacconta = new JLabel("Viaggia, Esplora, Racconta...");
		lblViaggiaEsploraRacconta.setForeground(new Color(255, 215, 0));
		lblViaggiaEsploraRacconta.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblViaggiaEsploraRacconta.setBounds(126, 416, 233, 29);
		panel.add(lblViaggiaEsploraRacconta);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setBackground(new Color(128, 0, 0));
		menuBar.setBounds(0, 0, 139, 31);
		panel.add(menuBar);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Area di Servizio");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				controller.setVisibleLoginModeratore(true);
			}
		});
		mntmNewMenuItem.setForeground(new Color(255, 215, 0));
		mntmNewMenuItem.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		mntmNewMenuItem.setBackground(new Color(165, 42, 42));
		menuBar.add(mntmNewMenuItem);
		
		JLabel Sfondo = new JLabel("");
		Sfondo.setIcon(new ImageIcon(Home.class.getResource("/Images/Home Red.jpg")));
		Sfondo.setBounds(0, 0, 788, 580);
		panel.add(Sfondo);
	}
}
