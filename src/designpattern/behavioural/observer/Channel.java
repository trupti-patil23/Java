package designpattern.behavioural.observer;

//This is Subject
public interface Channel {

	void subscribe(Subscriber subscriber);

	void unsubscribe(Subscriber subscriber);

	void NotifySubscribers();

	void uploadVideo(String videoTitle);

}
