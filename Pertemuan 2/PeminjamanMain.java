public class PeminjamanMain {
    public static void main(String[] args) {
    
        Peminjaman pj1 = new Peminjaman();
        pj1.id = 50220;
        pj1.namaMember ="Riefki Ariyanto";
        pj1.namaGame = "PES 2020";
        pj1.harga=20000;
        pj1.lama=2;

        
        pj1.tampilData();
        System.out.println("Lama Sewa : "+pj1.lama+ "Hari");
        System.out.println("Total Biaya : Rp."+pj1.harga*pj1.lama);

    }
}
