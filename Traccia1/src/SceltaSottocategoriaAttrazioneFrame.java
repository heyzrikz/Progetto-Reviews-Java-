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
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class SceltaSottocategoriaAttrazioneFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SceltaSottocategoriaAttrazioneFrame frame = new SceltaSottocategoriaAttrazioneFrame();
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
	public SceltaSottocategoriaAttrazioneFrame(Controller ctrl) {
		setResizable(false);
		setBackground(new Color(128, 0, 0));
		Controller controller=ctrl;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 909, 782);
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
		
		JPanel panelAttrazione = new JPanel();
		panelAttrazione.setBackground(new Color(128, 0, 0));
		panelAttrazione.setBounds(15, 90, 873, 652);
		contentPane.add(panelAttrazione);
		panelAttrazione.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Museo\r\n");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setBounds(192, 89, 117, 47);
		panelAttrazione.add(lblNewLabel);
		
		JLabel lblPizza = new JLabel("Tour");
		lblPizza.setForeground(new Color(255, 215, 0));
		lblPizza.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblPizza.setBounds(619, 94, 78, 36);
		panelAttrazione.add(lblPizza);
		
		JLabel lblPesce = new JLabel("Teatro");
		lblPesce.setForeground(new Color(255, 215, 0));
		lblPesce.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblPesce.setBounds(591, 292, 106, 33);
		panelAttrazione.add(lblPesce);
		
		JLabel lblSteakhouse = new JLabel("Parco Divertimenti");
		lblSteakhouse.setForeground(new Color(255, 215, 0));
		lblSteakhouse.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblSteakhouse.setBounds(429, 491, 283, 33);
		panelAttrazione.add(lblSteakhouse);
		
		JLabel lblGiapponese = new JLabel("Cinema");
		lblGiapponese.setForeground(new Color(255, 215, 0));
		lblGiapponese.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblGiapponese.setBounds(192, 290, 117, 36);
		panelAttrazione.add(lblGiapponese);
		
		JLabel lblCaff = new JLabel("Lido\r\n");
		lblCaff.setForeground(new Color(255, 215, 0));
		lblCaff.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblCaff.setBounds(192, 484, 89, 47);
		panelAttrazione.add(lblCaff);
		
		JButton btnMuseo = new JButton("");
		btnMuseo.setHorizontalAlignment(SwingConstants.LEFT);
		btnMuseo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					controller.setVisibleMostraAttivita(true);
					setVisible(false);
					controller.setElencoAttivita("Museo");
					controller.aggiungiTabellaAttivita(controller.getTabellaAttivita());
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnMuseo.setBorder(null);
		btnMuseo.setIcon(new ImageIcon(SceltaSottocategoriaAttrazioneFrame.class.getResource("/Images/museo.png")));
		btnMuseo.setOpaque(false);
		btnMuseo.setContentAreaFilled(false);
		btnMuseo.setBounds(34, 35, 259, 149);
		panelAttrazione.add(btnMuseo);
		
		JButton btnTour = new JButton("");
		btnTour.setHorizontalAlignment(SwingConstants.RIGHT);
		btnTour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					controller.setVisibleMostraAttivita(true);
					setVisible(false);
					controller.setElencoAttivita("Tour");
					controller.aggiungiTabellaAttivita(controller.getTabellaAttivita());
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnTour.setIcon(new ImageIcon(SceltaSottocategoriaAttrazioneFrame.class.getResource("/Images/tour.png")));
		btnTour.setOpaque(false);
		btnTour.setContentAreaFilled(false);
		btnTour.setBorder(null);
		btnTour.setBounds(582, 42, 259, 142);
		panelAttrazione.add(btnTour);
		
		JButton btnTeatro = new JButton("");
		btnTeatro.setHorizontalAlignment(SwingConstants.RIGHT);
		btnTeatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					controller.setVisibleMostraAttivita(true);
					setVisible(false);
					controller.setElencoAttivita("Teatro");
					controller.aggiungiTabellaAttivita(controller.getTabellaAttivita());
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnTeatro.setIcon(new ImageIcon(SceltaSottocategoriaAttrazioneFrame.class.getResource("/Images/theater.png")));
		btnTeatro.setOpaque(false);
		btnTeatro.setContentAreaFilled(false);
		btnTeatro.setBorder(null);
		btnTeatro.setBounds(582, 236, 259, 142);
		panelAttrazione.add(btnTeatro);
		
		JButton btnCinema = new JButton("");
		btnCinema.setHorizontalAlignment(SwingConstants.LEFT);
		btnCinema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					controller.setVisibleMostraAttivita(true);
					setVisible(false);
					controller.setElencoAttivita("Cinema");
					controller.aggiungiTabellaAttivita(controller.getTabellaAttivita());
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnCinema.setIcon(new ImageIcon(SceltaSottocategoriaAttrazioneFrame.class.getResource("/Images/cinema.png")));
		btnCinema.setOpaque(false);
		btnCinema.setContentAreaFilled(false);
		btnCinema.setBorder(null);
		btnCinema.setBounds(34, 236, 259, 143);
		panelAttrazione.add(btnCinema);
		
		JButton btnParcoDivertimenti = new JButton("");
		btnParcoDivertimenti.setHorizontalAlignment(SwingConstants.RIGHT);
		btnParcoDivertimenti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					controller.setVisibleMostraAttivita(true);
					setVisible(false);
					controller.setElencoAttivita("Parco Divertimenti");
					controller.aggiungiTabellaAttivita(controller.getTabellaAttivita());
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnParcoDivertimenti.setIcon(new ImageIcon(SceltaSottocategoriaAttrazioneFrame.class.getResource("/Images/parcogiochi.png")));
		btnParcoDivertimenti.setOpaque(false);
		btnParcoDivertimenti.setContentAreaFilled(false);
		btnParcoDivertimenti.setBorder(null);
		btnParcoDivertimenti.setBounds(414, 449, 427, 131);
		panelAttrazione.add(btnParcoDivertimenti);
		
		JButton btnLido = new JButton("");
		btnLido.setHorizontalAlignment(SwingConstants.LEFT);
		btnLido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					controller.setVisibleMostraAttivita(true);
					setVisible(false);
					controller.setElencoAttivita("Lido");
					controller.aggiungiTabellaAttivita(controller.getTabellaAttivita());
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnLido.setIcon(new ImageIcon(SceltaSottocategoriaAttrazioneFrame.class.getResource("/Images/beach.png")));
		btnLido.setOpaque(false);
		btnLido.setContentAreaFilled(false);
		btnLido.setBorder(null);
		btnLido.setBounds(34, 449, 259, 131);
		panelAttrazione.add(btnLido);
		
		JButton btnBack = new JButton("\r\n");
		btnBack.setBounds(836, 603, 37, 33);
		panelAttrazione.add(btnBack);
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
