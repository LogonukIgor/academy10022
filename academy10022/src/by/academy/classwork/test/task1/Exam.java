package by.academy.classwork.test.task1;

public class Exam<T extends Number> {

	private T[] mark;

	public Exam() {
		super();
	}

	public Exam(T[] mark) {
		super();
		this.mark = mark;
	}

	public double calcFinalMark() {
		Integer sum = 0;
		for (T a : mark) {
			sum += a.intValue();
		}
		double cped = (double) sum / mark.length;
		System.out.print("Средняя оценка: ");
		return cped;
	}

	public void add(T value) {
		T[] tempMark = (T[]) new Number[mark.length + 1];
		System.arraycopy(mark, 0, tempMark, 0, mark.length);
		mark = tempMark;
		mark[mark.length-1] = value;
	}

	public T[] getMark() {
		return mark;
	}

	public void setMark(T[] mark) {
		this.mark = mark;
	}
	
}
