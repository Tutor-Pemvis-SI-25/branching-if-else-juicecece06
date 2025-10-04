import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bil1, bil2, y, x;

        bil1 = Integer.parseInt(input.nextLine());
        bil2 = Integer.parseInt(input.nextLine());
        if (bil1 % 2 == 0) {
            System.out.println("Bilangan pertama:Genap");
        } else {
            System.out.println("Bilangan pertama:Ganjil");
        }
        if (bil2 % 2 == 0) {
            System.out.println("Bilangan kedua:Genap");
        } else {
            System.out.println("Bilangan kedua:Ganjil");
        }
        if (bil1 > bil2) {
            System.out.println("Bilangan pertama lebih besar");
        } else {
            if (bil2 > bil1) {
                System.out.println("Bilangan kedua lebih besar");
            } else {
                System.out.println("Kedua bilangan sama besar");
            }
        }
        if (bil1 % 2 == 0 && Integer.toString(bil2) + 2 == 0) {
            y = bil1 + bil2;
            System.out.println("Hasil penjumlahan:" + y);
        } else {
            if (bil1 % 2 != 0 && bil2 % 2 != 0) {
                x = bil1 * bil2;
                System.out.println("Hasil perkalian:" + x);
            } else {
                System.out.println("Berbeda jenis");
            }
        }
    }
}
