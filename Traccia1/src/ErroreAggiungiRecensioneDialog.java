import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ErroreAggiungiRecensioneDialog extends JDialog {

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErroreAggiungiRecensioneDialog dialog = new ErroreAggiungiRecensioneDialog();
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
	public ErroreAggiungiRecensioneDialog(Controller ctrl) {
		getContentPane().setBackground(new Color(128, 0, 0));
		setBackground(new Color(128, 0, 0));
		Controller controller = ctrl;
		setBounds(100, 100, 642, 358);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ErroreAggiungiRecensioneDialog.class.getResource("/Images/sad.png")));
		lblNewLabel.setBounds(248, 35, 147, 137);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Errore, puoi inserire massimo una recensione per ogni attivit\u00E0 visitata");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 19));
		lblNewLabel_1.setForeground(new Color(255, 215, 0));
		lblNewLabel_1.setBounds(15, 188, 610, 20);
		getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 215, 0));
		separator.setBackground(new Color(255, 215, 0));
		separator.setBounds(41, 245, 547, 21);
		getContentPane().add(separator);
		
		JButton btnOk = new JButton("");
		btnOk.setIcon(new ImageIcon(ErroreAggiungiRecensioneDialog.class.getResource("/Images/check-mark.png")));
		btnOk.setBorder(null);
		btnOk.setContentAreaFilled(false);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				controller.setVisibleAggiungiRecensioneFrame(true);
			}
		});
		btnOk.setOpaque(false);
		btnOk.setBorder(null);
		btnOk.setBounds(555, 257, 33, 29);
		getContentPane().add(btnOk);

	}
}
