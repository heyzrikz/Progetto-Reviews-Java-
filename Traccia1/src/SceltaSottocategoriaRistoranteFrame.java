import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class SceltaSottocategoriaRistoranteFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SceltaSottocategoriaRistoranteFrame frame = new SceltaSottocategoriaRistoranteFrame();
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
	public SceltaSottocategoriaRistoranteFrame(Controller ctrl) {
		setResizable(false);
		setBackground(new Color(128, 0, 0));
		Controller controller=ctrl;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 905, 849);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCosaPreferisci = new JLabel("COSA PREFERISCI?");
		lblCosaPreferisci.setForeground(new Color(255, 215, 0));
		lblCosaPreferisci.setFont(new Font("Corbel Light", Font.BOLD, 35));
		lblCosaPreferisci.setBounds(301, 16, 317, 46);
		contentPane.add(lblCosaPreferisci);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 215, 0));
		separator.setBackground(new Color(255, 215, 0));
		separator.setBounds(43, 64, 809, 21);
		contentPane.add(separator);
		
		JPanel panelRistorante = new JPanel();
		panelRistorante.setBackground(new Color(128, 0, 0));
		panelRistorante.setBounds(0, 90, 1019, 719);
		contentPane.add(panelRistorante);
		panelRistorante.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cucina Locale");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setBounds(211, 68, 208, 36);
		panelRistorante.add(lblNewLabel);
		
		JLabel lblPizza = new JLabel("Pizza");
		lblPizza.setForeground(new Color(255, 215, 0));
		lblPizza.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblPizza.setBounds(626, 68, 105, 36);
		panelRistorante.add(lblPizza);
		
		JLabel lblPesce = new JLabel("Pesce");
		lblPesce.setForeground(new Color(255, 215, 0));
		lblPesce.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblPesce.setBounds(211, 234, 96, 36);
		panelRistorante.add(lblPesce);
		
		JLabel lblSteakhouse = new JLabel("Steakhouse");
		lblSteakhouse.setForeground(new Color(255, 215, 0));
		lblSteakhouse.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblSteakhouse.setBounds(546, 229, 164, 46);
		panelRistorante.add(lblSteakhouse);
		
		JLabel lblGiapponese = new JLabel("Giapponese");
		lblGiapponese.setForeground(new Color(255, 215, 0));
		lblGiapponese.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblGiapponese.setBounds(211, 573, 175, 36);
		panelRistorante.add(lblGiapponese);
		
		JLabel lblCaff = new JLabel("Caff\u00E8");
		lblCaff.setForeground(new Color(255, 215, 0));
		lblCaff.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblCaff.setBounds(623, 407, 87, 36);
		panelRistorante.add(lblCaff);
		
		JLabel lblCinese = new JLabel("Cinese");
		lblCinese.setForeground(new Color(255, 215, 0));
		lblCinese.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblCinese.setBounds(610, 573, 113, 36);
		panelRistorante.add(lblCinese);
		
		JLabel lblStreetfood = new JLabel("Streetfood");
		lblStreetfood.setForeground(new Color(255, 215, 0));
		lblStreetfood.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblStreetfood.setBounds(211, 407, 156, 36);
		panelRistorante.add(lblStreetfood);
		
		JButton btnCucinaLocale = new JButton("");
		btnCucinaLocale.setHorizontalAlignment(SwingConstants.LEFT);
		btnCucinaLocale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					controller.setVisibleMostraAttivita(true);
					setVisible(false);
					controller.setElencoAttivita("Cucina locale: Italiana");
					controller.aggiungiTabellaAttivita(controller.getTabellaAttivita());
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnCucinaLocale.setBorder(null);
		btnCucinaLocale.setIcon(new ImageIcon(SceltaSottocategoriaRistoranteFrame.class.getResource("/Images/cucinaLocale.png")));
		btnCucinaLocale.setOpaque(false);
		btnCucinaLocale.setContentAreaFilled(false);
		btnCucinaLocale.setBounds(48, 16, 371, 136);
		panelRistorante.add(btnCucinaLocale);
		
		JButton btnPizza = new JButton("");
		btnPizza.setHorizontalAlignment(SwingConstants.RIGHT);
		btnPizza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					controller.setVisibleMostraAttivita(true);
					setVisible(false);
					controller.setElencoAttivita("Pizza");
					controller.aggiungiTabellaAttivita(controller.getTabellaAttivita());
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnPizza.setIcon(new ImageIcon(SceltaSottocategoriaRistoranteFrame.class.getResource("/Images/pizza.png")));
		btnPizza.setOpaque(false);
		btnPizza.setContentAreaFilled(false);
		btnPizza.setBorder(null);
		btnPizza.setBounds(532, 16, 326, 136);
		panelRistorante.add(btnPizza);
		
		JButton btnPesce = new JButton("");
		btnPesce.setHorizontalAlignment(SwingConstants.LEFT);
		btnPesce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					controller.setVisibleMostraAttivita(true);
					setVisible(false);
					controller.setElencoAttivita("Pesce");
					controller.aggiungiTabellaAttivita(controller.getTabellaAttivita());
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnPesce.setIcon(new ImageIcon(SceltaSottocategoriaRistoranteFrame.class.getResource("/Images/pesce.png")));
		btnPesce.setOpaque(false);
		btnPesce.setContentAreaFilled(false);
		btnPesce.setBorder(null);
		btnPesce.setBounds(48, 190, 259, 129);
		panelRistorante.add(btnPesce);
		
		JButton btnGiapponese = new JButton("");
		btnGiapponese.setHorizontalAlignment(SwingConstants.LEFT);
		btnGiapponese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					controller.setVisibleMostraAttivita(true);
					setVisible(false);
					controller.setElencoAttivita("Giapponese");
					controller.aggiungiTabellaAttivita(controller.getTabellaAttivita());
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnGiapponese.setIcon(new ImageIcon(SceltaSottocategoriaRistoranteFrame.class.getResource("/Images/cucinagiapponese.png")));
		btnGiapponese.setOpaque(false);
		btnGiapponese.setContentAreaFilled(false);
		btnGiapponese.setBorder(null);
		btnGiapponese.setBounds(48, 527, 259, 136);
		panelRistorante.add(btnGiapponese);
		
		JButton btnSteakhouse = new JButton("");
		btnSteakhouse.setHorizontalAlignment(SwingConstants.RIGHT);
		btnSteakhouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					controller.setVisibleMostraAttivita(true);
					setVisible(false);
					controller.setElencoAttivita("Steakhouse");
					controller.aggiungiTabellaAttivita(controller.getTabellaAttivita());
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnSteakhouse.setIcon(new ImageIcon(SceltaSottocategoriaRistoranteFrame.class.getResource("/Images/steakhouse.png")));
		btnSteakhouse.setOpaque(false);
		btnSteakhouse.setContentAreaFilled(false);
		btnSteakhouse.setBorder(null);
		btnSteakhouse.setBounds(568, 183, 290, 136);
		panelRistorante.add(btnSteakhouse);
		
		JButton btnCaffe = new JButton("");
		btnCaffe.setHorizontalAlignment(SwingConstants.RIGHT);
		btnCaffe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					controller.setVisibleMostraAttivita(true);
					setVisible(false);
					controller.setElencoAttivita("Caffè");
					controller.aggiungiTabellaAttivita(controller.getTabellaAttivita());
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnCaffe.setIcon(new ImageIcon(SceltaSottocategoriaRistoranteFrame.class.getResource("/Images/caffe.png")));
		btnCaffe.setOpaque(false);
		btnCaffe.setContentAreaFilled(false);
		btnCaffe.setBorder(null);
		btnCaffe.setBounds(610, 359, 248, 131);
		panelRistorante.add(btnCaffe);
		
		JButton btnCinese = new JButton("");
		btnCinese.setHorizontalAlignment(SwingConstants.RIGHT);
		btnCinese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					controller.setVisibleMostraAttivita(true);
					setVisible(false);
					controller.setElencoAttivita("Cinese");
					controller.aggiungiTabellaAttivita(controller.getTabellaAttivita());
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnCinese.setIcon(new ImageIcon(SceltaSottocategoriaRistoranteFrame.class.getResource("/Images/cucinacinese.png")));
		btnCinese.setOpaque(false);
		btnCinese.setContentAreaFilled(false);
		btnCinese.setBorder(null);
		btnCinese.setBounds(599, 527, 259, 131);
		panelRistorante.add(btnCinese);
		
		JButton btnStreetfood = new JButton("");
		btnStreetfood.setHorizontalAlignment(SwingConstants.LEFT);
		btnStreetfood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					controller.setVisibleMostraAttivita(true);
					setVisible(false);
					controller.setElencoAttivita("StreetFood");
					controller.aggiungiTabellaAttivita(controller.getTabellaAttivita());
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnStreetfood.setIcon(new ImageIcon(SceltaSottocategoriaRistoranteFrame.class.getResource("/Images/streetfood.png")));
		btnStreetfood.setOpaque(false);
		btnStreetfood.setContentAreaFilled(false);
		btnStreetfood.setBorder(null);
		btnStreetfood.setBounds(48, 359, 319, 131);
		panelRistorante.add(btnStreetfood);
		
JButton btnBack = new JButton("\r\n");
btnBack.setBounds(836, 670, 37, 33);
panelRistorante.add(btnBack);
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
	}

}
