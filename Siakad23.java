import java.util.Scanner;

public class Siakad23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nama, nim;
        char kelas;
        byte absen;
        int nilaiUTS, nilaiUAS;
        double nilaiKuis, nilaiTugas, nilaiAkhir;

        System.out.print("Masukkan nama: "); 
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextInt();

        nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUTS * 0.30) + (nilaiUAS * 0.35);

        System.out.print("Mahasiswa dengan nama " + nama + " (NIM " + nim + ")");
        System.out.println(" Kelas " + kelas + " nomor absen " + absen);
        System.out.print("Nilai Akhir: " + nilaiAkhir);
    }
}