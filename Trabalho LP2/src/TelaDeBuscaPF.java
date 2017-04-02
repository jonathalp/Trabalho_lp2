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
import javax.swing.JTable;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class TelaDeBuscaPF extends JFrame implements ActionListener {

	JPanel contentPane;
	JMenuItem mntmSair = new JMenuItem("Sair");
	private JTextField tfBusca;

	public TelaDeBuscaPF() {
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
		
		JRadioButton rdbtnNome = new JRadioButton("MARCA");
		rdbtnNome.setBounds(10, 28, 109, 23);
		contentPane.add(rdbtnNome);
				
				JRadioButton rdbtnDistribuidor = new JRadioButton("DISTRIBUIDOR");
				rdbtnDistribuidor.setBounds(10, 52, 109, 23);
				contentPane.add(rdbtnDistribuidor);
						
						JRadioButton rdbtnVolume = new JRadioButton("VOLUME");
						rdbtnVolume.setBounds(10, 78, 73, 23);
						contentPane.add(rdbtnVolume);
										
										JTextArea taResultado = new JTextArea();
										taResultado.setBounds(24, 126, 503, 283);
										contentPane.add(taResultado);
												
												tfBusca = new JTextField();
												tfBusca.setBounds(105, 95, 243, 20);
												contentPane.add(tfBusca);
												tfBusca.setColumns(10);
														
														JButton btBuscar = new JButton("BUSCAR");
														btBuscar.setBounds(358, 94, 89, 23);
														contentPane.add(btBuscar);
												
														JLabel lblNewLabel = new JLabel("");
														lblNewLabel.setBounds(0, 0, 550, 532);
														lblNewLabel.setIcon(new ImageIcon("C:\\Imagens\\Brahma-logo (2).jpg"));
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