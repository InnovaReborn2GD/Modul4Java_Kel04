package id.landcruiserprado.praktikum.challenge;

public class kelas3 {
    public static boolean isPalindrome(String s) {
        // Menghapus spasi dan mengubah string menjadi huruf kecil
        s = s.replace(" ", "").toLowerCase();

        // Membalik string dan membandingkan dengan string asli
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }

    public static void main(String[] args) {
        String kata = "kasur rusak";
        boolean hasil = isPalindrome(kata);
        System.out.println(hasil);  // Output: true
    }
}

