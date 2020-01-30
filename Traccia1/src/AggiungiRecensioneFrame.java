

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSeparator;

@SuppressWarnings("serial")
public class AggiungiRecensioneFrame extends JFrame {
	
	private JPanel contentPane;
	private JTextField txtTitoloRecensione;
	/**
	 * Launch the application.
	 */
	/**public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AggiungiRecensioneFrame frame = new AggiungiRecensioneFrame();
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
	public AggiungiRecensioneFrame(Controller ctrl){
		setResizable(false);
		Controller controller=ctrl;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 928, 673);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(139, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomeAttivita = new JLabel("Nome");
		lblNomeAttivita.setBounds(15, 16, 783, 51);
		lblNomeAttivita.setForeground(new Color(255, 215, 0));
		lblNomeAttivita.setFont(new Font("Goudy Old Style", Font.BOLD, 25));
		contentPane.add(lblNomeAttivita);
		
		
		JLabel lblPosizioneAttivita = new JLabel("Posizione");
		lblPosizioneAttivita.setBounds(15, 62, 351, 29);
		lblPosizioneAttivita.setForeground(new Color(255, 140, 0));
		lblPosizioneAttivita.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		contentPane.add(lblPosizioneAttivita);
		
		JLabel lblViaAttivita = new JLabel("Via");
		lblViaAttivita.setBounds(15, 83, 579, 29);
		lblViaAttivita.setForeground(new Color(255, 140, 0));
		lblViaAttivita.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		contentPane.add(lblViaAttivita);
		
		JLabel lblImmagine = new JLabel("\r\n");
		lblImmagine.setBorder(null);
		lblImmagine.setIcon(new ImageIcon(AggiungiRecensioneFrame.class.getResource("/Images/add (1).png")));
		lblImmagine.setBounds(15, 119, 486, 285);
		contentPane.add(lblImmagine);
		
		JLabel lblSottocategoriaAttivita = new JLabel("Sottocategoria");
		lblSottocategoriaAttivita.setBounds(15, 0, 233, 29);
		lblSottocategoriaAttivita.setForeground(new Color(255, 0, 0));
		lblSottocategoriaAttivita.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		contentPane.add(lblSottocategoriaAttivita);
		
		JLabel lblSottocategoria_2_Attivita = new JLabel("Sottocategoria due");
		lblSottocategoria_2_Attivita.setBounds(157, 0, 233, 29);
		lblSottocategoria_2_Attivita.setForeground(Color.RED);
		lblSottocategoria_2_Attivita.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		contentPane.add(lblSottocategoria_2_Attivita);
		
		JTextArea txtDescrizione = new JTextArea();
		txtDescrizione.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(178, 34, 34), new Color(178, 34, 34), new Color(178, 34, 34), new Color(178, 34, 34)));
		txtDescrizione.setForeground(new Color(255, 215, 0));
		txtDescrizione.setEditable(false);
		txtDescrizione.setLineWrap(true);
		txtDescrizione.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		txtDescrizione.setBounds(15, 444, 513, 173);
		txtDescrizione.setBackground(new Color(139, 0, 0));
		contentPane.add(txtDescrizione);
		controller.setLabelAggiungiRecensioneFrame(lblNomeAttivita, lblPosizioneAttivita, lblViaAttivita, lblSottocategoriaAttivita, lblSottocategoria_2_Attivita, txtDescrizione,lblImmagine);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 0, 0));
		panel.setBounds(543, 62, 338, 468);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 131, 297, 196);
		scrollPane.setBorder(null);
		panel.add(scrollPane);
		
		JTextArea txtRecensione = new JTextArea();
		txtRecensione.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(165, 42, 42), new Color(165, 42, 42), new Color(165, 42, 42), new Color(165, 42, 42)));
		txtRecensione.setBackground(new Color(128, 0, 0));
		txtRecensione.setLineWrap(true);
		txtRecensione.setFont(new Font("Trebuchet MS", Font.ITALIC, 13));
		txtRecensione.setForeground(new Color(255, 140, 0));
		txtRecensione.setText("Scrivi la tua recensione...");
		txtRecensione.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txtRecensione.getText().length() >= 250 )
		            e.consume(); 
		    }  
		});
		scrollPane.setViewportView(txtRecensione);
		
		JSpinner spinnerVoto = new JSpinner();
		spinnerVoto.setForeground(new Color(178, 34, 34));
		spinnerVoto.setModel(new SpinnerNumberModel(1, 1, 5, 1));
		spinnerVoto.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		spinnerVoto.setBackground(new Color(128, 0, 0));
		spinnerVoto.setBounds(237, 362, 73, 26);
		panel.add(spinnerVoto);
		
		txtTitoloRecensione = new JTextField();
		txtTitoloRecensione.setForeground(new Color(255, 140, 0));
		txtTitoloRecensione.setText("Inserisci titolo");
		txtTitoloRecensione.setBorder(null);
		txtTitoloRecensione.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
		txtTitoloRecensione.setBackground(new Color(128, 0, 0));
		txtTitoloRecensione.setBounds(15, 87, 286, 26);
		txtTitoloRecensione.setOpaque(false);
		txtTitoloRecensione.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) { 
		        if (txtTitoloRecensione.getText().length() >= 30 )
		            e.consume(); 
		    }  
		});
		panel.add(txtTitoloRecensione);
		
		txtTitoloRecensione.setColumns(10);
		
		JLabel lblVoto = new JLabel("Voto:");
		lblVoto.setForeground(new Color(255, 140, 0));
		lblVoto.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblVoto.setBounds(183, 364, 51, 20);
		panel.add(lblVoto);
		
		JButton btnAggiungiRecensione = new JButton("");
		btnAggiungiRecensione.setIcon(new ImageIcon(AggiungiRecensioneFrame.class.getResource("/Images/add review.png")));
		
		btnAggiungiRecensione.setBounds(275, 419, 37, 33);
		btnAggiungiRecensione.setOpaque(false);
		btnAggiungiRecensione.setContentAreaFilled(false);
		btnAggiungiRecensione.setBorderPainted(false);
		btnAggiungiRecensione.setBorder(null);
		panel.add(btnAggiungiRecensione);
		
		JButton btnBack = new JButton("\r\n");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTitoloRecensione.setText("Inserisci Titolo");
				txtRecensione.setText("Scrivi la tua recensione...");
				setVisible(false);
				controller.setVisibleCercaAttivitaFrame(true);
			}
		});
		btnBack.setIcon(new ImageIcon(AggiungiRecensioneFrame.class.getResource("/Images/undo.png")));
		btnBack.setBounds(221, 419, 37, 33);
		btnBack.setOpaque(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		btnBack.setBorder(null);
		panel.add(btnBack);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 215, 0));
		separator.setBackground(new Color(255, 215, 0));
		separator.setBounds(16, 111, 296, 21);
		panel.add(separator);
		
		JLabel lblAsteriscoRecensione = new JLabel("*");
		lblAsteriscoRecensione.setBounds(316, 131, 22, 20);
		panel.add(lblAsteriscoRecensione);
		lblAsteriscoRecensione.setForeground(Color.RED);
		lblAsteriscoRecensione.setVisible(false);
		lblAsteriscoRecensione.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		
		JLabel lblAsteriscoTitolo = new JLabel("*");
		lblAsteriscoTitolo.setBounds(316, 97, 22, 20);
		panel.add(lblAsteriscoTitolo);
		lblAsteriscoTitolo.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		lblAsteriscoTitolo.setVisible(false);
		lblAsteriscoTitolo.setForeground(new Color(255, 0, 0));
		
		JLabel lblRecensione = new JLabel("Recensione:");
		lblRecensione.setBounds(0, 0, 285, 71);
		panel.add(lblRecensione);
		lblRecensione.setForeground(new Color(255, 215, 0));
		lblRecensione.setFont(new Font("Goudy Old Style", Font.BOLD, 55));
		
		btnAggiungiRecensione.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controller.gestisciAsterischiAggiungiRecensione(lblAsteriscoTitolo, lblAsteriscoRecensione, txtTitoloRecensione, txtRecensione)){
					try {
						if(controller.verificaAggiuntaRecensione()==true){
							controller.inserisciRecensione(controller.generaCodiceRecensione(), txtTitoloRecensione.getText(), txtRecensione.getText(), (Integer)spinnerVoto.getValue());
							controller.setVisibleRecensioneAggiuntaDialog(true);
							txtRecensione.setText("Scrivi la tua recensione...");
							txtTitoloRecensione.setText("Inserisci titolo");
							setVisible(false);
						}else  {controller.setVisibleErroreAggiungiRecensioneDialog(true);
						setVisible(false);}
					} catch (Exception e1) {e1.printStackTrace();}}}});
		
	}
}
