public class Pria  {
    private int umur;
    private String nama;
    private boolean dewasa;
    private Wanita istri;

  public Pria() {
    }

Pria(int umur,String nama, boolean dewasa, Wanita istri){
    this.umur=umur;
    this.nama=nama;
    this.dewasa=dewasa;
    this.istri=istri;
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
public void setIstri(Wanita istri) {
    this.istri = istri;
}
public Wanita getIstri() {
    return istri;
}

public void infoPria(){
   if(getUmur()>=22){
       if(istri !=null){
           setDewasa(true);
           istri.setDewasa(true);
           istri.info();
       }else {
           setDewasa(true);
           System.out.println("Pria ini masih kuliah");
       }
    }
}
public void info(){
    System.out.println("Nama : " + nama );
    System.out.println("Umur : " + umur );

}
}
