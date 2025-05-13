package org.example.ders31;

public class Task {
    public static void main(String[] args) {
        int[]arr = {0, 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
        int target = 19;
        int left = 0, right = arr.length -1;
        while (left <= right){
            int mid = (right + left)/2;
            if (arr[mid] == target) {
                System.out.println("İndeks tapıldı: " +mid);
                System.out.println("Ədədin özü: " +arr[mid]);
                break;
            } else if (arr[mid] < target) {
                left = mid +1;
            } else {
                right = mid-1;
            }
        }
    }
}
