public class Mac extends Laptop{
    public String security;

    public Mac() {

    }

    public Mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String security) {
        this.security = security;
    }

    public void tampilMac() {
        System.out.println("Merk : " + merk);
        System.out.println("kecProsesor : " + kecProsesor);
        System.out.println("sizeMemory : " + sizeMemory);
        System.out.println("jnsProsesor : " + jnsProsesor);
        System.out.println("jnsBatrei : " + jnsBatrei);
        System.out.println("security : " + security);
    }
}