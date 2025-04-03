package org.example;

public class B5
{
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //Khai bao
        double chieuDai_HCN=15.5;
        double chieuRong_HCN=15;

        //Tinh dien tich va chu vi HCN
        double dienTich = chieuDai_HCN*chieuRong_HCN;
        double chuVi = (chieuDai_HCN+chieuRong_HCN)*2;

        //In thong tin
        System.out.println("\n===== Diện tích và Chu vi HCN =====");
        System.out.println("Diện tích HCN: " + dienTich);
        System.out.println("Chu vi HCN: " + chuVi);
    }
}
