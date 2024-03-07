/*
NIM : 13020220120
Nama : Achmad Rizky Maulana
Hari/Tanggal : Kamis 07/03/2024
Waktu Pengerjaan : 20:30
*/
import javax.swing.*;

public class No1JOptionPane {
    public static void main(String[] args) {

       //input data oleh user
       String Nim = JOptionPane.showInputDialog("Nim: ");
       String Nama = JOptionPane.showInputDialog("Nama: ");
       String Jurusan = JOptionPane.showInputDialog("Jurusan: ");
       String Fakultas = JOptionPane.showInputDialog("Fakultas: ");

       // Output dari inputan oleh user
       System.out.println("Data Mahasiswa");
       System.out.println("Nim      : " + Nim);
       System.out.println("Nama     : " + Nama);
       System.out.println("Jurusan  : " + Jurusan);
       System.out.println("Fakultas : " + Fakultas);
    }
}
