
import javax.swing.JDialog;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class AttivitaAggiuntaFallita extends JDialog {

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AttivitaAggiuntaFallita dialog = new AttivitaAggiuntaFallita();
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
	public AttivitaAggiuntaFallita(Controller ctrl) {
		setResizable(false);
		Controller controller=ctrl;
		setBounds(100, 100, 660, 339);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel Icona = new JLabel("");
		Icona.setIcon(new ImageIcon(AttivitaAggiuntaFallita.class.getResource("/Images/sad.png")));
		Icona.setBounds(278, 16, 144, 141);
		panel.add(Icona);
		
		JLabel lblAttivitNonAggiunta = new JLabel("Attivit\u00E0 non aggiunta perch\u00E8 nome e posizione sono gi\u00E0 presenti nel database");
		lblAttivitNonAggiunta.setForeground(new Color(255, 215, 0));
		lblAttivitNonAggiunta.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblAttivitNonAggiunta.setBounds(15, 173, 624, 29);
		panel.add(lblAttivitNonAggiunta);
		
		JButton btnOk = new JButton("");
		btnOk.setFocusPainted(false);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				controller.setVisibleAggiungiAttivitaFrame(true);
				
			}
		});
		btnOk.setIcon(new ImageIcon(AttivitaAggiuntaFallita.class.getResource("/Images/check-mark.png")));
		btnOk.setBorder(null);
		btnOk.setContentAreaFilled(false);
		btnOk.setOpaque(false);
		btnOk.setBounds(570, 246, 54, 37);
		panel.add(btnOk);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 215, 0));
		separator.setBackground(new Color(255, 215, 0));
		separator.setBounds(54, 229, 534, 21);
		panel.add(separator);
		
		JLabel sfondo = new JLabel("");
		sfondo.setIcon(new ImageIcon(AttivitaAggiuntaFallita.class.getResource("/Images/Menu.png")));
		sfondo.setBounds(0, 0, 654, 299);
		panel.add(sfondo);

	}

}
