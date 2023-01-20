import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        String tercih = null;
        Client client = new Client();

        try{
            while (true){
                System.out.println("Malzemenin tutarini hesaplamak icin 1'e");
                System.out.println("iskontolu tutari hesaplamak icin 2'ye");
                System.out.println("uygulamadan cikmak icin 3'e basiniz");
                Scanner scanner = new Scanner(System.in);
                int secenek = scanner.nextInt();
                if(secenek == 1){
                    client.odenecekMeblayiHesapla(new MalzemeTipineGoreToplamTutariniHesapla());
                } else if (secenek == 2) {
                    client.odenecekMeblayiHesapla(new Adapter());
                }
                else {
                    return;
                }
            }
        } catch(Exception e){
            System.out.println("hata ile karsilasildi.Hata:"+e+" Uygulama sonlanacaktir");
        }
    }
}