/* Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объём ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.*/

package Homework6;

import java.util.List;
import java.util.Set;
import java.util.Map;
import java.lang.Exception;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try {

            PropertyInitializer ptInitializer = new PropertyInitializer();
            ptInitializer.Init();

            ProductRegistry productRegistry = new ProductRegistry(ptInitializer);

            Set<Notebook> notebooks = productRegistry.BuildNonebooks();
            for (Notebook nb : notebooks) {
                System.out.println(nb);
            }
            System.out.println();

            InputData inputData = new InputData(ptInitializer);
            Map<PropertyEnum, Object> critarians = inputData.RequestCriteria();

            System.out.println();
            if (critarians.size() != 0) {

                List<Notebook> result = Filter(notebooks, critarians);
                if (result.size() > 0)
                    for (Notebook nb : result) {
                        System.out.println(nb);
                    }
                else
                    System.out.println("Поиск не дал результатов.");

            } else
                System.out.println("Вы не задали критерий поиска.");
            System.out.println();

        } catch (Exception e) {

        }

    }

    private static List<Notebook> Filter(Set<Notebook> notebooks, Map<PropertyEnum, Object> critarians) {

        return notebooks.stream().filter(x -> Check(x, critarians)).collect(Collectors.toList());
    }

    private static Boolean Check(Notebook notebook, Map<PropertyEnum, Object> critarians) {
        Boolean result = true;

        for (Map.Entry<PropertyEnum, Object> item : critarians.entrySet()) {
            PropertyVisitor visitor = new PropertyVisitor(item.getValue());
            if (notebook.properties.containsKey(item.getKey())) {
                notebook.properties.get(item.getKey()).Accept(visitor);
                result &= visitor.result;
            }
        }
        return result;
    }

}
