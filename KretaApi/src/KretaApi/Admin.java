package KretaApi;

public class Admin extends Penumpang {

    private String kode;
    private String username;
    private String password;

    public Admin(){

    }
    public Admin(String kode){
        this.kode = kode;
    }
    public Admin(String kode, String username, String password){
        this.kode = kode;
        this.username = username;
        this.password = password;
    }

    public String getKode(String s) {
        return kode;
    }

    public void setKode(String kode) {

        this.kode = kode;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }
}
