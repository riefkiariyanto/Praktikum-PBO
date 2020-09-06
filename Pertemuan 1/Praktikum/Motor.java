public class Motor {
    
        private String merek;
        private String warna;
        private int gear;

        public void setMerek(String newValue)
        {
            merek = newValue;
        }

        public void warna(String newValue)
        {
            warna = newValue;
        }

        public void tambahGear(int increment)
        {
        gear = gear + increment;
        }

        public void rem(int descrement)
         {
        gear = gear - descrement;
         }


        public void cetakStatus()
        {
            System.out.println("merek : "+merek);
            System.out.println("warna : "+warna);
            System.out.println("gear : "+ gear);
            
        }
}