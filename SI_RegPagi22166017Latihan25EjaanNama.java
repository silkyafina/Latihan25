import java.util.Scanner;
/**
 *
 * @author User
 * Nama : Silky Afina Saly
 * NIM  : 22166017
 * Prodi: Sistem Informasi
 * Deskripsi Program: Program untuk menampilkan ejaan nama yang inputannya berasal
 * dari user
 */
public class SI_RegPagi22166017Latihan25EjaanNama {
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       
       // input nama untuk dieja
        System.out.print("Masukkan nama depan anda untuk dieja: ");
        String nama = input.nextLine();
        
        // ejaan nama dengan 
        System.out.println("Ejaan untuk "+nama+" adalah : ");
        for (int i = 0; i < nama.length(); i++) {
            char huruf = nama.charAt(i);
            System.out.println("Huruf ke-" + (i + 1) + " : " + huruf);
        }
        System.out.println("(Developed by: Silky Afina Saly)");
        }
    }
    
