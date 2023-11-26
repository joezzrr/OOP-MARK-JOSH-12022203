public class MainApp {
    public static void main(String[] args) {
        
        Mobil mobil1 = new Mobil("M1", 150.0, 5, 4);

        
        Bus bus1 = new Bus("B1", 100.0, 30, 40);

        
        System.out.println("Informasi Mobil:");
        System.out.println(mobil1.toString());
        System.out.println("\nwaktu tempuh mobil untuk jarak 300 km adalah sekitar: " + mobil1.hitungWaktuTempuh(300)+ " Jam" );

        System.out.println("\nInformasi Bus:");
        System.out.println(bus1.toString());
        
        System.out.println("\nwaktu tempuh bus untuk jarak 290 km adalah sekitar: " + bus1.hitungWaktuTempuh(290)+ " Jam" );
    }
}