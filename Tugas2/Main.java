package Tugas2;

public class Main {
    public static void main(String[] args) {

        LivingRoom kamar = new LivingRoom();
        kamar.panjang = 6;
        kamar.lebar = 4;
        kamar.tinggi = 4;
        System.out.println("luas kamar adalah : "+kamar.area()+"M^2");

        System.out.println("=========================");

        Circle lingkaran = new Circle();
        lingkaran.radius = 7;
        System.out.println("luas lingkaran adalah : "+lingkaran.hitungLuas()+"Cm^2");
    }
}