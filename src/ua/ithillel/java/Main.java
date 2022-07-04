package ua.ithillel.java;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        String[] fruits = new String[10];
        fruits[0] = "Apple";
        fruits[1] = "Cherry";
        fruits[2] = "Banana";
        fruits[3] = "Plum";
        fruits[4] = "Drupe";
        fruits[5] = "Pineapple";
        fruits[6] = "Orange";
        fruits[7] = "Peach";
        fruits[8] = "Apricot";
        fruits[9] = "Mango";

        System.out.println("\nOutput of all fruits in one line = " + Arrays.deepToString(fruits));

        String[] food = Arrays.copyOf(fruits, fruits.length);

        System.out.println("\nOutput of all foods in new lines:\n");
        Stream.of(food).forEach(System.out::println);

        int[][] score = new int[3][4];
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                score[i][j] = 10 * (i + 1) + j;
            }
        }

        int[] result = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                result[i] += score[i][j];
            }
        }

        System.out.println("\nThe sum of the elements of each row of the array:\n");
        Arrays.stream(result).forEach(System.out::println);

    }
}