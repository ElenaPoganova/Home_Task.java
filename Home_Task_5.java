// 1) Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь
// несколько телефонов. Написать программу, которая найдёт и выведет повторяющиеся имена с количеством
// повторений. Отсортировать по убыванию популярности.
import java.util.HashMap;
// import java.util.Map;
// import java.util.TreeMap;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.LinkedList;

public class Home_Task_5 {
    
    public static void main(String[] args) {
//         HashMap<Integer, String> phoneBook = new HashMap<>();
//         phoneBook.putIfAbsent(1111111,"Иванов");
//         phoneBook.putIfAbsent(2222222,"Иванов");
//         phoneBook.putIfAbsent(3333333, "Петров");
//         phoneBook.putIfAbsent(4444444, "Сидоров");
//         phoneBook.putIfAbsent(5555555, "Сидоров");

//         System.out.println(phoneBook);

        
//         new HashMap<String, Integer>().entrySet().stream()
//             .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
//             .forEach(k -> System.out.println(k.getKey() + ":" + k.getValue()));

//     }
//     public static HashMap<String, Integer> get(HashMap<Integer, String> phoneBook){
//         var result = new HashMap<String, Integer>();
//         for (var item : phoneBook.entrySet()) {
//             if (result.containsKey(item.getValue())) {
//                 var key = item.getValue();
//                 var value = result.get(item.getValue());
//                 result.replace(key, value + 1);
//             } else {
//                 result.put(item.getValue(), 1);
//             }
//         }
//         return result;
        
//     }
//     System.out.println(result);
// } 

// Реализовать алгоритм пирамидальной сортировки (HeapSort)

// int[] array = new int[] { 1, 46, 12, 2, 9, 0, 7 };
// System.out.println("исходный массив:");
// for (int i : array)
//     System.out.print(i + "; ");
// piramidSort(array);
// System.out.println("\n отсортированный массив:");
// for (int i : array)
//     System.out.print(i + "; ");

// public static int[] piramidSort(int[] array) {
// int top = array.length - 1;
// do {
//     for (int i = top; i > 0; i--) {
//      
//         int parent;
//         if ((i & 1) > 0)
//             parent = (i + 1) / 2 - 1;
//         else
//             parent = i / 2 - 1;
//         if (array[i] < array[parent])
//             continue;
//         int temp = array[parent];
//         array[parent] = array[i];
//         array[i] = temp;
//     int temp = array[0];
//     array[0] = array[top];
//     array[top] = temp;
//     top--;
//  
// } while (top > 0);
// return array;
// }
// }     
  



