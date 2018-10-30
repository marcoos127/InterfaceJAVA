package view;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PrimeiraTela extends JFrame {
	JLabel lblnome = new JLabel("Nome: ");
	JLabel lblendereco = new JLabel("Endereço: ");
	JLabel lblbairro = new JLabel("Bairro: ");
	JLabel lblcep = new JLabel("CEP: ");
	JLabel lblcidade = new JLabel("Cidade: ");
	JLabel lblestado = new JLabel("Estado: ");
	JTextField txtbairro = new JTextField();
	JTextField txtendereco = new JTextField();
	JTextField txtcep = new JTextField();
	JTextField txtcidade = new JTextField();
	JTextField txtestado = new JTextField();
	JTextField txtNome = new JTextField();
	public PrimeiraTela() {
		super ("Titulo da Minha Janela");
		
		Container paine = this.getContentPane();
		
		paine.add(lblnome);
		lblnome.setBounds(20,20,100,20);
		
		paine.add(txtNome);
		txtNome.setBounds(130,20,200,20);
		
		this.setLayout(null);
		this.setSize(400,400);
		//this.setResizable(null);
		this.setVisible(true);
		
		Container paine2 = this.getContentPane();
		
		paine.add(lblendereco);
		lblendereco.setBounds(20,40,100,20);
		
		paine.add(txtendereco);
		txtendereco.setBounds(130,40,200,20);
		
		this.setLayout(null);
		this.setSize(400,400);
		//this.setResizable(null);
		this.setVisible(true);
		
		Container paine3 = this.getContentPane();
		
		paine.add(lblbairro);
		lblbairro.setBounds(20,60,100,20);
		
		paine.add(txtbairro);
		txtbairro.setBounds(130,60,200,20);
		
		this.setLayout(null);
		this.setSize(400,400);
		//this.setResizable(null);
		this.setVisible(true);
		
		Container paine4 = this.getContentPane();
		
		paine.add(lblcep);
		lblcep.setBounds(20,80,100,20);
		
		paine.add(txtcep);
		txtcep.setBounds(130,80,200,20);
		
		this.setLayout(null);
		this.setSize(400,400);
		//this.setResizable(null);
		this.setVisible(true);
		
		Container paine5 = this.getContentPane();
		
		paine.add(lblcidade);
		lblcidade.setBounds(20,100,100,20);
		
		paine.add(txtcidade);
		txtcidade.setBounds(130,100,200,20);
		
		this.setLayout(null);
		this.setSize(400,400);
		//this.setResizable(null);
		this.setVisible(true);
		
		Container paine6 = this.getContentPane();
		
		paine.add(lblestado);
		lblestado.setBounds(20,120,100,20);
		
		paine.add(txtestado);
		txtestado.setBounds(130,120,200,20);
		
		this.setLayout(null);
		this.setSize(400,400);
		//this.setResizable(null);
		this.setVisible(true);
	}
	public static void main(String args[]) {
		PrimeiraTela tela = new PrimeiraTela();
	}
	
}
