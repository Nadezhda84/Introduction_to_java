/* Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.*/
package Homework3;

import java.util.ArrayList;
import java.util.Collections;

public class Task_3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(14);
        numbers.add(82);
        numbers.add(26);
        numbers.add(13);
        numbers.add(5);
        numbers.add(2);
        numbers.add(38);
        numbers.add(54);
        System.out.println(numbers);

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        int count = 0;
        double average = 0;
        for (int num : numbers) {
            count += num;
        }
        average = (double)count / numbers.size();
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое значение: " + average);
    }
}
