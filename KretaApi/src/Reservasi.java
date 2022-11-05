import java.util.Date;

public class Reservasi extends  Penumpang {
    private String noTranksaksi;
    private double total;
    private Date tgl;

    public Reservasi(){
    }

    public Reservasi(String noTranksaksi, double total, Date tgl) {
        this.noTranksaksi = noTranksaksi;
        this.total = total;
        this.tgl = tgl;
    }

   // @Override
    //public static void Reservasi;
    @Override
    public String getNoTranksaksi() {
        return noTranksaksi;
    }

    @Override
    public void setNoTranksaksi(String noTranksaksi) {
        this.noTranksaksi = noTranksaksi;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getTgl() {
        return tgl;
    }

    public void setTgl(Date tgl) {
        this.tgl = tgl;
    }

    public void setTgl() {
        int tgl = 1;
    }
}
