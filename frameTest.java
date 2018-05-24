import javax.swing.*;
import java.awt.*;

import java.awt.event.*;


public class FrameTest {

	public static void main (String[] args) {

	JFrame f;
	JPanel p;
	JButton b;
	JLabel l;

			f = new JFrame("Java Frames");
			f.setVisible(true);
			f.setSize(500, 500);
			f.setResizable(false);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			p = new JPanel();
			p.setBackground(Color.GRAY);

			b = new JButton("Click");
			l = new JLabel("Label");
			l.setForeground(Color.RED);

			l.setBounds(190, 200, 100, 30);
			p.add(l);
			b.setBounds(150, 250, 120, 35);
			p.add(b);


			p.setLayout(null);
			f.add(p);

			ActionListener listener = new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					p.setBackground(Color.BLUE);
					l.setForeground(Color.WHITE);
					b.setBounds(150, 50, 120, 35);
					}};
			b.addActionListener(listener);

	}
}
