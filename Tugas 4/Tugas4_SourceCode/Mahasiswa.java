/*Nama  :Achmad Rizky Maulana
  Nim   : 13020220120
  Kelas : A4 - Teknik Informatika
  Tgl   : Kamis 28-Maret-2024
  Waktu : 08.00 wita
*/

//kode program evaluasi praktikum 4 NO.2

public class Mahasiswa extends Orang {
    private String stb;

    public Mahasiswa() {
        super();
        this.stb = "1302002134"; //stambuk anda
    }

    public Mahasiswa(String stb, String nama) {
        this.nama = nama;
        this.stb = stb;
    }

    public static void info() {
        System.out.println("Ini adalah kelas Mahasiswa");
    }
}
