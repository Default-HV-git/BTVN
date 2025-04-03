package org.example;

import java.util.Scanner;

public class B10
{
    public static void main(String[] args)
    {
        // Khai báo
        Scanner scanner = new Scanner(System.in);

        // Nhập vào số giờ làm và lương mỗi giờ của nhân viên
        System.out.print("Nhập số giờ làm = ");
        double so_gio = scanner.nextDouble();
        System.out.print("Nhập số lương mỗi giờ = ");
        double luong_moi_gio = scanner.nextDouble();

        // Tính lương
        double tongLuong;
        if(so_gio > 40)
        {
            double gio_OT = so_gio - 40;
            tongLuong = luong_moi_gio * 40 + gio_OT * luong_moi_gio * 1.5;
        }
        else
        {
            tongLuong = luong_moi_gio * so_gio;
        }
        System.out.print("Tong luong cua nhan vien la: " + tongLuong);

        scanner.close();
    }
}
