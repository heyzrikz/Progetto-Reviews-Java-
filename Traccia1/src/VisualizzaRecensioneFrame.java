
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;

@SuppressWarnings("serial")
public class VisualizzaRecensioneFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VisualizzaRecensioneFrame frame = new VisualizzaRecensioneFrame();
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
	public VisualizzaRecensioneFrame(Controller ctrl) {
		setResizable(false);
		Controller controller = ctrl;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 527);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		UIManager.put("OptionPane.background",new Color(128, 0, 0));
		UIManager.put("Panel.background",new Color(128, 0, 0));
		UIManager.put("OptionPane.messageForeground",new Color(255, 215, 0));
		
		JLabel lblUsername = new JLabel("New label");
		lblUsername.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblUsername.setForeground(new Color(255, 215, 0));
		lblUsername.setBounds(15, 412, 138, 20);
		contentPane.add(lblUsername);
		
		JLabel lblTitoloRecensione = new JLabel("Titolo Recensione");
		lblTitoloRecensione.setFont(new Font("Goudy Old Style", Font.BOLD, 35));
		lblTitoloRecensione.setForeground(new Color(255, 215, 0));
		lblTitoloRecensione.setBounds(15, 16, 415, 50);
		contentPane.add(lblTitoloRecensione);
		
		JTextArea textAreaRecensione = new JTextArea();
		textAreaRecensione.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 140, 0), new Color(255, 140, 0), new Color(255, 140, 0), new Color(255, 140, 0)));
		textAreaRecensione.setEditable(false);
		textAreaRecensione.setLineWrap(true);
		textAreaRecensione.setForeground(new Color(255, 165, 0));
		textAreaRecensione.setFont(new Font("Trebuchet MS", Font.ITALIC, 20));
		textAreaRecensione.setBackground(new Color(128, 0, 0));
		textAreaRecensione.setBounds(15, 82, 515, 314);
		contentPane.add(textAreaRecensione);
		
		JLabel lblData = new JLabel("New label");
		lblData.setForeground(new Color(255, 215, 0));
		lblData.setBounds(438, 61, 92, 20);
		contentPane.add(lblData);
		
		controller.setLabelVisualizzaRecensioneSelezionata(lblTitoloRecensione, textAreaRecensione, lblUsername,lblData);
		
		
		
		
		JLabel lblNewLabel = new JLabel("Scritto da:");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblNewLabel.setForeground(new Color(255, 140, 0));
		lblNewLabel.setBounds(15, 396, 92, 20);
		contentPane.add(lblNewLabel);
		
		JButton btnSegnala = new JButton("");
		btnSegnala.setIcon(new ImageIcon(VisualizzaRecensioneFrame.class.getResource("/Images/report.png")));
		btnSegnala.setOpaque(false);
		btnSegnala.setBorder(null);
		btnSegnala.setBorderPainted(false);
		btnSegnala.setContentAreaFilled(false);
		btnSegnala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int dialog = JOptionPane.showConfirmDialog(null,"Vuoi davvero segnalare questa recensione?","Attenzione",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
				if(dialog == JOptionPane.OK_OPTION){
					if(controller.verificaSegnalazione()==true){
						try {
							controller.inserisciSegnalazione(controller.generaCodiceSegnalazione());
						} catch (Exception e) {e.printStackTrace();}
		            }
					btnSegnala.setVisible(false);
				}else btnSegnala.setVisible(true);}});
		
		btnSegnala.setBounds(483, 412, 47, 43);
		contentPane.add(btnSegnala);
		
		JButton btnTornaIndietro = new JButton("");
		btnTornaIndietro.setIcon(new ImageIcon(AggiungiAttivitaFrame.class.getResource("/Images/undo.png")));
		btnTornaIndietro.setOpaque(false);
		btnTornaIndietro.setContentAreaFilled(false);
		btnTornaIndietro.setBorderPainted(false);
		btnTornaIndietro.setBorder(null);
		btnTornaIndietro.setBounds(422, 412, 47, 41);
		contentPane.add(btnTornaIndietro);
		
		btnTornaIndietro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				controller.setVisibleMostraRecensioni(true);
				btnSegnala.setEnabled(true);
				btnSegnala.setVisible(true);
			
			}
		});
		
		
		
		
	}
}
