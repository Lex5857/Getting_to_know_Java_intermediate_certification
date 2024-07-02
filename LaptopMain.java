package GettingToKnowTheBasicApiJava.Seminar.Lesson6.Homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LaptopMain {
    private static void listCharacteristics() {
        System.out.println("Список характеристик ноутбука: ");
        System.out.println("1. Объем оперативной памяти");
        System.out.println("2. Объем жесткого диска");
        System.out.println("3. Операционная система");
        System.out.println("4. Цвет");
    }

    private static void showSetListInt(Set<Integer> array, Map<Integer, Integer> criteriaMapInt) {
        int number = 0;
        for (int elem : array) {
            number++;
            System.out.println(String.format("%d. %d", number, elem));
            criteriaMapInt.put(number, elem);
        }
    }

    private static void showSetListStr(Set<String> array, Map<Integer, String> criteriaMapStr) {
        int number = 0;
        for (String elem : array) {
            number++;
            System.out.println(String.format("%d. %s", number, elem));
            criteriaMapStr.put(number, elem);
        }
    }

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(8, 256, "Mac OS", "Серый");
        Laptop laptop2 = new Laptop(16, 512, "Windows 10 Pro", "Белый");
        Laptop laptop3 = new Laptop(4, 128, "Chrome OS", "Черный");
        Laptop laptop4 = new Laptop(32, 1024, "Windows 11 Pro", "Синий");
        Laptop laptop5 = new Laptop(8, 128, "Astra Linux", "Черный");

        Set<Laptop> laptops = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5));
        Set<Integer> ramMemorySize = new HashSet<>();
        Set<Integer> hardDriveSize = new HashSet<>();
        Set<String> operatingSystem = new HashSet<>();
        Set<String> color = new HashSet<>();

        Map<Integer, String> criteriaMapStr = new HashMap<>();
        Map<Integer, Integer> criteriaMapInt = new HashMap<>();

        for (Laptop laptop : laptops) {
            ramMemorySize.add(laptop.getRamMemorySize());
            hardDriveSize.add(laptop.getHardDriveSize());
            operatingSystem.add(laptop.getOperatingSystem());
            color.add(laptop.getColor());
        }

        listCharacteristics();
        System.out.println("Выберете характеристику для фильтрации");
        System.out.println("Введите номер характеристики:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equals("1")) {
            System.out.println("Ноутбуки с такими объемами оперативной памяти в наличии:");
            showSetListInt(ramMemorySize, criteriaMapInt);
            System.out.println("Введите номер характеристики для фильтрации:");
            input = scanner.nextLine();
            int num = Integer.parseInt(input);
            int selected = criteriaMapInt.get(num);
            System.out.println("Ноутбуки с выбранным объемом оперативной памяти и выше:");
            System.out.println();
            for (Laptop laptop : laptops){
                if (laptop.getRamMemorySize() >= selected){
                    System.out.println(laptop);
                    System.out.println();
                }
            }

        } else if (input.equals("2")) {
            System.out.println("Ноутбуки с такими объемами жесткого диска в наличии:");
            showSetListInt(hardDriveSize, criteriaMapInt);
            System.out.println("Введите номер характеристики для фильтрации:");
            input = scanner.nextLine();
            int num = Integer.parseInt(input);
            int selected = criteriaMapInt.get(num);
            System.out.println("Ноутбуки с выбранным объемом жесткого диска и выше:");
            System.out.println();
            for (Laptop laptop : laptops){
                if (laptop.getHardDriveSize() >= selected){
                    System.out.println(laptop);
                    System.out.println();
                }
            }

        } else if (input.equals("3")) {
            System.out.println("Ноутбуки с операционными системами в наличии:");
            showSetListStr(operatingSystem, criteriaMapStr);
            System.out.println("Введите номер характеристики для фильтрации:");
            input = scanner.nextLine();
            int num = Integer.parseInt(input);
            String selected = criteriaMapStr.get(num);
            System.out.println("Ноутбуки с выбранной операционной системой:");
            System.out.println();
            for (Laptop laptop : laptops){
                if (laptop.getOperatingSystem().equals(selected)){
                    System.out.println(laptop);
                    System.out.println();
                } 
            }

        } else if (input.equals("4")) {
            System.out.println("Ноутбуки таких цветов в наличии:");
            showSetListStr(color, criteriaMapStr);
            System.out.println("Введите номер характеристики для фильтрации:");
            input = scanner.nextLine();
            int num = Integer.parseInt(input);
            String selected = criteriaMapStr.get(num);
            System.out.println("Ноутбуки выбранного цвета:");
            System.out.println();
            for (Laptop laptop : laptops){
                if (laptop.getColor().equals(selected)){
                    System.out.println(laptop);
                    System.out.println();
                } 
            }
        }
        scanner.close();
    }
}
