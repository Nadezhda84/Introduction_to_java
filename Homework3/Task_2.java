/*Пусть дан произвольный список целых чисел, удалить из него чётные числа */
package Homework3;

import java.util.ArrayList;

public class Task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(14);
        numbers.add(82);
        numbers.add(26);
        numbers.add(13);
        numbers.add(5);
        numbers.add(2);
        numbers.add(33);
        numbers.add(54);
        System.out.println("Список чисел: " + numbers);
        numbers.removeIf(n -> n % 2 == 0);
        System.out.println("Список без четных чисел: " + numbers);
    }
}
