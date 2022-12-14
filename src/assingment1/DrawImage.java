package assingment1;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawImage extends JPanel{
@Override
	public void paint(Graphics g){
		Toolkit t = Toolkit.getDefaultToolkit();
		Image i = t.getImage("img1.jpg");
		g.drawImage(i, 120,100,this);
	}
	
	public static void main(String[] a){
		DrawImage m = new DrawImage();
		JFrame f = new JFrame();
		f.add(m);
		f.setSize(700,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
