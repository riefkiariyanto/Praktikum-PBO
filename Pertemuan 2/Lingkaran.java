import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args) {

        double k,r, luas, phi = 3.14;

        Scanner scan = new Scanner(System.in);
        System.out.println("Untuk Menghitung Luas");
        System.out.print("Masukkan panjang jari-jari lingkaran: ");
        r = scan.nextDouble();
        luas = phi * r * r;

        System.out.println("Untuk Menghitung Keliling");
        System.out.print("Masukkan panjang jari-jari lingkaran: ");
         r = scan.nextDouble();
        k = 2 * phi * r;

        System.out.println("Luas Lingkaran adalah  : :"+luas);
        System.out.println("Keliling Lingkaran adalah  : " + k);
       
}
}
