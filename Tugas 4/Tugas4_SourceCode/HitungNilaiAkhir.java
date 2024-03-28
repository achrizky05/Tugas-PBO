/*Nama  :Achmad Rizky Maulana
  Nim   : 13020220120
  Kelas : A4 - Teknik Informatika
  Tgl   : Kamis 28-Maret-2024
  Waktu : 08.00 wita
*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Evaluasi.HitungNilai;

/**
 *
 * @author ASUS TUF GAMING
 */
public class HitungNilaiAkhir {
    public class NilaiMahasiswa {
    private int tugas1;
    private int tugas2;
    private int mid;
    private int uas;

    // Method untuk menghitung nilai rata-rata tugas
    public double nilaiTugas(int tugas1, int tugas2) {
        return (tugas1 + tugas2) / 2.0; // Menggunakan 2.0 untuk memastikan hasilnya bertipe double
    }

    // Method untuk menghitung nilai akhir
    public double nilaiAkhir(double tugas, int mid, int uas) {
        return (tugas * 0.4) + (mid * 0.3) + (uas * 0.3);
    }

    // Getter dan setter lainnya...
}

}
