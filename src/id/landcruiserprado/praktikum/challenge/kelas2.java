package id.landcruiserprado.praktikum.challenge;

public class kelas2 {
    public static double hitungLPBalok(double pajero, double fortuner, double innova) {
        return 2 * (pajero * fortuner + pajero * innova + fortuner * innova);
    }

    public static void main(String[] args) {
        double pajero = 5.0;
        double fortuner = 3.0;
        double innova = 4.0;

        double luasPermukaan = hitungLPBalok(pajero, fortuner, innova);

        System.out.println("Luas Permukaan Balok: " + luasPermukaan);
    }
}

