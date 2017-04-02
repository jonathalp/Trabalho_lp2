import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;

public class PrincipalPF extends JFrame implements ActionListener {

	JPanel contentPane;
	JMenuItem mntmSair = new JMenuItem("Sair");

	public PrincipalPF() {
		setTitle("Cerve...j\u00E1! Beba com modera\u00E7\u00E3o.");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Imagens\\Brahma-logo.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 574);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 550, 21);
		contentPane.add(menuBar);

		JMenu mnCadastro = new JMenu("Cadastro");
		menuBar.add(mnCadastro);

		JMenuItem mntmEditar = new JMenuItem("Editar");
		mnCadastro.add(mntmEditar);

		JMenu mnBuscarProdutos = new JMenu("Produtos");
		menuBar.add(mnBuscarProdutos);
		
		JMenuItem mntmProdutos = new JMenuItem("Lista");
		mnBuscarProdutos.add(mntmProdutos);
		
		JMenuItem mntmConsultar = new JMenuItem("Buscar");
		mnBuscarProdutos.add(mntmConsultar);

		JMenu mnSair = new JMenu("Sair");
		menuBar.add(mnSair);
		
		JMenuItem mntmTrocarUsuario = new JMenuItem("Trocar Usu\u00E1rio");
		mnSair.add(mntmTrocarUsuario);

		mnSair.add(mntmSair);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 550, 532);
		lblNewLabel.setIcon(new ImageIcon("C:\\Imagens\\Brahma-logo.jpg"));
		contentPane.add(lblNewLabel);

		mntmSair.addActionListener(this);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmSair) {
			this.dispose();
		}

	}
}
