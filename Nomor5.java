import java.util.Scanner;
public class Nomor5 {
    public static double penjumlahan(double number1, double number2) {
        return number1 + number2;
    }
    public static double pengurangan(double number1, double number2) {
        return number1 - number2;
    }
    public static double perkalian(double number1, double number2) {
        return number1 * number2;
    }
    public static double pembagian(double number1, double number2) {
        if(number2 != 0) {
            return number1 / number2;
        } else {
            throw new IllegalArgumentException("pembagian tidak bisa dinagi dengan 0");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan angka pertama: ");
        double number1 = input.nextDouble();

        System.out.print("masukkan angka kedua: ");
        double number2 = input.nextDouble();

        System.out.print("operasi yang dipakai (+ - * /): ");
        char operation = input.next().charAt(0);

        double result = 0;
        switch(operation) {
            case '+':
                result = penjumlahan(number1, number2);
                break;
            case '-':
                result = pengurangan(number1, number2);
                break;
            case '*':
                result = perkalian(number1, number2);
                break;
            case '/':
                try {
                    result = pembagian(number1, number2);
                } catch(IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Ada Kesalahan");
                return;
        }
        System.out.printf("Result: %.2f\n",result);
    }

}
