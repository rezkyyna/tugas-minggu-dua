package com.juaracoding;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Gaji Karyawan: $");
        double gaji = input.nextDouble();

        double pajak = hitungPajak(gaji);

        double gajiBersih = gaji - pajak;

        System.out.println("Gaji Karyawan: $" + gaji);
        System.out.println("Pajak yang Dikenakan: $" + pajak);
        System.out.println("Gaji Bersih: $" + gajiBersih);

        input.close();
    }

    public static double hitungPajak(double gaji) {
        if (gaji >= 7000) {
            return 0.1 * gaji;
        } else {
            return 0;
        }
    }
}

