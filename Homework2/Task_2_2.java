/*Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.*/

import java.io.IOException;
import java.util.Arrays;
//import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
//import java.util.logging.FileHandler.encoding=UTF-8;
//import java.util.logging.Handler;


public class Task_2_2 {
    public static void main(String[] args) throws SecurityException, IOException {
        int[] array = {11, 3, 14, 16, 7};
        boolean isSorted = false;
        int tmp;
        Logger logger = Logger.getLogger(Task_2_2.class.getName()); 
        //ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("Homework2/log.txt");  
        fh.setEncoding("UTF-8");      
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.addHandler(fh);
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;
                    tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                }
            }
            logger.info("Next sort iteration");
        }
        logger.info("Sorting completed");
        System.out.println(Arrays.toString(array));
    }
}
