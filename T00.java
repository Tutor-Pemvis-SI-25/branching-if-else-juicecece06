import java.util.*;
import java.lang.Math;

public class JT00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, y, x;
        int b;

        System.out.println("Masukkan bilangan pertama: ");
        a = Integer.parseInt(input.nextLine());
        System.out.println("Masukkan bilangan kedua: ");
        b = Integer.parseInt(input.nextLine());
        if (a % 2 == 0) {
            System.out.println("Bilangan pertama: Genap");
        } else {
            System.out.println("Bilangan pertama: Ganjil");
        }
        if (b % 2 == 0) {
            System.out.println("Bilangan kedua: Genap");
        } else {
            System.out.println("Bilangan kedua: Ganjil");
        }
        if (a > b) {
            System.out.println("Bilangan pertama lebih besar");
        } else {
            if (b > a) {
                System.out.println("Bilangan kedua lebih besar");
            } else {
                System.out.println("Keduanya sama besar");
            }
        }
        if (a % 2 == 0 && b % 2 == 0) {
            x = a + b;
            System.out.println("Hasil penjumlahan: " + x);
        } else {
            if (a % 2 == 1 && b % 2 == 1) {
                y = a * b;
                System.out.println("Hasil perkalian: " + y);
            } else {
                System.out.println("Berbeda jenis");
            }
        }
    }
}
