

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class AttivitaAggiuntaRiuscita extends JDialog {

	/**
	 * Launch the application.
	 */
	/**public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AttivitaAggiuntaRiuscita dialog = new AttivitaAggiuntaRiuscita();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public AttivitaAggiuntaRiuscita(Controller ctrl) {
		Controller controller=ctrl;
		setResizable(false);
		setBounds(100, 100, 558, 334);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 700, 294);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\r\n");
		lblNewLabel.setIcon(new ImageIcon(AttivitaAggiuntaRiuscita.class.getResource("/Images/okay (1).png")));
		lblNewLabel.setBounds(211, 16, 142, 161);
		panel.add(lblNewLabel);
		
		JLabel lblAttivitAggiuntaCorrettemente = new JLabel("Attivit\u00E0 aggiunta correttemente");
		lblAttivitAggiuntaCorrettemente.setForeground(new Color(255, 215, 0));
		lblAttivitAggiuntaCorrettemente.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblAttivitAggiuntaCorrettemente.setBounds(149, 162, 274, 29);
		panel.add(lblAttivitAggiuntaCorrettemente);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 215, 0));
		separator.setBackground(new Color(255, 215, 0));
		separator.setBounds(32, 239, 485, 21);
		panel.add(separator);
		
		JButton btnOk = new JButton("");
		btnOk.setIcon(new ImageIcon(AttivitaAggiuntaRiuscita.class.getResource("/Images/check-mark.png")));
		btnOk.setBorder(null);
		btnOk.setContentAreaFilled(false);
		btnOk.setOpaque(false);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				controller.setVisibleMenuPrincipaleProprietario(true);
				
			}
		});
		btnOk.setBounds(468, 249, 49, 29);
		panel.add(btnOk);
		
		JLabel Sfondo = new JLabel("");
		Sfondo.setIcon(new ImageIcon(AttivitaAggiuntaRiuscita.class.getResource("/Images/Menu.png")));
		Sfondo.setBounds(0, 0, 556, 294);
		panel.add(Sfondo);

	}
}
