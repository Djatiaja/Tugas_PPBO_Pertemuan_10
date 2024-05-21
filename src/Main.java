public class Main {
    public static void main(String[] args) {
        System.out.println("Mobil penumbang reguler");
        MobilPenumbang toyota = new MobilPenumbang("PL 2301 R", "toyota", "hitam", MobilPenumbang.Jenis.regular);
        toyota.gas();
        toyota.setDiKopling(true);
        toyota.tambahGigi();
        toyota.gas();
        toyota.gas();
        toyota.rem();
        toyota.rem();

        System.out.println();
        System.out.println("Mobil penumpang sport");
        MobilPenumbang civicTurbo = new MobilPenumbang("PL 2143 AA", "Honda", "Biru", MobilPenumbang.Jenis.sport);
        civicTurbo.tambahGigi();
        civicTurbo.tambahGigi();
        civicTurbo.kurangiGigi();
        civicTurbo.setDiKopling(true);
        civicTurbo.kurangiGigi();
        civicTurbo.gas();

        System.out.println();
        System.out.println("Mobil Barang");
        MobilBarang pickup = new MobilBarang("PL 1211 AA", "Hyundai", "Putih", 12);
        pickup.tambahGigi();
        pickup.setDiKopling(true);
        pickup.tambahGigi();
        pickup.tambahGigi();
        pickup.tambahGigi();
        pickup.tambahGigi();
        pickup.tambahGigi();
        pickup.tambahGigi();
        pickup.tambahGigi();
        pickup.gas();
        pickup.rem();

    }
}