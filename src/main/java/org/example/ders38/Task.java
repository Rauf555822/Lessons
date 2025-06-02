package org.example.ders38;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] numbers = {6,3,9,2,10,7,8,4,5,9};
        for (int i = 0; i < numbers.length -1; i++) {
            for (int j=0; j < numbers.length - i -1; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers [j+1];
                    numbers [j+1] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
