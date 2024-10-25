import java.util.ArrayList;
import java.util.List;

public class Main {

    // Fungsi untuk mengembalikan bilangan genap dari array
    public static int[] getEvenNumbers(int[] arr) {
        List<Integer> evenNumbersList = new ArrayList<>(); // List untuk menyimpan bilangan genap

        for (int num : arr) {
            if (num % 2 == 0) { // Memeriksa apakah bilangan genap
                evenNumbersList.add(num); // Menambahkan bilangan genap ke list
            }
        }

        // Mengonversi List ke array
        int[] evenNumbersArray = new int[evenNumbersList.size()];
        for (int i = 0; i < evenNumbersList.size(); i++) {
            evenNumbersArray[i] = evenNumbersList.get(i);
        }

        return evenNumbersArray; // Mengembalikan array berisi bilangan genap
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Contoh array
        int[] evenNumbers = getEvenNumbers(arr); // Memanggil fungsi

        // Menampilkan bilangan genap
        System.out.print("Bilangan genap dalam array: ");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}