import java.util.Scanner;


public class kdv {
    public static void main(String[] args) {
    //fiyatları tanımladım
        double fiyat1, kdvsizTutar, kdvliTutar, kdvOrani;

        Scanner deger = new Scanner(System.in);

        System.out.print("Fiyat Giriniz : ");
        fiyat1 = deger.nextDouble();


        kdvOrani = fiyat1 < 1000 ? 1.18 : 1.08;

        kdvsizTutar = fiyat1;

        kdvliTutar = kdvOrani*fiyat1;


        System.out.println("KDV'siz Fiyat : " + kdvsizTutar);
        System.out.println("KDV'li Fiyat : " + kdvliTutar);
        System.out.println("KDV Oranı " + kdvOrani);














    }
}
