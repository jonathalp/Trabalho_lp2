import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.Locale;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;

public class BuscaDeProdutosPF extends JDialog implements ActionListener{

	private final JPanel contentPanel = new JPanel();
	
	JButton cancelButton = new JButton("Sair");
	ButtonGroup EscQtd = new ButtonGroup();
	private JTextField textField;

	Locale BRAZIL = new Locale("pt","BR");
	DecimalFormatSymbols REAL = new DecimalFormatSymbols(BRAZIL);
	DecimalFormat DINHEIRO_REAL = new DecimalFormat("¤ ###,###,##0.00",REAL);
	
	public BuscaDeProdutosPF() {
		setTitle("Cerve...j\u00E1! Beba com modera\u00E7\u00E3o.");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Imagens\\Brahma-logo (2).jpg"));
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 550, 531);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		MaskFormatter mcReal = null;
		  try{      
			         mcReal = new MaskFormatter("#########,##");
			         mcReal.setPlaceholderCharacter(' ');
			    }
			    catch(ParseException excp){}
			
		
		
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(10, 38, 524, 14);
		lblMarca.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		contentPanel.add(lblMarca);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 63, 143, 22);
		contentPanel.add(scrollPane);
		
		JList list = new JList();
		list.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Bav\u00E1ria ", "Bodebrown", "Bohemia ", "Brahma ", "Brahma Extra", "Caracu ", "Cerveja Adri\u00E1tica", "Crystal ", "Devassa ", "Eisenbahn", "Heinrich Thielen", "Itaipava ", "Kaiser ", "Kronenbier", "Liber ", "Polar ", "Skol", "Therez\u00F3polis Gold", "Waybeer", "Xingu "};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(list);
		
		JLabel lblVolume = new JLabel("Volume");
		lblVolume.setBounds(173, 38, 288, 14);
		lblVolume.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		contentPanel.add(lblVolume);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		textField.setBounds(173, 63, 64, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(243, 63, 46, 20);
		contentPanel.add(scrollPane_1);
		
		JList list_1 = new JList();
		scrollPane_1.setViewportView(list_1);
		list_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"ml", "L"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setBounds(299, 38, 189, 14);
		lblQuantidade.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		contentPanel.add(lblQuantidade);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(327, 63, 64, 22);
		contentPanel.add(scrollPane_2);
		
		JList list_2 = new JList();
		list_2.setModel(new AbstractListModel() {
			String[] values = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		scrollPane_2.setViewportView(list_2);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(424, 38, 64, 14);
		lblValor.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		contentPanel.add(lblValor);
		
	
		
		JTextField formattedTextField = new JFormattedTextField(mcReal);
		formattedTextField.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		formattedTextField.setBounds(424, 63, 78, 22);
		contentPanel.add(formattedTextField);
		
		
		
		
	
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 534, 486);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setIcon(new ImageIcon("C:\\Imagens\\Brahma-logo (2).jpg"));
		contentPanel.add(lblNewLabel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Confirma");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
		cancelButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == cancelButton){
			PrincipalPJ principalpj = new PrincipalPJ();
			principalpj.setVisible(true);
			dispose();
		}
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
