package org.example.ders31;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 6, 7, 3, 4, 8};
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
