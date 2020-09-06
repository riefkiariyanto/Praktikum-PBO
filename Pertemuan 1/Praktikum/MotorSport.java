public class MotorSport extends Motor 
{
    private String CcMotor;

    public void setCcMotor(String newValue)
    {
        CcMotor = newValue;
    }
    public void cetakStatus()
    {
        super.cetakStatus();
        System.out.println("Cc Motor : " + CcMotor);
    }
}