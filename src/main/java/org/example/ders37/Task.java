package org.example.ders37;

public class Task {
    public static void main(String[] args) {
        int[]arr = {0,2,4,6,8,10,12,14,16,18,20};
        int target = 16;
        int left = 0, right = arr.length -1;
        while (left <= right) {
            int mid = (right + left)/2;
            if (arr[mid] == target) {
                System.out.println("Index found: " +mid);
                System.out.println("The number itself: " +arr[mid]);
                break;
            } else if (arr[mid] < target) {
                left = mid +1;
            } else {
                right = mid -1;
            }
        }
    }
}
