
package interfacelatihan;

public class Sarjana extends Mahasiswa implements ICumlaude,IBerprestasi {

    public Sarjana(String nama) {
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Aku mahasiswa,Namaku Rifkie");
        System.out.println("Aku berkuliah di Polinema");
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,51"); 
    }

    @Override
    public void menjuaraiKompetisi() {
       System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya Menerbitkan artikel di jurnal INTERNASIONAL");
    }
    
}
