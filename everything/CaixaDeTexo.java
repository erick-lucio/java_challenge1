package everything;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.JButton;
import javax.swing.JScrollBar;

public class CaixaDeTexo extends JFrame {

	private JPanel contentPane;

	public CaixaDeTexo(String txt) {
            
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		JTextArea textArea = new JTextArea();
		textArea.setBounds(5, 48, 572, 694);
                //textArea.setBackground(Color.black);
		setSize(613,694);
		textArea.setText(txt);
		Font f = new Font("Verdana", Font.PLAIN, 12);
		contentPane.setLayout(null);
		textArea.setLineWrap(true);
		textArea.setFont(f);
		textArea.setEditable(false);
		contentPane.add(textArea);
		
		
		JScrollPane scroll = new JScrollPane(textArea);
		add(scroll);
		JRootPane meurootpane = getRootPane();
		meurootpane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "ESCAPE");
		meurootpane.getRootPane().getActionMap().put("ESCAPE", new AbstractAction("ESCAPE") {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);			
			}
		});
	}
}
