public class Laptop extends Komputer {

    public String jnsBatrei;

    public Laptop() {

    }

    public Laptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei) {
        this.jnsBatrei = jnsBatrei;
    }

    public void tampilLaptop() {
        System.out.println("Merk : " + merk);
        System.out.println("kecProsesor : " + kecProsesor);
        System.out.println("sizeMemory : " + sizeMemory);
        System.out.println("jnsProsesor : " + jnsProsesor);
        System.out.println("jnsBatrei : " + jnsBatrei);
    }
}