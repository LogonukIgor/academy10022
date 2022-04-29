package by.academy.homework.hw4.task3;

import java.util.Arrays;

public class CustomCollection<T> {

	private T[] array;

	public CustomCollection(T[] array) {
		this.array = array;
	}

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}
	
	public CustomIterator getIterator() {
		return new ArrayIterator();
	}

	private class ArrayIterator implements CustomIterator {
		
		int index;

		@Override
		public boolean hasNext() {
			if(index<array.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			return array[index++];
		}

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CustomCollection [array=");
		builder.append(Arrays.toString(array));
		builder.append("]");
		return builder.toString();
	}

}
