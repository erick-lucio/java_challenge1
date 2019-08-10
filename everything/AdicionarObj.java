package everything;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class AdicionarObj extends JFrame {

	private JPanel contentPane;
	Nebulosa nebulosa;
	JTextPane textPane;
	JTextPane textPane_1;
	
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public AdicionarObj(String objPesquisa,final String objCriado,String txt,Nebulosa nebulosaAtual) {
		this.nebulosa = nebulosaAtual;
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setSize(1030,900);
		Font f = new Font("Verdana", Font.PLAIN, 12);
		setFont(f);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textPane = new JTextPane();
		textPane.setBounds(217, 11, 126, 20);
		panel.add(textPane);
		
		JLabel lblDigiteONome = new JLabel("Digite o nome do(a) "+objPesquisa+" :");
		lblDigiteONome.setBounds(10, 14, 197, 17);
		panel.add(lblDigiteONome);
		
		JLabel lblDigiteONome_1 = new JLabel("Digite o nome do(a) "+objCriado+" :");
		lblDigiteONome_1.setBounds(10, 46, 197, 20);
		panel.add(lblDigiteONome_1);
		
		textPane_1 = new JTextPane();
		textPane_1.setBounds(217, 46, 126, 20);
		panel.add(textPane_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 122, 1000, 600);
		textArea.setEditable(false);
		textArea.setText(txt);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
                //textArea.setBackground(Color.black);
		panel.add(textArea);
		
                
		JButton btnAdd = new JButton("Add");
		btnAdd.setVisible(true);
		btnAdd.setBounds(10, 81, 70, 20);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(objCriado.equals("Planet")){
					try {
						nebulosa.addPlanet(textPane.getText(), textPane_1.getText());
						JOptionPane.showMessageDialog(null, "Criação concluida");
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Não foi possivel criar o planet");
					}
				}
				if(objCriado.equals("Meteor")){
					try {
						nebulosa.addMeteor(textPane.getText(), textPane_1.getText());
						JOptionPane.showMessageDialog(null, "Criação concluida");
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Não foi possivel criar o Meteor");
					}
				}
				if(objCriado.equals("Black Hole")){
					try {
						nebulosa.addBlackHole(textPane.getText(), textPane_1.getText());
						JOptionPane.showMessageDialog(null, "Criação concluida");
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Não foi possivel criar a Black Hole");
					}
				}
				if(objCriado.equals("Star")){
					try {
						nebulosa.addStar(textPane.getText(), textPane_1.getText());
						JOptionPane.showMessageDialog(null, "Criação concluida");
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Não foi possivel criar a Star");
					}
				}
				if(objCriado.equals("Galaxy")){
					try {
						nebulosa.addGalaxy(textPane.getText(), textPane_1.getText());
						JOptionPane.showMessageDialog(null, "Criação concluida");
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Não foi possivel criar a Galaxy");
					}
				}
			}
		});
		panel.add(btnAdd);
		JRootPane meurootpane = getRootPane();
		meurootpane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "ESCAPE");
		meurootpane.getRootPane().getActionMap().put("ESCAPE", new AbstractAction("ESCAPE") {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);			
			}
		});
	}
}
