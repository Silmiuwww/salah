

package PrakDasproJobsheet4;
import java.util.Scanner;

/**
 * PemilihanBilangan12
 */
public class PemilihanBilangan12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukan sebuah angka: ");
        int angka = sc.nextInt();

        if (angka % 2 == 0)
        {
            System.out.print("Angka " + angka + " termasuk bilangan genap");
        }
        else
        {
            System.out.print("Angka " + angka + " termasuk bilangan ganjil");
        }
    }
        
}
