package by.academy.classwork.test.task1;

import java.util.Arrays;
import java.util.Random;

public class ExamDemo {

	public static void main(String[] args) {

		Random random = new Random();
		Integer numMarks = random.nextInt(11);

		Integer[] array2 = new Integer[numMarks];
		
		for(int i = 0;i<array2.length;i++) {
			array2[i] = random.nextInt(11);
		}

		Exam<Integer> exam = new Exam<>(array2);
		System.out.println(Arrays.toString(array2));
		
		exam.add(7);
		
		System.out.println(Arrays.toString(exam.getMark()));
		System.out.println(exam.calcFinalMark());
	}

}
