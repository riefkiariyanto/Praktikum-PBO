public class laptop {
    
    private String jenisLayar,merek;

    public void setMerek(String newValue)
    {
        merek = newValue;
    }

    public void setJeniLayar(String newValue)
    {
        jenisLayar = newValue;
    }
    public void cetakStatus()
    {

        System.out.println("Merek : "+ merek);
        System.out.println("Jenis Layar: " + jenisLayar);
    }
}