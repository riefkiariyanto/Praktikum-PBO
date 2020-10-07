import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("Apakah anda akan menambahkan data?");
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String pilih;
        int jmlh = 0;
        do {
            menu();
            System.out.print("Masukkan pilihan anda (Y/T) : ");
            pilih = input.nextLine();
            switch (pilih) {
                case "Y":
                case "y":
                    jmlh++;

                    System.out.print("Masukkan nip          : ");
                    String nip = input.nextLine();
                    System.out.print("Masukkan nama pegawai : ");
                    String nm = input.nextLine();
                    System.out.print("Masukkan jumlah SKS   : ");
                    int sks = input.nextInt();
                    System.out.print("Masukkan alamat       : ");
                    String almt = input.next();

                    Dosen dos = new Dosen(nip, nm, almt);
                    dos.setSKS(sks);
                    DaftarGaji daf = new DaftarGaji();
                    daf.addPegawai(dos);
                    System.out.println();
                    daf.printSemuaGaji();
                    break;
                case "T":
                case "t":
                    break;
                default:
                    System.out.println("Pilihan anda tidak tersedia.");
            }
            System.out.println();
        } while (pilih == "Y" || pilih == "T" );

    }
}
