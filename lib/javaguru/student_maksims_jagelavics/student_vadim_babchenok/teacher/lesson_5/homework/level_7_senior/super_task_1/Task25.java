package com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.lesson_5.homework.level_7_senior.super_task_1;

public class Task25 {

	public static void main(String[] args) {
		ArrayUtil arrayUtil = new ArrayUtil();
		int arrayLength = arrayUtil.getArrayLengthFromUser();
		int [] array =  arrayUtil.newArray(arrayLength);
		arrayUtil.fillArray(array);
		arrayUtil.printArray(array);
	}

}
