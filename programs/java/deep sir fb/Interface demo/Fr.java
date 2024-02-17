import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;


public class Fr {
public static void main(String[] args) {
	JFrame f=new JFrame();
	f.setSize(600,600);
	JInternalFrame i=new JInternalFrame();
	i.setSize(500,500);
	i.setVisible(true);
	f.add(i);
	f.setVisible(true);
	
}
}
