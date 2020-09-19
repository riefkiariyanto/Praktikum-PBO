import java.util.Scanner;

public class TestKoperasiMain {
    public static void menu() {

        System.out.println("\n=======KOPERASI======");
        System.out.println("Menu Pilihan: ");
        System.out.println("1.) Pinjaman");
        System.out.println("2.) Angsuran");
        System.out.println("3.) Jumlah Pinjaman");
        System.out.println("4.) Exit");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TestKoperasi donny = new TestKoperasi("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        int select;

        do {
            menu(); 
            System.out.print("Pilih Menu : ");
            select = sc.nextInt();

            switch (select) {
                case 1:
                    System.out.print("Masukkan pinjam : ");
                    int p = sc.nextInt();
                    donny.pinjam(p);
                    donny.getJumlahPinjaman();
                    break;
                case 2:
                    System.out.print("Masukkan angsuran : ");
                    int a = sc.nextInt();
                    donny.angsur(a);
                    break;
                case 3:
                    System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while (select == 1 || select == 2 || select == 3 || select
                == 4);
        }
}
