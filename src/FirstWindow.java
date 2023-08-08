import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstWindow extends JFrame {

	private JPanel contentPane;
	private JTextField tfa;
	private JTextField tfb;
	private JTextField tfres;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstWindow frame = new FirstWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FirstWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("Calculator");
		heading.setForeground(new Color(255, 0, 0));
		heading.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 30));
		heading.setBackground(new Color(0, 255, 0));
		heading.setBounds(128, 0, 170, 38);
		contentPane.add(heading);
		
		JLabel labela = new JLabel("A");
		labela.setForeground(new Color(255, 0, 0));
		labela.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 26));
		labela.setBounds(117, 54, 20, 33);
		contentPane.add(labela);
		
		tfa = new JTextField();
		tfa.setBounds(161, 54, 118, 33);
		contentPane.add(tfa);
		tfa.setColumns(10);
		
		JLabel labelb = new JLabel("B");
		labelb.setForeground(Color.RED);
		labelb.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 26));
		labelb.setBounds(117, 98, 20, 33);
		contentPane.add(labelb);
		
		tfb = new JTextField();
		tfb.setColumns(10);
		tfb.setBounds(161, 98, 118, 33);
		contentPane.add(tfb);
		
		JLabel labelres = new JLabel("Result");
		labelres.setForeground(Color.RED);
		labelres.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 26));
		labelres.setBounds(44, 142, 93, 33);
		contentPane.add(labelres);
		
		tfres = new JTextField();
		tfres.setColumns(10);
		tfres.setBounds(161, 142, 118, 33);
		contentPane.add(tfres);
		
		JButton sub = new JButton("SUB");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to sub
				 String data1=tfa.getText();
			       String data2=tfb.getText();
			       int var1=Integer.parseInt(data1);
			       int var2=Integer.parseInt(data2);
			       int res=var1-var2;
			       String ressult=String.valueOf(res);
			       tfres.setText(ressult);
				
			}
		});
		sub.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 22));
		sub.setForeground(new Color(0, 0, 255));
		sub.setBackground(new Color(255, 255, 255));
		sub.setBounds(87, 215, 85, 37);
		contentPane.add(sub);
		
		JButton mul = new JButton("MUL");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to mul
				 String data1=tfa.getText();
			       String data2=tfb.getText();
			       int var1=Integer.parseInt(data1);
			       int var2=Integer.parseInt(data2);
			       int res=var1*var2;
			       String ressult=String.valueOf(res);
			       tfres.setText(ressult);
			}
		});
		mul.setForeground(new Color(255, 128, 0));
		mul.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 22));
		mul.setBackground(Color.WHITE);
		mul.setBounds(172, 215, 85, 37);
		contentPane.add(mul);
		
		JButton div = new JButton("DIV");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to div
				 String data1=tfa.getText();
			       String data2=tfb.getText();
			       float var1=Float.parseFloat(data1);
			       float var2=Float.parseFloat(data2);
			       float res=var1/var2;
			       String ressult=String.valueOf(res);
			       tfres.setText(ressult);
			}
		});
		div.setForeground(new Color(255, 0, 128));
		div.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 22));
		div.setBackground(Color.WHITE);
		div.setBounds(256, 215, 85, 37);
		contentPane.add(div);
		
		JButton rem = new JButton("REM");
		rem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to rem
				 String data1=tfa.getText();
			       String data2=tfb.getText();
			       float var1=Float.parseFloat(data1);
			       float var2=Float.parseFloat(data2);
			       float res=var1%var2;
			       String ressult=String.valueOf(res);
			       tfres.setText(ressult);
			}
		});
		rem.setForeground(new Color(64, 128, 128));
		rem.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 22));
		rem.setBackground(Color.WHITE);
		rem.setBounds(341, 215, 85, 37);
		contentPane.add(rem);
		
		JButton add = new JButton("ADD");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                 //logic to add
		       String data1=tfa.getText();
		       String data2=tfb.getText();
		       int var1=Integer.parseInt(data1);
		       int var2=Integer.parseInt(data2);
		       int res=var1+var2;
		       String ressult=String.valueOf(res);
		       tfres.setText(ressult);
			}
		});
		add.setForeground(Color.RED);
		add.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 22));
		add.setBackground(Color.WHITE);
		add.setBounds(0, 215, 85, 37);
		contentPane.add(add);
	}
}
