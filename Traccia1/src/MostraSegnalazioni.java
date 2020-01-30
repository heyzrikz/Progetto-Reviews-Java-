
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

@SuppressWarnings("serial")
public class MostraSegnalazioni extends JFrame {

	private JPanel contentPane;
	private JTable tableSegnalazioni;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MostraSegnalazioni frame = new MostraSegnalazioni();
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
	public MostraSegnalazioni(Controller ctrl) {
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
		btnBack.setBounds(964, 573, 37, 33);
		btnBack.setOpaque(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		btnBack.setBorder(null);
		contentPane.add(btnBack);
		
		
		
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 0, 0), new Color(128, 0, 0), new Color(128, 0, 0), new Color(128, 0, 0)));
		scrollPane.setBounds(15, 16, 986, 525);
		contentPane.add(scrollPane);
		
		tableSegnalazioni = new JTable();
		tableSegnalazioni.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try{DefaultTableModel model =(DefaultTableModel) tableSegnalazioni.getModel();
				setVisible(false);
				int selectedRowIndex=tableSegnalazioni.getSelectedRow();
				controller.setSegnalazioneSelezionata(model.getValueAt(selectedRowIndex,0).toString());
			    controller.getLabelVisualizzaSegnalazioneSelezionata();}catch(Exception e){}
			}
			    
			    
			
		});
		tableSegnalazioni.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 0, 0), new Color(128, 0, 0), new Color(128, 0, 0), new Color(128, 0, 0)));
		tableSegnalazioni.setShowHorizontalLines(false);
		tableSegnalazioni.setSelectionForeground(new Color(255, 215, 0));
		tableSegnalazioni.setSelectionBackground(new Color(205, 92, 92));
		tableSegnalazioni.setGridColor(new Color(128, 0, 0));
		tableSegnalazioni.setForeground(new Color(255, 215, 0));
		tableSegnalazioni.setFont(new Font("Trebuchet MS", Font.PLAIN, 19));
		tableSegnalazioni.setBackground(new Color(128, 0, 0));
		tableSegnalazioni.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableSegnalazioni.setEnabled(true);
		tableSegnalazioni.getTableHeader().setOpaque(false);
		tableSegnalazioni.getTableHeader().setBackground(new Color(128, 0, 0));
		tableSegnalazioni.getTableHeader().setForeground(new Color(255, 215, 0));
		tableSegnalazioni.getTableHeader().setFont(new Font("Trebuchet MS", Font.PLAIN, 19));
		tableSegnalazioni.getTableHeader().setBorder(null);
		tableSegnalazioni.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Codice", "Titolo", "Descrizione"
			}
		) {
			@SuppressWarnings("rawtypes")
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class
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
		tableSegnalazioni.getColumnModel().getColumn(0).setResizable(false);
		tableSegnalazioni.getColumnModel().getColumn(0).setPreferredWidth(62);
		tableSegnalazioni.getColumnModel().getColumn(1).setResizable(false);
		tableSegnalazioni.getColumnModel().getColumn(1).setPreferredWidth(200);
		tableSegnalazioni.getColumnModel().getColumn(2).setResizable(false);
		tableSegnalazioni.getColumnModel().getColumn(2).setPreferredWidth(500);
		tableSegnalazioni.setFillsViewportHeight(true);
		tableSegnalazioni.setForeground(new Color(255, 215, 0));
		tableSegnalazioni.setFont(new Font("Trebuchet MS", Font.PLAIN, 19));
		scrollPane.setViewportView(tableSegnalazioni);
		
		controller.removeAllItems(tableSegnalazioni);
		controller.setTabellaSegnalazioni(tableSegnalazioni);
	
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				controller.setVisibleMenuPrincipaleModeratore(true);
			}
		});
		tableSegnalazioni.setRowHeight(150);
	
		
	}
	}


