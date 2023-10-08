package com.CRUD;

import com.bentuk.balok;
import com.bentuk.bola;
import com.bentuk.prisma_segitiga;

import java.util.ArrayList;
import java.util.Scanner;

public final class crud {
    static final Scanner input = new Scanner(System.in);
    static final ArrayList<bola> arrayBola = new ArrayList<>();
    static final ArrayList<balok> arrayBalok = new ArrayList<>();
    static final ArrayList<prisma_segitiga> arrayPrismaSegitiga = new ArrayList<>();
    public static void create(String pilihanNambah){
        try {
            switch (pilihanNambah){
                case "1":
                    System.out.print("Masukkan jari-jari bola : ");
                    float jariJariBola = Float.parseFloat(input.nextLine());
                    System.out.print("Masukkan tinggi bola : ");
                    float tinggiBola = Float.parseFloat(input.nextLine());
                    bola objekBola = new bola(jariJariBola,tinggiBola);
                    arrayBola.add(objekBola);
                    System.out.println();
                    break;
                case "2":
                    System.out.print("Masukkan tinggi balok : ");
                    float tinggiBalok = Float.parseFloat(input.nextLine());
                    System.out.print("Masukkan panjang balok : ");
                    float panjangBalok = Float.parseFloat(input.nextLine());
                    System.out.print("Masukkan lebar balok : ");
                    float lebarBalok = Float.parseFloat(input.nextLine());
                    balok objekBalok = new balok(tinggiBalok,panjangBalok,lebarBalok);
                    arrayBalok.add(objekBalok);
                    System.out.println();
                    break;
                case "3":
                    System.out.print("Masukkan luas alas prisma segitiga : ");
                    float luasAlasPrismaSegitiga = Float.parseFloat(input.nextLine());
                    System.out.print("Masukkan luas selimut prisma segitiga : ");
                    float luasSelimutPrismaSegitiga = Float.parseFloat(input.nextLine());
                    System.out.print("Masukkan tinggi  prisma segitiga : ");
                    float tinggiPrismaSegitiga = Float.parseFloat(input.nextLine());
                    prisma_segitiga objekPrismaSegitiga = new prisma_segitiga(luasAlasPrismaSegitiga,luasSelimutPrismaSegitiga,tinggiPrismaSegitiga);
                    arrayPrismaSegitiga.add(objekPrismaSegitiga);
                    System.out.println();
                    break;
                default:
                    System.out.println("Masukkan pilihan yang tersedia");
            }
        }catch (NumberFormatException e){
            System.out.println("\nHarap masukkan angka");
        }
    }
    public static void read(String pilihanTampilkan){
        int nomorBola = 1,nomorBalok = 1,nomorPrismaSegitiga = 1;
        switch (pilihanTampilkan){
            case "1":
                if (arrayBola.isEmpty()){
                    System.out.println("\n<<<ArrayList bola masih kosong>>>\n");
                }else {
                    for (bola objekBola : arrayBola){
                        System.out.println("\nBOLA "+nomorBola);
                        System.out.println("Jari - jari bola : "+objekBola.getJariJari()+"\nTinggi bola : "+objekBola.getTinggi());
                        nomorBola+=1;
                    }
                }break;
            case "2":
                if (arrayBalok.isEmpty()){
                    System.out.println("\n<<<ArrayList balok masih kosong>>>\n");
                }else {
                    for (balok objekBalok : arrayBalok){
                        System.out.println("\nBALOK "+nomorBalok);
                        System.out.println("Tinggi balok : "+objekBalok.getTinggi()+
                                "\nPanjang balok : "+objekBalok.getPanjang()+
                                "\nLebar balok : "+objekBalok.getLebar());
                        nomorBalok+=1;
                    }
                }break;
            case "3":
                if (arrayPrismaSegitiga.isEmpty()){
                    System.out.println("\n<<<ArrayList prisma segitiga masih kosong>>>\n");
                }else {
                    for (prisma_segitiga objekPrismaSegitiga : arrayPrismaSegitiga){
                        System.out.println("\nPRISMA SEGITIGA "+nomorPrismaSegitiga);
                        System.out.println("Luas alas  : "+objekPrismaSegitiga.getLuasAlas()+
                                "\nLuas selimut : " +objekPrismaSegitiga.getLuasSelimut()+
                                "\nTinggi prisma segitiga : " +objekPrismaSegitiga.getTinggi());
                        nomorPrismaSegitiga+=1;
                    }
                }break;
        }
    }
    public static void update(String pilihanUbah){
        try{
            switch (pilihanUbah){
                case "1":
                    if (arrayBola.isEmpty()){
                        System.out.println("\nArrayList bola masih kosong ");
                    }else {
                        System.out.print("Masukkan nomor BOLA yang ingin diubah (ketik 0 untuk ke menu awal): ");
                        int inputNomorBola = Integer.parseInt(input.nextLine());
                        if (inputNomorBola > 0 && inputNomorBola<=arrayBola.size()){
                            System.out.print("Masukkan jari-jari baru : ");
                            float jariJariBolaBaru = Float.parseFloat(input.nextLine());
                            System.out.print("Masukkan tinggi baru : ");
                            float tinggiBolaBaru = Float.parseFloat(input.nextLine());
                            bola objekBola = arrayBola.get(inputNomorBola - 1);
                            objekBola.setJariJari(jariJariBolaBaru);
                            objekBola.setTinggi(tinggiBolaBaru);
                            System.out.println("\nData BOLA "+inputNomorBola+" berhasil diubah.\n");
                        } else if (inputNomorBola == 0) {
                            break;
                        }else {
                            System.out.println("\nNomor BOLA tidak valid.\n");
                        }
                    }break;
                case "2":
                    if (arrayBalok.isEmpty()){
                        System.out.println("\nArrayList balok masih kosong ");
                    }else {
                        System.out.print("Masukkan nomor BALOK yang ingin diubah (ketik 0 untuk ke menu awal): ");
                        int inputNomorBalok = Integer.parseInt(input.nextLine());
                        if (inputNomorBalok > 0 && inputNomorBalok <= arrayBalok.size()){
                            System.out.print("Masukkan tinggi baru : ");
                            float tinggiBalokBaru = Float.parseFloat(input.nextLine());
                            System.out.print("Masukkan panjang baru : ");
                            float panjangBalokBaru = Float.parseFloat(input.nextLine());
                            System.out.print("Masukkan lebar baru : ");
                            float lebarBalokBaru = Float.parseFloat(input.nextLine());
                            balok objekBalok = arrayBalok.get(inputNomorBalok - 1);
                            objekBalok.setTinggi(tinggiBalokBaru);
                            objekBalok.setPanjang(panjangBalokBaru);
                            objekBalok.setLebar(lebarBalokBaru);
                            System.out.println("\nData BALOK "+inputNomorBalok+" berhasil diubah.\n");
                        } else if (inputNomorBalok == 0) {
                            break;
                        }else {
                            System.out.println("\nNomor BALOK tidak valid.\n");
                        }
                    }break;
                case "3":
                    if (arrayPrismaSegitiga.isEmpty()){
                        System.out.println("\nArrayList balok masih kosong ");
                    }else {
                        System.out.print("Masukkan nomor PRISMA SEGITIGA yang ingin diubah (ketik 0 untuk ke menu awal): ");
                        int inputNomorPrisma = Integer.parseInt(input.nextLine());
                        if (inputNomorPrisma > 0 && inputNomorPrisma <= arrayPrismaSegitiga.size()){
                            System.out.print("Masukkan luas alas baru : ");
                            float luasAlasBaru = Float.parseFloat(input.nextLine());
                            System.out.print("Masukkan luas selimut baru : ");
                            float luasSelimutBaru = Float.parseFloat(input.nextLine());
                            System.out.print("Masukkan tinggi baru : ");
                            float tinggiBaru = Float.parseFloat(input.nextLine());
                            prisma_segitiga objekPrismaSegitiga = arrayPrismaSegitiga.get(inputNomorPrisma - 1);
                            objekPrismaSegitiga.setLuasAlas(luasAlasBaru);
                            objekPrismaSegitiga.setLuasSelimut(luasSelimutBaru);
                            objekPrismaSegitiga.setTinggi(tinggiBaru);
                            System.out.println("\nData PRISMA SEGITIGA "+inputNomorPrisma+" berhasil diubah.\n");
                        } else if (inputNomorPrisma == 0) {
                            break;
                        }else {
                            System.out.println("\nNomor BALOK tidak valid.\n");
                        }
                    }break;
            }
        }catch (NumberFormatException e){
            System.out.println("\nHarap masukkan angka");
        }
    }
    public static void delete(String pilihanHapus){
        try {
            switch (pilihanHapus){
                case "1":
                    if (arrayBola.isEmpty()){
                        System.out.println("\nArrayList bola masih kosong ");
                    }else {
                        System.out.print("Masukkan nomor BOLA yang ingin dihapus : ");
                        int inputHapusBola = Integer.parseInt(input.nextLine());
                        if (inputHapusBola > 0 && inputHapusBola <= arrayBola.size()){
                            bola objekBola = arrayBola.get(inputHapusBola - 1);
                            arrayBola.remove(objekBola);
                            System.out.println("\nData BOLA "+inputHapusBola+" berhasil dihapus.\n");
                        }else {
                            System.out.println("\nNomor BOLA tidak valid.\n");
                        }
                    }break;
                case "2":
                    if (arrayBalok.isEmpty()){
                        System.out.println("\nArrayList balok masih kosong ");
                    }else {
                        System.out.print("Masukkan nomor BALOK yang ingin dihapus : ");
                        int inputHapusBalok = Integer.parseInt(input.nextLine());
                        if (inputHapusBalok > 0 && inputHapusBalok <= arrayBalok.size()){
                            balok objekBalok = arrayBalok.get(inputHapusBalok - 1);
                            arrayBalok.remove(objekBalok);
                            System.out.println("\nData BALOK "+inputHapusBalok+" berhasil dihapus.\n");
                        }else {
                            System.out.println("\nNomor BALOK tidak valid.\n");
                        }
                    }break;
                case "3":
                    if (arrayPrismaSegitiga.isEmpty()){
                        System.out.println("\nArrayList PRISMA SEGITIGA masih kosong ");
                    }else {
                        System.out.print("Masukkan nomor PRISMA SEGITIGA yang ingin dihapus : ");
                        int inputHapusPrisma = Integer.parseInt(input.nextLine());
                        if (inputHapusPrisma > 0 && inputHapusPrisma <= arrayPrismaSegitiga.size()){
                            prisma_segitiga objekPrisma = arrayPrismaSegitiga.get(inputHapusPrisma - 1);
                            arrayPrismaSegitiga.remove(objekPrisma);
                            System.out.println("\nData PRISMA SEGITIGA "+inputHapusPrisma+" berhasil dihapus.\n");
                        }else {
                            System.out.println("\nNomor PRISMA SEGITIGA tidak valid.\n");
                        }
                    }break;
            }
        }catch (NumberFormatException e){
            System.out.println("\nHarap masukkan angka");
        }
    }
    public static void perhitungan(String pilihanTambah){
        try{
            switch (pilihanTambah){
                case "1":
                    System.out.print("Masukkan nomor BOLA yang ingin dihitung : ");
                    int inputBolaHitung = Integer.parseInt(input.nextLine());
                    if (inputBolaHitung > 0 && inputBolaHitung <= arrayBola.size()){
                        bola objekBola = arrayBola.get(inputBolaHitung - 1);
                        float hasilLuas = objekBola.hitungLuas();
                        float hasilVolume = objekBola.hitungVolume();
                        System.out.println("Hasil luas bola "+inputBolaHitung+" : "+hasilLuas);
                        System.out.println("Hasil volume bola "+inputBolaHitung+" : "+hasilVolume);
                    }else {
                        System.out.println("\nNomor BOLA tidak valid.\n");
                    }break;
                case "2":
                    System.out.print("Masukkan nomor BALOK yang ingin dihitung : ");
                    int inputBalokHitung = Integer.parseInt(input.nextLine());
                    if (inputBalokHitung > 0 && inputBalokHitung <= arrayBalok.size()){
                        balok objekBalok = arrayBalok.get(inputBalokHitung - 1);
                        float hasilLuas = objekBalok.hitungLuas();
                        float hasilVolume = objekBalok.hitungVolume();
                        System.out.println("Hasil luas balok "+inputBalokHitung+" : "+hasilLuas);
                        System.out.println("Hasil volume balok "+inputBalokHitung+" : "+hasilVolume);
                    }else {
                        System.out.println("\nNomor BALOK tidak valid.\n");
                    }break;
                case "3":
                    System.out.print("Masukkan nomor PRISMA SEGITIGA yang ingin dihitung : ");
                    int inputPrismaHitung = Integer.parseInt(input.nextLine());
                    if (inputPrismaHitung > 0 && inputPrismaHitung <= arrayPrismaSegitiga.size()){
                        prisma_segitiga objekPrisma = arrayPrismaSegitiga.get(inputPrismaHitung - 1);
                        float hasilLuas = objekPrisma.hitungLuas();
                        float hasilVolume = objekPrisma.hitungVolume();
                        System.out.println("Hasil luas PRISMA SEGITIGA "+inputPrismaHitung+" : "+hasilLuas);
                        System.out.println("Hasil volume PRISMA SEGITIGA "+inputPrismaHitung+" : "+hasilVolume);
                    }else {
                        System.out.println("\nNomor BALOK tidak valid.\n");
                    }break;
            }
        }catch (NumberFormatException e){
            System.out.println("\nHarap masukkan angka");
        }
    }
}
