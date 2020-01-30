

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class MostraAttivita extends JFrame {

	private JPanel contentPane;
	private JTable tableAttivita;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MostraAttivita frame = new MostraAttivita();
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
	public MostraAttivita(Controller ctrl) {
		setBackground(new Color(128, 0, 0));
		Controller controller=ctrl;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1022, 590);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 215, 0));
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton btnBack = new JButton("\r\n");
		
		btnBack.setIcon(new ImageIcon(AggiungiRecensioneFrame.class.getResource("/Images/undo.png")));
		btnBack.setBounds(948, 485, 37, 33);
		btnBack.setOpaque(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		btnBack.setBorder(null);
		contentPane.add(btnBack);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		scrollPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 0, 0), new Color(128, 0, 0), new Color(128, 0, 0), new Color(128, 0, 0)));
		scrollPane.setForeground(new Color(255, 215, 0));
		scrollPane.setBackground(new Color(128, 0, 0));
		scrollPane.setBounds(0, 0, 1000, 485);
		contentPane.add(scrollPane);
		
		tableAttivita = new JTable();
		tableAttivita.setShowVerticalLines(false);
		tableAttivita.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try{DefaultTableModel model =(DefaultTableModel) tableAttivita.getModel();
				controller.setVisibleMostraRecensioni(true);
				int selectedRowIndex=tableAttivita.getSelectedRow();
				controller.setElencoRecensioni(model.getValueAt(selectedRowIndex,0).toString());
				controller.getLabelMostraRecensioni();
				controller.aggiungiTabellaRecensioni(controller.getTabellaRecensioni());
				setVisible(false);}catch(Exception e){}
			}
		});
		tableAttivita.setSelectionForeground(new Color(255, 215, 0));
		tableAttivita.setSelectionBackground(new Color(205, 92, 92));
		tableAttivita.setGridColor(new Color(255, 140, 0));
		tableAttivita.setForeground(new Color(255, 215, 0));
		tableAttivita.setFont(new Font("Trebuchet MS", Font.PLAIN, 30));
		tableAttivita.setBackground(new Color(128, 0, 0));
		tableAttivita.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableAttivita.setEnabled(true);
		tableAttivita.getTableHeader().setOpaque(false);
		tableAttivita.getTableHeader().setBackground(new Color(128, 0, 0));
		tableAttivita.getTableHeader().setForeground(new Color(255, 215, 0));
		tableAttivita.getTableHeader().setFont(new Font("Trebuchet MS", Font.PLAIN, 19));
		tableAttivita.getTableHeader().setBorder(null);
		
		
		tableAttivita.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "Via", "Foto"
			}
		) {
			
			@SuppressWarnings("rawtypes")
			Class[] columnTypes = new Class[] {
				String.class, String.class, ImageIcon.class
			};
			public Class<?> getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.getViewport().setBackground(new Color(128, 0, 0));
		tableAttivita.setFillsViewportHeight(true);
		tableAttivita.getColumnModel().getColumn(0).setResizable(false);
		tableAttivita.getColumnModel().getColumn(0).setPreferredWidth(240);
		tableAttivita.getColumnModel().getColumn(1).setResizable(false);
		tableAttivita.getColumnModel().getColumn(1).setPreferredWidth(400);
		tableAttivita.getColumnModel().getColumn(2).setResizable(false);
		tableAttivita.getColumnModel().getColumn(2).setPreferredWidth(485);
		tableAttivita.setRowHeight(285);
		scrollPane.setViewportView(tableAttivita);
		
     	controller.removeAllItems(tableAttivita);
		controller.setTabellaAttivita(tableAttivita);
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.removeAllItems(tableAttivita);
				setVisible(false);
				controller.setVisibleCercaRecensioneFrame(true);
			}
		});
		
		
	}
}
