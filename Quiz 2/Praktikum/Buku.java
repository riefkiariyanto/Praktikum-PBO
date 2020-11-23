public class Buku extends MediaInfomasi{

    public void setJMLHalaman(int jml) {
        super.jmlHalaman = jml+4;
        System.out.println("Buku ini memiliki "+jml+" halaman");
        System.out.println("Jika dihitung dengan cover, maka jumlah halaman "+ "dari buku tersebut: "+jmlHalaman+" halaman, "+ "lebih tebal daripada majalah karena terdapat cover dalam dan cover luar");
    }
    @Override
    public void reputasi() {
        System.out.println("Penerbit buku ini memiliki reputasi");
    }
    
}