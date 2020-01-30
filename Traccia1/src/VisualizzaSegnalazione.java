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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

public class VisualizzaSegnalazione extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VisualizzaSegnalazione frame = new VisualizzaSegnalazione();
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
	public VisualizzaSegnalazione(Controller ctrl) {
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
		
		controller.setLabelVisualizzaSegnalazioneSelezionata(lblTitoloRecensione, textAreaRecensione, lblUsername);
		
		
		
		
		JLabel lblNewLabel = new JLabel("Scritto da:");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		lblNewLabel.setForeground(new Color(255, 140, 0));
		lblNewLabel.setBounds(15, 396, 92, 20);
		contentPane.add(lblNewLabel);
		
		JButton btnTornaIndietro = new JButton("");
		btnTornaIndietro.setIcon(new ImageIcon(AggiungiAttivitaFrame.class.getResource("/Images/undo.png")));
		btnTornaIndietro.setOpaque(false);
		btnTornaIndietro.setContentAreaFilled(false);
		btnTornaIndietro.setBorderPainted(false);
		btnTornaIndietro.setBorder(null);
		btnTornaIndietro.setBounds(378, 412, 47, 43);
		contentPane.add(btnTornaIndietro);
		
		JButton btnConferma = new JButton("");
		
		JButton btnElimina = new JButton("");
		btnElimina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dialog = JOptionPane.showConfirmDialog(null,"Vuoi davvero eliminare questa recensione?","Attenzione",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
				if(dialog == JOptionPane.OK_OPTION){
					btnConferma.setVisible(false);
					btnElimina.setVisible(false);
					try {
						controller.eliminaRecensione();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					
				}else {btnConferma.setVisible(true);
					 btnElimina.setVisible(true);}
			}
		});
		btnElimina.setIcon(new ImageIcon(VisualizzaSegnalazione.class.getResource("/Images/delete.png")));
		btnElimina.setBounds(473, 412, 47, 43);
		btnElimina.setBorder(null);
		btnElimina.setContentAreaFilled(false);
		btnElimina.setOpaque(false);
		contentPane.add(btnElimina);
		
		
		btnConferma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dialog = JOptionPane.showConfirmDialog(null,"Vuoi davvero confermare questa segnalazione?","Attenzione",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
				if(dialog == JOptionPane.OK_OPTION){
					btnConferma.setVisible(false);
					btnElimina.setVisible(false);
					try {
						controller.eliminaSegnalazione();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					
				}else {btnConferma.setVisible(true);
					 btnElimina.setVisible(true);}
				}
			}
		);
		btnConferma.setIcon(new ImageIcon(VisualizzaSegnalazione.class.getResource("/Images/ok_sign.png")));
		btnConferma.setOpaque(false);
		btnConferma.setContentAreaFilled(false);
		btnConferma.setBorder(null);
		btnConferma.setBounds(427, 412, 47, 43);
		contentPane.add(btnConferma);
		
		btnTornaIndietro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				controller.setVisibleMenuPrincipaleModeratore(true);
				btnElimina.setVisible(true);
				btnConferma.setVisible(true);
				try {
					controller.setElencoSegnalazioni();
				} catch (Exception e) {
					e.printStackTrace();
				}
				controller.aggiungiTabellaSegnalazioni(controller.getTabellaRecensioniSegnalate());
				
			
			}
		});
		
		
		
		
	}
}
