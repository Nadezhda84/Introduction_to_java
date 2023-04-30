/*Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти.
Если введено exit, завершаем программу
Пример:
java
python
c#
print > [c#, python, java]
revert
print > [python, java]
kotlin
print > [kotlin, python, java]
revert
revert
revert
print > []
revert > Ошибка!
exit -> (Программа завершилась) */
package Homework4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку (print - для вывода на печать,revert - для удаления предыдущей строки,exit - для завершения): ");
        LinkedList<String> list = new LinkedList<>();
        while (true) {
        String string = sc.nextLine();
        if (string.equals("exit")) {
            break;
        } else 
            if (string.equals("print")) {
                if(list.isEmpty()){
                    System.out.println("Список строк пуст!");
                } else {
                    System.out.println(list);
                }
            } else 
                if (string.equals("revert")) {
                    if(list.isEmpty()){
                        System.out.println("Список строк пуст!");
                    } else {
                        list.removeFirst();
                        if(list.isEmpty()){
                            System.out.println("Все строки удалены!");
                        } else {
                            System.out.println(list);
                        }
                    }
                } else {
                    list.addFirst(string);
                }
        }
        sc.close();
    }
}
