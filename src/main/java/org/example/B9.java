package org.example;

public class B9
{
    public static void main(String[] args)
    {
        // In ra bảng cửu chương từ 1 đến 10
        for (int i=1; i<=10; i++)
        {
            System.out.println("\nBảng cửu chương " + i + ":");
            for (int j=1; j<=10; j++)
            {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
