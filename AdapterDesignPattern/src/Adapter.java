public class Adapter implements ITutarHesaplayici{

    private Adaptee adaptee;
    public Adapter(){
        adaptee = new Adaptee();
    }

    @Override
    public double hesapla(double fiyat, double adet) {
        return adaptee.iskontoluTutariHesapla(fiyat,adet);
    }
}
