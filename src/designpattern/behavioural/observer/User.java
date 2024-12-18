package designpattern.behavioural.observer;


public class User implements Subscriber {
	String userName ;
	

	public User(String userName) {
		super();
		this.userName = userName;
	}

	@Override
	public void update(String channelName, String videoTitle) {
		  System.out.println("Hey " + userName + ", " + channelName + " just uploaded a new video: " + videoTitle);
		
	}

}
