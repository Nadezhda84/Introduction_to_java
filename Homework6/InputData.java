package Homework6;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class InputData {

    private int exit = 100;
    private PropertyInitializer ptInitializer;

    InputData(PropertyInitializer ptInitializer) {
        this.ptInitializer = ptInitializer;
    }

    public Map<PropertyEnum, Object> RequestCriteria() {

        Map<PropertyEnum, Object> criterians = new Hashtable<>();
        Scanner iScanner = new Scanner(System.in);

        try {
            int index = -1;
            System.out.println("Выберите действие:");
            System.out.println();
            while (index != exit) {
                for (Map.Entry<PropertyEnum, String> pt : ptInitializer.properties.entrySet()) {
                    System.out.println(String.format("%s - %s. ", pt.getKey().ordinal(), pt.getValue()));
                }
                System.out.println("100 - Начать поиск. ");
                index = iScanner.nextInt();
                iScanner.nextLine();
                if (index != exit) {
                    try {
                        PropertyEnum property = PropertyEnum.values()[index];
                        GetPropertyValue(iScanner, criterians, property);
                    } catch (Exception e) {
                        System.out.println("Вы ввели не верный код опперации.");
                    }
                }
            }
        } finally {
            iScanner.close();
        }

        return criterians;
    }

    private void GetPropertyValue(Scanner iScanner, Map<PropertyEnum, Object> criterians, PropertyEnum property)
            throws Exception {

        Object value = null;
        switch (ptInitializer.propertyTypes.get(property)) {
            case String:
                System.out.print("Введите критерий поиска: ");
                value = iScanner.nextLine();
                break;
            case Double:
                System.out.print("Введите критерий поиска: ");
                value = iScanner.nextDouble();
                iScanner.nextLine();
                break;
            default:
                throw new Exception("Не верный тип свойства.");
        }

        criterians.put(property, value);

    }

}
