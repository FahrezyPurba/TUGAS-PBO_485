package PBO.java;

public abstract class KeretaApi {
    private String namaKereta,stasiunAsal, stasiunTujuan;
    public KeretaApi(String namaKereta, String stasiunAsal, String stasiunTujuan) {
        this.namaKereta = namaKereta;
        this.stasiunAsal = stasiunAsal;
        this.stasiunTujuan = stasiunTujuan;
    }
    public void tampilData(){
        System.out.println("========(" + namaKereta + ") " + stasiunAsal + " => " + stasiunTujuan + "======");
    }
}
