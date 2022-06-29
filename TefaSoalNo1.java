package tefasoalno1;

import java.util.Scanner;

public class TefaSoalNo1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang, lebar, hargaPerM, harga1, harga2, harga3, harga4, harga5;

        System.out.println("============================================"
                + "\nSelamat Datang Di Aplikasi Penghitung Tanah"
                + "\n============================================");
        System.out.print("Masukkan harga tanah per M:");
        hargaPerM = input.nextInt();

        System.out.print("Masukkan panjang tanah: ");
        panjang = input.nextInt();

        System.out.print("Masukkan lebar tanah: ");
        lebar = input.nextInt();

        harga1 = panjang * lebar * hargaPerM;
        harga2 = harga1 * 10 / 100 + harga1;
        harga3 = harga2 * 10 / 100 + harga2;
        harga4 = harga3 * 10 / 100 + harga3;
        harga5 = harga4 * 10 / 100 + harga4;

        System.out.println("============================================");
        System.out.println("Harga tanah tahun ke-1= " + harga1
                + "\nHarga tanah tahun ke-2= " + harga2
                + "\nHarga tanah tahun ke-3= " + harga3
                + "\nHarga tanah tahun ke-4= " + harga4
                + "\nHarga tanah tahun ke-5= " + harga5);

    }

}
