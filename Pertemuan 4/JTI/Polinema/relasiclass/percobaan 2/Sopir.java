public class Sopir {
    private String nama;
    private int biaya;

    Mobil(String nama, int biaya){
        this.nama=nama;
        this.biaya=biaya;
    }

    public void setMerk(String nama){
        this.nama=nama;
    }
    public void setBiaya(int biaya){
        this.biaya=biaya;
    }
    
    public String getMerk(){
        return nama;
    }
    public double getBiaya(){
        return biaya;
    }
    public int hitungBiayaSopir(int hari) {
        return biaya * hari;
        }
        
}
