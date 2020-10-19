/**
 * MainKuis
 */
public class MainKuis {

    public static void main(String[] args) {
        SepedaMotor honda = new SepedaMotor("Vario","honda");
        System.out.println(honda.getMerekMotor());
        System.out.println(honda.getMerekMesin());
        honda.tambahKecepatanMotor();
        honda.tambahKecepatanMotor();
        honda.kurangiKecepatanMotor();
        System.out.println();

        SepedaMotor yamaha=new SepedaMotor("Nmax","Yamaha");
        System.out.println(yamaha.getMerekMotor());
        System.out.println(yamaha.getMerekMesin());
        yamaha.tambahKecepatanMotor();
        yamaha.tambahKecepatanMotor();
        yamaha.kurangiKecepatanMotor();
    }
}