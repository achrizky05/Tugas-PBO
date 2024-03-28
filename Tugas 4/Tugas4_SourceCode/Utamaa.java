/*Nama  :Achmad Rizky Maulana
  Nim   : 13020220120
  Kelas : A4 - Teknik Informatika
  Tgl   : Kamis 28-Maret-2024
  Waktu : 08.00 wita
*/

//kode program evaluasi praktikum 4 NO.2

public class Utamaa {
    public static void main(String[] args) {
        Orang orang = new Orang();
        orang.nama = "Achrizky"; // isi sesuai nama anda
        System.out.println("Stb : " + orang.nama);
        
        // Memanggil metode info() dari kelas Orang
        Orang.info();
        
        // Memanggil metode info() dari kelas Mahasiswa
        Mahasiswa.info();
    }
}
