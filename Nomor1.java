import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan harga barang: ");
        double harga = scanner.nextDouble();
        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlah = scanner.nextInt();

        double total;
        if (jumlah < 5) {
            total = harga * jumlah;
        } else if (jumlah <= 10) {
            total = harga * jumlah * 0.95;
        } else if (jumlah <= 20) {
            total = harga * jumlah * 0.90;
        } else {
            total = harga * jumlah * 0.80;
        }
        System.out.printf("Total harga setelah diskon: Rp%,.2f%n", total);
    }
}

