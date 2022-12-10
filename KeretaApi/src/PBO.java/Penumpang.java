package PBO.java;

public class  Penumpang extends KeretaApi{
    private String nama;

    public Penumpang(String namaKereta, String stasiunAsal, String stasiunTujuan) {
        super(namaKereta, stasiunAsal, stasiunTujuan);
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

