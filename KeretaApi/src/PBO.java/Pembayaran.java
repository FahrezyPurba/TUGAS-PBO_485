package PBO.java;

public class Pembayaran extends Penumpang{
    private int bagasi, kelas; //PROPERTY
    private int tiket=50000;

   // public Pembayaran(){
//        tiket = 50000;
   // }

    public Pembayaran(String namaKereta, String stasiunAsal, String stasiunTujuan) {
        super(namaKereta, stasiunAsal, stasiunTujuan);
    }

    public void setKelas(int kelas) {
        this.kelas = kelas;
    }
    public void hitungBayaran(){
        if(kelas == 1){
            bagasi = 10000;
            int total =  tiket + bagasi;
            System.out.println("\tPembayaran Tiket : " + tiket);
            System.out.println("\tbiaya Bagasi  : " + bagasi);
            System.out.println("\tTotal Pembayaran : " + total);
            System.out.println("+++++++++++++++++++++++++++++++++++");
        }
    }

    public void tampilpembayaran(){
        tampilData();
    }
}
