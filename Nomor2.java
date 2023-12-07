import java.util.Scanner;
public class Nomor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username baru: ");
        String usernameBenar = scanner.nextLine();
        System.out.print("Masukkan password baru: ");
        String passwordBenar = scanner.nextLine();

        System.out.print("Masukkan username: ");
        String usernameInput = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String passwordInput = scanner.nextLine();

        if (usernameInput.equals(usernameBenar) && passwordInput.equals(passwordBenar)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }
    }
}
