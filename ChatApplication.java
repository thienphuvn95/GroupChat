package chat;

import java.util.ArrayList;
import java.util.List;

public class ChatApplication implements Message{
	private List<ChatUser> group_users;
	private String message;
	
	public ChatApplication() {
		this.group_users = new ArrayList<ChatUser>(); 
	}
	
	public void addChatter(ChatUser user) {
		// TODO Auto-generated method stub
		this.group_users.add(user);
	}
	@Override
	public String getMessage() {	
		// TODO Auto-generated method stub
		return message;
	}
	@Override
	public void writeMessage(String mess) { 
		// TODO Auto-generated method stub
		this.message=mess; 
		sendMess();
	}
	public void sendMess() {
		
		for(int i=0;i<group_users.size();i++)
		group_users.get(i).display(getMessage()); 
	}
}
	
