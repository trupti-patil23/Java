package designpattern.behavioural.iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		BookCollection bookCollection = new BookCollection();
		bookCollection.addBook("Harry Potter1");
		bookCollection.addBook("Harry Potter2");
		bookCollection.addBook("Harry Potter3");
		bookCollection.addBook("Harry Potter4");
		
		Iterator<String> itr = bookCollection.createIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
