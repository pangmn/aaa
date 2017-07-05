import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JButtonAndJMenu extends JFrame implements ItemListener,ActionListener,MouseListener{

	JCheckBox cb;
	JRadioButton rb1,rb2;
	JTextArea ta;
	JMenuItem mi1,mi2;
	JPopupMenu popM;
	
	public JButtonAndJMenu(){
		 super("问卷调查");
	     this.setSize(200,400);                                //设置框架尺寸
	     this.setBackground(java.awt.Color.lightGray);         //设置框架背景颜色
	     this.setLocation(300,240);                            //框架显示在屏幕的位置
	     this.setDefaultCloseOperation(EXIT_ON_CLOSE);         //单击窗口关闭按钮时，结束程序运行
	        
	     Container c = this.getContentPane();     //返回JFrame的内容窗格
	     c.setLayout(new GridLayout(6,1));
	     c.add(new JLabel("Your interests are:"));
	     
	     String inst[] = {"Swimming","Basketball","Singing"};
	     for(int i=0;i<inst.length;i++){
	    	 cb=new JCheckBox(inst[i]);
	    	 cb.addItemListener(this);
	    	 c.add(cb); 
	     }
	     
	     JPanel p=new JPanel();
	     c.add(p);
	     p.add(new JLabel("Gender:"));
	     ButtonGroup bg=new ButtonGroup();
	     rb1=new JRadioButton("Male");
	     rb1.addItemListener(this);
	     bg.add(rb1);
	     p.add(rb1);
	     rb2=new JRadioButton("Female");
	     rb2.addItemListener(this);
	     bg.add(rb2);
	     p.add(rb2);
	     
	     ta=new JTextArea();
	     ta.addMouseListener(this);
	     c.add(ta);
	     
	     JMenuBar mb=new JMenuBar();
	     this.setJMenuBar(mb);
	     JMenu m1=new JMenu("File");
	     mb.add(m1);
	     JMenu m2=new JMenu("Help");
	     mb.add(m2);
	     mi1=new JMenuItem("Save");
	     mi1.addActionListener(this);
	     mi2=new JMenuItem("Exit");
	     mi2.addActionListener(this);
	     m1.add(mi1);
	     m1.add(mi2);
	     
	     popM = new JPopupMenu();
	     String popstr[]={"剪切","复制","粘贴"};
	     JMenuItem popmenuitem[]=new JMenuItem[popstr.length];
	     for(int i=0;i<popmenuitem.length;i++){
	    	 popmenuitem[i]=new JMenuItem(popstr[i]);
	    	 this.popM.add(popmenuitem[i]);
	    	 popmenuitem[i].addActionListener(this);
	     }
	     popmenuitem[0].setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,InputEvent.CTRL_MASK));
	     ta.add(popM);
	     this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==mi1){
			JFileChooser fc=new JFileChooser();
			fc.showSaveDialog(this);
		}
		if(e.getSource()==mi2){
			int i = JOptionPane.showConfirmDialog(this,"Do you want to exit?");
			if(i==0)
				System.exit(0);
		}
		if(e.getActionCommand().equals("剪切"))
			ta.cut();
		if(e.getActionCommand().equals("复制"))
			ta.copy();
		if(e.getActionCommand().equals("粘贴"))
			ta.paste();
			
	}
	
	public void itemStateChanged(ItemEvent e){
		if(e.getSource()==cb){
			ta.setText(cb.getText()+"\n");
		}
		if(e.getSource()==rb1){
			ta.setText(rb1.getText()+"\n");
		}
		if(e.getSource()==rb2){
			ta.setText(rb2.getText()+"\n");
		}
	}
	/*public void actionPerformed(ActionEvent e){
		
	}*/
	public static void main(String[] args) {
		new JButtonAndJMenu();

	}

	public void mouseClicked(MouseEvent e) {
		if(e.getButton()==3)
			popM.show(this.ta,e.getX(),e.getY());
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
