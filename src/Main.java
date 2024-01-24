import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }


    public static void countInteger(List<Integer> nums) {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }

        }

    }

    public static void task1() {
        System.out.println("Задача1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        countInteger(nums);
        System.out.println();

    }


    public static void printUniqueNumbers(List<Integer> nums) {
        Set<Integer> uniqueEvenNumbers = new HashSet<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                uniqueEvenNumbers.add(num);
            }
        }

        Set<Integer> sortedUniqueEvenNumbers = new TreeSet<>(uniqueEvenNumbers);
        for (int num : sortedUniqueEvenNumbers) {
            System.out.print(num + " ");
        }

    }

    public static void task2() {
        System.out.println("Задача2");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        printUniqueNumbers(nums);
        System.out.println();


    }

    public static void afficherDesMotsUniques(List<String> strings) {
        Set<String> uniqueWords = new HashSet<>(strings);
        for (String word : uniqueWords) {

            System.out.print(word + " ");

        }
    }


    public static void task3() {
        System.out.println("Задача3");
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        afficherDesMotsUniques(strings);
        System.out.println();

    }


    public static void printNumberOfTakes(List<String> strings) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : strings) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue()+" ");
        }
    }


    public static void task4() {
        System.out.println("Задача4");
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        printNumberOfTakes(strings);

    }

}







