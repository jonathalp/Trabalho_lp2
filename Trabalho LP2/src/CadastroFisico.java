import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

public class CadastroFisico extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tfLogin;
	private JTextField pfSenha;
	private JLabel lblNome;
	private JLabel lblCpf;
	private JLabel lblEndereo;
	private JLabel lblBairro;
	private JLabel lblCep;
	private JLabel lblTelefone;
	private JTextField tfNome;
	private JFormattedTextField tfCPF;
	private JTextField tfNum;
	private JTextField textField_3;
	private JTextField tfCEP;
	private JTextField tfFone;
	private JLabel lblEmail;
	private JTextField tfEmail;
	private JLabel lblEndereo_1;
	private JTextField tfEndereco;
	private JButton btnSalvar;
	private JButton btnLimpar;
	private JButton btnSair;


	public CadastroFisico() {
		setTitle("Cerve...j\u00E1! Beba com modera\u00E7\u00E3o.");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Imagens\\Brahma-logo.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 571, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		MaskFormatter mcCPF = null;
		try {
			mcCPF = new MaskFormatter("###.###.###-##");
		} catch (ParseException e) {
		}
		MaskFormatter mcCEP = null;
		try {
			mcCEP = new MaskFormatter("#####-###");
		} catch (ParseException e) {
		}
		MaskFormatter mcFone = null;
		try {
			mcFone = new MaskFormatter("(##)#####-####");
		} catch (ParseException e) {
		}
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLogin.setBounds(33, 11, 62, 23);
		contentPane.add(lblLogin);
		
		tfLogin = new JTextField();
		tfLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfLogin.setForeground(Color.BLACK);
		tfLogin.setBounds(85, 14, 189, 20);
		tfLogin.setOpaque(false);
		tfLogin.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		contentPane.add(tfLogin);
		tfLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSenha.setBounds(299, 11, 62, 23);
		contentPane.add(lblSenha);
		
		pfSenha = new JPasswordField();
		pfSenha.setFont(new Font("Tahoma", Font.BOLD, 12));
		pfSenha.setForeground(Color.BLACK);
		pfSenha.setOpaque(false);
		pfSenha.setColumns(10);
		pfSenha.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		pfSenha.setBounds(356, 14, 101, 20);
		contentPane.add(pfSenha);
		
		lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNome.setBounds(33, 57, 62, 23);
		contentPane.add(lblNome);
		
		tfNome = new JTextField();
		tfNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfNome.setForeground(Color.BLACK);
		tfNome.setOpaque(false);
		tfNome.setColumns(10);
		tfNome.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		tfNome.setBounds(85, 58, 372, 20);
		contentPane.add(tfNome);
		
		lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCpf.setBounds(33, 98, 62, 23);
		contentPane.add(lblCpf);
		
		
		tfCPF = new JFormattedTextField(mcCPF);
		tfCPF.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfCPF.setForeground(Color.BLACK);
		tfCPF.setOpaque(false);
		tfCPF.setColumns(10);
		tfCPF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		tfCPF.setBounds(85, 102, 189, 20);
		contentPane.add(tfCPF);
		
		lblEndereo_1 = new JLabel("Endere\u00E7o:");
		lblEndereo_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEndereo_1.setBounds(33, 142, 78, 23);
		contentPane.add(lblEndereo_1);
		
		tfEndereco = new JTextField();
		tfEndereco.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfEndereco.setForeground(Color.BLACK);
		tfEndereco.setOpaque(false);
		tfEndereco.setColumns(10);
		tfEndereco.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		tfEndereco.setBounds(106, 142, 351, 20);
		contentPane.add(tfEndereco);
		
		lblEndereo = new JLabel("Numero:");
		lblEndereo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEndereo.setBounds(33, 179, 62, 23);
		contentPane.add(lblEndereo);
		
		tfNum = new JTextField();
		tfNum.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfNum.setForeground(Color.BLACK);
		tfNum.setOpaque(false);
		tfNum.setColumns(10);
		tfNum.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		tfNum.setBounds(98, 179, 62, 20);
		contentPane.add(tfNum);
		
		lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBairro.setBounds(167, 177, 62, 23);
		contentPane.add(lblBairro);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_3.setForeground(Color.BLACK);
		textField_3.setOpaque(false);
		textField_3.setColumns(10);
		textField_3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_3.setBounds(222, 178, 235, 20);
		contentPane.add(textField_3);
		
		lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCep.setBounds(33, 218, 62, 23);
		contentPane.add(lblCep);
		
		tfCEP = new JFormattedTextField(mcCEP);
		tfCEP.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfCEP.setForeground(Color.BLACK);
		tfCEP.setOpaque(false);
		tfCEP.setColumns(10);
		tfCEP.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		tfCEP.setBounds(72, 221, 135, 20);
		contentPane.add(tfCEP);
		
		lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTelefone.setBounds(222, 218, 86, 23);
		contentPane.add(lblTelefone);
		
		tfFone = new JFormattedTextField(mcFone);
		tfFone.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfFone.setForeground(Color.BLACK);
		tfFone.setOpaque(false);
		tfFone.setColumns(10);
		tfFone.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		tfFone.setBounds(293, 221, 164, 20);
		contentPane.add(tfFone);
		
		lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(33, 259, 62, 23);
		contentPane.add(lblEmail);
		
		tfEmail = new JTextField();
		tfEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		tfEmail.setForeground(Color.BLACK);
		tfEmail.setOpaque(false);
		tfEmail.setColumns(10);
		tfEmail.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		tfEmail.setBounds(82, 262, 375, 20);
		contentPane.add(tfEmail);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setOpaque(false);
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSalvar.setContentAreaFilled(false);
		btnSalvar.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		btnSalvar.setBounds(231, 356, 101, 31);
		contentPane.add(btnSalvar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setOpaque(false);
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLimpar.setContentAreaFilled(false);
		btnLimpar.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		btnLimpar.setBounds(106, 376, 101, 31);
		contentPane.add(btnLimpar);
		
		btnSair = new JButton("Sair");
		btnSair.setOpaque(false);
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSair.setContentAreaFilled(false);
		btnSair.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		btnSair.setBounds(356, 376, 101, 31);
		contentPane.add(btnSair);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Imagens\\Brahma-logo (2).jpg"));
		lblNewLabel.setBounds(0, 0, 551, 480);
		contentPane.add(lblNewLabel);
		
		btnLimpar.addActionListener(this);
		btnSair.addActionListener(this);
		btnSalvar.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnSair){
			Login login = new Login();
			login.setVisible(true);
			this.dispose();
		}
		
	}
}
