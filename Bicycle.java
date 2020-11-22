/**
 * Latihan57
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Vehicle
 */
public class Bicycle extends Vehicle {
    private int myGearCount;

    public Bicycle(){
        System.out.println("Bicycle");
    }
    public int getMyGearCount() {
        return myGearCount;
    }

    public void setMyGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }
}
