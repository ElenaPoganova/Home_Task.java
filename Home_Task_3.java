import java.util.List;
import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;

public class Home_Task_3 {
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
    public static void main(String[] args) {
    //     ArrayList<Integer>list = new ArrayList<Integer>(); 
    //     Random rn = new Random();
    //     for (int i = 0; i < 10; i++){
    //         list.add(rn.nextInt(10));
    //     }
    //     System.out.println(list);
           
    //     int min = list.get(0);
    //     int max = list.get(0);
    //     int sum = 0;
        
    //     for (Integer i : list) {
    //         sum += i;
    //         if (i < min)
    //             min = i;
    //         if (i > max)
    //             max = i;
    //     }
    //     double avg = (double) sum / (double) list.size();
        
    //     System.out.println("Минимальное число: " + min);
    //     System.out.println("Максимальное число: " + max);
    //     System.out.println("Среднее арифметическое заданного списка: " + avg);
 
            
    // }   
    
    }
    // Пусть дан произвольный список целых чисел, удалить из него чётные числа
//     public static ArrayList<Integer> getRandomList() {
//         ArrayList<Integer>list = new ArrayList<Integer>(); 
//         Random rn = new Random();
//         for (int i = 0; i < 15; i++){
//             list.add(rn.nextInt(100));
//         }
//         System.out.println(list);
//         return list;
//     }    
         
    
//     public static ArrayList<Integer> deletEvenNum(ArrayList<Integer> list) {
//         Iterator<Integer> iterator = list.iterator();
//         while (iterator.hasNext()) {
//             if (iterator.next() % 2 == 0) iterator.remove();  
//             }  
        
//     System.out.println(list);
//     return list;
//     }
// }
       
// Реализовать алгоритм сортировки слиянием     
       
        public static int[] mergeSort(int[] array) {
                    
            int n = array.length;
            if (n <= 1)
                return array;
                
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, n / 2));
        int[] right = mergeSort(Arrays.copyOfRange(array, n / 2, n));
           
        return merge(left, right);
    }
    
       
    private static int[] merge(int[] left, int[] right) {
    
        int n1 = left.length;
        int n2 = right.length;
        int nResult = n1 + n2;
        int i1 = 0;
        int i2 = 0;
        int[] arrayResult = new int[nResult];
           
        for (int i = 0; i < nResult; i++) {             
            if (i1 == n1) {
                arrayResult[i] = right[i2++];                    
            } else if (i2 == n2) {
                arrayResult[i] = left[i1++];
            } else {                  
                if (left[i1] < right[i2]) {
                    arrayResult[i] = left[i1++];
                } else {
                    arrayResult[i] = right[i2++];
                }
            }
        }
            return arrayResult;
    }   
          
        public static int getRandom(int[] array){
            int rnd = new Random().nextInt(10);
            return array[rnd];
          
        System.out.println("Исходный массив: " + Arrays.toString(array));
        
        }
        array = Home_Task_3.mergeSort(array);
        System.out.println("Результивный массив: " + java.util.Arrays.toString(array));
    }
}

