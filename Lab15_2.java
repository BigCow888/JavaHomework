import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.net.*;
public class Lab15_2 extends JFrame{
	Image img;
	JButton button=new JButton();
	JPanel panel=new JPanel();
	public Lab15_2()
	{
		URL imgUrl=Lab15_2.class.getResource("flower.jpg");
		img=Toolkit.getDefaultToolkit().getImage(imgUrl);
		this.setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		panel.add(button);
		button.setBounds(0,0,100,100);
		button.setText("旋转");
		panel.setBounds(150,300,100,100);
		
		add(panel);
		add(new CanvasPanel());
		
		this.setTitle("图片旋转");
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Lab15_2().setVisible(true);
	}
	
	class CanvasPanel extends Canvas{
		public void paint(Graphics g)
		{
			super.paint(g);
			Graphics2D g2=(Graphics2D) g;
			g2.drawImage(img, 0, 0, 400,300,this);
		}
	}
}
