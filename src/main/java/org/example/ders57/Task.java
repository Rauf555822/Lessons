package org.example.ders57;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        int[]arr = {23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 51, 53, 55};
        int target = 45;
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                System.out.println("Found at index " + mid);
                System.out.println("Target: " + arr[mid]);
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }
}
