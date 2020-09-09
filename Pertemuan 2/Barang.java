public class Barang {
    
    public String kode,namaBarang;
    public int harga;
    public float diskon;

    public void kode(String newValue){
        kode = newValue;
    }

    public void namaBarang(String newValue){
        namaBarang = newValue
    }

    public int hargaJual(){
        int hjual = (int)(harga - ((diskon * harga)/100));
        return hjual;

    }
    public void tampilData(){
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Id Barang : " +kode );
        System.out.println("Harga Barang  : " + harga);
        System.out.println("Diskon : " + diskon +"%");
    }
   
}
