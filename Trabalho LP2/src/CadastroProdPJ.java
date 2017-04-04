import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;

public class CadastroProdPJ extends JDialog implements ActionListener{

	private final JPanel contentPanel = new JPanel();
	
	JButton cancelButton = new JButton("Sair");
	ButtonGroup EscQtd = new ButtonGroup();
	JRadioButton radioButton = new JRadioButton("1.");
	JRadioButton radioButton_1 = new JRadioButton("2.");
	JRadioButton radioButton_2 = new JRadioButton("3.");
	JRadioButton radioButton_3 = new JRadioButton("4.");
	JRadioButton radioButton_4 = new JRadioButton("5.");
	JRadioButton radioButton_5 = new JRadioButton("6.");
	JButton okButton = new JButton("Confirma");

	
	public CadastroProdPJ() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Imagens\\Brahma-logo (2).jpg"));
		setTitle("Cerve...j\u00E1! Beba com modera\u00E7\u00E3o.");
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 550, 531);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		EscQtd.add(radioButton);EscQtd.add(radioButton_1);EscQtd.add(radioButton_2);
		EscQtd.add(radioButton_3);EscQtd.add(radioButton_4);EscQtd.add(radioButton_5);
		
		JLabel lblSelecioneAQuantidade = new JLabel("Selecione a quantidade de produtos que deseja cadastra. ");
		lblSelecioneAQuantidade.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblSelecioneAQuantidade.setBounds(22, 11, 486, 71);
		contentPanel.add(lblSelecioneAQuantidade);
		
		radioButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		radioButton.setBounds(117, 89, 39, 23);
		contentPanel.add(radioButton);
		
		radioButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		radioButton_1.setBounds(155, 137, 45, 23);
		contentPanel.add(radioButton_1);
		
		radioButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		radioButton_2.setBounds(171, 181, 45, 23);
		contentPanel.add(radioButton_2);
		
		radioButton_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		radioButton_3.setBounds(217, 232, 45, 23);
		contentPanel.add(radioButton_3);
		
		radioButton_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		radioButton_4.setBounds(252, 274, 45, 23);
		contentPanel.add(radioButton_4);
		
		radioButton_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		radioButton_5.setBounds(284, 322, 45, 23);
		contentPanel.add(radioButton_5);
		
	
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setIcon(new ImageIcon("C:\\Imagens\\Brahma-logo (2).jpg"));
		lblNewLabel.setBounds(0, 0, 534, 486);
		contentPanel.add(lblNewLabel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				
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
		okButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == cancelButton){
			PrincipalPJ principalpj = new PrincipalPJ();
			principalpj.setVisible(true);
			dispose();
		}
		if(e.getSource() == okButton){
			Cadastro1prod cadastro1prod = new Cadastro1prod();
			cadastro1prod.setVisible(true);
			dispose();
	}

	}
}
