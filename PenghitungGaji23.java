import java.util.Scanner;

public class PenghitungGaji23 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double jmlJamKerja, gajiPerJam;

        System.out.print("Masukkan jam kerja anda : ");
        jmlJamKerja = sc.nextDouble();

        System.out.print("Masukkan gaji anda : ");
        gajiPerjam = sc.nextDouble();

        double gajiKotor = jmlJamKerja * gajiPerJam;
        double bonus = gajiKotor * 0.10;
        double gajiSebelumPajak = gajiKotor + bonus;

        double pajak = gajiSebelumPajak * 0.05;
        double gajiTotal = gajiSebelumPajak * pajak;

        System.out.println("Total gaji anda adalah : Rp." + gajiTotal );
    }
}