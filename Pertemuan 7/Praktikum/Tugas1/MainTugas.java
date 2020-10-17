import java.util.Scanner;
/**
 * MainTugas
 */
public class MainTugas {

    public static void main(String[] args) {
        Mac M = new Mac();
        M.merk = "HP";
        M.kecProsesor = 2;
        M.sizeMemory = 6;
        M.jnsProsesor = "Intel";
        M.jnsBatrei = "Ni-Cd";
        M.security = "AVG";
        M.tampilMac();
        System.out.println();
        Pc P = new Pc();
        P.merk = "HP";
        P.kecProsesor = 2;
        P.sizeMemory = 6;
        P.jnsProsesor = "Intel";
        P.ukuranMonitor = 24;
        P.tampilPc();
        System.out.println();
        Windows W = new Windows();
        W.merk = "HP";
        W.kecProsesor = 2;
        W.sizeMemory = 6;
        W.jnsProsesor = "Intel";
        W.jnsBatrei = "Ni-Cd";
        W.fitur = "Windows 10";
        W.tampilWindows();
    }
}
