package org.example;

import java.util.Scanner;

public class B8
{
    public static void main(String[] args)
    {
        //Khai bao
        Scanner scanner = new Scanner(System.in);

        //Nhập N
        System.out.print("Nhập N = ");
        int so_N = scanner.nextInt();

        // Tính tổng từ 1 đến N
        int sum = 0;
        for (int i=1; i <= so_N; i++)
        {
            sum += i;
        }

        // In ra màn hình
        System.out.println("Tổng từ 1 đến " +so_N+ " là: " + sum);

        scanner.close();
    }
}
