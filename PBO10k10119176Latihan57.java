/**
 * Latihan57
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Vehicle
 */
public class PBO10k10119176Latihan57 {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        

        bicycle.setMyBrand("Trek Bike");
        bicycle.setMyModel("7.4FX");
        bicycle.setMyGearCount(23);

        System.out.println("Brand : " + bicycle.getMyBrand());
        System.out.println("Model : " + bicycle.getMyModel());
        System.out.println("Jumlah Gear : " + bicycle.getMyGearCount());

        System.out.println(" ");

        Skateboard skateboard = new Skateboard();

        skateboard.setMyBrand("Ally Skate");
        skateboard.setMyModel("Rocket");
        skateboard.setMyBroadLength(54.5);
        
        System.out.println("Brand : " + skateboard.getMyBrand());
        System.out.println("Model : " + skateboard.getMyModel());
        System.out.println("Jumlah Gear : " + skateboard.getMyBroadLength());
        
    }
}
