/*Реализовать простой калькулятор */

import java.util.Scanner;
public class Task_3 {

    public static void main(String[] args) {
        try{
            Scanner iScanner = new Scanner(System.in);
            System.out.printf("Введите первое число: ");
            int num1 = iScanner.nextInt();
            iScanner.nextLine();
            System.out.printf("Введите операцию: ");
            String oper = iScanner.nextLine();
            System.out.printf("Введите второе число: ");
            int num2 = iScanner.nextInt();
            Object result = calc(num1, num2, oper);
            System.out.println("Результат операции: "+result);
            iScanner.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    static int sum(int num1, int num2){
        return num1 + num2;
    }

    static int diff(int num1, int num2){
        return num1 - num2;
    }

    static int mult(int num1, int num2){
        return num1 * num2;
    }

    static double div(int num1, int num2){
        if (num2 == 0)
            throw new ArithmeticException("Деление на ноль невозможно!");
        else{
            double a = (double)num1;
            //double b = (double)num2;
            return a / num2;
        }
    }

    static int pow(int num1, int num2){
        int res = 1;
        for (int i = 1; i <= num2; i++){
            res *=  num1;
        }
        return res;
    }

    static Object calc(int a, int b, String oper){
        switch(oper){
            case "+": return sum(a,  b);
            case "-": return diff(a, b);
            case "*": return mult(a, b);
            case "/": return div(a, b);
            case "^": return pow(a, b);    
            default:
                throw new RuntimeException("Недопустимая операция: " + oper);
        }     
    }   
}