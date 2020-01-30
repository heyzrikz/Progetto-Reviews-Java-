
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class SceltaSottocategoriaAlloggioFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SceltaSottocategoriaAlloggioFrame frame = new SceltaSottocategoriaAlloggioFrame();
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
	public SceltaSottocategoriaAlloggioFrame(Controller ctrl) {
		setResizable(false);
		setBackground(new Color(128, 0, 0));
		Controller controller=ctrl;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 837);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelAlloggio = new JPanel();
		panelAlloggio.setBackground(new Color(128, 0, 0));
		panelAlloggio.setBounds(0, 0, 663, 797);
		contentPane.add(panelAlloggio);
		panelAlloggio.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hotel");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setBounds(284, 199, 133, 47);
		panelAlloggio.add(lblNewLabel);
		
		JLabel lblPizza = new JLabel("B&B\r\n\r\n");
		lblPizza.setForeground(new Color(255, 215, 0));
		lblPizza.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		lblPizza.setBounds(284, 391, 110, 70);
		panelAlloggio.add(lblPizza);
		
		JButton btnCucinaLocale = new JButton("");
		btnCucinaLocale.setHorizontalAlignment(SwingConstants.LEFT);
		btnCucinaLocale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					controller.setVisibleMostraAttivita(true);
					controller.setElencoAttivita("Hotel");
					controller.aggiungiTabellaAttivita(controller.getTabellaAttivita());
					setVisible(false);
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnCucinaLocale.setBorder(null);
		btnCucinaLocale.setIcon(new ImageIcon(SceltaSottocategoriaAlloggioFrame.class.getResource("/Images/hotel.png")));
		btnCucinaLocale.setOpaque(false);
		btnCucinaLocale.setContentAreaFilled(false);
		btnCucinaLocale.setBounds(51, 153, 405, 140);
		panelAlloggio.add(btnCucinaLocale);
		
		JButton btnPizza = new JButton("");
		btnPizza.setHorizontalAlignment(SwingConstants.LEFT);
		btnPizza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					controller.setVisibleMostraAttivita(true);
					setVisible(false);
					controller.setElencoAttivita("B&B");
					controller.aggiungiTabellaAttivita(controller.getTabellaAttivita());
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnPizza.setIcon(new ImageIcon(SceltaSottocategoriaAlloggioFrame.class.getResource("/Images/bedAndB.png")));
		btnPizza.setOpaque(false);
		btnPizza.setContentAreaFilled(false);
		btnPizza.setBorder(null);
		btnPizza.setBounds(51, 359, 343, 143);
		panelAlloggio.add(btnPizza);
				
				JButton btnBack = new JButton("\r\n");
				btnBack.setBounds(577, 748, 37, 33);
				panelAlloggio.add(btnBack);
				btnBack.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
						controller.setVisibleCercaRecensioneFrame(true);
					}
				});
				
				btnBack.setIcon(new ImageIcon(AggiungiRecensioneFrame.class.getResource("/Images/undo.png")));
				btnBack.setOpaque(false);
				btnBack.setContentAreaFilled(false);
				btnBack.setBorderPainted(false);
				btnBack.setBorder(null);
				
				JButton btnPesce = new JButton("");
				btnPesce.setHorizontalAlignment(SwingConstants.LEFT);
				btnPesce.setBounds(51, 575, 366, 140);
				panelAlloggio.add(btnPesce);
				btnPesce.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							controller.setVisibleMostraAttivita(true);
							setVisible(false);
							controller.setElencoAttivita("Ostello");
							controller.aggiungiTabellaAttivita(controller.getTabellaAttivita());
						} catch (Exception e1) {
							
							e1.printStackTrace();
						}
					}
				});
				btnPesce.setIcon(new ImageIcon(SceltaSottocategoriaAlloggioFrame.class.getResource("/Images/hostel.png")));
				btnPesce.setOpaque(false);
				btnPesce.setContentAreaFilled(false);
				btnPesce.setBorder(null);
				
				JLabel lblPesce = new JLabel("Ostello\r\n");
				lblPesce.setBounds(284, 615, 140, 52);
				panelAlloggio.add(lblPesce);
				lblPesce.setForeground(new Color(255, 215, 0));
				lblPesce.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
				
				JSeparator separator = new JSeparator();
				separator.setBounds(51, 89, 563, 21);
				panelAlloggio.add(separator);
				separator.setForeground(new Color(255, 215, 0));
				separator.setBackground(new Color(255, 215, 0));
				
				JLabel lblCosaPreferisci = new JLabel("COSA PREFERISCI?");
				lblCosaPreferisci.setBounds(159, 27, 355, 46);
				panelAlloggio.add(lblCosaPreferisci);
				lblCosaPreferisci.setForeground(new Color(255, 215, 0));
				lblCosaPreferisci.setFont(new Font("Corbel Light", Font.BOLD, 40));
	}

}
