

//Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
//  используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки. Если значение null,
// то параметр не должен попадать в запрос.

// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HomeTask_2 {
    public static void main(String[] args) {
    //     String strDir = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
    //     StringBuilder string = new StringBuilder();
    //     String str = strDir.replace("{","").replace("}", "").replace("/", "strDir");
    //     String[] arr = str.split(",");
           
    //     for (int j = 0; j < arr.length; j++) {
    //         if (!(arr[j].contains("null"))){
    //             String[] arr3 =arr[j].split(":");
    //                 string.append(arr3[0].replace("\"",""));
    //                 string.append(" = " + arr3[1] + " and ");
    //         }
    //     }
    //     string.setLength(string.length()-4);
    //     System.out.println("select * from students where" +" "+ string);
    calc();
    }
  

// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите
//  в лог-файл.
        
    // public static void bubble_sort() {
    //     int[] arr = {13, 5, 38, 21, 7, 44, 1, 11, 99 };
    //     int n = arr.length;
    
    //     try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt"))) {
    //         for (int i = 0; i < n - 1; i++) {
    //             for (int j = 0; j < n - i - 1; j++) {
    //                 if (arr[j] > arr[j + 1]) {
    //                     int temp = arr[j];
    //                     arr[j] = arr[j + 1];
    //                     arr[j + 1] = temp;
    //                 }
    //             }
                   
    //             writer.write("Iteration " + (i + 1) + ": ");
    //             for (int k = 0; k < n; k++) {
    //                 writer.write(arr[k] + " ");
    //             }
    //             writer.newLine();
    //         }
    //     } catch (IOException e) {
    //         System.out.println("Error.");
    //         e.printStackTrace();
    //     }
    
    //     System.out.println("Sorted array:");
    //     for (int i = 0; i < n; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    // }

public static void calc() {
    Scanner in = new Scanner(System.in);
    System.out.print("Введите первое число: ");
    int a = in.nextInt();
    System.out.print("Введите второе число: ");
    int b = in.nextInt();
    System.out.print("Введите операцию + - / *: ");
    char operation = in.next().charAt(0);
    int res = 0;
    
    switch (operation) {
        case '+':
            res = a + b;
            System.out.printf("%d + %d = %d\n", a, b, res);
            break;
        case '-':
            res = a - b;
            System.out.printf("%d - %d = %d\n", a, b, res);
            break;
        case '/':
            res = a / b;
            System.out.printf("%d / %d = %d\n", a, b, res);
            break;
        case '*':
            res = a * b;
            System.out.printf("%d * %d = %d\n", a, b, res);
            break;

    }
    in.close();

    try (BufferedWriter writer = new BufferedWriter(new FileWriter("calc_log.txt"))) {
        writer.write(a + " " + operation + " " + b + " = " + res);
        writer.close();
    } catch (IOException e) {
        System.out.println("Error.");
        e.printStackTrace();
    }
}
}    
  