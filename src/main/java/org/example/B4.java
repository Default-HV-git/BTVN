package org.example;

import java.util.Scanner;

public class B4
{
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //Khai bao
        Scanner scanner = new Scanner(System.in);

        //Nhap Ho ten va Ngay thang nam sinh
        System.out.print("Nhâp họ và tên: ");
        String hoTen = scanner.nextLine();

        System.out.print("Nhâp ngày tháng năm sinh: ");
        String ngaySinh = scanner.nextLine();

        //In thong tin
        System.out.println("\n===== Thông tin =====");
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Ngày tháng năm sinh: " + ngaySinh);
        scanner.close();
    }
}