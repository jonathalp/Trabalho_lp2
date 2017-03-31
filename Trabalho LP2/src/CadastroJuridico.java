import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

public class CadastroJuridico extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textFieldLogin;
	private JTextField textFieldSenha;
	private JLabel lblNome;
	private JLabel lblCpf;
	private JLabel lblEndereo;
	private JLabel lblBairro;
	private JLabel lblCep;
	private JLabel lblTelefone;
	private JTextField textField;
	private JFormattedTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblEmail;
	private JTextField textField_6;
	private JLabel lblEndereo_1;
	private JTextField textField_7;
	private JButton btnSalvar;
	private JButton btnLimpar;
	private JButton btnSair;

	public CadastroJuridico() {
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
			mcCPF = new MaskFormatter("##.###.###/####-##");
		} catch (ParseException e) {
		}

		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLogin.setBounds(33, 11, 62, 23);
		contentPane.add(lblLogin);

		textFieldLogin = new JTextField();
		textFieldLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		textFieldLogin.setForeground(Color.BLACK);
		textFieldLogin.setBounds(85, 14, 189, 20);
		textFieldLogin.setOpaque(false);
		textFieldLogin.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		contentPane.add(textFieldLogin);
		textFieldLogin.setColumns(10);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSenha.setBounds(299, 11, 62, 23);
		contentPane.add(lblSenha);

		textFieldSenha = new JPasswordField();
		textFieldSenha.setFont(new Font("Tahoma", Font.BOLD, 12));
		textFieldSenha.setForeground(Color.BLACK);
		textFieldSenha.setOpaque(false);
		textFieldSenha.setColumns(10);
		textFieldSenha.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textFieldSenha.setBounds(356, 14, 101, 20);
		contentPane.add(textFieldSenha);

		lblNome = new JLabel("Raz\u00E3o Social:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNome.setBounds(33, 57, 98, 23);
		contentPane.add(lblNome);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField.setForeground(Color.BLACK);
		textField.setOpaque(false);
		textField.setColumns(10);
		textField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField.setBounds(141, 60, 345, 20);
		contentPane.add(textField);

		lblCpf = new JLabel("CNPJ:");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCpf.setBounds(33, 98, 62, 23);
		contentPane.add(lblCpf);

		textField_1 = new JFormattedTextField(mcCPF);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_1.setForeground(Color.BLACK);
		textField_1.setOpaque(false);
		textField_1.setColumns(10);
		textField_1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_1.setBounds(85, 102, 189, 20);
		contentPane.add(textField_1);

		lblEndereo_1 = new JLabel("Endere\u00E7o:");
		lblEndereo_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEndereo_1.setBounds(33, 142, 78, 23);
		contentPane.add(lblEndereo_1);

		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_7.setForeground(Color.BLACK);
		textField_7.setOpaque(false);
		textField_7.setColumns(10);
		textField_7.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_7.setBounds(106, 142, 351, 20);
		contentPane.add(textField_7);

		lblEndereo = new JLabel("Numero:");
		lblEndereo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEndereo.setBounds(33, 179, 62, 23);
		contentPane.add(lblEndereo);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_2.setForeground(Color.BLACK);
		textField_2.setOpaque(false);
		textField_2.setColumns(10);
		textField_2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_2.setBounds(98, 179, 62, 20);
		contentPane.add(textField_2);

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

		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_4.setForeground(Color.BLACK);
		textField_4.setOpaque(false);
		textField_4.setColumns(10);
		textField_4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_4.setBounds(72, 221, 135, 20);
		contentPane.add(textField_4);

		lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTelefone.setBounds(222, 218, 86, 23);
		contentPane.add(lblTelefone);

		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_5.setForeground(Color.BLACK);
		textField_5.setOpaque(false);
		textField_5.setColumns(10);
		textField_5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_5.setBounds(293, 221, 164, 20);
		contentPane.add(textField_5);

		lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(33, 259, 62, 23);
		contentPane.add(lblEmail);

		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_6.setForeground(Color.BLACK);
		textField_6.setOpaque(false);
		textField_6.setColumns(10);
		textField_6.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		textField_6.setBounds(82, 262, 375, 20);
		contentPane.add(textField_6);

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
		if (e.getSource() == btnSair) {
			Login login = new Login();
			login.setVisible(true);
			this.dispose();
		}

	}
}
