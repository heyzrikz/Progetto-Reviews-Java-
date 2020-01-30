
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MostraRecensioni extends JFrame {

	private JPanel contentPane;
	private JTable tableRecensioni;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MostraRecensioni frame = new MostraRecensioni();
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
	public MostraRecensioni(Controller ctrl) {
		setResizable(false);
		setBackground(new Color(128, 0, 0));
		Controller controller=ctrl;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1022, 662);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 215, 0));
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
JButton btnBack = new JButton("\r\n");
		
		btnBack.setIcon(new ImageIcon(AggiungiRecensioneFrame.class.getResource("/Images/undo.png")));
		btnBack.setBounds(860, 490, 37, 33);
		btnBack.setOpaque(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		btnBack.setBorder(null);
		contentPane.add(btnBack);
		
		
		
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 0, 0), new Color(128, 0, 0), new Color(128, 0, 0), new Color(128, 0, 0)));
		scrollPane.setBounds(15, 83, 942, 458);
		contentPane.add(scrollPane);
		
		tableRecensioni = new JTable();
		tableRecensioni.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try{DefaultTableModel model =(DefaultTableModel) tableRecensioni.getModel();
				int selectedRowIndex=tableRecensioni.getSelectedRow();
				controller.setRecensioneSelezionata(model.getValueAt(selectedRowIndex,0).toString());
			    controller.getLabelVisualizzaRecensioneSelezionata();}catch(Exception e){}
			}
			    
			 
		});
		tableRecensioni.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 0, 0), new Color(128, 0, 0), new Color(128, 0, 0), new Color(128, 0, 0)));
		tableRecensioni.setShowHorizontalLines(false);
		tableRecensioni.setSelectionForeground(new Color(255, 215, 0));
		tableRecensioni.setSelectionBackground(new Color(205, 92, 92));
		tableRecensioni.setGridColor(new Color(128, 0, 0));
		tableRecensioni.setForeground(new Color(255, 215, 0));
		tableRecensioni.setFont(new Font("Trebuchet MS", Font.PLAIN, 19));
		tableRecensioni.setBackground(new Color(128, 0, 0));
		tableRecensioni.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableRecensioni.setEnabled(true);
		tableRecensioni.getTableHeader().setOpaque(false);
		tableRecensioni.getTableHeader().setBackground(new Color(128, 0, 0));
		tableRecensioni.getTableHeader().setForeground(new Color(255, 215, 0));
		tableRecensioni.getTableHeader().setFont(new Font("Trebuchet MS", Font.PLAIN, 19));
		tableRecensioni.getTableHeader().setBorder(null);
		tableRecensioni.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Codice", "Titolo", "Descrizione", "Voto"
			}
		) {
			@SuppressWarnings("rawtypes")
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Float.class
			};
			public Class<?> getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tableRecensioni.getColumnModel().getColumn(0).setResizable(false);
		tableRecensioni.getColumnModel().getColumn(0).setPreferredWidth(62);
		tableRecensioni.getColumnModel().getColumn(1).setResizable(false);
		tableRecensioni.getColumnModel().getColumn(1).setPreferredWidth(200);
		tableRecensioni.getColumnModel().getColumn(2).setResizable(false);
		tableRecensioni.getColumnModel().getColumn(2).setPreferredWidth(500);
		tableRecensioni.getColumnModel().getColumn(3).setResizable(false);
		tableRecensioni.setFillsViewportHeight(true);
		tableRecensioni.setForeground(new Color(255, 215, 0));
		tableRecensioni.setFont(new Font("Trebuchet MS", Font.PLAIN, 19));
		scrollPane.setViewportView(tableRecensioni);
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.removeAllItems(tableRecensioni);
				setVisible(false);
				controller.setVisibleMostraAttivita(true);
			}
		});
		
		JLabel lblNome = new JLabel("Nome\r\n");
		lblNome.setForeground(new Color(255, 140, 0));
		lblNome.setFont(new Font("Goudy Old Style", Font.BOLD, 35));
		lblNome.setBounds(15, 16, 774, 43);
		contentPane.add(lblNome);
		
		JLabel lblNewLabel = new JLabel("Media:");
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		lblNewLabel.setBounds(804, 16, 69, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblMedia = new JLabel("5");
		lblMedia.setForeground(new Color(255, 215, 0));
		lblMedia.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		lblMedia.setBounds(861, 16, 69, 51);
		contentPane.add(lblMedia);
		controller.setLabelMostraRecensioni(lblNome, lblMedia);
		tableRecensioni.setRowHeight(150);
		
		controller.removeAllItems(tableRecensioni);
		controller.setTabellaRecensioni(tableRecensioni);
		
	}
}
