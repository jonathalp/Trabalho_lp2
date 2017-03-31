import java.awt.Color;
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
import javax.swing.border.EmptyBorder;

public class Cadastro1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	JButton btnPessoaF = new JButton("Cadastro Pessoa Fisica");
	JButton btnPessoaJ = new JButton("Cadastro Pessoa Juridica");
	JButton btnRetornarLogin = new JButton("Retornar login");

	public Cadastro1() {
		setTitle("Cerve...j\u00E1! Beba com modera\u00E7\u00E3o.");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Imagens\\Brahma-logo.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 559);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		btnRetornarLogin.setOpaque(false);
		btnRetornarLogin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnRetornarLogin.setContentAreaFilled(false);
		btnRetornarLogin.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		btnRetornarLogin.setBounds(190, 454, 166, 63);

		contentPane.add(btnRetornarLogin);

		btnPessoaJ.setOpaque(false);
		btnPessoaJ.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPessoaJ.setContentAreaFilled(false);
		btnPessoaJ.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		btnPessoaJ.setBounds(299, 192, 223, 63);
		contentPane.add(btnPessoaJ);

		btnPessoaF.setOpaque(false);
		btnPessoaF.setContentAreaFilled(false);
		btnPessoaF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		btnPessoaF.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPessoaF.setBounds(10, 192, 223, 63);
		contentPane.add(btnPessoaF);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Imagens\\Fundo cad ini.png"));
		lblNewLabel.setBounds(0, 0, 539, 517);
		contentPane.add(lblNewLabel);

		btnPessoaF.addActionListener(this);
		btnPessoaJ.addActionListener(this);
		btnRetornarLogin.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnRetornarLogin) {
			Login login = new Login();
			login.setVisible(true);
			this.dispose();
		}
		if (e.getSource() == btnPessoaF) {
			CadastroFisico cadastrofisico = new CadastroFisico();
			cadastrofisico.setVisible(true);
			this.dispose();
		}
		if (e.getSource() == btnPessoaJ) {
			CadastroJuridico cadastrijuridico = new CadastroJuridico();
			cadastrijuridico.setVisible(true);
			this.dispose();
		}

	}
}
