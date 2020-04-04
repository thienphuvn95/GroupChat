package chat;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to groupchat");
		ChatApplication app = new ChatApplication();
		//app.addChatter(new ChatUser("Kim", app));
		//app.addChatter(new ChatUser("Jay", app));
		ChatUser u1 = new ChatUser("Jay", app);
		ChatUser u2 = new ChatUser("John", app);
		ChatUser u3 = new ChatUser("John2", app);
		
		app.addChatter(u1);
		app.addChatter(u2);
		app.addChatter(u3);
		//u.addChatter(new ChatFrame("Jay"));
		//u.addChatter(new ChatFrame("lee"));
	}
}