
import java.awt.Color;
import java.awt.Cursor;
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

@SuppressWarnings("serial")
public class MostraProprieAttivita extends JFrame {

	private JPanel contentPane;
	private JTable tableProprieAttivita;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MostraProprieAttivita frame = new MostraProprieAttivita();
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
	public MostraProprieAttivita(Controller ctrl) {
		setResizable(false);
		setBackground(new Color(128, 0, 0));
		Controller controller=ctrl;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1022, 641);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 215, 0));
		contentPane.setBackground(new Color(128, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton btnBack = new JButton("\r\n");
		
		btnBack.setIcon(new ImageIcon(AggiungiRecensioneFrame.class.getResource("/Images/undo.png")));
		btnBack.setBounds(862, 536, 37, 33);
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
		scrollPane.setBounds(41, 16, 941, 504);
		contentPane.add(scrollPane);
		
		tableProprieAttivita= new JTable();
		tableProprieAttivita.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try{DefaultTableModel model =(DefaultTableModel) tableProprieAttivita.getModel();
				int selectedRowIndex=tableProprieAttivita.getSelectedRow();
				controller.setPropriaAttivitaSelezionata(model.getValueAt(selectedRowIndex,0).toString());
				controller.getTextModificaAttivita();
				controller.setVisibleModificaAttivita(true);
				setVisible(false);}catch(Exception e){}
			}
		});
		tableProprieAttivita.setSelectionForeground(new Color(255, 215, 0));
		tableProprieAttivita.setSelectionBackground(new Color(205, 92, 92));
		tableProprieAttivita.setGridColor(new Color(255, 140, 0));
		tableProprieAttivita.setForeground(new Color(255, 215, 0));
		tableProprieAttivita.setFont(new Font("Trebuchet MS", Font.BOLD, 23));
		tableProprieAttivita.setBackground(new Color(128, 0, 0));
		tableProprieAttivita.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableProprieAttivita.setEnabled(true);
		tableProprieAttivita.getTableHeader().setOpaque(false);
		tableProprieAttivita.getTableHeader().setBackground(new Color(128, 0, 0));
		tableProprieAttivita.getTableHeader().setForeground(new Color(255, 215, 0));
		tableProprieAttivita.getTableHeader().setFont(new Font("Trebuchet MS", Font.PLAIN, 19));
		tableProprieAttivita.getTableHeader().setBorder(null);
		
		
		tableProprieAttivita.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Codice", "Nome", "Via", "Foto"
			}
		) {
			@SuppressWarnings("rawtypes")
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, ImageIcon.class
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
		tableProprieAttivita.getColumnModel().getColumn(0).setResizable(false);
		tableProprieAttivita.getColumnModel().getColumn(1).setResizable(false);
		tableProprieAttivita.getColumnModel().getColumn(1).setPreferredWidth(240);
		tableProprieAttivita.getColumnModel().getColumn(2).setResizable(false);
		tableProprieAttivita.getColumnModel().getColumn(2).setPreferredWidth(400);
		tableProprieAttivita.getColumnModel().getColumn(3).setResizable(false);
		tableProprieAttivita.getColumnModel().getColumn(3).setPreferredWidth(485);
		scrollPane.getViewport().setBackground(new Color(128, 0, 0));
		tableProprieAttivita.setFillsViewportHeight(true);
		tableProprieAttivita.setShowVerticalLines(false);
		tableProprieAttivita.setRowHeight(285);
		scrollPane.setViewportView(tableProprieAttivita);
		
     	controller.removeAllItems(tableProprieAttivita);
		controller.setTabellaProprieAttivita(tableProprieAttivita);
		
		btnBack.setFocusPainted(false);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				controller.setVisibleMenuPrincipaleProprietario(true);
			}
		});
		
		
	}
	}


