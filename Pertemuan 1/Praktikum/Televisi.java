public class Televisi {

    private String jenisUkuranLayar,merek;

    public void setMerek(String newValue)
    {
        merek = newValue;
    }

    public void setUkuranLayar(String newValue)
    {
        jenisUkuranLayar = newValue;
    }
    public void cetakStatus()
    {
        System.out.println("Merek : "+ merek);
        System.out.println("Jenis Ukran layar : " + jenisUkuranLayar);
    }
}