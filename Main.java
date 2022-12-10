package PBO.java;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Penumpang p1 = new Penumpang("SENJA","YK","PS");
        System.out.println("detail");
        Pembayaran pbyr1 = new Pembayaran("SENJA UTAMA","YOGYAKARTA","PASAR SENEN");
        pbyr1.tampilpembayaran();

        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.print("Nama Penumpang : ");
        String nama = input.nextLine();
        p1.setNama(nama);

        System.out.println("Kelas : ");
        System.out.println("1. Eksekutif" +"\n2. Ekonomi" + "\n3. Bisnis" );
        System.out.println("Pilih Kelas : ");
        int kelas = input.nextInt();
        pbyr1.setKelas(kelas);

        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.println("\tNama Penumpang : "+p1.getNama());
        System.out.println("\tPembayaran Penumpang : ");
        pbyr1.hitungBayaran();
    }
}

