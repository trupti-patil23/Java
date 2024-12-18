package designpattern.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Channel {
	String channelName;
	String videoTitle;
	List<Subscriber> subscribersList = new ArrayList<>();

	public YoutubeChannel(String channelName) {
		super();
		this.channelName = channelName;
	}

	@Override
	public void subscribe(Subscriber subscriber) {
		subscribersList.add(subscriber);
	}

	@Override
	public void unsubscribe(Subscriber subscriber) {
		subscribersList.remove(subscriber);
	}

	@Override
	public void NotifySubscribers() {
		for (Subscriber subscriber : subscribersList) {
			subscriber.update(this.channelName, this.videoTitle);
		}
	}

	@Override
	public void uploadVideo(String videoTitle) {
		this.videoTitle = videoTitle;
		System.out.println(channelName + " uploaded a new video: " + videoTitle);
		NotifySubscribers();
	}

}
