package org.example;

import java.util.Scanner;

public class B11
{
    public static void main(String[] args)
    {
        // Khai báo
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước mảng
        System.out.print("Số lượng phần tử của mảng n = ");
        int n = scanner.nextInt();

        // Nhập phần tử của mảng
        System.out.print("Nhập các phần từ của mảng: ");
        int[] array = new int[n];
        for (int i=0; i < n; i++)
        {
            System.out.print("\nPhần tử " + (i+1) + " =");
            array[i] = scanner.nextInt();
        }

        // In ra phần tử lớn nhất
        int max = array [0];
        for (int i = 1; i < n; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
            }
        }
        System.out.println("\nPhần tử lớn nhất trong mảng là: " + max);

        scanner.close();
    }
}
