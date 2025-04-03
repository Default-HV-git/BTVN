package org.example;

import java.util.Scanner;

public class B6
{
    public static void main(String[] args)
    {
        //Khai bao
        Scanner scanner = new Scanner(System.in);

        //Nhập nhiệt độ C (Celsius)
        System.out.print("Nhập nhiệt độ C: ");
        double nhietDo_C = scanner.nextDouble();

        // Tính nhệt độ F
        double nhietDo_F = nhietDo_C * 9/5;

        //In thong tin
        System.out.println("\n===== Kết quả =====");
        System.out.println("Nhiệt độ F (Fahrenheit): " + nhietDo_F);
        scanner.close();
    }
}
