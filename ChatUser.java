package chat;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class ChatUser implements ActionListener{
	
	private JTextArea tx;
	private JFrame frame;
	private JPanel main;
	private JPanel top;
	private JPanel cn ;
	private JPanel  bottom;
	private JButton bt;
	private String name, message;
    private JTextField tf;
    ChatApplication app;
	public ChatUser(String string, ChatApplication app) {
		this.app = app;
		this.name=string;
		this.tx=new JTextArea();
		this.frame = new JFrame("Group Chat");
		this.main =new JPanel();
		this.top =new JPanel();
		this.cn =new JPanel();
		this.bottom =new JPanel();
		this.bt=new JButton("Send");
		this.tf=new JTextField();
	  
		
		
		main.setLayout(new BorderLayout(5,5));
		top.setLayout(new GridLayout(1,0,5,5));   
	    cn.setLayout(new BorderLayout(5,5));
	    bottom.setLayout(new BorderLayout(5,5));
	    top.add(new JLabel("Your username: "+name ));
	    cn.add(new JScrollPane(tx), BorderLayout.CENTER);
	    tx.setEditable(false);
	    bottom.add(tf, BorderLayout.CENTER); 
	    bottom.add(bt, BorderLayout.EAST);
	    main.add(top, BorderLayout.NORTH);
	    main.add(cn, BorderLayout.CENTER); 
	    main.add(bottom, BorderLayout.SOUTH);
	    main.setBorder(new EmptyBorder(10, 10, 10, 10) );
	    bt.addActionListener(this);
	    frame.setContentPane(main);
	    frame.setSize(800, 600);
		frame.setVisible(true);
	}
	public void sendText() {
		message=tf.getText();
		message=name+": "+ message;
		//
		this.app.writeMessage(message);
		System.out.println(message);
		tf.setText("");
		 
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource().equals(bt))
			sendText(); 
	}
	public void display(String message2) { 
		// TODO Auto-generated method stub
		tx.setText(tx.getText()+ "\n"+ message2);
	}
}





