import java.util.Scanner;
public class TarifListrik23 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        double jmlListrik;
        int tarif = 1500;

        System.out.print("Masukkan jumlah listrik: ");
        jmlListrik = sc.nextDouble();

        System.out.println("Tarif per kwh listrik: " + tarif);

        boolean isMelebihi = jmlListrik > 500;
        if(isMelebihi){
            System.out.println("Penggunaan listrik anda melebihi 500 kwh");
        } else {
            System.out.println("Penggunaan listrik anda tidak melebihi 500 kwh");
        }
        double totalTarif = jmlListrik * tarif;
        System.out.println("Jumlah tagihan yang perlu anda bayarkan adalah: " + totalTarif);
    }
}