package KretaApi;

public class AdminImpl extends Admin {
    public AdminImpl() {
    }

    public AdminImpl(String kode) {
        super(kode);
    }

    public AdminImpl(String kode, String username, String password) {
        super(kode, username, password);
    }
}
