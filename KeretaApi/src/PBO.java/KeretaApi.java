package PBO.java;

public abstract class KeretaApi {
    private final String namaKereta;
    private final String stasiunAsal;
    private final String stasiunTujuan;
    public KeretaApi(String namaKereta, String stasiunAsal, String stasiunTujuan) {
        this.namaKereta = namaKereta;
        this.stasiunAsal = stasiunAsal;
        this.stasiunTujuan = stasiunTujuan;
    }
    public void tampilData(){
        System.out.println("*******************************************************");
        System.out.println("*                    SELAMAT DATANG                   *");
        System.out.println("*                 KERETA API INDONESIA                *");
        System.out.println("=========(" + namaKereta + ") " + stasiunAsal + " => " + stasiunTujuan + "=======");
        System.out.println("*******************************************************");
    }
}
