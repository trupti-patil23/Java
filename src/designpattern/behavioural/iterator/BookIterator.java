package designpattern.behavioural.iterator;

import java.util.List;

public class BookIterator implements Iterator<String> {
	List<String> bookList ;
	private int index = 0;

		
	public BookIterator(List<String> bookList) {
		super();
		this.bookList = bookList;
	}

	@Override
	public boolean hasNext() {
		if (index < bookList.size())
			return true;
		else
			return false;
	}

	@Override
	public String next() {		
		if (hasNext()) {			
			return bookList.get(index++);
		}
		return null;
	}
}
