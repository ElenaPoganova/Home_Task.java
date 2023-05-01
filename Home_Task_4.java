
    // Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый»
    //  список    
    import java.util.LinkedList;
    

public class Home_Task_4 {    

    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(1); intList.add(2); intList.add(3); intList.add(4);
        intList.add(5); intList.add(6); intList.add(7);
        System.out.println("Задан список: " + intList);
        intList = invertedList(intList);
        System.out.println("Перевернутый список: " + intList);
    }
    static LinkedList<Integer> invertedList(LinkedList<Integer> list){
        LinkedList<Integer> newList = new LinkedList<>();
            while (!list.isEmpty()){
            newList.add(list.removeLast());
        }
        return newList;
    }
}    



    // Реализуйте очередь с помощью LinkedList со следующими методами:
    // • enqueue() — помещает элемент в конец очереди,
    // • dequeue() — возвращает первый элемент из очереди и удаляет его,
    // • first() — возвращает первый элемент из очереди, не удаляя.
    
    
//     int[] list = { 1, 2, 3, 4, 5, 6, 7 };
//     LinkedList<Integer> linkList = new LinkedList<>();
//     for (Integer temp : list) {
//         linkList.add(temp);
//     }
//     System.out.println("Задан список: " + linkList);
//     enqueue(linkList, 8);
//     System.out.println("Помещает элемент в конец очереди: " + linkList);
//     int element = dequeue(linkList);
//     System.out.println("Возвращает первый элемент: " + element);
//     System.out.println("И удаляет его из очереди: " + linkList);
//     int element1 = first(linkList);
//     System.out.println("Возвращает первый элемент: " + element1);
//     System.out.println("И не удаляет его из очереди: " + linkList);
// }
// static void enqueue(LinkedList<Integer> list, int num) {
//     list.addLast(num);
// }
// static int dequeue(LinkedList<Integer> list) {
//     int num = 0;
//     num = list.get(0);
//     list.remove(0);
//     return num;
// }
// static int first(LinkedList<Integer> list) {
//     int num = 0;
//     num = list.get(0);
//     return num;
// }
// }
 
