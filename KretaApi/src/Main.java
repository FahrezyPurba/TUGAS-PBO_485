import KretaApi.Admin;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scn = new Scanner(System.in);

        while( running ) {
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [ya/tidak]> ");

            jawab = scn.nextLine();

            // cek jawabnnya, kalau ya maka berhenti mengulang
            if( jawab.equalsIgnoreCase("ya") ){
                running = false;
            }

            counter++;
        }

        System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");


        Admin admin = new Admin();
        //admin.getKode("-");
        admin.setUsername("ezyprba");
        admin.setPassword("123");

        System.out.println("||----------ADMIN----------||");
       // System.out.println("Kode : " + admin.getKode("02"));
        System.out.println("Username : " + admin.getUsername());
        System.out.println("Password : " + admin.getPassword());

        Penumpang pnmpng = new Penumpang();
        pnmpng.setNamapenumpang("Fahrezy");
        pnmpng.setNoKtp("12345678");
        pnmpng.setNoTranksaksi("019283");

        System.out.println("||----------PENUMPANG--------||");
        System.out.println("Nama Penumpang : " + pnmpng.getNamaPenumpang());
        System.out.println("NoKtp : " + pnmpng.getNoKtp());
        System.out.println("NoTranksaksi : " + pnmpng.getNoTranksaksi());

        Reservasi rsvrs = new Reservasi();
        rsvrs.setNoTranksaksi("019283");
        rsvrs.setTotal(10000);
        LocalDate tanggalSekarang = LocalDate.now();
       // System.out.println(tanggalSekarang);
       // rsvrs.setTgl();

        System.out.println("||----------RESERVASI-----------||");
        System.out.println("TanggalTranksaksi : " + tanggalSekarang);
        System.out.println("NoTranksaksi : " + rsvrs.getNoTranksaksi());
        System.out.println("Total : " + rsvrs.getTotal());
     //   System.out.println("Tanggal : " + rsvrs.getTgl());

        Kreta krt = new Kreta();
        krt.setKodekrt("9999");
        krt.setSubkls("Ekonomi");
        krt.setGerbong("Gerbong 1");
        krt.setHrgtiket(20000);
        krt.setStasiunasl("Yogyakarta");
        krt.setStasiuntujuan("PasarSenen");
        LocalTime WaktuSekarang = LocalTime.now();
       // krt.getJmbrgkt("10.30")

        System.out.println("||----------KRETA----------||");
        System.out.println("JamBerangkat : " + WaktuSekarang);
        System.out.println("KodeKreta : " + krt.getKodekrt());
        System.out.println("SubKelas : " + krt.getSubkls());
        System.out.println("Gerbong : " + krt.getGerbong());
        System.out.println("HargaTiket : " + krt.getHrgtiket());
        System.out.println("StasiunAsal : " + krt.getStasiunasl());
        System.out.println("StasiuTujuan : " + krt.getStasiuntujuan());
        System.out.println("||----------SELAMAT SAMPAI TUJUAN----------||");
    }
}
