import javax.swing.*;
public class swingbuttn1
{
	swingbuttn1()
	{
		JFrame f=new JFrame("Button Example");
		JButton b=new JButton(new ImageIcon("D:\\icon.png"));
		b.setBounds(100,100,150,40);
		f.add(b);
		f.setSize(600,600);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public static void main(String args[])
	{
		new swingbuttn1();
	}
}
