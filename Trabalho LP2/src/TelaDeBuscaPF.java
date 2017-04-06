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
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class TelaDeBuscaPF extends JFrame implements ActionListener {

	JPanel contentPane;
	JMenuItem mntmSair = new JMenuItem("Sair");
	JComboBox cbBusca = new JComboBox();
	
	
	JRadioButton rdbtnMarca = new JRadioButton("MARCA");
	JRadioButton rdbtnDistribuidor = new JRadioButton("DISTRIBUIDOR");
	JRadioButton rdbtnVolume = new JRadioButton("VOLUME");
	
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
		
		rdbtnMarca.setBounds(10, 28, 109, 23);
		contentPane.add(rdbtnMarca);
				
				
		rdbtnDistribuidor.setBounds(10, 52, 109, 23);
		contentPane.add(rdbtnDistribuidor);
						
						
		rdbtnVolume.setBounds(10, 78, 73, 23);
		contentPane.add(rdbtnVolume);
		
		ButtonGroup btOpcoesDeBusca = new ButtonGroup();
		btOpcoesDeBusca.add(rdbtnDistribuidor);
		btOpcoesDeBusca.add(rdbtnMarca);
		btOpcoesDeBusca.add(rdbtnVolume);

		mnSair.add(mntmSair);
		
		rdbtnDistribuidor.addActionListener(this);
		rdbtnMarca.addActionListener(this);
		rdbtnVolume.addActionListener(this);
										
		JTextArea taResultado = new JTextArea();
		taResultado.setBounds(24, 126, 503, 283);
		contentPane.add(taResultado);

		JButton btBuscar = new JButton("BUSCAR");
		btBuscar.setBounds(358, 94, 89, 23);
		contentPane.add(btBuscar);

		cbBusca.setBounds(128, 95, 220, 20);
		contentPane.add(cbBusca);

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
		if (e.getSource() == rdbtnMarca) {
			cbBusca.setModel(new DefaultComboBoxModel(new String[] {""}));
			cbBusca.setModel(new DefaultComboBoxModel(new String[] {"Bav\u00E1ria ", "Bodebrown", "Bohemia ", "Brahma ",
					"Brahma Extra", "Caracu ", "Cerveja Adri\u00E1tica", "Crystal ", "Devassa ", "Eisenbahn",
					"Heinrich Thielen", "Itaipava ", "Kaiser ", "Kronenbier", "Liber ", "Polar ", "Skol",
					"Therez\u00F3polis Gold", "Waybeer", "Xingu "}));
		}
		if (e.getSource() == rdbtnVolume) {
			cbBusca.setModel(new DefaultComboBoxModel(new String[] {""}));
			cbBusca.setModel(new DefaultComboBoxModel(new String[] {"ml", "L"}));
		}
		if (e.getSource() == rdbtnDistribuidor) {
			cbBusca.setModel(new DefaultComboBoxModel(new String[] {""}));
			cbBusca.setModel(new DefaultComboBoxModel(new String[] {"Lista de Distribuidores"}));
		}

	}
	
	public static void main(String[] args) {
		TelaDeBuscaPF novo = new TelaDeBuscaPF();
		novo.setVisible(true);
	}
}