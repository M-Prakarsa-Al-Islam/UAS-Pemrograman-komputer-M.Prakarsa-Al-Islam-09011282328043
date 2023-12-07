import java.util.Scanner;
public class Nomor6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata atau frase: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Ini adalah palindrom.");
        } else {
            System.out.println("Ini bukan palindrom.");
        }
        scanner.close();
    }
    public static boolean isPalindrome(String str) {
        //ini adalah rumus yang menghapus spasi dan mengubah semua huruf menjadi huruf kecil
        str = str.replaceAll("\\s+", "").toLowerCase();
        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            char firstChar = str.charAt(i);
            char lastChar = str.charAt(length - 1 - i);

            if (firstChar != lastChar) {
                return false;
            }
        }
        return true;
    }
}
