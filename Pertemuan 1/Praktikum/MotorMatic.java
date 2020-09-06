public class MotorMatic extends Motor 
{
    private String jenisBahanbakar;

    public void setJeniBahanBakar(String newValue)
    {
        jenisBahanbakar = newValue;
    }
    public void cetakStatus()
    {
        super.cetakStatus();
        System.out.println("Jenis Bahan bakar : " + jenisBahanbakar);
    }
}