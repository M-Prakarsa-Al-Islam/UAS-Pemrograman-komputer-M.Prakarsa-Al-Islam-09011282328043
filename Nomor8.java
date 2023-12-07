import java.util.Scanner;

class AkunPengguna {
    private String username;
    private String password;
    private boolean statusAktif;

    // Konstruktor untuk inisialisasi atribut akun
    public AkunPengguna(String username, String password) {
        this.username = username;
        this.password = password;
        this.statusAktif = true; // Awalnya akun aktif
    }

    // Metode untuk menampilkan informasi akun
    public void tampilkanInformasi() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Nonaktif"));
    }

    // Metode untuk mengaktifkan akun
    public void aktifkanAkun() {
        statusAktif = true;
        System.out.println("Akun berhasil diaktifkan.");
    }

    // Metode untuk menonaktifkan akun
    public void nonaktifkanAkun() {
        statusAktif = false;
        System.out.println("Akun berhasil dinonaktifkan.");
    }
}

public class Nomor8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat akun baru
        System.out.print("Masukkan username baru: ");
        String newUsername = scanner.nextLine();
        System.out.print("Masukkan password baru: ");
        String newPassword = scanner.nextLine();

        AkunPengguna akunBaru = new AkunPengguna(newUsername, newPassword);

        // Menampilkan informasi akun
        System.out.println("\nInformasi Akun:");
        akunBaru.tampilkanInformasi();

        // Mengaktifkan atau menonaktifkan akun
        System.out.print("\nAktifkan akun? (y/n): ");
        char pilihan = scanner.next().charAt(0);

        if (pilihan == 'y' || pilihan == 'Y') {
            akunBaru.aktifkanAkun();
        } else if (pilihan == 'n' || pilihan == 'N') {
            akunBaru.nonaktifkanAkun();
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
