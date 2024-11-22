package id.landcruiserprado.praktikum.responsi;

public class Math {
    public int hitung1(int a, int b) {
        return a * b;
    }

    public int hitung2(int a, int b) {
        return a * (b * b);
    }

    public int hitung3(int a, int b) {
        return a * (b * b * b);
    }

    public static void main(String[] args) {
        Math math = new Math();

        int result1 = math.hitung1(3, 5);
        int result2 = math.hitung2(10, 5);
        int result3 = math.hitung3(200, 5);
        int result4 = math.hitung1(0, 5);
        int result5 = math.hitung1(-3, 5);

        System.out.println("Hasil hitung1: " + result1);
        System.out.println("Hasil hitung2: " + result2);
        System.out.println("Hasil hitung3: " + result3);
        System.out.println("Hasil hitung4: " + result4);
        System.out.println("Hasil hitung5: " + result5);
    }
}
