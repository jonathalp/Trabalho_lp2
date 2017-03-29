import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame implements ActionListener {

	public JPanel contentPane;
	public JTextField textFieldUsuario;
	public JTextField textPassSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	JButton btnSair = new JButton("Sair");
	JButton btnCadastrar = new JButton("Cadastrar");
	JButton btnEntrar = new JButton("Entrar");

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Cerve...j\u00E1! Beba com modera\u00E7\u00E3o.");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Imagens\\Brahma-logo.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEntrar.setBounds(226, 494, 131, 37);
		btnEntrar.setOpaque(false);
		btnEntrar.setContentAreaFilled(false);
		btnEntrar.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		contentPane.add(btnEntrar);

		btnSair.setOpaque(false);
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSair.setContentAreaFilled(false);
		btnSair.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		btnSair.setBounds(385, 494, 131, 37);
		contentPane.add(btnSair);

		
		btnCadastrar.setOpaque(false);
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCadastrar.setContentAreaFilled(false);
		btnCadastrar.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		btnCadastrar.setBounds(61, 494, 131, 37);
		contentPane.add(btnCadastrar);

		JLabel lblLogin = new JLabel("Usu\u00E1rio:");
		lblLogin.setBackground(Color.BLACK);
		lblLogin.setForeground(Color.BLACK);
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblLogin.setBounds(87, 380, 145, 39);
		contentPane.add(lblLogin);

		textFieldUsuario = new JTextField();
		textFieldUsuario.setForeground(Color.BLACK);
		textFieldUsuario.setBackground(Color.BLACK);
		textFieldUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		textFieldUsuario.setBounds(216, 394, 215, 23);
		textFieldUsuario.setOpaque(false);
		textFieldUsuario.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		contentPane.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblSenha.setBounds(108, 425, 106, 23);
		contentPane.add(lblSenha);

		textPassSenha = new JPasswordField();
		textPassSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
		textPassSenha.setBackground(Color.BLACK);
		textPassSenha.setForeground(Color.BLACK);
		textPassSenha.setBounds(214, 425, 157, 23);
		textPassSenha.setOpaque(false);
		textPassSenha.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		contentPane.add(textPassSenha);
		textPassSenha.setColumns(10);

		JLabel lblFundo = new JLabel("");
		lblFundo.setIcon(new ImageIcon("C:\\Imagens\\Brahma-logo.jpg"));
		lblFundo.setBounds(0, 0, 559, 542);
		contentPane.add(lblFundo);

		btnSair.addActionListener(this);
		btnCadastrar.addActionListener(this);
		btnEntrar.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSair) {
			this.dispose();

		}
		if (e.getSource() == btnCadastrar){
			Cadastro1 cadastro1 = new Cadastro1();
			cadastro1.setVisible(true);
			this.dispose();
			 
		}
		
		if (e.getSource() == btnEntrar){
			//Fazer a verificação de usuario e senha em arquivo.
			Principal principal = new Principal();
			principal.setVisible(true);
			this.dispose();
			 
		}	}
}
