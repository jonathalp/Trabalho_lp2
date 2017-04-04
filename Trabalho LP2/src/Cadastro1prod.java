import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.Locale;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

public class Cadastro1prod extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();

	JButton cancelButton = new JButton("Sair");
	ButtonGroup EscQtd = new ButtonGroup();
	private JTextField textField;

	Locale BRAZIL = new Locale("pt", "BR");
	DecimalFormatSymbols REAL = new DecimalFormatSymbols(BRAZIL);
	DecimalFormat DINHEIRO_REAL = new DecimalFormat("¤ ###,###,##0.00", REAL);

	public Cadastro1prod() {
		setTitle("Cerve...j\u00E1! Beba com modera\u00E7\u00E3o.");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Imagens\\Brahma-logo (2).jpg"));
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 550, 531);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		MaskFormatter mcReal = null;
		try {
			mcReal = new MaskFormatter("R$#,##");
			mcReal.setPlaceholderCharacter(' ');
		} catch (ParseException excp) {
		}

		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(10, 38, 524, 14);
		lblMarca.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		contentPanel.add(lblMarca);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Bav\u00E1ria ", "Bodebrown", "Bohemia ", "Brahma ",
				"Brahma Extra", "Caracu ", "Cerveja Adri\u00E1tica", "Crystal ", "Devassa ", "Eisenbahn",
				"Heinrich Thielen", "Itaipava ", "Kaiser ", "Kronenbier", "Liber ", "Polar ", "Skol",
				"Therez\u00F3polis Gold", "Waybeer", "Xingu " }));
		comboBox.setBounds(10, 63, 128, 20);
		contentPanel.add(comboBox);

		JLabel lblVolume = new JLabel("Volume");
		lblVolume.setBounds(173, 38, 288, 14);
		lblVolume.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		contentPanel.add(lblVolume);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		textField.setBounds(173, 63, 64, 20);
		contentPanel.add(textField);
		textField.setColumns(10);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "ml", "L" }));
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		comboBox_1.setBounds(247, 63, 44, 20);
		contentPanel.add(comboBox_1);

		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setBounds(299, 38, 189, 14);
		lblQuantidade.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		contentPanel.add(lblQuantidade);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27",
				"28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44",
				"45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61",
				"62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78",
				"79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95",
				"96", "97", "98", "99", "100" }));
		comboBox_2.setBounds(309, 63, 72, 20);
		contentPanel.add(comboBox_2);

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

			JButton btnSalvarESair = new JButton("Salvar e Sair");
			btnSalvarESair.setActionCommand("OK");
			buttonPane.add(btnSalvarESair);
			{
				JButton okButton = new JButton("Salvar");
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
		if (e.getSource() == cancelButton) {
			PrincipalPJ principalpj = new PrincipalPJ();
			principalpj.setVisible(true);
			dispose();
		}
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
