public class Wanita {
    private int umur;
    private String nama;
    private boolean dewasa;
    private Pria suami;
    private Manusia anak;

    public Wanita() {
    }

Wanita(int umur,String nama, boolean dewasa, Pria suami,Manusia anak){
    this.umur=umur;
    this.nama=nama;
    this.dewasa=dewasa;
    this.suami = suami;
    this.anak = anak;
}

public void setUmur(int umur) {
    this.umur = umur;
}
public int getUmur() {
    return umur;
}
public void setNama(String nama) {
    this.nama = nama;
}
public String getNama() {
    return nama;
}
public void setDewasa(boolean dewasa) {
    this.dewasa = dewasa;
}
public boolean getDewasa(){
    return dewasa;
}
public void setSuami(Pria suami) {
    this.suami=suami;
}
public Pria getSuami() {
    return suami;
}
public void setAnak(Manusia anak) {
    this.anak = anak;
}
public Manusia getAnak() {
    return anak;
}

public void infoWanita(){
    if(getUmur()>=20){
        setDewasa(true);
        if(suami.getUmur()>=22){
            suami.setDewasa(true);
        }else{
            suami.setDewasa(false);
        }
        suami.info();
        System.out.println( "data anak" );
        anak.info();
    }else {
        setDewasa(false);
        System.out.println("Wanita ini masih Kuliah");
    }
    
}
public void info(){
    System.out.println("Nama : " + nama );
    System.out.println("Umur : " + umur );
}
}
