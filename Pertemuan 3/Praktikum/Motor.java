/**
 * Motor
 */
public class Motor {

    public int kecepatan = 0;
    public boolean kontanOn= false;
    public void nylakanMesin(){
        kontanOn= true;
    }
    public void matikanMesin(){
        kontanOn= false;
        kecepatan=0;
    }
    public void tambahKecepatan(){
        if(kontanOn == true){
            kecepatan +=5;
        }
        else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin off !");
            System.out.println("");
        }
    }
    public void kurangiKecepatan(){
        if(kontanOn == true){
            kecepatan -=5;
        }
        else{
            System.out.println("Kecepatan tidak bisa Berkurang karena mesin Off !");
            System.out.println("");

        }
    }
    public void printStatus(){
        if (kontanOn == true){ 
            System.out.println("Kontak On ");
        }
        else{
            System.out.println("Kontak Off ");
        }
        System.out.println("kecepatan "+kecepatan+"\n");
    }
}