public class Penumpang {
    static void Penumpang() {
        System.out.println();
    }

    private String id;
    private String noTranksaksi;
    private String namapenumpang;
    private String noKtp;

    public Penumpang() {
    }

    public Penumpang(String id) {
        this.id = id;
    }

    public Penumpang(String id, String noTranksaksi) {
        this.id = id;
        this.noTranksaksi = noTranksaksi;
    }

    public String getNamaPenumpang() {

        return namapenumpang;
    }

    public void setNamaPenumpang(String namaPenumpang) {

        this.namapenumpang = namaPenumpang;
    }

    public String getNoKtp() {

        return noKtp;
    }

    public void setNoKtp(String noKtp) {

        this.noKtp = noKtp;
    }

    public String getId() {

        return id;
    }

    public void setId() {

        this.id = id;
    }

    public String getNoTranksaksi() {

        return noTranksaksi;
    }

    public void setNoTranksaksi(String noTranksaksi) {

        this.noTranksaksi = noTranksaksi;
    }

    public void setNamapenumpang(String namapenumpang) {
        this.namapenumpang = namapenumpang;
    }

}
