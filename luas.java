import java.util.Scanner; // Library yang digunakan untuk membaca input dari keyboard

public class LuasLingkaran {
  public static void main(String[] args) {
    // Membuat objek Scanner untuk membaca input dari keyboard
    Scanner keyboard = new Scanner(System.in);

    // Meminta user untuk memasukkan jari-jari lingkaran
    System.out.print("Masukkan jari-jari lingkaran: ");
    double jariJari = keyboard.nextDouble();

    // Menghitung luas lingkaran
    double luas = 3.14 * jariJari * jariJari;

    // Menampilkan hasil perhitungan ke layar
    System.out.println("Luas lingkaran adalah " + luas);
  }
}
