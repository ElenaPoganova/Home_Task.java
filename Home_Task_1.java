
// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class Home_Task_1 {
    
    public static void main(String[] args) {
        // try (Scanner in = new Scanner(System.in)) {
        //     System.out.print("Введите число: ");
        //     int numb = in.nextInt();
        //     int s=0;
        //     int f=1;
        //     for (int i = 1; i <= numb; i++) {                
        //        s+=i;
        //        f*=i;
        //     }
        //     System.out.println("Треугольного число: " + s);
        //     System.out.println("Факториал числа: " + f);
        // }
        calc();
    }
    


// Вывести все простые числа от 1 до 1000

    // public static void prime_numbers() {
    //     for(int i = 2; i <= 1000; i++) {
    //         boolean prime = true;
    //         for(int j = 2; j < i; j++) {
    //             if(i % j == 0) {
    //                 prime = false;
    //                 break;
    //             }
    //         }
    //         if(prime) {
    //             System.out.print(i + " ");
    //         }
    //     }
    // }
    
  
// Реализовать простой калькулятор (пользователь вводит 2 числа и вводит операцию (+ - / *)



    public static void calc() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        System.out.println("Введите операцию + - / *: ");
        char operation = in.next().charAt(0);
        int res;
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
    }
}    