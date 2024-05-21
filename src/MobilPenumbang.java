public class MobilPenumbang extends Mobil{
    Jenis jenis;
    int kecMaks=0, kecMin=0;
    int[][]  kecepatanPerGigi ={
            {0},
            {0, 10},
            {11, 20},
            {21, 40},
            {41, 70},
            {71,100}};
    enum Jenis{
        sport, regular
    }
    public MobilPenumbang(String nomorKendaraan, String merek, String warna, Jenis jenis) {
        super(nomorKendaraan, merek, warna);
        this.jenis = jenis;
    }

    @Override
    public void tambahGigi() {
        if (gigi>=5){
            System.out.println("Gigi telah berada diposisi maksimal");
            return;
        }
        if (!(isDiKopling) && jenis == Jenis.regular){
            System.out.println("Gigi mobil tidak bisa bertambah sebab kopling tidak menyala");
            return;
        }
        gigi++;
        if (gigi == 0){
            kecMaks=0;
            kecMin=0;
        }else {
            kecMin = kecepatanPerGigi[gigi][0];
            kecMaks = kecepatanPerGigi[gigi][1];
        }
        System.out.println("Gigi mobil berhasil bertambah menjadi gigi " + gigi);
    }

    @Override
    public void kurangiGigi() {
        if (gigi<=0){
            System.out.println("Gigi mobil tidak bisa berkurang karena gigi telah berada diposisi 0");
            return;
        }
        if (!(isDiKopling)){
            System.out.println("Gigi mobil tidak bisa berkurang sebab kopling tidak menyala");
            return;
        }
        gigi--;
        System.out.println("Gigi mobil berhasil berkurang menjadi gigi " + gigi);
    }

    @Override
    public void gas() {
        if (gigi ==0){
            System.out.println("Gas tidak bisa dilakukan pada gigi 0");
            return;
        }
        if (kecepatan>= kecMaks){
            System.out.println("Kecepatan untuk gigi "  + this.gigi +" telah dicapai pada " + kecepatan +"km/h");
            return;
        }
        kecepatan+=10;
        System.out.println("Kecepatan mobil saat ini berada pada " + this.kecepatan + "km/h");
    }

    public void rem(){
        if (kecepatan<=0){
            System.out.println("Mobil dalam keadaan berhenti");
            return;
        }
        if (kecepatan<= kecMin){
            System.out.println("Kecepatan minimum untuk gigi " + this.gigi + " adalah " +this.kecMin +", mohon turunkan gigi agar mesin tidak rusak ");
        }
        kecepatan-=10;
        System.out.println("Kecepatan berkurang menjadi " + this.kecepatan+ "km/h");
    }
}
