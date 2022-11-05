import java.util.Date;

public class Kreta extends Penumpang{
    private String kodekrt;
    private String subkls;
    private String  gerbong;
    private Date jmbrgkt;
    private Date tiba;
    private double hrgtiket;
    private String stasiunasl;
    private String  stasiuntujuan;

    public Kreta(){
    }
    public Kreta(String kodekrt, String subkls, String gerbong, Date jmbrgkt, Date tiba, double hrgtiket, String stasiunasl, String  stasiuntujuan) {
        this.kodekrt = kodekrt;
        this.subkls = subkls;
        this.gerbong = gerbong;
        this.jmbrgkt = jmbrgkt;
        this.tiba = tiba;
        this.hrgtiket = hrgtiket;
        this.stasiunasl = stasiunasl;
        this.stasiuntujuan = stasiuntujuan;
    }

    public String getKodekrt() {
        return kodekrt;
    }

    public void setKodekrt(String kodekrt) {
        this.kodekrt = kodekrt;
    }

    public String getSubkls() {

        return subkls;
    }

    public void setSubkls(String subkls) {

        this.subkls = subkls;
    }

    public String getGerbong() {
        return gerbong;
    }

    public void setGerbong(String gerbong) {
        this.gerbong = gerbong;
    }

    //public Date getJmbrgkt() {
     //   return jmbrgkt;
   // }

   // public void setJmbrgkt(Date jmbrgkt) {
     //   this.jmbrgkt = jmbrgkt;
    //}

    //public Date getTiba() {
      //  return tiba;
    //}

    //public void setTiba(Date tiba) {
     //   this.tiba = tiba;
    //}

    public double getHrgtiket() {

        return hrgtiket;
    }

    public void setHrgtiket(double hrgtiket) {

        this.hrgtiket = hrgtiket;
    }

    public String getStasiunasl() {

        return stasiunasl;
    }

    public void setStasiunasl(String stasiunasl) {

        this.stasiunasl = stasiunasl;
    }

    public String getStasiuntujuan() {

        return stasiuntujuan;
    }

    public void setStasiuntujuan(String stasiuntujuan) {

        this.stasiuntujuan = stasiuntujuan;
    }

}
