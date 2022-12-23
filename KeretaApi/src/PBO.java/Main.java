package PBO.java;

public class Main {
    public static void main(String[] args) {
        Penumpang p1 = new Penumpang("SENJA UTAMA", "YOGYAKARTA", "PASAR SENEN");
        p1.tampilData();
        Pembayaran pbyr1 = new Pembayaran("SENJA UTAMA", "YOGYAKARTA", "PASAR SENEN");
        pbyr1.tampilpembayaran();

    }
}

