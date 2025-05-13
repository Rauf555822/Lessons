package org.example.ders3;

import java.util.Scanner;

public class Task1 {
    public static class WeeklyActivity {
        public static void main(String[] args) {
            // Həftənin günləri və məşğuliyyətləri
            String[] days = {
                    "Bazar ertəsi", "Çərşənbə axşamı", "Çərşənbə", "Cümə axşamı",
                    "Cümə", "Şənbə", "Bazar"
            };

            String[] activities = {
                    "Kitab oxumaq", "İdman etmək", "Film izləmək", "Dostlarla vaxt keçirmək",
                    "Yeni bir şey öyrənmək", "Gəzintiyə çıxmaq", "Dincəlmək"
            };

            // User-dən input almaq
            Scanner scanner = new Scanner(System.in);
            System.out.println("Həftənin gününün nömrəsini daxil edin (1-7): ");

            if (scanner.hasNextInt()) {
                int dayNumber = scanner.nextInt();

                // Gün nömrəsi 1-7 arasında olmalıdır
                if (dayNumber >= 1 && dayNumber <= 7) {
                    System.out.println(days[dayNumber - 1] + " - " + activities[dayNumber - 1]);
                } else {
                    System.out.println("Xəta: 1-dən 7-yə qədər rəqəm daxil edin.");
                }
            } else {
                System.out.println("Xəta: Zəhmət olmasa düzgün bir ədəd daxil edin.");
            }

            scanner.close();
        }
    }
}
