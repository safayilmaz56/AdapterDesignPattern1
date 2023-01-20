import java.util.Scanner;

public class Client {
    public void odenecekMeblayiHesapla(ITutarHesaplayici tutarHesaplayici){
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen fiyati giriniz");
        double fiyat = scanner.nextDouble();
        System.out.println("lutfen adeti giriniz");
        double adet = scanner.nextDouble();
        System.out.println("Tutar="+tutarHesaplayici.hesapla(fiyat,adet));
    }
}
