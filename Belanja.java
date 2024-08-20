import java.util.Scanner;

public class Belanja {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Input harga awal : ");
        int hargaAwal = input.nextInt();
        System.out.println("Input diskon yang didapat : ");
        int persentaseDiskon=input.nextInt();
        System.out.println("input jumlah barang yang dibeli : ");
        int jumlahDibeli=input.nextInt();
        double diskon=hargaAwal*jumlahDibeli*persentaseDiskon/100;
        double total=(hargaAwal*jumlahDibeli) - (diskon);
        System.out.println("harga yang dibayar adalah Rp." +total);
    }
} 
 {
    
        Scanner input = new Scanner(System.in);
        System.out.println("input jam kerja anda : ");
        int jamKerja = input.nextInt();
        System.out.println("input tarif per jam anda : ");
        int tarifPerjam = input.nextInt();
        double diskon=jamKerja*tarifPerjam*10/100;
        double total=jamKerja*tarifPerjam-diskon;
        System.out.println("gaji bersih RP. "+total);

    }
