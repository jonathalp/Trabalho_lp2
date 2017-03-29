import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import java.awt.Toolkit;

public class Principal extends JFrame implements ActionListener {

	JPanel contentPane;
	JMenuItem mntmSair = new JMenuItem("Sair");
	
	public Principal() {
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
		
		JMenu mnConsulta = new JMenu("Consulta");
		menuBar.add(mnConsulta);
		
		JMenu mnSair = new JMenu("Sair");
		menuBar.add(mnSair);
		
		
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
		if(e.getSource() == mntmSair){
			this.dispose();
		}
		
	}
}
