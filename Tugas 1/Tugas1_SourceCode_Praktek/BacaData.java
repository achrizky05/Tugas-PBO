/*
NIM : 13020220120
Nama : Achmad Rizky Maulana
Hari/Tanggal : Kamis 07/03/2024
Waktu Pengerjaan : 16:00
*/
import java.util.Scanner;

public class BacaData {
    public static void main(String[] args) {
        int a;
        Scanner masukan;
        
        System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
        masukan = new Scanner(System.in);
        a = masukan.nextInt(); 
        
        System.out.print ("Nilai yang dibaca : "+ a);
}
}