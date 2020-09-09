public class Peminjaman {
    public int id, harga, lama;
    public String namaMember, namaGame;
    
     public void setId(int newValue){
        id = newValue;
    }
    public void setNamaMember(String newValue){
        namaMember = newValue;
    }
    public void setNamaGame(String newValue){
        namaGame = newValue;
    }
     public void setHarga(int newValue){
        harga = newValue;
    }
     public void setLama (int newValue){
         lama = newValue;
     }
        public void tampilData()
    {
        System.out.println("Nomer ID: "+id);
        System.out.println("Nama Member: "+namaMember);
        System.out.println("Nama Game: "+namaGame);
        System.out.println("Harga Game: "+harga);
        System.out.println("Lama Peminjaman (Hari): "+lama);
        System.out.println("Biaya yang harus dibayar :  Rp"+harga*lama);
        System.out.println();
}
 
  }

    