/*Дан массив nums = [3,2,2,3] и число val = 3. 
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему. */
package Task_3;

public class Program {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3,1,2,77,33,3,8,5,3,1,3,4,6};
        int val = 2;
        int if_count = 0;
        int else_count = 0;
        int[] new_arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val){
                new_arr[nums.length - 1 - if_count] = nums[i];
                if_count++;
            }
            else {
                new_arr[else_count] = nums[i];
                else_count++;
            }
        }
        for (int i = 0; i < new_arr.length; i++) {
            System.out.print(new_arr[i]);
        }
    }
}