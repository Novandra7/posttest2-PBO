package com.utama;

import com.bentuk.*;
import com.CRUD.*;

import java.util.ArrayList;
import java.util.Scanner;

public final class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("selamat datang di perhitungan bangun ruang");
        while(true){
            System.out.println("\n1. Tambah Bangun Ruang");
            System.out.println("2. Tampilkan Bangun Ruang");
            System.out.println("3. Ubah Bangun Ruang");
            System.out.println("4. Hapus Bangun Ruang");
            System.out.println("5. Hitung Bangun Ruang");
            System.out.println("6. EXIT");
            System.out.print("Masukkan Pilihan Anda (1/2/3/4/5/6) : ");
            String pilihan = input.nextLine();

            switch (pilihan){
                case "1":
                    pilihanBangunRuang();
                    String pilihanNambah = input.nextLine();
                    crud.create(pilihanNambah);
                    break;
                case "2":
                    pilihanBangunRuang();
                    String pilihanTampilkan = input.nextLine();
                    crud.read(pilihanTampilkan);
                    break;
                case "3":
                    pilihanBangunRuang();
                    String pilihanUbah = input.nextLine();
                    crud.update(pilihanUbah);
                    break;
                case "4":
                    pilihanBangunRuang();
                    String pilihanHapus = input.nextLine();
                    crud.delete(pilihanHapus);
                    break;
                case "5":
                    pilihanBangunRuang();
                    String pilihanTambah = input.nextLine();
                    crud.perhitungan(pilihanTambah);
                    break;
                case "6":
                    input.close();
                    System.out.println("\nTERIMAKASIH\n");
                    System.exit(0);
            }
        }
    }
     private static void pilihanBangunRuang(){
        System.out.println("\n1. Lingkaran");
        System.out.println("2. Balok");
        System.out.println("3. Prisma Segitiga");
        System.out.print("Masukkan pilihan anda (1/2/3) : ");
    }
}