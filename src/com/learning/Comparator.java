package com.learning;

import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> {	
	public int compare(T t1, T t2);
	
	static <U>Comparator<U> comparing(Function<U, Comparable> f){
		return (c1, c2)->f.apply(c1).compareTo(f.apply(c2));		
	}
	
	public default Comparator<T> thenComparing(Function<T, Comparable> f){
		return thenComparing(comparing(f));
		
	}

	public default Comparator<T> thenComparing(Comparator<T> comp){
		return (c1, c2)-> compare(c1, c2)==0?comp.compare(c1, c2):compare(c1, c2);
		
	}
}
