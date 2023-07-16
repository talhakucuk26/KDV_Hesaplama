import java.util.Scanner;

public class notortuyg {
    public static void main(String[] args) {
        // Matematik, fizik, kimya, türkçe, tarih, müzik derslerinin
        // sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastıran bir uygulama programı yazın

        // Değişkenleri Oluştur
        int mat,fizik,kimya,turkce,tarih,muzik;

        //Kullanıcıdan bu değişkenlerin değerini almam gerekiyor. Scanner Sınıfımızı tanımladık.
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();


        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();


        System.out.print("Kimya Notunuzu : ");
        kimya = inp.nextInt();


        System.out.print("Türkçe Notunuzu : ");
        turkce = inp.nextInt();


        System.out.print("Tarih Notunuzu : ");
        tarih = inp.nextInt();


        System.out.print("Müzik Notunuzu : ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;

        System.out.println("Ortalamanız : " + sonuc);

        boolean sart;
        sart = (sonuc <60);

        String durumunuz;
        durumunuz = sart ? "Kaldınız" : "Geçtiniz";

        System.out.println("Sınıf Durumunuz " + durumunuz);



    }
}
