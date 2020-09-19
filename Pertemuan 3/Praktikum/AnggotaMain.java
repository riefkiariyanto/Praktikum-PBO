public class AnggotaMain extends Anggota {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("amar","farhan");
        System.out.println("Simpanan " + anggota1.getNama()+" : RP "+anggota1.getSimpanan() );

        anggota1.setNama("Amar ");
        anggota1.setAlamat("jalan Sukarno hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " +anggota1.getNama()+ " : Rp "+ anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama()+" : RP "+anggota1.getSimpanan() );

    }

}
