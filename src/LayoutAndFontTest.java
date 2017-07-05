import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;


public class LayoutAndFontTest extends Frame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new LayoutAndFontTest();

	}

	public LayoutAndFontTest()  {
		super("User Login");
		this.setSize(300,200);
		this.setLocation(300,240);
		this.setBackground(Color.gray);
		this.setLayout(new FlowLayout());
		//this.setLayout(new GridLayout(3, 2));
		this.add(new Label("UserID"));
		this.add(new TextField("user1"));
		this.add(new Label("Password"));
		this.add(new TextField("password"));
		this.add(new Button("OK"));
		this.add(new Button("Cancel"));
		
		/*this.setLayout(null);
		Label l1=new Label("UserID");
		l1.setSize(30,15);
		l1.setLocation(10,40);
		l1.setFont(new Font("Arial",Font.BOLD,12));
		l1.setForeground(Color.red);
		this.add(l1);
		TextField f1=new TextField("user1");
		f1.setBounds(50, 40, 50,15);
		this.add(f1);*/
		
		/*this.add(new Label("UserID"),BorderLayout.WEST);
		this.add(new TextField("user1"),"Center");
		this.add(new Label("Password"),BorderLayout.EAST);
		this.add(new TextField("password"),BorderLayout.NORTH);
		Panel p=new Panel();
		p.add(new Button("OK"));
		p.add(new Button("Cancel"));
		this.add(p,"South");*/
		
		this.setVisible(true);
		
		// TODO Auto-generated constructor stub
	}

}
