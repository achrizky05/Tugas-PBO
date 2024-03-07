/*
NIM : 13020220120
Nama : Achmad Rizky Maulana
Hari/Tanggal : Kamis 07/03/2024
Waktu Pengerjaan : 20:30
*/
import java.util.Scanner;

public class No1Scanner {
    public static void main(String[] args) {
        String Nim, Nama, Jurusan, Fakultas;
        Scanner InData = new Scanner(System.in);

        System.out.println("\n");

        //input data oleh user
        System.out.println("Masukkan data mahasiswa dibawah ini !!!");
        System.out.print("Nim      : ");
        Nim = InData.nextLine();
        System.out.print("Nama     : ");
        Nama = InData.nextLine();
        System.out.print("Jurusan  : ");
        Jurusan = InData.nextLine();
        System.out.print("Fakultas : ");
        Fakultas = InData.nextLine();

        System.out.println("\n");

        //output dari inputan oleh user
        System.out.println("Data Mahasiswa");
        System.out.println("Nama     : " + Nama);
        System.out.println("Nim      : " + Nim);
        System.out.println("Jurusan  : " + Jurusan);
        System.out.println("Fakultas : " + Fakultas);

        InData.close();
    }
}
