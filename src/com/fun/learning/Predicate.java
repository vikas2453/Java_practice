package com.fun.learning;

@FunctionalInterface
public interface Predicate<T> {
	public boolean test(T t);
	
	public default Predicate<T> and(Predicate<T> other){
		return s->this.test(s) && other.test(s);
		
	}

	public static<U> Predicate<U> isEquals(U string) {
		
		return u->u.equals(string);
	}

}
