import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class ErroreRisultatoNonTrovatoDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErroreRisultatoNonTrovatoDialog dialog = new ErroreRisultatoNonTrovatoDialog();
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
	public ErroreRisultatoNonTrovatoDialog(Controller ctrl) {
		setBounds(100, 100, 450, 300);
		Controller controller =ctrl;
		setBounds(100, 100, 636, 341);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(128, 0, 0));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Nessun risultato trovato...Riprova");
			lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 19));
			lblNewLabel.setForeground(new Color(255, 215, 0));
			lblNewLabel.setBounds(166, 173, 291, 20);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(ErroreRisultatoNonTrovatoDialog.class.getResource("/Images/sad.png")));
			lblNewLabel_1.setBounds(250, 19, 145, 138);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JSeparator separator = new JSeparator();
			separator.setForeground(new Color(255, 215, 0));
			separator.setBackground(new Color(255, 215, 0));
			separator.setBounds(38, 220, 540, 21);
			contentPanel.add(separator);
		}
		{
			JButton btnOk = new JButton("\r\n");
			btnOk.setFocusPainted(false);
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					controller.setVisibleCercaRecensioneFrame(true);
				}
			});
			btnOk.setIcon(new ImageIcon(ErroreRisultatoNonTrovatoDialog.class.getResource("/Images/check-mark.png")));
			btnOk.setBounds(500, 233, 66, 36);
			btnOk.setOpaque(true);
			btnOk.setBorder(null);
			btnOk.setContentAreaFilled(false);
			btnOk.setBorderPainted(false);
			contentPanel.add(btnOk);
		}
	}


	}


