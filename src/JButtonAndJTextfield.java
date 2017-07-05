
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JButtonAndJTextfield extends JFrame implements ActionListener,CaretListener {

	JPanel p;
	JTextField tf;
	JTextArea ta;
	int value;
	static int count=1;
	
	
	public static void main(String[] args) {
		new JButtonAndJTextfield();

	}

	public JButtonAndJTextfield() {
		super("¼ÆËãÆ÷");		
		this.setSize(200,300);
		this.setLocation(300,200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=this.getContentPane();
		//c.setLayout(new GridLayout(3,1));
		tf=new JTextField(30);
		c.add(tf,"North");
	    tf.addCaretListener(this);
	    
	    p=new JPanel(new GridLayout(3,2));
	    String str[]={"1","2","3","4","+","="};
	    for(int i=0;i<str.length;i++){
	    	JButton b=new JButton(str[i]);
	    	b.addActionListener(this);
	    	p.add(b);
	    }
	    c.add(p);
	    
	    ta=new JTextArea();
	    c.add(ta,"South");
	    this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		String current=e.getActionCommand();
		if(current=="1"||current=="2"||current=="3"||current=="4"){
			tf.setText(current);
			if(count==1)
			    value=Integer.parseInt(current);
			if(count>=2)
				value+=Integer.parseInt(tf.getText());
			
		}
		if(current=="+"){
			count++;
			
		}
		if(current=="="){
			tf.setText(String.valueOf(value));
			count=1;
		}
		
	}
	
    public void caretUpdate(CaretEvent ev){
    	ta.setText(tf.getText());
    }
}
