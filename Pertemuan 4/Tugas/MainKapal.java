public class MainKapal {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("52312322311", "Asep");
        Kapal kapal = new Kapal("A4",9 );
        kapal.setPenumpang(p, 1);
        System.out.println(kapal.info());

        Pegawai nahkoda = new Pegawai("45672134334", "Muhammad Supriyadi");
        Pegawai asisten = new Pegawai("45673122223", "Joko");
        Kapal p1 = new Kapal("Ferry Hydrofoil", "Tanjung Perak Surabaya - Pelabuhan Gili Mas, Lombok Barat", nahkoda, asisten);
        System.out.println(p1.info1());
    }
}
