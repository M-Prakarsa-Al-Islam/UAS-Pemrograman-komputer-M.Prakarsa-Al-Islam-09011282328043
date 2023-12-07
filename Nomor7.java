import java.util.Scanner;

public class BukuPerpustakaan {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean dipinjam;

    // Konstruktor untuk inisialisasi atribut buku
    public BukuPerpustakaan(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false; // Awalnya buku tidak sedang dipinjam
    }

    // Metode untuk menampilkan informasi buku
    public void tampilkanInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Status Peminjaman: " + (dipinjam ? "Sedang Dipinjam" : "Tersedia"));
    }

    // Metode untuk meminjam buku
    public void pinjamBuku() {
        if (dipinjam) {
            System.out.println("Buku sedang dipinjam.");
        } else {
            dipinjam = true;
            System.out.println("Buku berhasil dipinjam.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek buku
        BukuPerpustakaan buku1 = new BukuPerpustakaan("Harry Potter", "J.K. Rowling", 2001);

        // Menampilkan informasi buku
        System.out.println("Informasi Buku:");
        buku1.tampilkanInformasi();

        // Meminjam buku
        System.out.print("\nApakah Anda ingin meminjam buku ini? (y/n): ");
        char pilihan = scanner.next().charAt(0);

        if (pilihan == 'y' || pilihan == 'Y') {
            buku1.pinjamBuku();
        } else {
            System.out.println("Terima kasih.");
        }

        scanner.close();
    }
}
