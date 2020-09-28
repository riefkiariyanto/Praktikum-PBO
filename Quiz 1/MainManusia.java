public class MainManusia {
    public static void main(String[] args) {
      Pria pr=new Pria();
      Wanita wn= new Wanita();
      Manusia mn= new Manusia(18, "Reza", false);

      pr.setNama("Asep juanidi");
      pr.setUmur(20);
      wn.setNama("wulan jamila ");
      wn.setUmur(19);
        
      System.out.println("Info pria");
      pr.info();
      pr.infoPria();
      

      System.out.println("Info Wanita");
      wn.info();
      wn.infoWanita();
    
      



    }
}
