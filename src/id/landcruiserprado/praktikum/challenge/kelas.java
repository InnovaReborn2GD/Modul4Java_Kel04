package id.landcruiserprado.praktikum.challenge;

public class kelas {
    // Method untuk membalikkan urutan kata dalam string
    public static String balikKata(String kalimat) {
        // Pisahkan string menjadi array kata-kata berdasarkan spasi
        String[] words = kalimat.split(" ");
        // Gunakan StringBuilder untuk menyimpan hasil
        StringBuilder balikKalimat = new StringBuilder();

        // Loop dari akhir array ke awal
        for (int i = words.length - 1; i >= 0; i--) {
            balikKalimat.append(words[i]);
            if (i != 0) {
                balikKalimat.append(" "); // Tambahkan spasi antara kata-kata
            }
        }
        return balikKalimat.toString();
    }

    public static void main(String[] args) {
        // Contoh penggunaan
        String kalimat = "jokowi ganteng";
        String hasil = balikKata(kalimat);
        System.out.println(hasil); // Output: "ganteng jokowi"
    }
}
