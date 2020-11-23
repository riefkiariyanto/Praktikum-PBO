public class Majalah extends MediaInfomasi{
  
    public void setJMLHalaman(int jml){
        super.jmlHalaman = jml+2;
        System.out.println("Majalah ini memiliki "+jml+" halaman");
        System.out.println("Jika dihitung dengan cover, maka jumlah halaman "+ "dari majalah tersebut: "+jmlHalaman+" halaman");
    }
    @Override
    public void reputasi() {
        System.out.println("Penerbit majalah ini memiliki reputasi");
    }

}
