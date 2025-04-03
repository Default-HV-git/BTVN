package org.example;

import java.util.Scanner;

public class B7
{
    public static void main(String[] args)
    {
        //Khai bao
        Scanner scanner = new Scanner(System.in);

        //Nhập số nguyên a
        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        // Kiểm tra chẵn lẻ
        if (a%2==0)
        {
            System.out.println("Đây là số chẵn ");
        }
        else
        {
            System.out.println("Đây là số lẻ ");
        }

        scanner.close();
    }
}
