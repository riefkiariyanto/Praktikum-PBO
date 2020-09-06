public class BarangMain {
    
    public static void main(String[] args) {

        Motor mtr1 =new Motor();
        MotorMatic mtr2 = new MotorMatic();
        MotorSport mtr3 = new MotorSport();
        laptop bnd1 = new laptop();
        Televisi bnd2 = new Televisi();

        mtr1.setMerek("Honda");
        mtr1.tambahGear(5);
        mtr1.warna("Merah");
        mtr1.cetakStatus();
        System.out.println("=================================");
        mtr2.setMerek("Yamaha");
        mtr2.tambahGear(1);
        mtr2.warna("Putih");
        mtr2.setJeniBahanBakar("pertalite");
        mtr2.cetakStatus();
        System.out.println("=================================");
        mtr3.setMerek("Kawasaki");
        mtr3.tambahGear(6);
        mtr3.warna("Hitam");
        mtr3.setCcMotor("600");
        mtr3.cetakStatus();
        System.out.println("=================================");
        bnd1.setMerek("Asus");
        bnd1.setJeniLayar("Amoled");
        bnd1.cetakStatus();
        System.out.println("=================================");
        bnd2.setMerek("Samsung");
        bnd2.setUkuranLayar("LED");
        bnd2.cetakStatus();


    }
}