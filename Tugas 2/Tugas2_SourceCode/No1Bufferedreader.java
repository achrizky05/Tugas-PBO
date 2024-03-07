/*
NIM : 13020220120
Nama : Achmad Rizky Maulana
Hari/Tanggal : Kamis 07/03/2024
Waktu Pengerjaan : 20:30
*/
import java.io.*;

public class No1Bufferedreader {
    public static void main(String[] args) throws IOException {
        BufferedReader InData = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("\n");

        //input data oleh user
        System.out.println("Masukkan data mahasiswa dibawah ini !!!");
        System.out.print("Nim      : ");
        String Nim = InData.readLine();
        System.out.print("Nama     : ");
        String Nama = InData.readLine();
        System.out.print("Jurusan  : ");
        String Jurusan = InData.readLine();
        System.out.print("Fakultas : ");
        String Fakultas = InData.readLine();
        
        System.out.println("\n");

        //output dari inputan oleh user
        System.out.println("Data Mahasiswa");
        System.out.println("Nim      : "+ Nim);
        System.out.println("Nama     : "+ Nama);
        System.out.println("Jurusan  : "+ Jurusan);
        System.out.println("Fakultas : "+ Fakultas);

        InData.close();
    }
}
