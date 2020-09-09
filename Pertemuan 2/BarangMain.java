public class BarangMain {
    public static void main(String[] args) {
        Barang br1 = new Barang();
        br1.namaBarang = "Kipas Angin";
        br1.kode ="b666";
        br1.harga =400000;
        br1.diskon=20;
        int hjual=br1.hargaJual();
        br1.tampilData();
        System.out.println("Harga Yang di bayar : Rp"+hjual);
    }
}
