package penilaianmahasiswa;

// Kelas untuk menghitung nilai akhir
class GradeCalculator {

    public double hitungNilaiAkhir(double tugas, double uts, double uas) {
        return (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);
    }
}

// Kelas untuk mencetak laporan nilai
class ReportPrinter {

    public void cetakLaporan(String nama, double nilai) {
        System.out.println("Laporan Nilai Mahasiswa: " + nama + " = " + nilai);
    }
}

// Kelas untuk menyimpan data mahasiswa
class StudentDatabase {

    public void simpanDatabase(String nama, double nilai) {
        System.out.println("Menyimpan ke database: " + nama + " = " + nilai);
    }
}

// Program utama
public class Main {

    public static void main(String[] args) {

        // Membuat objek dari masing-masing kelas
        GradeCalculator calculator = new GradeCalculator();
        ReportPrinter printer = new ReportPrinter();
        StudentDatabase database = new StudentDatabase();

        // Menghitung nilai akhir mahasiswa
        double nilai = calculator.hitungNilaiAkhir(85, 85, 90);

        // Mencetak laporan nilai
        printer.cetakLaporan("Andi", nilai);

        // Menyimpan data mahasiswa
        database.simpanDatabase("Andi", nilai);
    }
}
