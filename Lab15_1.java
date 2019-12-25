import java.awt.*;
import javax.swing.*;
public class Lab15_1 extends JFrame{
	private final int WIDTH1=80;
	private final int HEIGHT1=80;
	public Lab15_1()
	{
		super();
		this.setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new DrawPanel());
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Lab15_1().setVisible(true);
	}
	class DrawPanel extends JPanel
	{
		public void paint(Graphics g)
		{
			super.paint(g);
			g.setColor(Color.black);
			g.drawOval(100, 50, WIDTH1,HEIGHT1);
			g.drawOval(60, 60, 150, 50);
			g.drawString("sun", 125, 90);
			g.setColor(Color.blue);
			g.drawString("★", 58, 90);
			
		}
	}

}
