
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class ModificaAttivita extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeAttivita;
	private JTextField txtViaAttivita;
	private JSeparator separator_1;

	/**
	 * Launch the application.
	 */
   /*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModificaAttivita frame = new ModificaAttivita();
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
	public ModificaAttivita(Controller ctrl) {
		Controller controller=ctrl;
		setBackground(new Color(128, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 565);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNomeAttivita = new JTextField();
		txtNomeAttivita.setText("Nome Attivit\u00E0");
		txtNomeAttivita.setSelectionColor(new Color(178, 34, 34));
		txtNomeAttivita.setOpaque(false);
		txtNomeAttivita.setForeground(new Color(255, 165, 0));
		txtNomeAttivita.setFont(new Font("Trebuchet MS", Font.ITALIC, 35));
		txtNomeAttivita.setColumns(10);
		txtNomeAttivita.setBorder(null);
		txtNomeAttivita.setBounds(30, 121, 555, 41);
		contentPane.add(txtNomeAttivita);
		txtNomeAttivita.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txtNomeAttivita.getText().length() >= 15 )
		            e.consume(); 
		    }  
		});
	
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 215, 0));
		separator.setBackground(new Color(255, 215, 0));
		separator.setBounds(30, 165, 555, 21);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("MODIFICA LA TUA ATTIVITA'");
		lblNewLabel.setFont(new Font("Malgun Gothic", Font.BOLD, 25));
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setBounds(200, 16, 355, 30);
		contentPane.add(lblNewLabel);
		
		txtViaAttivita = new JTextField();
		txtViaAttivita.setText("Via Attivit\u00E0");
		txtViaAttivita.setSelectionColor(new Color(178, 34, 34));
		txtViaAttivita.setOpaque(false);
		txtViaAttivita.setForeground(new Color(255, 165, 0));
		txtViaAttivita.setFont(new Font("Trebuchet MS", Font.ITALIC, 20));
		txtViaAttivita.setColumns(10);
		txtViaAttivita.setBorder(null);
		txtViaAttivita.setBounds(30, 205, 310, 41);
		contentPane.add(txtViaAttivita);
		
		separator_1 = new JSeparator();
		separator_1.setForeground(new Color(255, 215, 0));
		separator_1.setBackground(new Color(255, 215, 0));
		separator_1.setBounds(30, 237, 310, 21);
		contentPane.add(separator_1);
		
		JTextArea txtDescrizioneAttivita = new JTextArea();
		txtDescrizioneAttivita.setText("Inserisci qui la descrizione della tu\u00E0 attivit\u00E0...");
		txtDescrizioneAttivita.setLineWrap(true);
		txtDescrizioneAttivita.setForeground(new Color(255, 165, 0));
		txtDescrizioneAttivita.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		txtDescrizioneAttivita.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(178, 34, 34), new Color(178, 34, 34), new Color(178, 34, 34), new Color(178, 34, 34)));
		txtDescrizioneAttivita.setBackground(new Color(139, 0, 0));
		txtDescrizioneAttivita.setBounds(30, 296, 684, 137);
		contentPane.add(txtDescrizioneAttivita);
		
		controller.setTextModificaAttivita(txtNomeAttivita, txtViaAttivita, txtDescrizioneAttivita);
		
		JButton btnBack=new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				controller.setVisibleMenuPrincipaleProprietario(true);
			}
		});
		btnBack.setIcon(new ImageIcon(AggiungiRecensioneFrame.class.getResource("/Images/undo.png")));
		btnBack.setBounds(638, 460, 37, 33);
		btnBack.setOpaque(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		btnBack.setBorder(null);
		contentPane.add(btnBack);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			if(controller.gestisciEccezioniModificaAttivita(txtNomeAttivita.getText(), txtViaAttivita.getText(), txtDescrizioneAttivita.getText())==true){
				controller.modificaAttivitaSelezionata(txtNomeAttivita.getText(), txtViaAttivita.getText(), txtDescrizioneAttivita.getText());
			  JOptionPane.showConfirmDialog(null,"Modifica effettuata con successo","Attenzione",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE);
			}
			}
		});
		btnNewButton.setIcon(new ImageIcon(ModificaAttivita.class.getResource("/Images/pencil.png")));
		btnNewButton.setBorder(null);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setOpaque(false);
		btnNewButton.setBounds(690, 460, 44, 30);
		btnNewButton.setContentAreaFilled(false);
		contentPane.add(btnNewButton);
}	
}
