
package interfacelatihan;
import interfacelatihan.ICumlaude;
import interfacelatihan.Mahasiswa;
import interfacelatihan.PascaSarjana;
import interfacelatihan.Rektor;
import interfacelatihan.Sarjana;
public class interfacemain {
    
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();
        
        Mahasiswa mahasiswaBiasa = new Mahasiswa("Rega");
        Sarjana SarjanaCumlaude = new Sarjana("Rifkie");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
        pakrektor.beriSertifikatCumlaude(mahasiswaBiasa);
        pakrektor.beriSertifikatCumlaude(SarjanaCumlaude);
        pakrektor.beriSertifikatCumlaude(masterCumlaude);
    }
    
}
