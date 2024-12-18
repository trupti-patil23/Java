package designpattern.behavioural.observer;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		// Create a YouTube channel
		YoutubeChannel channel = new YoutubeChannel("@Riaan_littlePrince");

		// Create subscribers
		Subscriber user1 = new User("Trupti");
		Subscriber user2 = new User("Shree");
		Subscriber user3 = new User("Nihal");
		
		//Subscribe to Channel
		channel.subscribe(user1);
		channel.subscribe(user2);
		channel.subscribe(user3);

		// Upload a video
		channel.uploadVideo("Riaan's trip to Disney");

		// Unsubscribe a user
		channel.unsubscribe(user2);

		// Upload another video
		channel.uploadVideo("Riaan's Manga Characters Drawings");
	}

}
