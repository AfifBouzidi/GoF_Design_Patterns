package com.abouzidi.gof;

public interface Aggregate<T> {

	public Iterator<T> createIterator();

}
