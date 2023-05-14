package HT6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.Objects;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Laptop Asus = new Laptop("Asus", 2048, 160, "Windows", 4740, 3000, 15.4, "Black", 32600, true);
        Laptop Toshiba = new Laptop("Toshiba", 2048, 300, "Windows", 4000, 2900, 15.4, "Gray", 37000, true);
        Laptop Lenovo = new Laptop ("Lenovo", 1024, 160, "Windows", 4000, 2960, 15.4, "Black", 27000, false);
    
        HashSet<Laptop> setLaptop = new HashSet<Laptop>(Arrays.asList(Asus, Toshiba, Lenovo)); 
        
        for (Object elem : setLaptop) {
            System.out.println(elem);
        }
        Scanner in = new Scanner(System.in);
        System.out.println(
                "По какому критерию вы хотите произвести отбор:\n" +
                        "1 - озу\n2 - объем жесткого диска\n3 - емкость батареи\n4 - вес\n5 - цена");
        int searchAtribut = in.nextInt();
        System.out.println("задайте диапазон (введите 2 цифры через пробел)");
        int min = in.nextInt();
        int max = in.nextInt();
        boolean flag = false;
        if (searchAtribut == 1) { 
            for (Laptop elem : setLaptop) {
                if (elem.getRandom_acces_memory() >= min && elem.getRandom_acces_memory() <= max) {
                    System.out.println(elem);
                    flag = true;
                }
            }
        } else if (searchAtribut == 2) { 
            for (Laptop elem : setLaptop) {
                if (elem.getHard_disk() >= min && elem.getHard_disk() <= max) {
                    System.out.println(elem);
                    flag = true;
                }
            }
        } else if (searchAtribut == 3) { 
            for (Laptop elem : setLaptop) {
                if (elem.getBattery() >= min && elem.getBattery() <= max) {
                    System.out.println(elem);
                    flag = true;
                }
            }
        } else if (searchAtribut == 4) { 
            for (Laptop elem : setLaptop) {
                if (elem.getWeight() >= min && elem.getWeight() <= max) {
                    System.out.println(elem);
                    flag = true;
                }
            }
        } else if (searchAtribut == 5) { 
            for (Laptop elem : setLaptop) {
                if (elem.getPrice() >= min && elem.getPrice() <= max) {
                    System.out.println(elem);
                    flag = true;
                }
            }    
        if (!flag) {
            System.out.println("Нет ноутбуков, удовлетворяющих вашему запросу");
        }
    }
    public static TreeMap<Integer, Laptop> sortByPrice(Set<Laptop> inputSet) {
        TreeMap<Integer, Laptop> sortByPrice = new TreeMap<>();
            for (Laptop laptop : inputSet) {
                sortByPrice.put(laptop.getPrice(), laptop);
            }
            return sortByPrice;
        }
    }
}
           
        

