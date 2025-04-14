package br.sp.senai.jandira.tabuada.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

import br.sp.senai.jandira.tabuada.model.Tabuada;

public class TelaTabuada {

	private JLabel labelMultiplicando;
	private JTextField txtMultiplicando;
	private JLabel labelMinimoMultiplicador;
	private JTextField txtMinimoMultiplicador;
	private JLabel labelMaximoMultiplicador;
	private JTextField txtMaximoMultiplicador;
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	private JList listTabuada;
	private String resultado[];
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setSize(246, 550);
		tela.setDefaultCloseOperation(3);
		tela.setTitle("Calculadora Tabuada");
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		tela.setResizable(false);
		
		// Criar um Label para Inserir no JFrame
		
		// Multiplicando
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(20, 20, 130, 25);
		
		txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(160, 22, 50, 25);
		
		// Mínimo Multiplicador
		labelMinimoMultiplicador = new JLabel();
		labelMinimoMultiplicador.setText("Mínimo Multiplicador:");
		labelMinimoMultiplicador.setBounds(20, 50, 130, 25);
		
		txtMinimoMultiplicador = new JTextField();
		txtMinimoMultiplicador.setBounds(160, 52, 50, 25);
		
		// Máximo Multiplicador
		labelMaximoMultiplicador = new JLabel();
		labelMaximoMultiplicador.setText("Máximo Multiplicador:");
		labelMaximoMultiplicador.setBounds(20, 80, 130, 25);
		
		txtMaximoMultiplicador = new JTextField();
		txtMaximoMultiplicador.setBounds(160, 82, 50, 25);		
		
		//Botão Calcular
		buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(20, 132, 90, 30);
		
		//Botão Limpar
		buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(120, 132, 90, 30);
		
		//Lista para exibir tabuada
		listTabuada = new JList();
		listTabuada.setBounds(20, 182, 190, 300);
		
		//Adicionar componentes ao painel de controle
		tela.getContentPane().add(labelMultiplicando);
		tela.getContentPane().add(txtMultiplicando);
		tela.getContentPane().add(labelMinimoMultiplicador);
		tela.getContentPane().add(txtMinimoMultiplicador);
		tela.getContentPane().add(labelMaximoMultiplicador);
		tela.getContentPane().add(txtMaximoMultiplicador);
		
		tela.getContentPane().add(buttonCalcular);
		tela.getContentPane().add(buttonLimpar);
		
		tela.getContentPane().add(listTabuada);
		
		//Configurar os ouvintes (listener)
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String multiplicando = txtMultiplicando.getText();
				String minimoMultiplicador = txtMinimoMultiplicador.getText();
				String maximoMultiplicador = txtMaximoMultiplicador.getText();
				
				//Casting -> conversão de um tipo para outro
				double multiplicandoDouble = Double.parseDouble(multiplicando);
				double minimoMultiplicadorDouble = Double.parseDouble(minimoMultiplicador);
				double maximoMultiplicadorDouble = Double.parseDouble(maximoMultiplicador);
				
				Tabuada tabuada = new Tabuada();
				tabuada.setMultiplicando(multiplicandoDouble);
				tabuada.setMinimoMultiplicador(minimoMultiplicadorDouble);
				tabuada.setMaximoMultiplicador(maximoMultiplicadorDouble);
				resultado = tabuada.calcularTabuada();
				
			}
			
		});

		//Tornar a tela visível ao usuário
		tela.setVisible(true);
		
	}
	
}