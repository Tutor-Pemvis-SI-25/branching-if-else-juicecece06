import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a;
        int b;

        System.out.println("Masukkan bilangan pertama: ");
        a = input.nextInt();
        System.out.println("Masukkan bilangan kedua: ");
        b = input.nextInt();
        if (a % 2 == 0) {
            System.out.println("Bilangan pertama Genap");
        } else {
            System.out.println("Bilangan pertama Ganjil");
        }
        if (b % 2 == 0) {
            System.out.println("Bilangan kedua Genap");
        } else {
            System.out.println("Bilangan kedua Ganjil");
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
            System.out.println("Hasil penjumlahan=A+B");
        } else {
            if (a % 2 == 1 && b % 2 == 1) {
                System.out.println("Hasil perkalian=A*B");
            } else {
                System.out.println("Berbeda jenis");
            }
        }
    }
}
