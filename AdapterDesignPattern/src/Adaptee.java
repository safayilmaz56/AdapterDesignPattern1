import java.util.Scanner;

public class Adaptee {
    public double iskontoluTutariHesapla(double fiyat,double adet){
        System.out.println("Lutfen isknto miktarini giriniz");
        Scanner scanner = new Scanner(System.in);
        double iskonto = scanner.nextInt();
        return fiyat * adet * (1 - iskonto);
    }
}
