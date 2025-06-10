package org.example.ders58;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] numbers = {10, 4, 16, 2, 18, 12, 14, 6, 8, 16};
        for (int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
