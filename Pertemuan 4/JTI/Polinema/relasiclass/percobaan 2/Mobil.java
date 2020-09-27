public class Mobil {
    
    private String merk;
    private int biaya;

    Mobil(String merk, int biaya){
        this.merk=merk;
        this.biaya=biaya;
    }

    public void setMerk(String merk){
        this.merk=merk;
    }
    public void setBiaya(int biaya){
        this.biaya=biaya;
    }
    
    public String getMerk(){
        return merk;
    }
    public double getBiaya(){
        return biaya;
    }
    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
        }
}
