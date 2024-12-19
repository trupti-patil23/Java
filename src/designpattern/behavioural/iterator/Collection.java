package designpattern.behavioural.iterator;

public interface Collection<T> {
    Iterator<T> createIterator();
}