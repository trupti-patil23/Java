package designpattern.behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookCollection implements Collection<String> {
	List<String> bookList = new ArrayList<String>();

	@Override
	public Iterator<String> createIterator() {
		return new BookIterator(bookList);
	}

	public void addBook(String book) {
		bookList.add(book);
	}
}
