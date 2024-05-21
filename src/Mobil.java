public abstract class Mobil {
    protected Boolean isDiKopling = false;
    protected String nomorKendaraan, merek , warna;
    protected int gigi, kecepatan =0;
    public Mobil(String nomorKendaraan, String merek, String warna) {
        this.nomorKendaraan = nomorKendaraan;
        this.merek = merek;
        this.warna = warna;
    }

    public void setDiKopling(Boolean diKopling) {
        isDiKopling = diKopling;
        System.out.println("Mobil dalam keadaan kopling");
    }
    abstract public void tambahGigi();
    abstract public void kurangiGigi();
    abstract public void gas();
}
