package PBO.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Pembayaran extends Penumpang implements Jenis{
    private int kelas; //PROPERTY

    public Pembayaran(String namaKereta, String stasiunAsal, String stasiunTujuan) {
        super(namaKereta, stasiunAsal, stasiunTujuan);
    }
    public void setKelas(int kelas) {
        this.kelas = kelas;
    }

    public void tampilpembayaran() {
        File file = new File("tiket.txt");
        PrintWriter output;
        {
            try {
                output = new PrintWriter(file);
                output.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                output.println("=                       CETAK TIKET                       =");
                output.println("=                  PT. KERETA API INDONESIA               =");
                output.println("=         (SEBJA UTAMA) YOGYAKARTA => PASAR SENEN         =");
                output.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                Scanner in = new Scanner(System.in);

                System.out.print("\nNama Penumpang : ");
                String nama = in.nextLine();
                setNama(nama);
                output.println("| Nama Penumpang      : " + getNama());
                output.println("| Detail Pembayaran Penumpang                             |");
                output.println("| --------------------------------                        |");

                boolean pilih = true;
                while(pilih){
                    System.out.println("Kelas : ");
                    System.out.println("""
                        1. KeretaApi Bisnis
                        2. KeretaApi Eksekutif
                        3. KeretaApi Ekonomi""");
                    System.out.print("Pilih Kelas : ");
                    int kelas = in.nextInt();
                    setKelas(kelas);

                    double bagasi;
                    if (kelas == 1) {
                        bagasi = 25000;
                        double total = tiket + bagasi;
                        output.println("|\t- Pembayaran Tiket : " + tiket + "                          |");
                        output.println("|\t- Biaya Bagasi     : " + bagasi + "                          |");
                        output.println("|\t- Total Pembayaran : " + total + "                          |");
                        output.println("| -------------------------------                         |");
                        output.println("| Jenis Kelas KA      : " + Jenis.kelas1 +"                  |");
                        output.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                        output.close();
                        pilih = false;
                    }else if (kelas == 2){
                        bagasi = 15000;
                        double total =  tiket + bagasi;
                        output.println("|\t- Pembayaran Tiket : " + tiket + "                          |");
                        output.println("|\t- Biaya Bagasi     : " + bagasi + "                          |");
                        output.println("|\t- Total Pembayaran : " + total + "                          |");
                        output.println("| -------------------------------                         |");
                        output.println("| Jenis Kelas KA      : " + Jenis.kelas2 + "               |");
                        output.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                        output.close();
                        pilih = false;
                    }
                    else if(kelas == 3) {
                        bagasi = 10000;
                        double total = tiket + bagasi;
                        output.println("|\t- Pembayaran Tiket : " + tiket + "                          |");
                        output.println("|\t- Biaya Bagasi     : " + bagasi + "                          |");
                        output.println("|\t- Total Pembayaran : " + total + "                          |");
                        output.println("| -------------------------------                         |");
                        output.println("| Jenis Kelas KA      : " + Jenis.kelas3 + "                 |");
                        output.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                        output.close();
                        pilih = false;
                    }
                    else{
                        System.out.println("Maaf, pilihan tidak tersedia,silahkan ulang lagi!\n");
                        pilih = true;
                    }
                }
                System.out.println("Tiket telah tercetak di 'tiket.txt'");
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                throw new RuntimeException(e);
            }
        }
    }

}
