
public class Manusia {

    private int umur;
    private String nama;
    private boolean dewasa;

    public Manusia() {
    }

    Manusia(int umur, String nama, boolean dewasa){
        this.umur = umur;
        this.nama = nama;
        this.dewasa=dewasa;

    }
    public void setUmur(int umur) {
        this.umur=umur;
    }
    public int getUmur() {
        return umur;
    }
    public void  setNama(String nama){
        this.nama=nama;
    }
    public String getNama() {
        return nama;
    }
    public void setDewasa(boolean dewasa){
        this.dewasa=dewasa;
    }
    public boolean getDewasa(){
        return dewasa;
    }

    public void info(){
        System.out.println("Nama : "+ this.nama + "\n");
        System.out.println("Umur : "+this.umur  + "\n");
        System.out.println("Usia : "+ this.dewasa+"\n");
    }


}
