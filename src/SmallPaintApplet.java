
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
public class SmallPaintApplet extends Applet implements ItemListener {
	JComboBox cb;
	JPanel pan;
	int select=0;
	public void init(){
		String str[]={"Line","Circle","Rectangle"};
		cb=new JComboBox(str);
		cb.addItemListener(this);
		pan=new JPanel();
		pan.add(cb);
		
		this.add(pan);
		
	}
	public void paint(Graphics g){
		int i1,i2;
		i1=i2=(int)(Math.random()*100);
		  g.drawOval(i1,i2,10,10);
	}
	public void itemStateChanged(ItemEvent e) {
		if(cb.getSelectedItem().equals("Circle"))
		  repaint();
	}
}

