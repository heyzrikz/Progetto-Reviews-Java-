
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
import java.awt.Toolkit;

@SuppressWarnings("serial")
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(SceltaSottocategoriaAttrazioneFrame.class.getResource("/Images/search_icon.png")));
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
		
		JLabel lblMuseo = new JLabel("Museo\r\n");
		lblMuseo.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblMuseo.setForeground(new Color(255, 215, 0));
		lblMuseo.setBounds(192, 89, 117, 47);
		panelAttrazione.add(lblMuseo);
		
		JLabel lblTour = new JLabel("Tour");
		lblTour.setForeground(new Color(255, 215, 0));
		lblTour.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblTour.setBounds(619, 94, 78, 36);
		panelAttrazione.add(lblTour);
		
		JLabel lblTeatro = new JLabel("Teatro");
		lblTeatro.setForeground(new Color(255, 215, 0));
		lblTeatro.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblTeatro.setBounds(591, 292, 106, 33);
		panelAttrazione.add(lblTeatro);
		
		JLabel lblParcoDivertimenti = new JLabel("Parco Divertimenti");
		lblParcoDivertimenti.setForeground(new Color(255, 215, 0));
		lblParcoDivertimenti.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblParcoDivertimenti.setBounds(429, 491, 283, 33);
		panelAttrazione.add(lblParcoDivertimenti);
		
		JLabel lblCinema = new JLabel("Cinema");
		lblCinema.setForeground(new Color(255, 215, 0));
		lblCinema.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblCinema.setBounds(192, 290, 117, 36);
		panelAttrazione.add(lblCinema);
		
		JLabel lblLido = new JLabel("Lido\r\n");
		lblLido.setForeground(new Color(255, 215, 0));
		lblLido.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblLido.setBounds(192, 484, 89, 47);
		panelAttrazione.add(lblLido);
		
		JButton btnMuseo = new JButton("");
		btnMuseo.setHorizontalAlignment(SwingConstants.LEFT);
		btnMuseo.setFocusPainted(false);
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
		btnTour.setFocusPainted(false);
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
		btnTeatro.setFocusPainted(false);
		btnTeatro.setContentAreaFilled(false);
		btnTeatro.setBorder(null);
		btnTeatro.setBounds(582, 236, 259, 142);
		panelAttrazione.add(btnTeatro);
		
		JButton btnCinema = new JButton("");
		btnCinema.setHorizontalAlignment(SwingConstants.LEFT);
		btnCinema.setFocusPainted(false);
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
		btnParcoDivertimenti.setFocusPainted(false);
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
		btnLido.setFocusPainted(false);
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
		btnBack.setFocusPainted(false);
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
