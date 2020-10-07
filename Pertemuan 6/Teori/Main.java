public class Main {
    public static void main(String[] args) {
          
          
          BangunDatar bangunDatar = new BangunDatar();
          
          
          Persegi persegi = new Persegi();
          persegi.sisi = 3;
          
          
          Lingkaran lingkaran = new Lingkaran();
          lingkaran.r = 26;
          
          
          PersegiPanjang persegiPanjang = new PersegiPanjang();
          persegiPanjang.panjang = 6;
          persegiPanjang.lebar = 2;
          
          
          Segitiga pSegitiga = new Segitiga();
          pSegitiga.alas = 6;
          pSegitiga.tinggi = 2;
          pSegitiga.sisimiring= 2;
          
          
          
          bangunDatar.luas();
          persegi.luas();
          lingkaran.luas();
          pSegitiga.luas();
          persegiPanjang.luas();

            System.out.println("-----------------------------");

          bangunDatar.keliling();
          persegi.keliling();
          lingkaran.keliling();
          persegiPanjang.keliling();
          pSegitiga.keliling();
         
      }
  }  